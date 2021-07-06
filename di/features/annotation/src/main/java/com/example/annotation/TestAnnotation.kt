package com.example.annotation

import kotlin.reflect.KClass

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class TestAnnotation(
  val classes: Array<KClass<*>>
)
