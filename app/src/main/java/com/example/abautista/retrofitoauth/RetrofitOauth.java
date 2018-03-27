package com.example.abautista.retrofitoauth;

import com.example.abautista.retrofitoauth.Model.Model;
import com.example.abautista.retrofitoauth.Model.ModelLoyalty;
import com.example.abautista.retrofitoauth.Model.ModelOauth;
import com.example.abautista.retrofitoauth.Model.ModelRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;

/**
 * Created by abautista on 3/26/2018.
 */

public interface RetrofitOauth {

    @POST("v2/oauth/token")
    @FormUrlEncoded
    @Headers({"api_key:cinepolis_test_android", "Content-Type:application/x-www-form-urlencoded"})
    Call<ModelOauth> getOauth(
            @Field("country_code") String countryCode,
            @Field("username") String username,
            @Field("password") String password,
            @Field("grant_type") String grantType,
            @Field("client_id") String clientId ,
            @Field("client_secret") String clientSecret
            );

    @POST("v1/members/loyalty")
    @Headers({"api_key:cinepolis_test_android",
            "Content-Type:application/json"})
    Call<Model> getMembersLoyalty(@Header("Authorization") String credential, @Body  ModelLoyalty bodyMemberLoyalty);


}
