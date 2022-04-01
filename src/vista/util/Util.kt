package vista.util

import javafx.scene.layout.BorderPane
import vista.State

enum class Topico {
    CRIME, CRIMINOSO, VITIMA, ARMA;

    override fun toString() = when (this) {
        CRIME -> "Crime"
        CRIMINOSO -> "Criminoso"
        VITIMA -> "Vítima"
        ARMA -> "Arma"
    }
}

fun BorderPane.update() {
    children.clear()
    top = State.title
    center = State.center
}