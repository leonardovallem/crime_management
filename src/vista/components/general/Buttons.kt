@file:Suppress("FunctionName")

package vista.components.general

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import vista.util.Styles

fun PrimaryButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
    setMinSize(80.0, 40.0)
    onAction = onClick
    style = Styles.PRIMARY_BUTTON
}

fun SecondaryButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
    setMinSize(80.0, 40.0)
    onAction = onClick
    style = Styles.SECONDARY_BUTTON
}

fun SecondaryVariantButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
    setMinSize(80.0, 40.0)
    onAction = onClick
    style = Styles.SECONDARY_VARIANT_BUTTON
}

fun DangerButton(label: String, onClick: EventHandler<ActionEvent>? = null) = Button(label).apply {
    setMinSize(80.0, 40.0)
    onAction = onClick
    style = Styles.DANGER_BUTTON
}