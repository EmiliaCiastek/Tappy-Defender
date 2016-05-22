package com.games.emcia.tappydefender2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Get a reference to the button in our layout
        final Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        // Listen for clicks
        buttonPlay.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        // must be the Play button.
        // Create a new Intent object
        Intent intentGame = new Intent(this, GameActivity.class);
        // Start our GameActivity class via the Intent
        startActivity(intentGame);
        // Now shut this activity down
        finish();
    }
}
