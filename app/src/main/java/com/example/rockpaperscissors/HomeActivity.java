package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;
import java.util.RandomAccess;

public class HomeActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button rockButton = findViewById(R.id.rock);
        Button paperButton = findViewById(R.id.paper);
        Button scissorsButton = findViewById(R.id.scissors);
        Button reset = findViewById(R.id.reset);
        ImageView userInput = findViewById(R.id.userInput);
        ImageView computerInput = findViewById(R.id.computerInput);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int computerChoice = randomNumber.nextInt(4 - 1) + 1;

                userInput.setImageDrawable(getDrawable(R.drawable.rock));
                if (computerChoice == 1) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.rock));
                    Toast.makeText(HomeActivity.this, "Draw! \uD83C\uDF8C", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 2) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.paper));
                    Toast.makeText(HomeActivity.this, "You Lost!", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 3) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.scissors));
                    Toast.makeText(HomeActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int computerChoice = randomNumber.nextInt(4 - 1) + 1;

                userInput.setImageDrawable(getDrawable(R.drawable.paper));
                if (computerChoice == 1) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.rock));
                    Toast.makeText(HomeActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 2) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.paper));
                    Toast.makeText(HomeActivity.this, "Draw! \uD83C\uDF8C", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 3) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.scissors));
                    Toast.makeText(HomeActivity.this, "You Lost!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int computerChoice = randomNumber.nextInt(4 - 1) + 1;

                userInput.setImageDrawable(getDrawable(R.drawable.scissors));
                if (computerChoice == 1) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.rock));
                    Toast.makeText(HomeActivity.this, "You Lost!", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 2) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.paper));
                    Toast.makeText(HomeActivity.this, "You Won!", Toast.LENGTH_SHORT).show();
                }
                else if (computerChoice == 3) {
                    computerInput.setImageDrawable(getDrawable(R.drawable.scissors));
                    Toast.makeText(HomeActivity.this, "Draw! \uD83C\uDF8C", Toast.LENGTH_SHORT).show();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInput.setImageDrawable(getDrawable(R.drawable.image));
                computerInput.setImageDrawable(getDrawable(R.drawable.image));
            }
        });
    }
}