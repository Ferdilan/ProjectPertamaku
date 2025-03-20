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

public class DataMahasiswaActivity extends AppCompatActivity {

    private EditText inputNama, inputNim, inputKelas, inputIpk;
    private TextView outputNama, outputNim, outputKelas, outputIpk;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_mahasiswa);

        inputNama = findViewById(R.id.input_nama);
        inputNim = findViewById(R.id.input_nim);
        inputKelas = findViewById(R.id.input_kelas);
        inputIpk = findViewById(R.id.input_ipk);
        outputNama = findViewById(R.id.viewNama);
        outputNim = findViewById(R.id.viewNim);
        outputKelas = findViewById(R.id.viewKelas);
        outputIpk = findViewById(R.id.viewIpk);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void handleSubmit(View view) {
        String nama = inputNama.getText().toString();
        String nim = inputNim.getText().toString();
        String kelas = inputKelas.getText().toString();
        String ipk = inputIpk.getText().toString();


        outputNama.setText("Nama: " + nama);
        outputNim.setText("NIM: " + nim);
        outputKelas.setText("Kelas: " + kelas);
        outputIpk.setText("IPK: " + ipk);

    }
}