package com.angelo_silvestre.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimeCharacterDetails extends AppCompatActivity {

    private static final String Tag = "MainActivity";

    private Button backBtn;
    private ImageView imageCoverDetails;
    private TextView nameDetails, characterDetails, shortDescDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_character_details);
        init();

        backBtn.setOnClickListener(view -> {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(AnimeCharacterDetails.this,MainActivity.class);
                    startActivity(intent);

                    finish();
                }
            },1);
        });




        nameDetails.setText(DemonSlayerRecViewAdapter.getPassName());
        characterDetails.setText(DemonSlayerRecViewAdapter.getPassCharacter());
        shortDescDetails.setText(DemonSlayerRecViewAdapter.getPassDescription());
        imageCoverDetails.setImageResource(DemonSlayerRecViewAdapter.getPassimageUrlCover());

        Log.d(Tag,
                "Get all the values of clicked cardview " +
                        "Name " + DemonSlayerRecViewAdapter.getPassName() +
                        "Character " + DemonSlayerRecViewAdapter.getPassCharacter() +
                        "Description " + DemonSlayerRecViewAdapter.getPassDescription() +
                        "ImageCover " + DemonSlayerRecViewAdapter.getPassimageUrlCover()
        );




    }

    private void init(){

        imageCoverDetails = findViewById(R.id.cover_image);
        nameDetails = findViewById(R.id.det_char_name);
        characterDetails = findViewById(R.id.det_char_role);
        shortDescDetails = findViewById(R.id.det_char_short_desc);
        backBtn = findViewById(R.id.btn_back);

        backBtn.bringToFront();


    }
}