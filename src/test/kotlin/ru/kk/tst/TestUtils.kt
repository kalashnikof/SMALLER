package ru.kk.tst

import org.mockito.Mockito

/**
 * Created by Kirill on 22.01.2017.
 */

fun <T> whenever(call: T) = Mockito.`when`(call)