package com.sgurin.smlr.service

/**
 * Created by Stanislav Gurin on 30.06.2017.
 */
interface KeyConverterService {
    fun idToKey(id: Long): String
    fun keyToId(key: String): Long
}