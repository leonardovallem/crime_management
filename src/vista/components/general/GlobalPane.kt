package vista.components.general

import javafx.geometry.Insets
import javafx.scene.layout.BorderPane

@Suppress("FunctionName")
fun GlobalPane() = BorderPane().apply {
    setMinSize(1024.0, 576.0)
    padding = Insets(10.0, 10.0, 10.0, 10.0)
}