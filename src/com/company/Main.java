package com.company;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        UserInfo userInfo = new UserInfo(1, "Жылдызбек Осмонкулов", "Active", "700999899");
        System.out.println(userInfo);
        String transientJson = gson.toJson(userInfo);
        System.out.println(transientJson);

    }
}
