package com.example.less_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_1);
        CardView cardView = findViewById(R.id.card_view);
        ImageView imageView = findViewById(R.id.img_doctor);
        LinearLayout linearLayout = findViewById(R.id.container);
        Button button2 =findViewById(R.id.btn_2);
        EditText editText  =findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cardView.getAlpha()==1) {
                    cardView.animate().alpha(0);
                    imageView.animate().alpha(0);
                }else{
                    cardView.animate().alpha(1);
                    imageView.animate().alpha(1);


                }
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(linearLayout.getVisibility()==View.VISIBLE){
                    linearLayout.setVisibility(View.GONE);
                }else{
                    linearLayout.setVisibility(View.VISIBLE);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}