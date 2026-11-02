fun main() {
    println("Introdueix el text:")
    val text = readLine()!!
    val textArray = text.toCharArray()

    println("Introdueix la paraula a cercar:")
    val paraula = readLine()!!
    val paraulaArray = paraula.toCharArray()

    var comptador = 0

    if (paraulaArray.isNotEmpty()) {
        for (i in 0..textArray.size - paraulaArray.size) {
            var coincideix = true
            for (j in paraulaArray.indices) {
                if (textArray[i + j] != paraulaArray[j]) {
                    coincideix = false
                    break
                }
            }
            if (coincideix) {
                comptador++
            }
        }
    }

    println("La paraula \"$paraula\" apareix $comptador vegades dins del text.")
}
