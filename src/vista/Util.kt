package vista

enum class Topico {
    CRIMINOSO, VITIMA, ARMA;

    override fun toString() = when(this) {
        CRIMINOSO -> "Criminoso"
        VITIMA -> "Vítima"
        ARMA -> "Arma"
    }
}