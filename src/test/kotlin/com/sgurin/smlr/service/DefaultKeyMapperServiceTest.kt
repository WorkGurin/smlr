package com.sgurin.smlr.service

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Stanislav Gurin on 30.06.2017.
 */
class DefaultKeyMapperServiceTest {
    val service: KeyMapperService = DefaultKeyMapperService()

    private val KEY: String = "aAbBcCdD"
    private val LINK: String = "http://www.google.com"
    private val LINK_NEW: String = "http://www.yandex.ru"

    @Test
    fun clientCanAddNewKeyWithLink() {
        assertEquals(KeyMapperService.Add.Success(KEY, LINK), service.add(KEY, LINK))
        assertEquals(KeyMapperService.Get.Link(LINK), service.getLink(KEY))
    }

    @Test
    fun clientCanNotAddExistingKey() {
        service.add(KEY, LINK)
        assertEquals(KeyMapperService.Add.AlreadyExist(KEY), service.add(KEY, LINK_NEW))
        assertEquals(KeyMapperService.Get.Link(LINK), service.getLink(KEY))
    }

    @Test
    fun clientCanNotTakeLinkIfKeyIsNotFoundInService() {
        assertEquals(KeyMapperService.Get.NotFound(KEY), service.getLink(KEY))
    }
}