package com.example.agrim.agrimactivity1;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        constraintLayout = findViewById(R.id.view);
    }
    public void onclick(View view)
    {
        Toast.makeText(this, ""+editText.getText().toString(), Toast.LENGTH_SHORT).show();

    }


}
