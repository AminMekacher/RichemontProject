package ch.epfl.esl.weddingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import ch.epfl.esl.weddingproject.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button startCameraButton;
    private float[] xArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        startCameraButton = findViewById(R.id.startCameraButton);
        startCameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, SamsungCamera.class);
                startActivity(intent);
            }
        });

        /*if (getIntent().getExtras() != null) {
            xArray = getIntent().getExtras().getFloatArray("X Values");
            Log.e("Tag", "Received values: " + xArray.length);
        }*/
    }

}
