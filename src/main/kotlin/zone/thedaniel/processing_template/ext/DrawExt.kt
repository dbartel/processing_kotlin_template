package zone.thedaniel.processing_template.ext

import processing.core.PApplet
import processing.core.PConstants


fun PApplet.drawShape(kind: ShapeType = ShapeType.Points,
                      end: ShapeCloseType = ShapeCloseType.Close,
                      vararg vertices: Pair<Float, Float>) {
    beginShape(kind.type)
    vertices.forEach {v ->
        vertex(v.first, v.second)
    }
    endShape(end.type)
}

fun PApplet.drawContour(vararg vertices: Pair<Float, Float>) {
    beginContour()
    vertices.forEach { v ->
        vertex(v.first, v.second)
    }
    endContour()
}


enum class ShapeType(val type: Int) {
    Points(PConstants.POINTS),
    Lines(PConstants.LINES),
    Triangles(PConstants.TRIANGLES),
    TriangleFan(PConstants.TRIANGLE_FAN),
    TriangleStrip(PConstants.TRIANGLE_STRIP),
    Quads(PConstants.QUADS),
    QuadStrip(PConstants.QUAD_STRIP)
}

enum class ShapeCloseType(val type: Int) {
    Open(PConstants.OPEN),
    Close(PConstants.CLOSE)
}