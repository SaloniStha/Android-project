package com.example.helloworld.response;

import com.example.helloworld.model.Food;

import java.util.ArrayList;

public class FoodResponse {
    private boolean success;
    private String message;
    private ArrayList<Food> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Food> getData() {
        return data;
    }

    public void setData(ArrayList<Food> data) {
        this.data = data;
    }
}
