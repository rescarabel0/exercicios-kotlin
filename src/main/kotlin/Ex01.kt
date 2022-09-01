fun main() {
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desenvolvimento de Sistemas"
    )
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")
    for ((counter, curso) in listaCursos.withIndex()) {
        if (curso.contains("Sistemas")) {
            println("$counter - $curso")
        }
    }
}