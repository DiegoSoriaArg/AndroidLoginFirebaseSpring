package com.example.loginfirebase.interfaces;

import com.example.loginfirebase.dto.MessageDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface HelloInterface {

    @GET("hello")
    Call<MessageDto> getHello(@Header("Authorization") String token);

}
