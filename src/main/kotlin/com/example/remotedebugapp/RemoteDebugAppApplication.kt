package com.example.remotedebugapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RemoteDebugAppApplication

fun main(args: Array<String>) {
	runApplication<RemoteDebugAppApplication>(*args)
}
