import de.github.dudrie.hamster.imperative.de.*

fun istLinksFrei(): Boolean {
    dreheNachLinks()
    val istFrei = istVorDirFrei()
    dreheNachRechts()
    return istFrei
}

fun istRechtsFrei(): Boolean {
    dreheNachRechts()
    val istFrei = istVorDirFrei()
    dreheNachLinks()
    return istFrei
}

fun dreheUm() {
    repeat(2) {
        dreheNachLinks()
    }
}

fun main() {
    starteLabyrinthSpiel(0)
    setzeSpielGeschwindigkeit(10f)

    while (!liegtEinKornAufDeinemFeld()) {
        if (istLinksFrei()) {
            dreheNachLinks()
            laufe()
        } else if (istVorDirFrei()) {
            laufe()
        } else if (istRechtsFrei()) {
            dreheNachRechts()
            laufe()
        } else {
            dreheUm()
            laufe()
        }
    }

    sammleKornAuf()
    stoppeSpiel()
}
