package vista

import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import vista.components.general.GlobalPane
import vista.components.renderHomeScreen
import vista.util.Styles.SURFACE

class Sistema : Application() {
    val globalPane = GlobalPane().apply {
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