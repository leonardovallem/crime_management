package vista.components.general

import javafx.geometry.Insets
import javafx.geometry.Pos

@Suppress("FunctionName")
fun GridPane() = javafx.scene.layout.GridPane().apply {
    padding = Insets(10.0, 10.0, 10.0, 10.0)
    vgap = 5.0
    hgap = 5.0
    alignment = Pos.CENTER
}