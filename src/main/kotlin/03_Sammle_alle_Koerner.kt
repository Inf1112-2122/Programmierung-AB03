import de.github.dudrie.hamster.imperative.de.*

fun laufeReihe() {
    sammleKornSicherAuf()

    while (istVorDirFrei()) {
        laufe()
        sammleKornSicherAuf()
    }
}

fun main() {
    starteSammleAlleKoernerAufSpiel(0)

    for (i in 0 until 2) {
        laufeReihe()

        dreheNachLinks()
        laufe()
        dreheNachLinks()

        laufeReihe()

        dreheNachRechts()
        laufeSicher()
        dreheNachRechts()
    }

    stoppeSpiel()
}
