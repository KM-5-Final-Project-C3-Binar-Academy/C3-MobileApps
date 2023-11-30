package com.c3.mobileapps.data.remote.service

import com.c3.mobileapps.data.remote.model.response.course.CategoryResponse
import com.c3.mobileapps.data.remote.model.response.course.CourseResponse
import retrofit2.http.GET

interface ApiServiceCourse {
    @GET("course-categories")
    suspend fun getCategory(): CategoryResponse

    @GET("courses")
    suspend fun getCourse(): CourseResponse
}