package com.example.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity{
    ViewFlipper viewFlipper;
    Button btn_login;
    TextView btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper=findViewById(R.id.viewFlipper);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById( R.id.btn_register);
        int Image[]={R.drawable.halong,R.drawable.causonghan,R.drawable.chuabaidinh,R.drawable.phuquoc};
        for (int i=0;i<Image.length;i++){
            Fliperimage(Image[i]);
        }
    }
    public void Fliperimage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
    }

}