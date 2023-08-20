package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    private Button btn;
    private Boolean isImg = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imageView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(isImg){
                    imgView.setImageResource(R.drawable.fvoid);
                }
                else{
                    imgView.setImageResource(R.drawable.invoker);
                }
                isImg = !isImg;
                String toastMessage = isImg ? "Image changed to Faceless Void" : "Image changed to Invoker";
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
                if (isImg) {
                    btn.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.button_color_true));
                } else {
                    btn.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.button_color_false));
                }
            }
        });
    }
}