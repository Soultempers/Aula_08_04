package com.example.aula_08_04;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_animada);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5);
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                } catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }; thread.start();
    }
}