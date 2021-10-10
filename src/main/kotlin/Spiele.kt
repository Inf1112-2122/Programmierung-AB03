import de.github.dudrie.hamster.imperative.de.starteSpiel

fun starteKoernerFlipSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "koerner_flippen"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteLegeKoernerInEckenSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "lege_koerner_in_ecken"
        override val interval: IntRange = 0..3
    }, spielNummer)
}

fun starteSammleAlleKoernerAufSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "hebe_alle_koerner_auf"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteLabyrinthSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "labyrinth"
        override val interval: IntRange = 0..1
    }, spielNummer)
}

private fun starteSpielAusSpielMenge(menge: SpielMenge, spielNummer: Int) {
    require(spielNummer in menge.interval) { "Die Spielnummer $spielNummer ist ungültig. Sie muss zwischen ${menge.interval.first} und ${menge.interval.last} liegen." }

    starteSpiel("territories/${menge.spielPrefix}_$spielNummer")
}

private interface SpielMenge {
    val spielPrefix: String
    val interval: IntRange
}
