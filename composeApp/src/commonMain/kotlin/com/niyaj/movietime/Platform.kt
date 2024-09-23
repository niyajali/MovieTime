package com.niyaj.movietime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform