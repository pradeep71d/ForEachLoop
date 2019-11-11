package com.example.demo14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {4, 52, 36, 21, 12, 34, 9};
        //  for (int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        for (int x : a) {
            System.out.println(x);
        }
    }
}
