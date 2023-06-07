package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class ExamQuestionsWithAnswers(val question:String, val answer:String,val optionsForMCQs: ArrayList<String>,val relatedImage:String?)
