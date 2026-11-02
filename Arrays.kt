import kotlin.random.Random

fun main() {
   
    val frequencies = IntArray(1000) { Random.nextInt(60, 201) }
    var min: Int
    var max: Int

    while (true) {
        println("Introdueix la freqüència mínima (60-200):")
        min = readLine()!!.trim().toInt()

        println("Introdueix la freqüència màxima (60-200):")
        max = readLine()!!.trim().toInt()

        if (min < 60 || min > 200 || max < 60 || max > 200) {
            println("Els valors han d'estar entre 60 i 200. Torna-ho a provar.\n")
            continue
        }
        if (min >= max) {
            println("La mínima ha de ser més petita que la màxima. Torna-ho a provar.\n")
            continue
        }
        break
    }

    var dinsInterval = 0
    var perSota = 0
    var perSobre = 0

    for (f in frequencies) {
        when {
            f in min..max -> dinsInterval++
            f < min -> perSota++
            f > max -> perSobre++
        }
    }

    val total = frequencies.size.toDouble()

    println("\nDins de l'interval [$min, $max]: $dinsInterval vegades (${"%.2f".format(dinsInterval / total * 100)}%)")
    println("Per sota de $min: $perSota vegades (${"%.2f".format(perSota / total * 100)}%)")
    println("Per sobre de $max: $perSobre vegades (${"%.2f".format(perSobre / total * 100)}%)")
}
