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

public class seviye2bulmaca3 extends AppCompatActivity {
    String kelime="";
    Button Atanim2;
    Button Ptanim;
    Button Dtanim;
    Button Etanim;
    Button Atanim;
    Button Ttanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button adapa;
    Button adapd;
    Button adapa2;
    Button adapp;
    Button adeta;
    Button adete;
    Button adett;
    Button etape;
    Button etapa;
    Button etapp;
    Button edatd;
    Button edata;
    Button edatt;
    Button dataa;
    Button datad;
    Button datat;
    int girisizniadap=1;
    int girisizniadet=1;
    int girisiznietap=1;
    int girisizniedat=1;
    int girisiznidata=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca3);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca3");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Etanim=(Button) findViewById(R.id.E);
        Ptanim=(Button) findViewById(R.id.P);
        Atanim=(Button) findViewById(R.id.A);
        Dtanim=(Button) findViewById(R.id.D);
        Ttanim=(Button) findViewById(R.id.T);
        Atanim2=(Button) findViewById(R.id.A2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Dtanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        adapa=(Button) findViewById(R.id.adapa);
        adapd=(Button) findViewById(R.id.adapd);
        adapa2=(Button) findViewById(R.id.adapa2);
        adapp=(Button) findViewById(R.id.adapp);
        adeta=(Button) findViewById(R.id.adeta);
        adete=(Button) findViewById(R.id.adete);
        adett=(Button) findViewById(R.id.adett);
        etape=(Button) findViewById(R.id.etape);
        etapa=(Button) findViewById(R.id.etapa);
        etapp=(Button) findViewById(R.id.etapp);
        edatd=(Button) findViewById(R.id.edatd);
        edata=(Button) findViewById(R.id.edata);
        edatt=(Button) findViewById(R.id.edatt);
        dataa=(Button) findViewById(R.id.dataa);
        datad=(Button) findViewById(R.id.datad);
        datat=(Button) findViewById(R.id.datat);
    }
    //0-a,1-d,2-a2,3-p,4-t,5-e
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
                        (Atanim=findViewById(R.id.A)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.D)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.A2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.P)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.T)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.E)).setText("A");
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
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Dtanim=findViewById(R.id.A)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Dtanim=findViewById(R.id.D)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Dtanim=findViewById(R.id.A2)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Dtanim=findViewById(R.id.P)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Dtanim=findViewById(R.id.T)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Dtanim=findViewById(R.id.E)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
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
                        (Atanim2=findViewById(R.id.A)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim2=findViewById(R.id.D)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.A2)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.P)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim2=findViewById(R.id.T)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim2=findViewById(R.id.E)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
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
                        (Ptanim=findViewById(R.id.A)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ptanim=findViewById(R.id.D)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ptanim=findViewById(R.id.A2)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ptanim=findViewById(R.id.P)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ptanim=findViewById(R.id.T)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ptanim=findViewById(R.id.E)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
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
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.D)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.A2)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.P)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim=findViewById(R.id.T)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.E)).setText("T");
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
                        (Etanim=findViewById(R.id.A)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim=findViewById(R.id.D)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.A2)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.P)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.T)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.E)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca3");
                ActivityCompat.finishAffinity(seviye2bulmaca3.this);
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
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisd(View view){
        Dtanim.setBackgroundColor(Color.GRAY);
        kelime+="D";
    }
    public void renkdegisp(View view){
        Ptanim.setBackgroundColor(Color.GRAY);
        kelime+="P";
    }

    public void renkdegisa2(View view){
        Atanim2.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("ADAP") && girisizniadap == 1) {
            puan+=100;
            adapa.setText("A");
            adapa.setBackgroundColor(Color.GREEN);
            adapd.setText("D");
            adapd.setBackgroundColor(Color.GREEN);
            adapa2.setText("A");
            adapa2.setBackgroundColor(Color.GREEN);
            adapp.setText("P");
            adapp.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniadap=0;
        }
        else if(kelime.equalsIgnoreCase("ADET") && girisizniadet == 1) {
            puan+=60;
            adeta.setText("A");
            adeta.setBackgroundColor(Color.GREEN);
            adapd.setText("D");
            adapd.setBackgroundColor(Color.GREEN);
            adete.setText("E");
            adete.setBackgroundColor(Color.GREEN);
            adett.setText("T");
            adett.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniadet=0;
        }
        else if(kelime.equalsIgnoreCase("ETAP") && girisiznietap == 1) {
            puan+=80;
            etapa.setText("A");
            etapa.setBackgroundColor(Color.GREEN);
            etapp.setText("P");
            etapp.setBackgroundColor(Color.GREEN);
            etape.setText("E");
            etape.setBackgroundColor(Color.GREEN);
            adett.setText("T");
            adett.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznietap=0;
        }
        else if(kelime.equalsIgnoreCase("EDAT") && girisizniedat == 1) {
            puan+=60;
            edata.setText("A");
            edata.setBackgroundColor(Color.GREEN);
            edatd.setText("D");
            edatd.setBackgroundColor(Color.GREEN);
            etape.setText("E");
            etape.setBackgroundColor(Color.GREEN);
            edatt.setText("T");
            edatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniedat=0;
        }
        else if(kelime.equalsIgnoreCase("DATA") && girisiznidata == 1) {
            puan+=60;
            edata.setText("A");
            edata.setBackgroundColor(Color.GREEN);
            datad.setText("D");
            datad.setBackgroundColor(Color.GREEN);
            datat.setText("T");
            datat.setBackgroundColor(Color.GREEN);
            dataa.setText("A");
            dataa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznidata=0;
        }
        else{
            puan-=2;
        }
        if(sayac==5){
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
                db.puanguncelle("seviye2bulmaca3",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Dtanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca3.this, seviye2bulmaca4.class);
        startActivity(gecisYap);
        finish();
    }
}
