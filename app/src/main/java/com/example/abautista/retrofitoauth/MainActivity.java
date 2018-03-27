package com.example.abautista.retrofitoauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRetrofit();
            }
        });
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

               SecondActivity( token=response.body().getTokenType()+ " " + response.body().getAccessToken());

            }
            @Override
            public void onFailure(Call<ModelOauth> call, Throwable t) {
            }
        });

    }


public void SecondActivity ( String key){
    Intent intent = new Intent(this,InfoActivity.class);
    intent.putExtra("Token",key);
    startActivity(intent);
}





}
