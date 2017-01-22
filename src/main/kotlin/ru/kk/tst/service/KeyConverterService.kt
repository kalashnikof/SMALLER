package ru.kk.tst.service

/**
 * Created by Kirill on 21.01.2017.
 */
interface KeyConverterService {
    fun idToKey(id: Long): String
    fun keyToId(key: String): Long
}