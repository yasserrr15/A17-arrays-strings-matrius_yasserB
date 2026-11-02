fun main() {
    println("Quants alumnes hi ha a l'aula?")
    val numAlumnes = readLine()!!.trim().toInt()

    val noms = Array(numAlumnes) { "" }

    for (i in 0 until numAlumnes) {
        println("Introdueix el nom de l'alumne ${i + 1}:")
        noms[i] = readLine()!!
    }

    // Quants noms comencen amb 'A'
    val comencenAmbA = noms.count { it.isNotEmpty() && it[0].uppercaseChar() == 'A' }
    println("\nNoms que comencen amb 'A': $comencenAmbA")

    // Quants noms contenen la lletra 's'
    val contenenS = noms.count { it.contains('s', ignoreCase = true) }
    println("Noms que contenen la lletra 's': $contenenS")

    // Demanar una lletra qualsevol
    println("\nIntrodueix una lletra:")
    val lletra = readLine()!!.trim()[0]

    var vegadesLletra = 0
    for (nom in noms) {
        vegadesLletra += nom.count { it.equals(lletra, ignoreCase = true) }
    }
    println("La lletra '$lletra' apareix $vegadesLletra vegades en total.")

    println("Noms que contenen la lletra '$lletra':")
    for (nom in noms) {
        if (nom.contains(lletra, ignoreCase = true)) {
            println("- $nom")
        }
    }

    // EXTRA: vector nou només amb els noms que contenen la lletra
    val nomsAmbLletra = noms.filter { it.contains(lletra, ignoreCase = true) }.toTypedArray()
    println("\n(EXTRA) Vector nou amb ${nomsAmbLletra.size} noms que contenen '$lletra': ${nomsAmbLletra.joinToString(", ")}")
}
