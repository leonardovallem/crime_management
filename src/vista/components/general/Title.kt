package vista.components.general

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.scene.text.TextAlignment
import vista.util.Styles

@Suppress("FunctionName")
fun Title(title: String, onNavigateBack: EventHandler<ActionEvent>? = null) = BorderPane().apply {
    onNavigateBack?.let {
        left = Button("VOLTAR").apply {
            alignment = Pos.CENTER
            style = Styles.GO_BACK_BUTTON
            onAction = it
        }
    }

    center = Text(title).apply {
        style = Styles.TITLE
        fill = if (onNavigateBack == null) Color.YELLOW else Color.WHITE
        textAlignment = TextAlignment.CENTER
    }
}