package com.example.recursividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //contar(1,20);
        Log.i("log","->"+(factorial(6 )));
    }

    /*public void contar(int numero, int limite) {
        if (numero > limite) {
            Log.i("log", "Se acabó la función, (apalusos)");
        } else {
            Log.i("log", "Numero ->" + numero);
            contar(numero + 1,limite);
        }

    }*/
    public int factorial (int num){
        int res =1;
        if(num<=1) {
            Log.i("log","se acabó la recursividad");
             return 1;

        }else{
            Log.i("log","->"+res);
            return res= num * factorial (num-1);
        }

    }

    }
       /* if(num== 0 || num ==1){
            Log.i("log","se acabó la recursividad");
        }else{
            int res=1;
            for(int i=num; i>0; i-- ){
                res*= i;
                Log.i("log","->"+num);
            }
        }*/




