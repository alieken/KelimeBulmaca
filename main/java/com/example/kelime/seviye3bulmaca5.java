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

public class seviye3bulmaca5 extends AppCompatActivity {
    String kelime="";
    Button Atanim;
    Button Ttanim;
    Button Rtanim;
    Button Ttanim3;
    Button Itanim;
    Button Btanim;
    Button Etanim;
    Button Ttanim2;
    Button onayla;
    Button devamet;
    Button tertibatt;
    Button tertibate;
    Button tertibatr;
    Button tertibatt2;
    Button tertibati;
    Button tertibatb;
    Button tertibata;
    Button tertibatt3;
    Button baterib;
    Button bateria;
    Button baterie;
    Button baterir;
    Button baterii;
    Button ibaretb;
    Button ibareta;
    Button ibaretr;
    Button ibarete;
    Button ibarett;
    Button bitterb;
    Button bitteri;
    Button bittert;
    Button bittere;
    Button bitterr;
    Button ibreti;
    Button ibretr;
    Button ibrete;
    int sayac=0;
    int girisiznitertibat=1;
    int girisiznibateri=1;
    int girisizniibaret=1;
    int girisiznibitter=1;
    int girisizniibret=1;
    long startTime;
    double puan =0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca5);
        startTime = System.currentTimeMillis();


        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca5");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim=(Button) findViewById(R.id.A);
        Ttanim=(Button) findViewById(R.id.T);
        Etanim=(Button) findViewById(R.id.E);
        Ttanim2=(Button) findViewById(R.id.T2);
        Ttanim3=(Button) findViewById(R.id.T3);
        Rtanim=(Button) findViewById(R.id.R);
        Itanim=(Button) findViewById(R.id.I);
        Btanim=(Button) findViewById(R.id.B);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim3.setBackgroundColor(Color.CYAN);
        Btanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Ttanim2.setBackgroundColor(Color.CYAN);
        tertibatt=(Button) findViewById(R.id.tertibatt);
        tertibate=(Button) findViewById(R.id.tertibate);
        tertibatr=(Button) findViewById(R.id.tertibatr);
        tertibatt2=(Button) findViewById(R.id.tertibatt2);
        tertibati=(Button) findViewById(R.id.tertibati);
        tertibatb=(Button) findViewById(R.id.tertibatb);
        tertibata=(Button) findViewById(R.id.tertibata);
        tertibatt3=(Button) findViewById(R.id.tertibatt3);
        baterib=(Button) findViewById(R.id.baterib);
        bateria=(Button) findViewById(R.id.bateria);
        baterie=(Button) findViewById(R.id.baterie);
        baterir=(Button) findViewById(R.id.baterir);
        baterii=(Button) findViewById(R.id.baterii);
        ibaretb=(Button) findViewById(R.id.ibaretb);
        ibareta=(Button) findViewById(R.id.ibareta);
        ibaretr=(Button) findViewById(R.id.ibaretr);
        ibarete=(Button) findViewById(R.id.ibarete);
        ibarett=(Button) findViewById(R.id.ibarett);
        bitterb=(Button) findViewById(R.id.bitterb);
        bitteri=(Button) findViewById(R.id.bitteri);
        bittert=(Button) findViewById(R.id.bittert);
        bittere=(Button) findViewById(R.id.bittere);
        bitterr=(Button) findViewById(R.id.bitterr);
        ibreti=(Button) findViewById(R.id.ibreti);
        ibretr=(Button) findViewById(R.id.ibretr);
        ibrete=(Button) findViewById(R.id.ibrete);
    }

    //0-t,1-e,2-r,3-t2,4-i,5-b,6-a,7-t3
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
                        (Ttanim=findViewById(R.id.T)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.E)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.R)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.T2)).setText("T");
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
                        (Ttanim=findViewById(R.id.B)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ttanim=findViewById(R.id.T3)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
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
                        (Etanim=findViewById(R.id.T)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim=findViewById(R.id.E)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.R)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.T2)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.I)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.B)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Etanim=findViewById(R.id.A)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Etanim=findViewById(R.id.T3)).setText("E");
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

        for (int i = 0; i < 1000 ; i++) {
            int gecis=1;
            Random r=new Random(); //random sınıfı
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Rtanim=findViewById(R.id.T)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Rtanim=findViewById(R.id.E)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Rtanim=findViewById(R.id.R)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Rtanim=findViewById(R.id.T2)).setText("R");
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
                        (Rtanim=findViewById(R.id.B)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Rtanim=findViewById(R.id.A)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Rtanim=findViewById(R.id.T3)).setText("R");
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
                        (Ttanim2=findViewById(R.id.T)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim2=findViewById(R.id.E)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim2=findViewById(R.id.R)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim2=findViewById(R.id.T2)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim2=findViewById(R.id.I)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim2=findViewById(R.id.B)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ttanim2=findViewById(R.id.A)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ttanim2=findViewById(R.id.T3)).setText("T");
                        Ttanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist2(view);
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
                        (Itanim=findViewById(R.id.T)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.E)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.R)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.T2)).setText("İ");
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
                        (Itanim=findViewById(R.id.B)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Itanim=findViewById(R.id.A)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Itanim=findViewById(R.id.T3)).setText("İ");
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
                        (Btanim=findViewById(R.id.T)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Btanim=findViewById(R.id.E)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Btanim=findViewById(R.id.R)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Btanim=findViewById(R.id.T2)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Btanim=findViewById(R.id.I)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Btanim=findViewById(R.id.B)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Btanim=findViewById(R.id.A)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Btanim=findViewById(R.id.T3)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
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
                        (Atanim=findViewById(R.id.T)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.E)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.R)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.T2)).setText("A");
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
                        (Atanim=findViewById(R.id.B)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Atanim=findViewById(R.id.A)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Atanim=findViewById(R.id.T3)).setText("A");
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
                        (Ttanim3=findViewById(R.id.T)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim3=findViewById(R.id.E)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim3=findViewById(R.id.R)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim3=findViewById(R.id.T2)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim3=findViewById(R.id.I)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim3=findViewById(R.id.B)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ttanim3=findViewById(R.id.A)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ttanim3=findViewById(R.id.T3)).setText("T");
                        Ttanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist3(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca5");
                ActivityCompat.finishAffinity(seviye3bulmaca5.this);
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
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegist3(View view){
        Ttanim3.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }

    public void renkdegisb(View view){
        Btanim.setBackgroundColor(Color.GRAY);
        kelime+="B";
    }
    public void renkdegisr(View view){
        Rtanim.setBackgroundColor(Color.GRAY);
        kelime+="R";
    }
    public void renkdegist2(View view){
        Ttanim2.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("TERTİBAT") && girisiznitertibat == 1) {
            puan+=100;
            tertibatt.setText("T");
            tertibatt.setBackgroundColor(Color.GREEN);
            tertibate.setText("E");
            tertibate.setBackgroundColor(Color.GREEN);
            tertibatr.setText("R");
            tertibatr.setBackgroundColor(Color.GREEN);
            tertibatt2.setText("T");
            tertibatt2.setBackgroundColor(Color.GREEN);
            tertibati.setText("İ");
            tertibati.setBackgroundColor(Color.GREEN);
            tertibatb.setText("B");
            tertibatb.setBackgroundColor(Color.GREEN);
            tertibata.setText("A");
            tertibata.setBackgroundColor(Color.GREEN);
            tertibatt3.setText("T");
            tertibatt3.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitertibat=0;
        }
        else if(kelime.equalsIgnoreCase("BATERİ") && girisiznibateri == 1) {
            puan+=80;
            tertibatt.setText("T");
            tertibatt.setBackgroundColor(Color.GREEN);
            baterib.setText("B");
            baterib.setBackgroundColor(Color.GREEN);
            bateria.setText("A");
            bateria.setBackgroundColor(Color.GREEN);
            baterie.setText("E");
            baterie.setBackgroundColor(Color.GREEN);
            baterir.setText("R");
            baterir.setBackgroundColor(Color.GREEN);
            baterii.setText("İ");
            baterii.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznibateri=0;
        }
        else if(kelime.equalsIgnoreCase("İBARET") && girisizniibaret == 1) {
            puan+=80;
            ibaretb.setText("B");
            ibaretb.setBackgroundColor(Color.GREEN);
            ibareta.setText("A");
            ibareta.setBackgroundColor(Color.GREEN);
            ibaretr.setText("R");
            ibaretr.setBackgroundColor(Color.GREEN);
            ibarete.setText("E");
            ibarete.setBackgroundColor(Color.GREEN);
            ibarett.setText("T");
            ibarett.setBackgroundColor(Color.GREEN);
            baterii.setText("İ");
            baterii.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniibaret=0;
        }
        else if(kelime.equalsIgnoreCase("BİTTER") && girisiznibitter == 1) {
            puan+=80;
            bitterb.setText("B");
            bitterb.setBackgroundColor(Color.GREEN);
            bitteri.setText("İ");
            bitteri.setBackgroundColor(Color.GREEN);
            bittert.setText("T");
            bittert.setBackgroundColor(Color.GREEN);
            bittere.setText("E");
            bittere.setBackgroundColor(Color.GREEN);
            bitterr.setText("R");
            bitterr.setBackgroundColor(Color.GREEN);
            tertibatt3.setText("T");
            tertibatt3.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznibitter=0;
        }
        else if(kelime.equalsIgnoreCase("İBRET") && girisizniibret == 1) {
            puan+=70;
            ibreti.setText("İ");
            ibreti.setBackgroundColor(Color.GREEN);
            ibretr.setText("R");
            ibretr.setBackgroundColor(Color.GREEN);
            ibrete.setText("E");
            ibrete.setBackgroundColor(Color.GREEN);
            ibarett.setText("T");
            ibarett.setBackgroundColor(Color.GREEN);
            tertibatb.setText("B");
            tertibatb.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniibret=0;
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
                db.puanguncelle("seviye3bulmaca5",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim3.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ttanim2.setBackgroundColor(Color.CYAN);
        Btanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca5.this, seviye3bulmaca6.class);
        startActivity(gecisYap);
        finish();
    }

}
