fun main() {
    val familyMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")
    )

    for (entry in familyMap) {
        println("${entry.key}: ${entry.value}")
    }
}