package vista.components.sistema

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.ListView
import javafx.scene.control.cell.CheckBoxListCell
import javafx.scene.paint.Color
import javafx.scene.text.Text
import modelo.CheckableModel
import vista.components.general.Column
import vista.components.general.SecondaryButton

@Suppress("FunctionName")
inline fun <reified T : CheckableModel> TopicCheckboxList(
    elements: List<T>,
    onClickListener: EventHandler<ActionEvent>? = null
) = if (elements.isEmpty()) Column(15.0).apply {
    alignment = Pos.CENTER
    val topicName = T::class.simpleName ?: "registro"

    children.add(Text("Nenhum $topicName encontrado").apply {
        fill = Color.WHITE
    })
    children.add(SecondaryButton("Adicionar", onClickListener))
} else ListView<T>().apply {
    elements.forEach { items.add(it) }
    padding = Insets(15.0)

    cellFactory = CheckBoxListCell.forListView {
        return@forListView it.checked
    }
}