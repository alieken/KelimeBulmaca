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

public class seviye3bulmaca2 extends AppCompatActivity {
    String kelime="";
    Button Atanim;
    Button Ftanim;
    Button Otanim;
    Button Rtanim;
    Button Itanim;
    Button Ztanim;
    Button Mtanim;
    Button Atanim2;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button aforizmaa;
    Button aforizmaf;
    Button aforizmao;
    Button aforizmar;
    Button aforizmai;
    Button aforizmaz;
    Button aforizmam;
    Button aforizmaa2;
    Button maarifm;
    Button maarifa;
    Button maarifr;
    Button maarifi;
    Button maariff;
    Button formaf;
    Button formar;
    Button formam;
    Button formaa;
    Button firmaf;
    Button firmar;
    Button firmam;
    Button firmaa;
    Button zamirz;
    Button zamira;
    Button zamiri;
    Button zamirr;
    Button miraa;
    Button mirai;

    int girisizniaforizma=1;
    int girisiznimaarif=1;
    int girisizniforma=1;
    int girisiznifirma=1;
    int girisiznizamir=1;
    int girisiznimira=1;
    long startTime;
    double puan =0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca2);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca2");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());


        Atanim=(Button) findViewById(R.id.A);
        Ftanim=(Button) findViewById(R.id.F);
        Otanim=(Button) findViewById(R.id.O);
        Rtanim=(Button) findViewById(R.id.R);
        Itanim=(Button) findViewById(R.id.I);
        Ztanim=(Button) findViewById(R.id.Z);
        Mtanim=(Button) findViewById(R.id.M);
        Atanim2=(Button) findViewById(R.id.A2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Ftanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Ztanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        aforizmaa=(Button) findViewById(R.id.aforizmaa);
        aforizmaf=(Button) findViewById(R.id.aforizmaf);
        aforizmao=(Button) findViewById(R.id.aforizmao);
        aforizmar=(Button) findViewById(R.id.aforizmar);
        aforizmai=(Button) findViewById(R.id.aforizmai);
        aforizmaz=(Button) findViewById(R.id.aforizmaz);
        aforizmam=(Button) findViewById(R.id.aforizmam);
        aforizmaa2=(Button) findViewById(R.id.aforizmaa2);
        maarifm=(Button) findViewById(R.id.maarifm);
        maarifa=(Button) findViewById(R.id.maarifa);
        maarifr=(Button) findViewById(R.id.maarifr);
        maarifi=(Button) findViewById(R.id.maarifi);
        maariff=(Button) findViewById(R.id.maariff);
        formaf=(Button) findViewById(R.id.formaf);
        formar=(Button) findViewById(R.id.formar);
        formam=(Button) findViewById(R.id.formam);
        formaa=(Button) findViewById(R.id.formaa);
        firmaf=(Button) findViewById(R.id.firmaf);
        firmar=(Button) findViewById(R.id.firmar);
        firmam=(Button) findViewById(R.id.firmam);
        firmaa=(Button) findViewById(R.id.firmaa);
        zamirz=(Button) findViewById(R.id.zamirz);
        zamira=(Button) findViewById(R.id.zamira);
        zamiri=(Button) findViewById(R.id.zamiri);
        zamirr=(Button) findViewById(R.id.zamirr);
        mirai=(Button) findViewById(R.id.mirai);
        miraa=(Button) findViewById(R.id.miraa);
    }

    //0-a,1-f,2-o,3-r,4-i,5-z,6-m,7-a2
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
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
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
                        (Atanim=findViewById(R.id.F)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.O)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.R)).setText("A");
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
                        (Atanim=findViewById(R.id.Z)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Atanim=findViewById(R.id.M)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Atanim=findViewById(R.id.A2)).setText("A");
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
                        (Ftanim=findViewById(R.id.A)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ftanim=findViewById(R.id.F)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ftanim=findViewById(R.id.O)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ftanim=findViewById(R.id.R)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ftanim=findViewById(R.id.I)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ftanim=findViewById(R.id.Z)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ftanim=findViewById(R.id.M)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ftanim=findViewById(R.id.A2)).setText("F");
                        Ftanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisf(view);
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
                        (Otanim=findViewById(R.id.A)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Otanim=findViewById(R.id.F)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Otanim=findViewById(R.id.O)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Otanim=findViewById(R.id.R)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Otanim=findViewById(R.id.I)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Otanim=findViewById(R.id.Z)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Otanim=findViewById(R.id.M)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Otanim=findViewById(R.id.A2)).setText("O");
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
                        (Rtanim=findViewById(R.id.A)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Rtanim=findViewById(R.id.F)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Rtanim=findViewById(R.id.O)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Rtanim=findViewById(R.id.R)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Rtanim=findViewById(R.id.I)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Rtanim=findViewById(R.id.Z)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Rtanim=findViewById(R.id.M)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Rtanim=findViewById(R.id.A2)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
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
                        (Itanim=findViewById(R.id.F)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.O)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.R)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.I)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.Z)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Itanim=findViewById(R.id.M)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Itanim=findViewById(R.id.A2)).setText("İ");
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ztanim=findViewById(R.id.A)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ztanim=findViewById(R.id.F)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ztanim=findViewById(R.id.O)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ztanim=findViewById(R.id.R)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ztanim=findViewById(R.id.I)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ztanim=findViewById(R.id.Z)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ztanim=findViewById(R.id.M)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ztanim=findViewById(R.id.A2)).setText("Z");
                        Ztanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisz(view);
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
                        (Mtanim=findViewById(R.id.A)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.F)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.O)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.R)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.I)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.Z)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Mtanim=findViewById(R.id.A2)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
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
                        (Atanim2=findViewById(R.id.F)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.O)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.R)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim2=findViewById(R.id.I)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim2=findViewById(R.id.Z)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Atanim2=findViewById(R.id.M)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Atanim2=findViewById(R.id.A2)).setText("A");
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca2");
                ActivityCompat.finishAffinity(seviye3bulmaca2.this);
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
    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisf(View view){
        Ftanim.setBackgroundColor(Color.GRAY);
        kelime+="F";
    }
    public void renkdegiso(View view){
        Otanim.setBackgroundColor(Color.GRAY);
        kelime+="O";
    }
    public void renkdegisr(View view){
        Rtanim.setBackgroundColor(Color.GRAY);
        kelime+="R";
    }
    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }

    public void renkdegisz(View view){
        Ztanim.setBackgroundColor(Color.GRAY);
        kelime+="Z";
    }
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegisa2(View view){
        Atanim2.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("AFORİZMA") && girisizniaforizma == 1) {
            puan+=190;
            aforizmaa.setText("A");
            aforizmaa.setBackgroundColor(Color.GREEN);
            aforizmaf.setText("F");
            aforizmaf.setBackgroundColor(Color.GREEN);
            aforizmao.setText("O");
            aforizmao.setBackgroundColor(Color.GREEN);
            aforizmar.setText("R");
            aforizmar.setBackgroundColor(Color.GREEN);
            aforizmai.setText("İ");
            aforizmai.setBackgroundColor(Color.GREEN);
            aforizmaz.setText("Z");
            aforizmaz.setBackgroundColor(Color.GREEN);
            aforizmam.setText("M");
            aforizmam.setBackgroundColor(Color.GREEN);
            aforizmaa2.setText("A");
            aforizmaa2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniaforizma=0;
        }
        else if(kelime.equalsIgnoreCase("MAARİF") && girisiznimaarif == 1) {
            puan+=130;
            aforizmaa.setText("A");
            aforizmaa.setBackgroundColor(Color.GREEN);
            maarifm.setText("M");
            maarifm.setBackgroundColor(Color.GREEN);
            maarifa.setText("A");
            maarifa.setBackgroundColor(Color.GREEN);
            maarifr.setText("R");
            maarifr.setBackgroundColor(Color.GREEN);
            maarifi.setText("İ");
            maarifi.setBackgroundColor(Color.GREEN);
            maariff.setText("F");
            maariff.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimaarif=0;
        }
        else if(kelime.equalsIgnoreCase("FORMA") && girisizniforma== 1) {
            puan+=130;
            formaf.setText("F");
            formaf.setBackgroundColor(Color.GREEN);
            formar.setText("R");
            formar.setBackgroundColor(Color.GREEN);
            formam.setText("M");
            formam.setBackgroundColor(Color.GREEN);
            formaa.setText("A");
            formaa.setBackgroundColor(Color.GREEN);
            aforizmao.setText("O");
            aforizmao.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniforma=0;
        }
        else if(kelime.equalsIgnoreCase("FİRMA") && girisiznifirma== 1) {
            puan+=120;
            firmaf.setText("F");
            firmaf.setBackgroundColor(Color.GREEN);
            firmar.setText("R");
            firmar.setBackgroundColor(Color.GREEN);
            firmam.setText("M");
            firmam.setBackgroundColor(Color.GREEN);
            firmaa.setText("A");
            firmaa.setBackgroundColor(Color.GREEN);
            aforizmai.setText("İ");
            aforizmai.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznifirma=0;
        }
        else if(kelime.equalsIgnoreCase("ZAMİR") && girisiznizamir== 1) {
            puan+=90;
            zamirz.setText("Z");
            zamirz.setBackgroundColor(Color.GREEN);
            zamira.setText("A");
            zamira.setBackgroundColor(Color.GREEN);
            zamiri.setText("İ");
            zamiri.setBackgroundColor(Color.GREEN);
            zamirr.setText("R");
            zamirr.setBackgroundColor(Color.GREEN);
            aforizmam.setText("M");
            aforizmam.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznizamir=0;
        }
        else if(kelime.equalsIgnoreCase("MİRA") && girisiznimira== 1) {
            puan+=50;
            mirai.setText("İ");
            mirai.setBackgroundColor(Color.GREEN);
            miraa.setText("A");
            miraa.setBackgroundColor(Color.GREEN);
            firmam.setText("M");
            firmam.setBackgroundColor(Color.GREEN);
            zamirr.setText("R");
            zamirr.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimira=0;
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
                db.puanguncelle("seviye3bulmaca2",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Ftanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ztanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca2.this, seviye3bulmaca3.class);
        startActivity(gecisYap);
        finish();
    }
}
