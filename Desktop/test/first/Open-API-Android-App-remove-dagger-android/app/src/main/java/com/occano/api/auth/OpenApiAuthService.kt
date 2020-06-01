package com.occano.api.auth

import androidx.lifecycle.LiveData
import com.occano.util.GenericApiResponse
import com.occano.api.auth.network_responses.LoginResponse
import com.occano.api.auth.network_responses.RegistrationResponse
import com.occano.di.auth.AuthScope
import retrofit2.http.*

@AuthScope
interface OpenApiAuthService {

    @POST("account/login")
    @FormUrlEncoded
    fun login(
        @Field("username") email: String,
        @Field("password") password: String
    ): LiveData<GenericApiResponse<LoginResponse>>

    @POST("account/register")
    @FormUrlEncoded
    fun register(
        @Field("email") email: String,
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("password2") password2: String
    ): LiveData<GenericApiResponse<RegistrationResponse>>

}
