package com.example.abautista.retrofitoauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.abautista.retrofitoauth.Adapters.RecyclerAdapter;
import com.example.abautista.retrofitoauth.Model.Model;
import com.example.abautista.retrofitoauth.Model.ModelLoyalty;
import com.example.abautista.retrofitoauth.Model.ModelPrueba;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InfoActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        String KEY = getIntent().getStringExtra("Token");
        callRetrofitLoyalty(KEY);
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

        Log.d("TAG", "callRetrofitLoyalty:" + s);
        RetrofitOauth sporaService = retrofit.create(RetrofitOauth.class);
        sporaService.getMembersLoyalty(s, modelLoyalty).enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                if (response.isSuccessful()) {
                    Log.d("TAG", "Loyalty" + response.body().getName());
                    Model model;
                    model = response.body();
                    adapterRecyclerCine(model);
                }
            }
            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.e("TAG", "onFailure");

            }
        });
    }


    public void adapterRecyclerCine(Model model){
       /* List<Model> list = new ArrayList<>();
        list.add(model);*/

        List<ModelPrueba> list = new ArrayList<>();

        ModelPrueba model2 = new ModelPrueba("Chucha", "Pedro", "Hembra","Perro");
        ModelPrueba model3 = new ModelPrueba("Chucha", "Pedro", "Hembra","Gato");

        list.add(model2);
        list.add(model3);



        Log.d("TAG", "Tmalo del recycler" + list.size());
        recyclerAdapter = new RecyclerAdapter(InfoActivity.this,list);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(InfoActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.hasFixedSize();

    }
}
