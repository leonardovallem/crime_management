package vista

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Stage
import vista.Styles.SUBTITLE
import vista.Styles.SURFACE
import vista.components.General

class Sistema : Application() {
    val globalPane = General.GlobalPane().apply {
        style = SURFACE
    }

    override fun start(stage: Stage) {
        renderHomeScreen()

        stage.run {
            title = "Sistema da Polícia"
            scene = Scene(globalPane)
            show()
        }
    }
}

fun main() = Application.launch(Sistema::class.java)