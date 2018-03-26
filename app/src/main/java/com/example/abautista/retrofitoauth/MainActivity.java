package com.example.abautista.retrofitoauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.abautista.retrofitoauth.Model.Model;
import com.example.abautista.retrofitoauth.Model.ModelLoyalty;
import com.example.abautista.retrofitoauth.Model.ModelOauth;
import com.example.abautista.retrofitoauth.Model.ModelRequest;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;

public class MainActivity extends AppCompatActivity {
    String token;
     String countryCode = "MX";
     String username = "pruebas-pruebas-ia@outlook.com";
     String password = "Pruebas01";
     String grantType = "password";
     String clientId = "CinepolisAndroidMobile";
     String clientSecret = "129ed5aae0a74176b54dd597a47bfe63";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callRetrofit();

    }

    private void callRetrofit() {
        String endPoint = getString(R.string.host_oauth);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endPoint)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitOauth sporaService = retrofit.create(RetrofitOauth.class);
        Call<ModelOauth> modelOauthCall = sporaService.getOauth(countryCode,username,password,grantType,clientId,clientSecret);
        modelOauthCall.enqueue(new Callback<ModelOauth>() {
            @Override
            public void onResponse(Call<ModelOauth> call, Response<ModelOauth> response) {
                Log.d("TAG", "RESPONSE "+response.body().getUsername());


                callRetrofitLoyalty(token=response.body().getTokenType()+ " " + response.body().getAccessToken());

            }
            @Override
            public void onFailure(Call<ModelOauth> call, Throwable t) {
            }
        });





    }


    private void callRetrofitLoyalty(String s) {
        String endPoint = getString(R.string.host);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endPoint)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ModelLoyalty modelLoyalty = new ModelLoyalty();
        modelLoyalty.setCardNumber("1303030317482433");
        modelLoyalty.setCountryCode("MX");
        modelLoyalty.setTransactionInclude(true);


        Log.d("TAG", "callRetrofitLoyalty:"+ s);
        RetrofitOauth sporaService = retrofit.create(RetrofitOauth.class);
        sporaService.getMembersLoyalty(s,modelLoyalty).enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {

                if(response.isSuccessful()) {
                    Log.d("TAG", "Loyalty" + response.body().getName());
                }
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.e("TAG", "onFailure");

            }
        });



    }





}
