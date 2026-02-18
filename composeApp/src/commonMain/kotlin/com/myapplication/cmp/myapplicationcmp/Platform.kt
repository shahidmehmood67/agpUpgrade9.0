package com.myapplication.cmp.myapplicationcmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform