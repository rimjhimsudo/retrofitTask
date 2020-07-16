package com.example.myrestapiinternapp.ACTIVITY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myrestapiinternapp.MODEL.Categories;
import com.example.myrestapiinternapp.NETWORK.GetDataServce;
import com.example.myrestapiinternapp.NETWORK.RetofitClientInstance;
import com.example.myrestapiinternapp.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Integer id;
    String name;
    Integer parent_id;
    List<Categories> subCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetDataServce service= RetofitClientInstance.getRetrofitInstance().create(GetDataServce.class);

        Call<List<Categories>> call= service.getAllcategory();
        Log.d("TAGcall",call.request().url().toString());
        call.enqueue(new Callback<List<Categories>>() {
            //Response<List<Categories>> response;
            @Override
            public void onResponse(Call<List<Categories>> callresponse, Response<List<Categories>> response) {
               // progressDialog.dismiss();
                //generateDataList(response.body());

                Log.d("TAG0","what"+response.body().size());
                Toast.makeText(MainActivity.this,"S"+response.body().size(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<List<Categories>> call, Throwable t) {
               // progressDialog.dismiss();;

                Toast.makeText(MainActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
