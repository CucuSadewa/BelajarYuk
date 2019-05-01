package com.example.belajaryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btndashboard;
    private EditText edtNama, edtNis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edt_nama);
        edtNis = (EditText) findViewById(R.id.edt_nis);
        btndashboard = (Button) findViewById(R.id.btn_dash);
    }

    public void dashboard(View view) {
        String Nama = edtNama.getText().toString().trim();
        String Nis = edtNis.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(Nama)) {
            isEmptyFields = true;
            edtNama.setError("Field Ini Tidak Boleh Kosong");
        }

        if (TextUtils.isEmpty(Nis)) {
            isEmptyFields = true;
            edtNis.setError("Field Ini Tidak Boleh Kosong");
        }

        if (!isEmptyFields) {
            Intent intentDash = new Intent(MainActivity.this, DashboardActivity.class);
            startActivity(intentDash);
            Toast.makeText(getApplicationContext(), "Silahkan Pilih Kategori Mata Pelajaran", Toast.LENGTH_SHORT).show();
        }
    }
}
