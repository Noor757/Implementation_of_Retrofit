package com.example.api;
import retrofit2.Call;
import retrofit2.http.GET;
public interface Methods {
    @GET("api/users?page=1")
    Call<UserData> getAllData();
}
