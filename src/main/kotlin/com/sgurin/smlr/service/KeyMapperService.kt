package com.sgurin.smlr.service

/**
 * Created by Stanislav Gurin on 30.06.2017.
 */
interface KeyMapperService {
    interface Add {
        data class Success(val key: String, val link: String) : Add
        data class AlreadyExist(val key: String) : Add
    }

    interface Get {
        data class Link(val link: String) : Get
        data class NotFound(val key: String) : Get
    }

    fun add(key: String, link: String): Add
    fun getLink(key: String): Get
}