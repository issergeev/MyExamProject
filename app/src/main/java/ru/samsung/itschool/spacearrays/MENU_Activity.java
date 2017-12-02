package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MENU_Activity extends Activity {

    Button starGameButton, exitGameButton;
    long time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        starGameButton = (Button) findViewById(R.id.startGameButton);
        exitGameButton = (Button) findViewById(R.id.exitGameButton);
        starGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MENU_Activity.this, MainActivity.class));
            }
        });
        exitGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void onBackPressed(){
        if (time + 2000 < System.currentTimeMillis()) {
            Toast.makeText(getApplicationContext(), "Press \"Back\" button again to exit", Toast.LENGTH_SHORT).show();
            time = System.currentTimeMillis();
        } else
            super.onBackPressed();
    }
}