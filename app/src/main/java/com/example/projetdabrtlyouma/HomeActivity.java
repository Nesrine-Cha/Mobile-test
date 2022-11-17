package com.example.projetdabrtlyouma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projetdabrtlyouma.Entity.User;

public class HomeActivity extends AppCompatActivity {
    private TextView tvUser;
    private  TextView textViewRer;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.tvUser);
        textViewRer= findViewById(R.id.textViewRer);
        textViewRer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, NoteActivity.class));
            }
        });

                if (user != null) {
            tvUser.setText("WELCOME " + user.getUserName());
        }
    }
}