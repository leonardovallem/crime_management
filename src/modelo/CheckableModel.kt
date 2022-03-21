package modelo

import javafx.beans.property.SimpleBooleanProperty

abstract class CheckableModel(val checked: SimpleBooleanProperty = SimpleBooleanProperty())