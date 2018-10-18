package zone.thedaniel.processing_template.ext

import processing.core.PApplet

fun PApplet.applyPixels(fn: (pixels: IntArray) -> IntArray) {
    loadPixels()
    pixels = fn(pixels)
    updatePixels()
}
