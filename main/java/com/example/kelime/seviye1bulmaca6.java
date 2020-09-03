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

public class seviye1bulmaca6 extends AppCompatActivity {
    String kelime="";
    Button Stanim;
    Button Itanim;
    Button Stanim2;
    Button Ttanim;
    Button Etanim;
    Button Mtanim;
    Button onayla;
    Button devamet;
    Button siss;
    Button siss2;
    Button sisi;
    Button sete;
    Button sett;
    Button simi;
    Button simm;
    Button timi;
    Button timm;
    Button misi;
    Button miss;
    Button siti;
    Button sitt;
    Button seme;
    Button sems;
    int sayac=0;
    int girisiznisis=1;
    int girisizniset=1;
    int girisiznisim=1;
    int girisiznitim=1;
    int girisiznimis=1;
    int girisiznisit=1;
    int girisiznisem=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca6);

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca6");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        startTime = System.currentTimeMillis();
        Stanim2=(Button) findViewById(R.id.S2);
        Ttanim=(Button) findViewById(R.id.T);
        Stanim=(Button) findViewById(R.id.S);
        Etanim=(Button) findViewById(R.id.E);
        Mtanim=(Button) findViewById(R.id.M);
        Itanim=(Button) findViewById(R.id.I);
        onayla=(Button) findViewById(R.id.onay);
        Stanim2.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        devamet=(Button) findViewById(R.id.devambutonu);
        siss=(Button) findViewById(R.id.siss);
        siss2=(Button) findViewById(R.id.siss2);
        sisi=(Button) findViewById(R.id.sisi);
        sete=(Button) findViewById(R.id.sete);
        sett=(Button) findViewById(R.id.sett);
        simi=(Button) findViewById(R.id.simi);
        simm=(Button) findViewById(R.id.simm);
        misi=(Button) findViewById(R.id.misi);
        miss=(Button) findViewById(R.id.miss);
        siti=(Button) findViewById(R.id.siti);
        sitt=(Button) findViewById(R.id.sitt);
        timi=(Button) findViewById(R.id.timi);
        timm=(Button) findViewById(R.id.timm);
        seme=(Button) findViewById(R.id.seme);
        sems=(Button) findViewById(R.id.sems);
    }

    //0-s,1-i,2-s2,3-t,4-e,5-m
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
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Stanim=findViewById(R.id.S)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Stanim=findViewById(R.id.I)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Stanim=findViewById(R.id.S2)).setText("S");
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
                        (Stanim=findViewById(R.id.E)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim=findViewById(R.id.M)).setText("S");
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
                        (Itanim=findViewById(R.id.S)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.I)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.S2)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.T)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.E)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.M)).setText("İ");
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
                        (Stanim2=findViewById(R.id.S)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Stanim2=findViewById(R.id.I)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Stanim2=findViewById(R.id.S2)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Stanim2=findViewById(R.id.T)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Stanim2=findViewById(R.id.E)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim2=findViewById(R.id.M)).setText("S");
                        Stanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss2(view);
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
                        (Ttanim=findViewById(R.id.S)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.I)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.S2)).setText("T");
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
                        (Ttanim=findViewById(R.id.E)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.M)).setText("T");
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
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Etanim=findViewById(R.id.S)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim=findViewById(R.id.I)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.S2)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.T)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.E)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.M)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
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
                        (Mtanim=findViewById(R.id.S)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.I)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.S2)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.T)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.E)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca6");
                ActivityCompat.finishAffinity(seviye1bulmaca6.this);
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
    public void renkdegiss2(View view){
        Stanim2.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }

    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void renkdegiss(View view){
        Stanim.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("SİS") && girisiznisis == 1) {
            puan+=50;
            siss.setText("S");
            siss.setBackgroundColor(Color.GREEN);
            siss2.setText("S");
            siss2.setBackgroundColor(Color.GREEN);
            sisi.setText("İ");
            sisi.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisis=0;
        }
        else if(kelime.equalsIgnoreCase("SET") && girisizniset== 1) {
            puan+=40;
            siss.setText("S");
            siss.setBackgroundColor(Color.GREEN);
            sete.setText("E");
            sete.setBackgroundColor(Color.GREEN);
            sett.setText("T");
            sett.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniset=0;
        }
        else if(kelime.equalsIgnoreCase("SİM") && girisiznisim== 1) {
            puan+=50;
            siss2.setText("S");
            siss2.setBackgroundColor(Color.GREEN);
            simi.setText("İ");
            simi.setBackgroundColor(Color.GREEN);
            simm.setText("M");
            simm.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisim=0;
        }
        else if(kelime.equalsIgnoreCase("MİS") && girisiznimis== 1) {
            puan+=50;
            miss.setText("S");
            miss.setBackgroundColor(Color.GREEN);
            misi.setText("İ");
            misi.setBackgroundColor(Color.GREEN);
            simm.setText("M");
            simm.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimis=0;
        }
        else if(kelime.equalsIgnoreCase("SİT") && girisiznisit== 1) {
            puan+=40;
            miss.setText("S");
            miss.setBackgroundColor(Color.GREEN);
            siti.setText("İ");
            siti.setBackgroundColor(Color.GREEN);
            sitt.setText("T");
            sitt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisit=0;
        }
        else if(kelime.equalsIgnoreCase("TİM") && girisiznitim== 1) {
            puan+=40;
            sitt.setText("T");
            sitt.setBackgroundColor(Color.GREEN);
            timi.setText("İ");
            timi.setBackgroundColor(Color.GREEN);
            timm.setText("M");
            timm.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitim=0;
        }
        else if(kelime.equalsIgnoreCase("SEM") && girisiznisem== 1) {
            puan+=50;
            sems.setText("S");
            sems.setBackgroundColor(Color.GREEN);
            seme.setText("E");
            seme.setBackgroundColor(Color.GREEN);
            timm.setText("M");
            timm.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisem=0;
        }
        else{
            puan-=2;
        }
        if(sayac==7){
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
                db.puanguncelle("seviye1bulmaca6",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Stanim2.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye1bulmaca6.this, seviye2bulmaca1.class);
        startActivity(gecisYap);
        finish();
    }
}
