package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.messenger.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Напишіть своє ім'я!",Toast.LENGTH_LONG).show();
                } else {
                    name = binding.editText.getText().toString();
                    startActivity(new Intent(MainActivity.this,ChatActivity.class));
                }
            }
        });
    }
}