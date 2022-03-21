@file:Suppress("FunctionName")

package vista.components

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.scene.layout.Region
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.scene.text.TextAlignment
import vista.Styles
import vista.Styles.DANGER_BUTTON
import vista.Styles.PRIMARY_BUTTON
import vista.Styles.SECONDARY_BUTTON

object General {
    fun GlobalPane() = BorderPane().apply {
        setMinSize(600.0, 400.0)
        padding = Insets(10.0, 10.0, 10.0, 10.0)
    }

    fun GridPane() = javafx.scene.layout.GridPane().apply {
        padding = Insets(10.0, 10.0, 10.0, 10.0)
        vgap = 5.0
        hgap = 5.0
        alignment = Pos.CENTER
    }

    fun Row(spacing: Double) = HBox(spacing)
    fun Column(spacing: Double) = VBox(spacing)

    fun PrimaryButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
        setMinSize(80.0, 40.0)
        onAction = onClick
        style = PRIMARY_BUTTON
    }

    fun SecondaryButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
        setMinSize(80.0, 40.0)
        onAction = onClick
        style = SECONDARY_BUTTON
    }

    fun Title(title: String, onNavigateBack: EventHandler<ActionEvent>? = null) = BorderPane().apply {
        onNavigateBack?.let {
            left = Button("VOLTAR").apply {
                alignment = Pos.CENTER
                style = DANGER_BUTTON
                onAction = it
            }
        }

        center = Text(title).apply {
            style = Styles.TITLE
            fill = if (onNavigateBack == null) Color.YELLOW else Color.WHITE
            textAlignment = TextAlignment.CENTER
        }
    }

    fun VerticalSpacer() = Region().apply {
        VBox.setVgrow(this, Priority.ALWAYS)
    }

    fun HorizontalSpacer() = Region().apply {
        HBox.setHgrow(this, Priority.ALWAYS)
    }
}