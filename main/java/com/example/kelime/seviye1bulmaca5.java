package com.example.kelime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class seviye1bulmaca5 extends AppCompatActivity {
    String kelime="";
    Button Stanim;
    Button Itanim;
    Button Ttanim;
    Button Atanim;
    Button Ktanim;
    Button Ytanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button ayia;
    Button ayiy;
    Button ayii;
    Button yata;
    Button yatt;
    Button taya;
    Button tayy;
    Button yasa;
    Button yass;
    Button ski;
    Button skk;
    Button akia;
    Button akii;
    int girisizniayi=1;
    int girisizniyat=1;
    int girisiznitay=1;
    int girisizniyas=1;
    int girisiznisiki=1;
    int girisizniaki=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca5);

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca5");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        startTime = System.currentTimeMillis();
        Atanim=(Button) findViewById(R.id.A);
        Ttanim=(Button) findViewById(R.id.T);
        Stanim=(Button) findViewById(R.id.S);
        Ktanim=(Button) findViewById(R.id.K);
        Ytanim=(Button) findViewById(R.id.Y);
        Itanim=(Button) findViewById(R.id.I);
        onayla=(Button) findViewById(R.id.onay);
        Atanim.setBackgroundColor(Color.CYAN);
        Ytanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        devamet=(Button) findViewById(R.id.devambutonu);
        ayia=(Button) findViewById(R.id.ayia);
        ayiy=(Button) findViewById(R.id.ayiy);
        ayii=(Button) findViewById(R.id.ayii);
        yata=(Button) findViewById(R.id.yata);
        yatt=(Button) findViewById(R.id.yatt);
        taya=(Button) findViewById(R.id.taya);
        tayy=(Button) findViewById(R.id.tayy);
        yasa=(Button) findViewById(R.id.yasa);
        yass=(Button) findViewById(R.id.yass);
        ski=(Button) findViewById(R.id.ski);
        skk=(Button) findViewById(R.id.skk);
        akia=(Button) findViewById(R.id.akia);
        akii=(Button) findViewById(R.id.akii);
    }
    //0-y,1-a,2-s,3-t,4-ı,5-k
    public void karistir(final View view){
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(0);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("-----------------------------------------------------");
        // Random r=new Random(); //random sınıfı
        //int a=r.nextInt(6);
        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ytanim=findViewById(R.id.Y)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ytanim=findViewById(R.id.A)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ytanim=findViewById(R.id.S)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ytanim=findViewById(R.id.T)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ytanim=findViewById(R.id.I)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ytanim=findViewById(R.id.K)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                }

            }
            for (int j = 0; j < ar.size() ; j++) {
                System.out.println("+++++++++++++++++++++++++++++++");
                System.out.println(ar.get(j));
                System.out.println("+++++++++++++++++++++++++++++++");
            }
            if(gecis==0){
                break;
            }
        }



        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Atanim=findViewById(R.id.Y)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.A)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.S)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.T)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.I)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.K)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                }

            }
            if(gecis==0){
                break;
            }
        }



        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Stanim=findViewById(R.id.Y)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Stanim=findViewById(R.id.A)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Stanim=findViewById(R.id.S)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Stanim=findViewById(R.id.T)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Stanim=findViewById(R.id.I)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim=findViewById(R.id.K)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    for (int k = 0; k < ar.size(); k++) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(ar.get(k));
                    }
                }

            }
            if(gecis==0){
                break;
            }
        }
        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ttanim=findViewById(R.id.Y)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.S)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.T)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim=findViewById(R.id.I)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.K)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    for (int k = 0; k < ar.size(); k++) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(ar.get(k));
                    }
                }

            }
            if(gecis==0){
                break;
            }
        }

        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Itanim=findViewById(R.id.Y)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.A)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.S)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.T)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.I)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.K)).setText("I");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }

                    for (int k = 0; k < ar.size(); k++) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(ar.get(k));
                    }
                }

            }
            if(gecis==0){
                break;
            }
        }





        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ktanim=findViewById(R.id.Y)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ktanim=findViewById(R.id.A)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.S)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.T)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.I)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.K)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    for (int k = 0; k < ar.size(); k++) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(ar.get(k));
                    }
                }

            }
            if(gecis==0){
                break;
            }
        }




        for (int i = 0; i < ar.size(); i++) {
            ar.remove(i);
        }
    }
    @Override    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Çıkış Yapmak istiyor musunuz?");
        builder.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            @Override            public void onClick(DialogInterface dialog, int which) {
                // Evet'e basılınca yapılacak işlemleri yazınız
                database db=new database(getApplicationContext());
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca5");
                ActivityCompat.finishAffinity(seviye1bulmaca5.this);
            }
        });
        builder.setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
            @Override            public void onClick(DialogInterface dialog, int which) {
                // Hayır'a baslınca yapılacak işmeleri yazınız
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisy(View view){
        Ytanim.setBackgroundColor(Color.GRAY);
        kelime+="Y";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }

    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="I";
    }
    public void renkdegiss(View view){
        Stanim.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("AYI") && girisizniayi == 1) {
            puan+=60;
            ayia.setText("A");
            ayia.setBackgroundColor(Color.GREEN);
            ayiy.setText("Y");
            ayiy.setBackgroundColor(Color.GREEN);
            ayii.setText("I");
            ayii.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniayi=0;
        }
        else if(kelime.equalsIgnoreCase("YAT") && girisizniyat == 1) {
            puan+=50;
            yata.setText("A");
            yata.setBackgroundColor(Color.GREEN);
            ayiy.setText("Y");
            ayiy.setBackgroundColor(Color.GREEN);
            yatt.setText("T");
            yatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniyat=0;
        }
        else if(kelime.equalsIgnoreCase("TAY") && girisiznitay == 1) {
            puan+=50;
            taya.setText("A");
            taya.setBackgroundColor(Color.GREEN);
            tayy.setText("Y");
            tayy.setBackgroundColor(Color.GREEN);
            yatt.setText("T");
            yatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitay=0;
        }
        else if(kelime.equalsIgnoreCase("YAS") && girisizniyas == 1) {
            puan+=60;
            yasa.setText("A");
            yasa.setBackgroundColor(Color.GREEN);
            tayy.setText("Y");
            tayy.setBackgroundColor(Color.GREEN);
            yass.setText("S");
            yass.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniyas=0;
        }
        else if(kelime.equalsIgnoreCase("SIK") && girisiznisiki == 1) {
            puan+=50;
            ski.setText("I");
            ski.setBackgroundColor(Color.GREEN);
            skk.setText("K");
            skk.setBackgroundColor(Color.GREEN);
            yass.setText("S");
            yass.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisiki=0;
        }
        else if(kelime.equalsIgnoreCase("AKI") && girisizniaki == 1) {
            puan+=40;
            akii.setText("I");
            akii.setBackgroundColor(Color.GREEN);
            skk.setText("K");
            skk.setBackgroundColor(Color.GREEN);
            akia.setText("A");
            akia.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniaki=0;
        }
        else{
            puan-=2;
        }
        if(sayac==6){
            devamet.setVisibility(View.VISIBLE);

            // ... zaman alan bazı işlemler ...
            long endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
            double seconds = (double)estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
            puan-=seconds;
            String st=""+puan;
            yourpuan.setText(st);
            if (puan>database.bestpuan){
                database db=new database(getApplicationContext());
                db.puanguncelle("seviye1bulmaca5",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        Ytanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye1bulmaca5.this, seviye1bulmaca6.class);
        startActivity(gecisYap);
        finish();
    }
}
