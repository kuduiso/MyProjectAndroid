package id.kuduiso.kangcukur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarKangCukur extends AppCompatActivity {
    private Button buttonDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kang_cukur);

        buttonDaftar = findViewById(R.id.btn_daftar);
        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeKangCukur();
            }
        });
    }

    public void openHomeKangCukur() {
        Intent intent = new Intent(this, HomeKangCukur.class);
        startActivity(intent);
    }


}
