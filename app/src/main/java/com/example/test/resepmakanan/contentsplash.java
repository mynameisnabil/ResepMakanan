package com.example.test.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class contentsplash extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.content_splash);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);  //Waktu pending 3 detik
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(contentsplash.this, MainActivity.class));

                }
            }
        });
        thread.start();
    }
}
