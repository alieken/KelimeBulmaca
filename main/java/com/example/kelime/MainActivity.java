package com.example.kelime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText kadi;
    EditText sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kadi = (EditText) findViewById(R.id.editText);
        sifre = (EditText) findViewById(R.id.editText2);

    }
    public void ekleb(View view){
        database db=new database(getApplicationContext());
        long id =db.ekle();
        System.out.println("3333333333333333333333333333333333333333333333333333333");
        System.out.println(database.sayacbulmaca);
        System.out.println("33333333333333333333333333333333333333333333333");
       // Toast.makeText(this, database.sayacbulmaca, Toast.LENGTH_SHORT).show();
    }

    public void giris(View view){
        String adi=kadi.getText().toString();
        String sifresi=sifre.getText().toString();
        database db= new database(getApplicationContext());
        int sayac =db.kontrol(adi,sifresi);
        if(sayac==0){
            Toast.makeText(this, "Kullanici adi veya sifre yanlis", Toast.LENGTH_SHORT).show();
        }
        else if(sayac>0){
            Toast.makeText(this, "Giris Basarili Hoşgeldiniz "+adi, Toast.LENGTH_SHORT).show();
            Intent gecisYap = new Intent(MainActivity.this, girissayfasi.class);
            gecisYap.putExtra("bolum",database.KaldigiBolum);
            gecisYap.putExtra("kadi",adi);
            gecisYap.putExtra("sifre",sifresi);
            startActivity(gecisYap);
            finish();
        }
    }
    public void kaydol(View view) {
        if (kadi.getText().equals("") || sifre.getText().equals("")) {
            Toast.makeText(this, "Lütfen boş alanları doldurunuz !!! ", Toast.LENGTH_SHORT).show();
        } else {
            String adi=kadi.getText().toString();
            String sifresi=sifre.getText().toString();
            String kaldik="seviye1bulmaca1";
            kullanici kullaniciler = new kullanici(adi,sifresi,kaldik);
            database db= new database(getApplicationContext());
            long id = db.ekleKullanici(adi,sifresi,kaldik);
            System.out.println("id ="+id);
            if(id>0){
                Toast.makeText(this, "Kayit basarili id="+id, Toast.LENGTH_SHORT).show();
                Intent gecisYap = new Intent(MainActivity.this, MainActivity.class);
                startActivity(gecisYap);
                finish();
            }else if(id==-10){
                Toast.makeText(this, "Böyle bir kullanıcı zaten var Kullanıcı adınızı değiştiriniz !!!", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(this, "BASARISIZ", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void ekle(View view)
    {
        EditText txtUsername=(EditText)findViewById(R.id.editText);
        EditText txtPassword=(EditText)findViewById(R.id.editText2);

        final String username=txtUsername.getText().toString();
        final String password=txtPassword.getText().toString();

        if(username.equals("")==false && password.equals("")==false)
        {
            RequestQueue queue = Volley.newRequestQueue(MainActivity.this);

            String url = "http://192.168.0.103/kaydol.php";    // Post atılan adres.
            StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                    new Response.Listener<String>()
                    {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();

                        }
                    },
                    new Response.ErrorListener()
                    {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                        }
                    }
            ) {
                @Override
                protected Map<String, String> getParams()
                {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("username", username);
                    params.put("password", password);

                    return params;
                }
            };
            queue.add(postRequest);
        }
        else
        {
            Toast.makeText(MainActivity.this,"Lütfen Gerekli Alanları Doldurun", Toast.LENGTH_LONG).show();
        }

    }
}
