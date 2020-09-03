package com.example.kelime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class girissayfasi extends AppCompatActivity {
    Button btnDegisken;
    Button kapat;
    String bolum;
    String kadi;
    String sifresi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girissayfasi);
        btnDegisken    =   (Button) findViewById(R.id.newgamebutton);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            bolum = bundle.getString("bolum");
            kadi = bundle.getString("kadi");
            sifresi = bundle.getString("sifre");
        }
    }

    public void newgamegecis(View view){
        database db=new database(getApplicationContext());
        db.guncelle(kadi,sifresi,"seviye1bulmaca1");
        Intent gecisYap = new Intent(girissayfasi.this, seviye1bulmaca1.class);
        gecisYap.putExtra("kadi",kadi);
        gecisYap.putExtra("sifre",sifresi);
        startActivity(gecisYap);
    }
    public void bitir(View view){
        System.exit(0);
    }
    public void resumegamegecis(View view) throws ClassNotFoundException {
       // user_name.getClass();
        //com.example.kelime.girissayfasi
        String duzelt = "com.example.kelime."+bolum;
        Intent gecisYap = new Intent(girissayfasi.this,Class.forName(duzelt));
        gecisYap.putExtra("bolum",database.KaldigiBolum);
        startActivity(gecisYap);
    }
    public void kapatke(View view){
        Intent gecisYap = new Intent(girissayfasi.this, MainActivity.class);
        startActivity(gecisYap);
        finish();
    }
}
