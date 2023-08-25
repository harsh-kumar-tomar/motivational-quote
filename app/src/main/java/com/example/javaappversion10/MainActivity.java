package com.example.javaappversion10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> motivationalQuotes ;


    int [] imageResourceIds = {
            R.drawable.anime ,
            R.drawable.anime0 ,


    };

    int randomIndex ;

    TextView textMotivational ;
    ImageView imageMotivational ;
    Button changePic ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        motivationalQuotes = new ArrayList<>() ;
        setMotivationalQuotes();






        intialize();
    }

    public void change (View view)
    {
        Random random = new Random();
        randomIndex = random.nextInt(imageResourceIds.length);
        imageMotivational.setImageResource(imageResourceIds[randomIndex]);

        textMotivational.setText(motivationalQuotes.get(randomIndex));

    }

    private void intialize() {

        imageMotivational = findViewById(R.id.imageMotivational);
        textMotivational = findViewById(R.id.textMotivational);
        changePic = findViewById(R.id.changePic);

    }

    public void setMotivationalQuotes()
    {
        motivationalQuotes.add("The best time to plant a tree was 20 years ago. The second best time is now.");
        motivationalQuotes.add("Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.");
        motivationalQuotes.add("Everything comes to him who hustles while he waits.");
        motivationalQuotes.add("Invest in your dreams. Grind now. Shine later");
        motivationalQuotes.add("We are what we repeatedly do. Excellence, then, is not an act, but a habit.");
        motivationalQuotes.add("Great things are done by a series of small things brought together.");
        motivationalQuotes.add("“Leaders can let you fail and yet not let you be a failure.");
    }
}