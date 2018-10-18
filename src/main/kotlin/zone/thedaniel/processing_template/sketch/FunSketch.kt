package zone.thedaniel.processing_template.sketch

import processing.core.PApplet

class FunSketch<State: Any>(
        private val sketchSettings: PApplet.() -> Unit,
        private val initialState: PApplet.() -> State,
        private val sketch: PApplet.(State) -> Unit,
        private val update: (State)-> State
): PApplet() {

    lateinit var state: State

    override fun settings() {
        super.settings()
        sketchSettings()
    }

    override fun setup() {
        super.setup()
        state = initialState()
    }

    override fun draw() {
        super.draw()
        sketch(state)
        state = update(state)
    }
}
