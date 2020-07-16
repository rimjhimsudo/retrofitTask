package com.example.myrestapiinternapp.MODEL;

import com.google.gson.annotations.SerializedName;

public class Categories {
    @SerializedName("id")
    private  Integer id;
    @SerializedName("name")
    private  String name;
    @SerializedName("parent_id")
    private Integer parent_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Categories getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Categories subCategory) {
        this.subCategory = subCategory;
    }

    @SerializedName("subCategory")
    private  Categories subCategory;

    public Categories(Integer id, String name, Integer parent_id, Categories subCategory) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.subCategory = subCategory;
    }
}
