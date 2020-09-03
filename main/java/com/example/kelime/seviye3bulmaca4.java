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

public class seviye3bulmaca4 extends AppCompatActivity {
    String kelime="";
    Button Atanim;
    Button Otanim;
    Button Stanim;
    Button Etanim;
    Button Ntanim;
    Button Ktanim;
    Button Rtanim;
    Button Ntanim2;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button asenkrona;
    Button asenkrons;
    Button asenkrone;
    Button asenkronn;
    Button asenkronk;
    Button asenkronr;
    Button asenkrono;
    Button asenkronn2;
    Button senkrons;
    Button senkrone;
    Button senkronn;
    Button senkronk;
    Button senkronr;
    Button senkrono;
    Button anonsa;
    Button anonsn;
    Button anonso;
    Button anonsn2;
    Button kanserk;
    Button kansere;
    Button kansern;
    Button kansers;
    Button kanserr;
    Button askera;
    Button askers;
    Button askerk;
    Button askere;
    Button orako;
    Button oraka;
    int girisizniasenkron =1 ;
    int girisiznisenkron =1 ;
    int girisiznianons =1 ;
    int girisiznikanser =1 ;
    int girisizniasker =1 ;
    int girisizniorak =1 ;
    long startTime;
    double puan =0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca4);
        startTime = System.currentTimeMillis();


        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca4");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim=(Button) findViewById(R.id.A);
        Stanim=(Button) findViewById(R.id.S);
        Etanim=(Button) findViewById(R.id.E);
        Ntanim=(Button) findViewById(R.id.N);
        Ktanim=(Button) findViewById(R.id.K);
        Rtanim=(Button) findViewById(R.id.R);
        Otanim=(Button) findViewById(R.id.O);
        Ntanim2=(Button) findViewById(R.id.N2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ntanim2.setBackgroundColor(Color.CYAN);
        asenkrona=(Button) findViewById(R.id.asenkrona);
        asenkrons=(Button) findViewById(R.id.asenkrons);
        asenkrone=(Button) findViewById(R.id.asenkrone);
        asenkronn=(Button) findViewById(R.id.asenkronn);
        asenkronk=(Button) findViewById(R.id.asenkronk);
        asenkronr=(Button) findViewById(R.id.asenkronr);
        asenkrono=(Button) findViewById(R.id.asenkrono);
        asenkronn2=(Button) findViewById(R.id.asenkronn2);
        senkrons=(Button) findViewById(R.id.senkrons);
        senkrone=(Button) findViewById(R.id.senkrone);
        senkronn=(Button) findViewById(R.id.senkronn);
        senkronk=(Button) findViewById(R.id.senkronk);
        senkronr=(Button) findViewById(R.id.senkronr);
        senkrono=(Button) findViewById(R.id.senkrono);
        anonsa=(Button) findViewById(R.id.anonsa);
        anonsn=(Button) findViewById(R.id.anonsn);
        anonso=(Button) findViewById(R.id.anonso);
        anonsn2=(Button) findViewById(R.id.anonsn2);
        kanserk=(Button) findViewById(R.id.kanserk);
        kansern=(Button) findViewById(R.id.kansern);
        kansers=(Button) findViewById(R.id.kansers);
        kansere=(Button) findViewById(R.id.kansere);
        kanserr=(Button) findViewById(R.id.kanserr);
        askera=(Button) findViewById(R.id.askera);
        askers=(Button) findViewById(R.id.askers);
        askerk=(Button) findViewById(R.id.askerk);
        askere=(Button) findViewById(R.id.askere);
        orako=(Button) findViewById(R.id.orako);
        oraka=(Button) findViewById(R.id.oraka);
    }

    //0-a,1-s,2-e,3-n,4-k,5-r,6-o,7-n2
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
                        (Atanim=findViewById(R.id.S)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.E)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.N)).setText("A");
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
                        (Atanim=findViewById(R.id.R)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Atanim=findViewById(R.id.O)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Atanim=findViewById(R.id.N2)).setText("A");
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
                        (Stanim=findViewById(R.id.A)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Stanim=findViewById(R.id.S)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Stanim=findViewById(R.id.E)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Stanim=findViewById(R.id.N)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Stanim=findViewById(R.id.K)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim=findViewById(R.id.R)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Stanim=findViewById(R.id.O)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Stanim=findViewById(R.id.N2)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
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
                        (Etanim=findViewById(R.id.S)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.E)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.N)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.K)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.R)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Etanim=findViewById(R.id.O)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Etanim=findViewById(R.id.N2)).setText("E");
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
                        (Ntanim=findViewById(R.id.A)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ntanim=findViewById(R.id.S)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ntanim=findViewById(R.id.E)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ntanim=findViewById(R.id.N)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ntanim=findViewById(R.id.K)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ntanim=findViewById(R.id.R)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ntanim=findViewById(R.id.O)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ntanim=findViewById(R.id.N2)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
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
                        (Ktanim=findViewById(R.id.S)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.E)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.N)).setText("K");
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
                        (Ktanim=findViewById(R.id.R)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ktanim=findViewById(R.id.O)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ktanim=findViewById(R.id.N2)).setText("K");
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
                        (Rtanim=findViewById(R.id.S)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Rtanim=findViewById(R.id.E)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Rtanim=findViewById(R.id.N)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Rtanim=findViewById(R.id.K)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Rtanim=findViewById(R.id.R)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Rtanim=findViewById(R.id.O)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Rtanim=findViewById(R.id.N2)).setText("R");
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
                        (Otanim=findViewById(R.id.S)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Otanim=findViewById(R.id.E)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Otanim=findViewById(R.id.N)).setText("O");
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
                        (Otanim=findViewById(R.id.R)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Otanim=findViewById(R.id.O)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Otanim=findViewById(R.id.N2)).setText("O");
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
                        (Ntanim2=findViewById(R.id.A)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ntanim2=findViewById(R.id.S)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ntanim2=findViewById(R.id.E)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ntanim2=findViewById(R.id.N)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ntanim2=findViewById(R.id.K)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ntanim2=findViewById(R.id.R)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ntanim2=findViewById(R.id.O)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ntanim2=findViewById(R.id.N2)).setText("N");
                        Ntanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn2(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca4");
                ActivityCompat.finishAffinity(seviye3bulmaca4.this);
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
    public void renkdegiss(View view){
        Stanim.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void renkdegiso(View view){
        Otanim.setBackgroundColor(Color.GRAY);
        kelime+="O";
    }
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegisn(View view){
        Ntanim.setBackgroundColor(Color.GRAY);
        kelime+="N";
    }

    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void renkdegisr(View view){
        Rtanim.setBackgroundColor(Color.GRAY);
        kelime+="R";
    }
    public void renkdegisn2(View view){
        Ntanim2.setBackgroundColor(Color.GRAY);
        kelime+="N";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("ASENKRON") && girisizniasenkron == 1) {
            puan+=100;
            asenkrona.setText("A");
            asenkrona.setBackgroundColor(Color.GREEN);
            asenkrons.setText("S");
            asenkrons.setBackgroundColor(Color.GREEN);
            asenkrone.setText("E");
            asenkrone.setBackgroundColor(Color.GREEN);
            asenkronn.setText("N");
            asenkronn.setBackgroundColor(Color.GREEN);
            asenkronk.setText("K");
            asenkronk.setBackgroundColor(Color.GREEN);
            asenkronr.setText("R");
            asenkronr.setBackgroundColor(Color.GREEN);
            asenkrono.setText("O");
            asenkrono.setBackgroundColor(Color.GREEN);
            asenkronn2.setText("N");
            asenkronn2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniasenkron=0;
        }
        else if(kelime.equalsIgnoreCase("SENKRON") && girisiznisenkron == 1) {
            puan+=90;
            senkrons.setText("S");
            senkrons.setBackgroundColor(Color.GREEN);
            senkrone.setText("E");
            senkrone.setBackgroundColor(Color.GREEN);
            senkronn.setText("N");
            senkronn.setBackgroundColor(Color.GREEN);
            senkronk.setText("K");
            senkronk.setBackgroundColor(Color.GREEN);
            senkronr.setText("R");
            senkronr.setBackgroundColor(Color.GREEN);
            senkrono.setText("O");
            senkrono.setBackgroundColor(Color.GREEN);
            asenkronn2.setText("N");
            asenkronn2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisenkron=0;
        }
        else if(kelime.equalsIgnoreCase("ANONS") && girisiznianons == 1) {
            puan+=70;
            anonsa.setText("A");
            anonsa.setBackgroundColor(Color.GREEN);
            anonsn.setText("N");
            anonsn.setBackgroundColor(Color.GREEN);
            anonso.setText("O");
            anonso.setBackgroundColor(Color.GREEN);
            anonsn2.setText("N");
            anonsn2.setBackgroundColor(Color.GREEN);
            asenkrons.setText("S");
            asenkrons.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznianons=0;
        }
        else if(kelime.equalsIgnoreCase("KANSER") && girisiznikanser == 1) {
            puan+=70;
            anonsa.setText("A");
            anonsa.setBackgroundColor(Color.GREEN);
            kansern.setText("N");
            kansern.setBackgroundColor(Color.GREEN);
            kanserk.setText("K");
            kanserk.setBackgroundColor(Color.GREEN);
            kansers.setText("S");
            kansers.setBackgroundColor(Color.GREEN);
            kansere.setText("E");
            kansere.setBackgroundColor(Color.GREEN);
            kanserr.setText("R");
            kanserr.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikanser=0;
        }
        else if(kelime.equalsIgnoreCase("ASKER") && girisizniasker == 1) {
            puan+=60;
            askers.setText("S");
            askers.setBackgroundColor(Color.GREEN);
            askera.setText("A");
            askera.setBackgroundColor(Color.GREEN);
            askere.setText("E");
            askere.setBackgroundColor(Color.GREEN);
            askerk.setText("K");
            askerk.setBackgroundColor(Color.GREEN);
            senkronr.setText("R");
            senkronr.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniasker=0;
        }
        else if(kelime.equalsIgnoreCase("ORAK") && girisizniorak == 1) {
            puan+=50;
            orako.setText("O");
            orako.setBackgroundColor(Color.GREEN);
            oraka.setText("A");
            oraka.setBackgroundColor(Color.GREEN);
            askerk.setText("K");
            askerk.setBackgroundColor(Color.GREEN);
            kanserr.setText("R");
            kanserr.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniorak=0;
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
                db.puanguncelle("seviye3bulmaca4",puan,database.kadi);
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
        Etanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ntanim2.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca4.this, seviye3bulmaca5.class);
        startActivity(gecisYap);
        finish();
    }
}
