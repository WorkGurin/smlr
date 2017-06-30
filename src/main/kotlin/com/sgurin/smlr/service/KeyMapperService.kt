package com.sgurin.smlr.service

/**
 * Created by Stanislav Gurin on 30.06.2017.
 */
interface KeyMapperService {
    interface Get {
        data class Link(val link: String) : Get
        data class NotFound(val key: String) : Get
    }

    fun getLink(key: String): Get
    fun add(link: String): String
}