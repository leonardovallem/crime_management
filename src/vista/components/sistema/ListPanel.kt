@file:Suppress("FunctionName")

package vista.components.sistema

import javafx.collections.FXCollections
import javafx.scene.control.ListView
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import vista.components.general.CustomCellFactory
import vista.util.Styles

fun <T> ListPanel(items: List<T>) = ListView(FXCollections.observableArrayList(items)).apply {
    cellFactory = CustomCellFactory()
}

fun <T> TablePanel() = TableView<T>()

fun <T, S> CustomTableColumn(label: String, field: String) = TableColumn<T, S>(label).apply {
    style = Styles.LABEL
    cellValueFactory = PropertyValueFactory<T, S>(field)
}