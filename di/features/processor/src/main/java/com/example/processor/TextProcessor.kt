package com.example.processor

import com.example.annotation.TestAnnotation
import net.ltgt.gradle.incap.IncrementalAnnotationProcessor
import net.ltgt.gradle.incap.IncrementalAnnotationProcessorType
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement


@SupportedSourceVersion(SourceVersion.RELEASE_8)
@IncrementalAnnotationProcessor(IncrementalAnnotationProcessorType.ISOLATING)
class TextProcessor : AbstractProcessor() {
    override fun process(p0: MutableSet<out TypeElement>?, p1: RoundEnvironment?): Boolean {
        return true
    }

    override fun getSupportedAnnotationTypes() = setOf(ANNOTATION_CLASS.canonicalName)

    override fun getSupportedSourceVersion(): SourceVersion = SourceVersion.latest()

    companion object {
        private val ANNOTATION_CLASS = TestAnnotation::class.java
    }
}