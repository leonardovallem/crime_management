package vista.components.sistema

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.Text
import vista.Sistema
import vista.components.general.Column
import vista.components.general.Row
import vista.components.general.SecondaryButton
import vista.components.general.SecondaryVariantButton
import vista.components.renderSearchScreen
import vista.util.Styles
import vista.util.Topico

@Suppress("FunctionName")
fun SearchOptionsPane(sistema: Sistema) = Column(15.0).apply {
    alignment = Pos.TOP_CENTER

    val title = Text("Pesquisar").apply {
        style = Styles.SUBTITLE
        fill = Color.WHITE
    }

    children.add(title)

    children.add(Row(15.0).apply {
        alignment = Pos.CENTER

        children.add(SecondaryVariantButton("Crime") {
            sistema.renderSearchScreen(Topico.CRIME)
        })
        children.add(SecondaryButton("Criminoso") {
            sistema.renderSearchScreen(Topico.CRIMINOSO)
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.CENTER

        children.add(SecondaryButton("Vítima") {
            sistema.renderSearchScreen(Topico.VITIMA)
        })
        children.add(SecondaryButton("Arma") {
            sistema.renderSearchScreen(Topico.ARMA)
        })
    })
}