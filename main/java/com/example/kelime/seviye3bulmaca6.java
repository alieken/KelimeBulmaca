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

public class seviye3bulmaca6 extends AppCompatActivity {
    String kelime="";
    Button CCtanim;
    Button Otanim;
    Button Ctanim;
    Button Utanim;
    Button Ktanim;
    Button Ltanim;
    Button Utanim2;
    Button Ktanim2;
    Button onayla;
    Button devamet;
    Button cocuklukcc;
    Button cocukluko;
    Button cocuklukc;
    Button cocukluku;
    Button cocuklukk;
    Button cocuklukl;
    Button cocukluku2;
    Button cocuklukk2;
    Button cocukluo;
    Button cocukluc;
    Button cocukluu;
    Button cocukluk;
    Button cocuklul;
    Button cocukluu2;
    Button okculuku2;
    Button okculuko;
    Button okculukc;
    Button okculuku;
    Button okculukl;
    Button okculukk;
    Button cokluc;
    Button cokluo;
    Button coklul;
    Button cokluk;
    Button kolcuo;
    Button kolcul;
    Button kolcuc;
    Button kolcuu;
    Button loko;
    int sayac=0;
    int girisiznicocukluk=1;
    int girisiznicocuklu=1;
    int girisizniokculuk=1;
    int girisiznicoklu=1;
    int girisiznikolcu=1;
    int girisiznilok=1;
    long startTime;
    double puan =0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca6);
        startTime = System.currentTimeMillis();


        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca6");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        CCtanim=(Button) findViewById(R.id.cc);
        Otanim=(Button) findViewById(R.id.O);
        Ctanim=(Button) findViewById(R.id.C);
        Utanim2=(Button) findViewById(R.id.U2);
        Ktanim=(Button) findViewById(R.id.K);
        Ltanim=(Button) findViewById(R.id.L);
        Utanim=(Button) findViewById(R.id.U);
        Ktanim2=(Button) findViewById(R.id.K2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        CCtanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ctanim.setBackgroundColor(Color.CYAN);
        Utanim2.setBackgroundColor(Color.CYAN);
        Utanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Ktanim2.setBackgroundColor(Color.CYAN);
        cocuklukcc=(Button) findViewById(R.id.cocuklukcc);
        cocukluko=(Button) findViewById(R.id.cocukluko);
        cocuklukc=(Button) findViewById(R.id.cocuklukc);
        cocukluku=(Button) findViewById(R.id.cocukluku);
        cocuklukk=(Button) findViewById(R.id.cocuklukk);
        cocuklukl=(Button) findViewById(R.id.cocuklukl);
        cocukluku2=(Button) findViewById(R.id.cocukluku2);
        cocuklukk2=(Button) findViewById(R.id.cocuklukk2);
        cocukluo=(Button) findViewById(R.id.cocukluo);
        cocukluc=(Button) findViewById(R.id.cocukluc);
        cocukluu=(Button) findViewById(R.id.cocukluu);
        cocukluk=(Button) findViewById(R.id.cocukluk);
        cocuklul=(Button) findViewById(R.id.cocuklul);
        cocukluu2=(Button) findViewById(R.id.cocukluu2);
        okculuko=(Button) findViewById(R.id.okculuko);
        okculukc=(Button) findViewById(R.id.okculukcc);
        okculuku=(Button) findViewById(R.id.okculuku);
        okculukl=(Button) findViewById(R.id.okculukl);
        okculukk=(Button) findViewById(R.id.okculukk);
        okculuku2=(Button) findViewById(R.id.okculuku2);
        cokluc=(Button) findViewById(R.id.cokluc);
        cokluo=(Button) findViewById(R.id.cokluo);
        cokluk=(Button) findViewById(R.id.cokluk);
        coklul=(Button) findViewById(R.id.coklul);
        kolcuo=(Button) findViewById(R.id.kolcuo);
        kolcul=(Button) findViewById(R.id.kolcul);
        kolcuc=(Button) findViewById(R.id.kolcuc);
        kolcuu=(Button) findViewById(R.id.kolcuu);
        loko=(Button) findViewById(R.id.loko);
    }


    //0-ç,1-o,2-c,3-u,4-k,5-l,6-u2,7-k2
    public void karistir(final View view){
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(0);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (CCtanim=findViewById(R.id.cc)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (CCtanim=findViewById(R.id.O)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (CCtanim=findViewById(R.id.C)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (CCtanim=findViewById(R.id.U)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (CCtanim=findViewById(R.id.K)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (CCtanim=findViewById(R.id.L)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (CCtanim=findViewById(R.id.U2)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (CCtanim=findViewById(R.id.K2)).setText("Ç");
                        CCtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiscc(view);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Otanim=findViewById(R.id.cc)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Otanim=findViewById(R.id.O)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Otanim=findViewById(R.id.C)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Otanim=findViewById(R.id.U)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Otanim=findViewById(R.id.K)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Otanim=findViewById(R.id.L)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Otanim=findViewById(R.id.U2)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Otanim=findViewById(R.id.K2)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ctanim=findViewById(R.id.cc)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ctanim=findViewById(R.id.O)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ctanim=findViewById(R.id.C)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ctanim=findViewById(R.id.U)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ctanim=findViewById(R.id.K)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ctanim=findViewById(R.id.L)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ctanim=findViewById(R.id.U2)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ctanim=findViewById(R.id.K)).setText("C");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Utanim=findViewById(R.id.cc)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Utanim=findViewById(R.id.O)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Utanim=findViewById(R.id.C)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Utanim=findViewById(R.id.U)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Utanim=findViewById(R.id.K)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Utanim=findViewById(R.id.L)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Utanim=findViewById(R.id.U2)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Utanim=findViewById(R.id.K2)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ktanim=findViewById(R.id.cc)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ktanim=findViewById(R.id.O)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.C)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.U)).setText("K");
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
                        (Ktanim=findViewById(R.id.L)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ktanim=findViewById(R.id.U2)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ktanim=findViewById(R.id.K2)).setText("K");
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ltanim=findViewById(R.id.cc)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ltanim=findViewById(R.id.O)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ltanim=findViewById(R.id.C)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ltanim=findViewById(R.id.U)).setText("L");
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
                        (Ltanim=findViewById(R.id.L)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ltanim=findViewById(R.id.U2)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ltanim=findViewById(R.id.K2)).setText("L");
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
            int a=r.nextInt(8);
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Utanim2=findViewById(R.id.cc)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Utanim2=findViewById(R.id.O)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Utanim2=findViewById(R.id.C)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Utanim2=findViewById(R.id.U)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Utanim2=findViewById(R.id.K)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Utanim2=findViewById(R.id.L)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Utanim2=findViewById(R.id.U2)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Utanim2=findViewById(R.id.K2)).setText("U");
                        Utanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu2(view);
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ktanim2=findViewById(R.id.cc)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ktanim2=findViewById(R.id.O)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim2=findViewById(R.id.C)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim2=findViewById(R.id.U)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim2=findViewById(R.id.K)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim2=findViewById(R.id.L)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ktanim2=findViewById(R.id.U2)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ktanim2=findViewById(R.id.K2)).setText("K");
                        Ktanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk2(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca6");
                ActivityCompat.finishAffinity(seviye3bulmaca6.this);
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
    public void renkdegiscc(View view){
        CCtanim.setBackgroundColor(Color.GRAY);
        kelime+="Ç";
    }
    public void renkdegiso(View view){
        Otanim.setBackgroundColor(Color.GRAY);
        kelime+="O";
    }
    public void renkdegisc(View view){
        Ctanim.setBackgroundColor(Color.GRAY);
        kelime+="C";
    }
    public void renkdegisu(View view){
        Utanim.setBackgroundColor(Color.GRAY);
        kelime+="U";
    }
    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }

    public void renkdegisl(View view){
        Ltanim.setBackgroundColor(Color.GRAY);
        kelime+="L";
    }
    public void renkdegisu2(View view){
        Utanim2.setBackgroundColor(Color.GRAY);
        kelime+="U";
    }
    public void renkdegisk2(View view){
        Ktanim2.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("ÇOCUKLUK") && girisiznicocukluk == 1) {
            puan+=170;
            cocuklukcc.setText("Ç");
            cocuklukcc.setBackgroundColor(Color.GREEN);
            cocukluko.setText("O");
            cocukluko.setBackgroundColor(Color.GREEN);
            cocuklukc.setText("C");
            cocuklukc.setBackgroundColor(Color.GREEN);
            cocukluku.setText("U");
            cocukluku.setBackgroundColor(Color.GREEN);
            cocuklukl.setText("L");
            cocuklukl.setBackgroundColor(Color.GREEN);
            cocuklukk.setText("K");
            cocuklukk.setBackgroundColor(Color.GREEN);
            cocukluku2.setText("U");
            cocukluku2.setBackgroundColor(Color.GREEN);
            cocuklukk2.setText("K");
            cocuklukk2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznicocukluk=0;
        }
        else if(kelime.equalsIgnoreCase("ÇOCUKLU") && girisiznicocuklu == 1) {
            puan+=160;
            cocuklukcc.setText("Ç");
            cocuklukcc.setBackgroundColor(Color.GREEN);
            cocukluo.setText("O");
            cocukluo.setBackgroundColor(Color.GREEN);
            cocukluc.setText("C");
            cocukluc.setBackgroundColor(Color.GREEN);
            cocukluu.setText("U");
            cocukluu.setBackgroundColor(Color.GREEN);
            cocuklul.setText("L");
            cocuklul.setBackgroundColor(Color.GREEN);
            cocukluk.setText("K");
            cocukluk.setBackgroundColor(Color.GREEN);
            cocukluu2.setText("U");
            cocukluu2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznicocuklu=0;
        }
        else if(kelime.equalsIgnoreCase("OKÇULUK") && girisizniokculuk == 1) {
            puan+=130;
            cocuklukk2.setText("K");
            cocuklukk2.setBackgroundColor(Color.GREEN);
            okculuko.setText("O");
            okculuko.setBackgroundColor(Color.GREEN);
            okculukc.setText("Ç");
            okculukc.setBackgroundColor(Color.GREEN);
            okculuku.setText("U");
            okculuku.setBackgroundColor(Color.GREEN);
            okculukl.setText("L");
            okculukl.setBackgroundColor(Color.GREEN);
            okculuku2.setText("U");
            okculuku2.setBackgroundColor(Color.GREEN);
            okculukk.setText("K");
            okculukk.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniokculuk=0;
        }
        else if(kelime.equalsIgnoreCase("ÇOKLU") && girisiznicoklu == 1) {
            puan+=100;
            cokluc.setText("Ç");
            cokluc.setBackgroundColor(Color.GREEN);
            cokluo.setText("O");
            cokluo.setBackgroundColor(Color.GREEN);
            cokluk.setText("K");
            cokluk.setBackgroundColor(Color.GREEN);
            okculuku.setText("U");
            okculuku.setBackgroundColor(Color.GREEN);
            coklul.setText("L");
            coklul.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznicoklu=0;
        }
        else if(kelime.equalsIgnoreCase("KOLCU") && girisiznikolcu == 1) {
            puan+=100;
          kolcuo.setText("O");
          kolcuo.setBackgroundColor(Color.GREEN);
          kolcul.setText("L");
          kolcul.setBackgroundColor(Color.GREEN);
          kolcuc.setText("C");
          kolcuc.setBackgroundColor(Color.GREEN);
            cocukluk.setText("K");
            cocukluk.setBackgroundColor(Color.GREEN);
          kolcuu.setText("U");
          kolcuu.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikolcu=0;
        }
        else if(kelime.equalsIgnoreCase("LOK") && girisiznilok == 1) {
            puan+=40;
            cokluk.setText("K");
            cokluk.setBackgroundColor(Color.GREEN);
            cocuklukl.setText("L");
            cocuklukl.setBackgroundColor(Color.GREEN);
            loko.setText("U");
            loko.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznilok=0;
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
                db.puanguncelle("seviye3bulmaca6",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        CCtanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ctanim.setBackgroundColor(Color.CYAN);
        Utanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Utanim2.setBackgroundColor(Color.CYAN);
        Ktanim2.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca6.this, bitis.class);
        startActivity(gecisYap);
        finish();
    }

}
