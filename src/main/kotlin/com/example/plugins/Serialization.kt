package com.example.plugins

import com.example.data.ExamQuestionsWithAnswers
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/json/kotlinx-serialization") {
                call.respond(mapOf("hello" to "world"))
            }
        get ("/questions"){
            call.respond(listOfQuestions())
        }
    }
}

fun listOfQuestions() = arrayListOf<ExamQuestionsWithAnswers>(
    ExamQuestionsWithAnswers("question 1", "solution 1", arrayListOf("solution 1", " solution 2", "solution 3"),null),
    ExamQuestionsWithAnswers("question 2", "solution 2", arrayListOf("solution 1", " solution 2", "solution 3"),null),
    ExamQuestionsWithAnswers("question 3", "solution 3", arrayListOf("solution 1", " solution 2", "solution 3"),null),
    ExamQuestionsWithAnswers("question 4", "solution 4", arrayListOf("solution 4", " solution 2", "solution 3"),null),
    ExamQuestionsWithAnswers("question 5", "solution 5", arrayListOf("solution 1", " solution 5", "solution 3"),null),
)
