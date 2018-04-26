package com.danbamitale.hellospark

import org.eclipse.jetty.http.HttpStatus
import spark.kotlin.get
import spark.kotlin.port
import spark.kotlin.post

fun main(args: Array<String>){
    println("Starting server on port 8080")
    port(8080)
    println("Setting up routes")
    root()
}


fun root(){
    get("/", "text/html; utf-8"){
        response.status(HttpStatus.OK_200)
        "Hello Work Spark"
    }

    post("/"){
        response.status(HttpStatus.FORBIDDEN_403)
        "Request not permitted"
    }
}