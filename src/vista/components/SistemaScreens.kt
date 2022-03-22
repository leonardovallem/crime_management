package vista.components

import javafx.geometry.Insets
import javafx.scene.layout.Region
import vista.Sistema
import vista.components.general.Title
import vista.components.sistema.RegisterFormPane
import vista.components.sistema.RegisterOptionsPane
import vista.components.sistema.SearchFieldPane
import vista.components.sistema.SearchOptionsPane
import vista.util.Topico

fun Sistema.renderHomeScreen() {
    globalPane.children.clear()
    globalPane.center = Region().apply {
        padding = Insets(15.0)
    }

    globalPane.top = Title("Sistema da Polícia")
    globalPane.left = RegisterOptionsPane(this)
    globalPane.right = SearchOptionsPane(this)
}

fun Sistema.renderRegisterScreen(topic: Topico) {
    globalPane.children.clear()

    globalPane.top = Title("Cadastrar $topic") {
        renderHomeScreen()
    }
    globalPane.center = RegisterFormPane(this, topic)
}

fun Sistema.renderSearchScreen(topic: Topico) {
    globalPane.children.clear()

    globalPane.top = Title("Pesquisar $topic") {
        renderHomeScreen()
    }
    globalPane.center = SearchFieldPane(this, topic)
}