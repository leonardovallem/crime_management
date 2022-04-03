package vista.components.general

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.TableCell
import javafx.scene.control.TableView
import javafx.scene.text.Text
import javafx.util.Callback
import vista.util.Styles

class CustomCellFactory<T> : Callback<ListView<T>, ListCell<T>> {
    override fun call(param: ListView<T>) = object : ListCell<T>() {
        override fun updateItem(item: T, empty: Boolean) {
            super.updateItem(item, empty)
            if (empty) {
                text = null
                graphic = null
            } else if (item != null) {
                text = null
                graphic = Row(15.0).apply {
                    alignment = Pos.CENTER_LEFT
                    children.add(Text(item.toString()).apply {
                        style = Styles.SUBTITLE
                    })

                    children.add(Row(15.0).apply {
                        alignment = Pos.CENTER_RIGHT
                        children.add(SecondaryButton("Editar"))
                        children.add(DangerButton("Excluir"))
                    })
                }
            }
        }
    }
}

open class ItemOptionsCell<T>(
    onEdit: EventHandler<ActionEvent>? = null,
    onDelete: EventHandler<ActionEvent>? = null,
) : TableCell<T, Boolean>() {
    private val editButton = SecondaryButton("Editar").apply {
        onAction = onEdit
    }
    private val deleteButton = DangerButton("Excluir").apply {
        onAction = onDelete
    }

    override fun updateItem(t: Boolean?, empty: Boolean) {
        super.updateItem(t, empty)
        if (!empty) {
            graphic = Row(15.0).apply {
                children.add(editButton)
                children.add(deleteButton)
            }
        }
    }
}