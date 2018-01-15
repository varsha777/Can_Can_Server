package com.varsha.serverapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("CanCan/getAllUsersData.php")
    Call<JSONResponse> getJSON();
}
