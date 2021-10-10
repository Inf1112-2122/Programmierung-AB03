import de.github.dudrie.hamster.imperative.de.*

fun laufeSicher() {
    if (istVorDirFrei()) {
        laufe()
    }
}

fun sammleKornSicherAuf() {
    if (liegtEinKornAufDeinemFeld()) {
        sammleKornAuf()
    }
}

fun legeKornSicherAb() {
    if (!istDeinMundLeer()) {
        legeKornAb()
    }
}

fun dreheNachRechts() {
    for (i in 0 until 3) {
        dreheNachLinks()
    }
}
