package id.kuduiso.kangcukur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginKangCukur extends AppCompatActivity {
    private Button buttonDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_kang_cukur);

        buttonDaftar = findViewById(R.id.btn_daftar);
        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaftarKangCukur();
            }
        });
    }


    public void openDaftarKangCukur() {
        Intent intent = new Intent(this, DaftarKangCukur.class);
        startActivity(intent);
    }

}
