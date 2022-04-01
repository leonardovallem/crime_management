package vista.components.screens

import vista.Sistema
import vista.State
import vista.components.general.Title
import vista.components.sistema.HomeScreenOptionsPane
import vista.components.sistema.SearchFieldPane
import vista.components.sistema.TopicOptionsPane
import vista.util.Topico
import vista.util.update

fun Sistema.renderHomeScreen() {
    State.update(
        title = Title("Sistema da Polícia"),
        center = HomeScreenOptionsPane(this)
    )
    globalPane.update()
}

fun Sistema.renderRegisterScreen() {
    State.update(
        title = Title("Menu de cadastro") { renderHomeScreen() },
        center = TopicOptionsPane(this)
    )
    globalPane.update()
}

fun Sistema.renderSearchScreen(topic: Topico) {
    State.update(
        title = Title("Pesquisar $topic") { renderHomeScreen() },
        center = SearchFieldPane(this, topic)
    )
    globalPane.update()
}