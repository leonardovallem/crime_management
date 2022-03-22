package vista.util

enum class Topico {
    CRIME, CRIMINOSO, VITIMA, ARMA;

    override fun toString() = when (this) {
        CRIME -> "Crime"
        CRIMINOSO -> "Criminoso"
        VITIMA -> "Vítima"
        ARMA -> "Arma"
    }
}