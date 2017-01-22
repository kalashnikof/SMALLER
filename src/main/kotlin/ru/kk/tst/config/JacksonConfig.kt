package ru.kk.tst.config

import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by Kirill on 22.01.2017.
 */

//todo: there's no need in that class?

@Configuration
open class JacksonConfig {
    @Bean open fun kotlinModule() = KotlinModule
}