package com.example.myrestapiinternapp.NETWORK;

import com.example.myrestapiinternapp.MODEL.Categories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataServce {
    @GET("/v3/f79cbce1-a70e-4313-8d76-00d19ee3b4c1")
    Call<List<Categories>> getAllcategory();
    /*Call<List<Categories>> getAllcategory(@Query("id") Integer id,
                                          @Query("name") String name,
                                          @Query("parent_id") Integer parent_id,
                                          @Query("subCategory") List<Categories> subCategory*/
    //Call<List<RetroPhoto>> getallPhotos();
}
