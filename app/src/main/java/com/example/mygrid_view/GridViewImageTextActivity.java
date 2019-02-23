package com.example.mygrid_view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewImageTextActivity extends AppCompatActivity {

    TextView tvSwipDescription;
     @SuppressLint("ClickableViewAccessibility")
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initializeView();

        tvSwipDescription.setOnTouchListener(new OnSwipeTouchListener(GridViewImageTextActivity.this){
            public void onSwipeTop() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastTop), Toast.LENGTH_SHORT).show();
                Intent intent =new Intent (GridViewImageTextActivity.this,Main2Activity.class);
                startActivity(intent);

            }
            public void onSwipeRight() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastRight), Toast.LENGTH_SHORT).show();
                Intent intent =new Intent (GridViewImageTextActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            public void onSwipeLeft() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastLeft), Toast.LENGTH_SHORT).show();
                Intent intent =new Intent (GridViewImageTextActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            public void onSwipeBottom() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastBottom), Toast.LENGTH_SHORT).show();
                Intent intent =new Intent (GridViewImageTextActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

      }

    private void initializeView() {
        tvSwipDescription=(TextView) findViewById(R.id.tvSwipDescription);
    }
}
