fun main() {
    println("Bem-vindo ao ByteBank!")
    val titular = "Lury"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = -100.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

//    testConditions(saldo)
//      loopFor()
//    loopWhile()
}

fun testConditions(saldo: Double) {
//    if (saldo > 0.0) {
//        println("Saldo positivo")
//    } else if (saldo == 0.0) {
//        println("Saldo zerado")
//    } else {
//        println("Saldo negativo")
//    }

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    } //tipo switch case
}

fun loopFor() {
    for (i in 1..3) {
        println(i)
        if (i == 2) {
            break
        }
    }

    println()

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

fun loopWhile() {
    var i = 0
    while (i < 5) {
        println(i)
        i++;
    }
}