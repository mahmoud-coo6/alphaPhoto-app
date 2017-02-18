package com.example2.acer.myapp5;

import android.nfc.cardemulation.OffHostApduService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     ImageView pho1;
     ImageView pho2 ;
    int count=0;
    public void change(View view){
        if(count==0){
            pho1.animate().alpha(0f).setDuration(2000);
            pho2.animate().alpha(1f).setDuration(2000);
            count += 1;
        }else{
            pho2.animate().alpha(0f).setDuration(2000);
            pho1.animate().alpha(1f).setDuration(2000);
            count =0;
        }
        //ImageView pho2 =  (ImageView) findViewById(R.id.imageView2);
        //   pho2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        // pho2.animate().translationY(180f).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pho1 =  (ImageView) findViewById(R.id.imageView2);
        pho2 = (ImageView) findViewById(R.id.imageView);


    }
}
