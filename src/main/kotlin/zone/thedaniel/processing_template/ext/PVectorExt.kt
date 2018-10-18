package zone.thedaniel.processing_template.ext

import processing.core.PVector

operator fun PVector.plus(other: PVector): PVector = this.add(other)
operator fun PVector.minus(other: PVector): PVector = this.sub(other)

