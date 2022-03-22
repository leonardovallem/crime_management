package vista.components.sistema

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.paint.Color
import javafx.scene.text.Text
import vista.Sistema
import vista.components.general.Column
import vista.components.general.Row
import vista.util.Styles
import vista.util.Topico

@Suppress("FunctionName")
fun SearchFieldPane(sistema: Sistema, topic: Topico) = Column(15.0).apply {
    padding = Insets(10.0, 10.0, 10.0, 10.0)

    children.add(Row(15.0).apply {
        children.add(Text("Nome:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            prefWidth = 400.0
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.BOTTOM_RIGHT
        children.add(Button("Pesquisar").apply {
            style = Styles.SEARCH_BUTTON
        })
    })
}