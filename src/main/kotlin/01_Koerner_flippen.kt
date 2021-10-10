import de.github.dudrie.hamster.imperative.de.*

fun flippeKorn() {
    if (liegtEinKornAufDeinemFeld()) {
        sammleKornAuf()
    } else {
        legeKornAb()
    }
}

fun main() {
    starteKoernerFlipSpiel(0)
    setzeSpielGeschwindigkeit(8f)

    // An das erste Feld denken!
    flippeKorn()

    while (istVorDirFrei()) {
        laufe()
        flippeKorn()
    }

    stoppeSpiel()
}
