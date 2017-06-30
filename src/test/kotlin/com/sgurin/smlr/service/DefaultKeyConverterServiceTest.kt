package com.sgurin.smlr.service

import org.junit.Test
import java.util.*
import org.junit.Assert.*

/**
 * Created by Stanislav Gurin on 30.06.2017.
 */
class DefaultKeyConverterServiceTest {
    val service: KeyConverterService = DefaultKeyConverterService()

    @Test
    fun givenIdMustBeConvertibleBothWays() {
        val rand = Random()

        for (i in 0..1000L) {
            val initialId = Math.abs(rand.nextLong())
            val key = service.idToKey(initialId)
            val id = service.keyToId(key)
            assertEquals(initialId, id)
        }
    }
}