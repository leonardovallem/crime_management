@file:Suppress("FunctionName")
package vista.components.general

import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.scene.layout.Region
import javafx.scene.layout.VBox

fun VerticalSpacer() = Region().apply {
    VBox.setVgrow(this, Priority.ALWAYS)
}

fun HorizontalSpacer() = Region().apply {
    HBox.setHgrow(this, Priority.ALWAYS)
}
