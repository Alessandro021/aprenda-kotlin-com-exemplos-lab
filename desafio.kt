// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuariosKotlin = listOf(Usuario("João"), Usuario("Maria"), Usuario("Carlos"))
    val usuariosJava = listOf(Usuario("Marcos"), Usuario("Joana"), Usuario("Livia"))

    val conteudoKotlin = listOf(ConteudoEducacional("Kotlin classes", 60), ConteudoEducacional("Kotlin variaveis", 90),
        ConteudoEducacional("Kotlin funções", 120))

    val conteudoJava = listOf(ConteudoEducacional("Java classes", 60), ConteudoEducacional("Java variaveis", 90),
        ConteudoEducacional("Java funções", 120))


    val formacao = Formacao("Kotlin", Nivel.BASICO, conteudoKotlin)
    val formacao2 = Formacao("Java", Nivel.INTERMEDIARIO, conteudoJava)

    for(usuario in usuariosKotlin){
        formacao.matricular(usuario)
    }

    for(usuario in usuariosJava){
        formacao2.matricular(usuario)
    }


    println("Formação: ${formacao.nome}")
    println("Nível: ${formacao.nivel}")
    println("Conteúdos: ${formacao.conteudos.map { it.nome }}")
    println("Inscritos: ${formacao.inscritos.map { it.nome }}")

    println("________")

    println("Formação: ${formacao2.nome}")
    println("Nível: ${formacao2.nivel}")
    println("Conteúdos: ${formacao2.conteudos.map { it.nome }}}")
    println("Inscritos: ${formacao2.inscritos.map { it.nome }}")
}
