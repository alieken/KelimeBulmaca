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

public class seviye2bulmaca1 extends AppCompatActivity {
    String kelime="";
    Button Atanim2;
    Button Htanim;
    Button Ltanim;
    Button Atanim;
    Button Ktanim;
    Button Itanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button hakih;
    Button hakia;
    Button hakii;
    Button hakik;
    Button ilahl;
    Button ilaha;
    Button ilahh;
    Button likaa;
    Button likak;
    Button likai;
    Button halka;
    Button halkl;
    Button halkk;
    Button kili;
    Button halaa;
    Button halaa2;
    Button halal;
    int girisiznihaki=1;
    int girisizniilah=1;
    int girisiznilika=1;
    int girisiznihalk=1;
    int girisiznikil=1;
    int girisiznihala=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca1);

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca1");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        startTime = System.currentTimeMillis();
        Atanim=(Button) findViewById(R.id.A);
        Htanim=(Button) findViewById(R.id.H);
        Ltanim=(Button) findViewById(R.id.L);
        Ktanim=(Button) findViewById(R.id.K);
        Itanim=(Button) findViewById(R.id.I);
        Atanim2=(Button) findViewById(R.id.A2);
        onayla=(Button) findViewById(R.id.onay);
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Htanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        devamet=(Button) findViewById(R.id.devambutonu);
        hakih=(Button) findViewById(R.id.hakih);
        hakia=(Button) findViewById(R.id.hakia);
        hakik=(Button) findViewById(R.id.hakik);
        hakii=(Button) findViewById(R.id.hakii);
        ilahl=(Button) findViewById(R.id.ilahl);
        ilaha=(Button) findViewById(R.id.ilaha);
        ilahh=(Button) findViewById(R.id.ilahh);
        likaa=(Button) findViewById(R.id.likaa);
        likai=(Button) findViewById(R.id.likai);
        likak=(Button) findViewById(R.id.likak);
        halka=(Button) findViewById(R.id.halka);
        halkl=(Button) findViewById(R.id.halkl);
        halkk=(Button) findViewById(R.id.halkk);
        kili=(Button) findViewById(R.id.kili);
        halaa=(Button) findViewById(R.id.halaa);
        halaa2=(Button) findViewById(R.id.halaa2);
        halal=(Button) findViewById(R.id.halal);
    }
    //0-a,1-h,2-l,3-a2,4-k,5-i
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
                        (Atanim=findViewById(R.id.H)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.L)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.A2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.K)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.I)).setText("A");
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
                        (Htanim=findViewById(R.id.A)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Htanim=findViewById(R.id.H)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Htanim=findViewById(R.id.L)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Htanim=findViewById(R.id.A2)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Htanim=findViewById(R.id.K)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Htanim=findViewById(R.id.I)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
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
                        (Ltanim=findViewById(R.id.A)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ltanim=findViewById(R.id.H)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ltanim=findViewById(R.id.L)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ltanim=findViewById(R.id.A2)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ltanim=findViewById(R.id.K)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ltanim=findViewById(R.id.I)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
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
                        (Atanim2=findViewById(R.id.H)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.L)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.A2)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim2=findViewById(R.id.K)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim2=findViewById(R.id.I)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
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
                        (Ktanim=findViewById(R.id.A)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ktanim=findViewById(R.id.H)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.L)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.A2)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.K)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.I)).setText("K");
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

        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Itanim=findViewById(R.id.A)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.H)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.L)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.A2)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.K)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.I)).setText("İ");
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca1");
                ActivityCompat.finishAffinity(seviye2bulmaca1.this);
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
    public void renkdegish(View view){
        Htanim.setBackgroundColor(Color.GRAY);
        kelime+="H";
    }
    public void renkdegisl(View view){
        Ltanim.setBackgroundColor(Color.GRAY);
        kelime+="L";
    }

    public void renkdegisa2(View view){
        Atanim2.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("HAKİ") && girisiznihaki == 1) {
            puan+=80;
            hakia.setText("A");
            hakia.setBackgroundColor(Color.GREEN);
            hakih.setText("H");
            hakih.setBackgroundColor(Color.GREEN);
            hakik.setText("K");
            hakik.setBackgroundColor(Color.GREEN);
            hakii.setText("İ");
            hakii.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznihaki=0;
        }
        else if(kelime.equalsIgnoreCase("İLAH") && girisizniilah == 1) {
            puan+=80;
            ilaha.setText("A");
            ilaha.setBackgroundColor(Color.GREEN);
            ilahh.setText("H");
            ilahh.setBackgroundColor(Color.GREEN);
            ilahl.setText("L");
            ilahl.setBackgroundColor(Color.GREEN);
            hakii.setText("İ");
            hakii.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniilah=0;
        }
        else if(kelime.equalsIgnoreCase("LİKA") && girisiznilika == 1) {
            puan+=40;
            likaa.setText("A");
            likaa.setBackgroundColor(Color.GREEN);
            likak.setText("K");
            likak.setBackgroundColor(Color.GREEN);
            ilahl.setText("L");
            ilahl.setBackgroundColor(Color.GREEN);
            likai.setText("İ");
            likai.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznilika=0;
        }
        else if(kelime.equalsIgnoreCase("HALK") && girisiznihalk == 1) {
            puan+=80;
            halka.setText("A");
            halka.setBackgroundColor(Color.GREEN);
            halkk.setText("K");
            halkk.setBackgroundColor(Color.GREEN);
            halkl.setText("L");
            halkl.setBackgroundColor(Color.GREEN);
            ilahh.setText("H");
            ilahh.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznihalk=0;
        }
        else if(kelime.equalsIgnoreCase("KİL") && girisiznikil == 1) {
            puan+=30;
            kili.setText("İ");
            kili.setBackgroundColor(Color.GREEN);
            likak.setText("K");
            likak.setBackgroundColor(Color.GREEN);
            halkl.setText("L");
            halkl.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikil=0;
        }
        else if(kelime.equalsIgnoreCase("HALA") && girisiznihala == 1) {
            puan+=80;
            hakih.setText("H");
            hakih.setBackgroundColor(Color.GREEN);
            halaa.setText("A");
            halaa.setBackgroundColor(Color.GREEN);
            halaa2.setText("A");
            halaa2.setBackgroundColor(Color.GREEN);
            halal.setText("L");
            halal.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznihala=0;
        }
        else {
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
                db.puanguncelle("seviye2bulmaca1",puan,database.kadi);
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
        Htanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca1.this, seviye2bulmaca2.class);
        startActivity(gecisYap);
        finish();
    }
}
