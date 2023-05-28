package com.redforest.breadcrumbs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BreadCrumbsApplication

fun main(args: Array<String>) {
	runApplication<BreadCrumbsApplication>(*args)
}
