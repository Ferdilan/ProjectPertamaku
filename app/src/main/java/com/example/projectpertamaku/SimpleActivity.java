package com.example.projectpertamaku;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SimpleActivity extends AppCompatActivity {

//    Pendeklarasian atribut
    private EditText inputName;
    private TextView outputText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simple);

//        Pengenalan Komponen
        inputName = findViewById(R.id.input_name);
        outputText = findViewById(R.id.output_name);
        button = findViewById(R.id.button_submit);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void handleSubmit(View view) {
        String name = inputName.getText().toString();
        outputText.setText("Hello "+ name);
    }
}