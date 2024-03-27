package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        OkHttpClient client = new OkHttpClient();

//        String url = "https://jsonplaceholder.typicode.com/todos/1";
//
//        Request req = new Request.Builder()
//                .url(url)
//                .build();
//
//        try (Response response = client.newCall(req).execute()) {
//            if(!response.isSuccessful()){
//                System.out.println("Something went wrong");
//            }
//            System.out.println("Response Body is : " + response.body().string());
//        }catch (IOException ex) {
//            ex.printStackTrace();
//        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);

        Todo t = todoService.getTodoById("1").execute().body();

        System.out.println(t.toString());
    }
}
