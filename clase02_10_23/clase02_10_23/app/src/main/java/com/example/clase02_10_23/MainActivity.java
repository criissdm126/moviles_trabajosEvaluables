package com.example.clase02_10_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG cicloVida ", "CicloVida: onStart");

         i=0;
    }

    @Override
    protected void  onStart(){
        super.onStart();
        Log.i("TAG cicloVida ", "CicloVida: onCreate");
        i++;
    }


    @Override
    protected void  onResume(){
        super.onResume();

        Log.i("TAG ciloVida" , "CicloVida: onResume");
        i++;
    }

    @Override
    public void  onPause(){
        super.onPause();
        Log.i("TAG cicloVida ", "CicloVida: onPause");
        i ++;
    }
    @Override
    public void  onStop(){
        super.onStop();
        Log.i("TAG cicloVida ", "CicloVida: onStop");
        i --;
    }
    @Override
    public void  onDestroy(){
        super.onDestroy();
        Log.i("TAG cicloVida ", "CicloVida: onDestroy");
        i--;
    }

}