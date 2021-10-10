import de.github.dudrie.hamster.imperative.de.*

fun laufeZurNaechstenWand() {
    while (istVorDirFrei()) {
        laufe()
    }
}

fun main() {
    starteLegeKoernerInEckenSpiel(0)
    setzeSpielGeschwindigkeit(8f)

//    if (!istDeinMundLeer()) {
//        legeKornAb()
//    }
    legeKornSicherAb()

    for (i in 0 until 3) {
        laufeZurNaechstenWand()
        dreheNachLinks()
        legeKornSicherAb()
//        if (!istDeinMundLeer()) {
//            legeKornAb()
//        }
    }

    stoppeSpiel()
}
