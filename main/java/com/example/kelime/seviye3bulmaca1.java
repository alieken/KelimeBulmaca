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

public class seviye3bulmaca1 extends AppCompatActivity {
    String kelime="";
    Button Stanim;
    Button Itanim;
    Button Itanim2;
    Button Ttanim;
    Button Atanim;
    Button Htanim;
    Button Mtanim;
    Button Dtanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button idami;
    Button idamd;
    Button idama;
    Button idamm;
    Button dahia;
    Button dahih;
    Button dahii;
    Button miati;
    Button miata;
    Button miatt;
    Button ahih;
    Button sahs;
    Button asits;
    Button asiti;
    Button asitt;
    Button imdati;
    Button imdatm;
    Button imdatd;
    Button imdata;
    int girisizniidam=1;
    int girisiznidahi=1;
    int girisiznimiat=1;
    int girisizniahi=1;
    int girisiznisah=1;
    int girisizniimdat=1;
    int girisizniasit=1;
    Button[] dizi = new Button[19];
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca1);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca1");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim=(Button) findViewById(R.id.A);
        Ttanim=(Button) findViewById(R.id.T);
        Stanim=(Button) findViewById(R.id.S);
        Mtanim=(Button) findViewById(R.id.M);
        Dtanim=(Button) findViewById(R.id.D);
        Itanim=(Button) findViewById(R.id.I);
        Htanim=(Button) findViewById(R.id.H);
        Itanim2=(Button) findViewById(R.id.i2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Htanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Itanim2.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        Dtanim.setBackgroundColor(Color.CYAN);
        idami=(Button) findViewById(R.id.idami);
        dizi[0]=idami;
        idamd=(Button) findViewById(R.id.idamd);
        dizi[1]=idamd;
        idama=(Button) findViewById(R.id.idama);
        dizi[2]=idama;
        idamm=(Button) findViewById(R.id.idamm);
        dizi[3]=idamm;
        dahii=(Button) findViewById(R.id.dahii);
        dizi[4]=dahii;
        dahih=(Button) findViewById(R.id.dahih);
        dizi[5]=dahih;
        dahia=(Button) findViewById(R.id.dahia);
        dizi[6]=dahia;
        miati=(Button) findViewById(R.id.miati);
        dizi[7]=miati;
        miata=(Button) findViewById(R.id.miata);
        dizi[8]=miata;
        miatt=(Button) findViewById(R.id.miatt);
        dizi[9]=miatt;
        ahih=(Button) findViewById(R.id.ahih);
        dizi[10]=ahih;
        sahs=(Button) findViewById(R.id.sahs);
        dizi[11]=sahs;
        asits=(Button) findViewById(R.id.asits);
        dizi[12]=asits;
        asiti=(Button) findViewById(R.id.asiti);
        dizi[13]=asiti;
        asitt=(Button) findViewById(R.id.asitt);
        dizi[14]=asitt;
        imdati=(Button) findViewById(R.id.imdati);
        dizi[15]=imdati;
        imdatm=(Button) findViewById(R.id.imdatm);
        dizi[16]=imdatm;
        imdatd=(Button) findViewById(R.id.imdatd);
        dizi[17]=imdatd;
        imdata=(Button) findViewById(R.id.imdata);
        dizi[18]=imdata;
    }
    //0-i,1-s,2-t,3-i2,4-h,5-d,6-a,7-m
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
                        (Itanim=findViewById(R.id.I)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.S)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim=findViewById(R.id.T)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim=findViewById(R.id.i2)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.H)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.D)).setText("İ");
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
                        (Itanim=findViewById(R.id.M)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
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
                        (Stanim=findViewById(R.id.I)).setText("S");
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
                        (Stanim=findViewById(R.id.T)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Stanim=findViewById(R.id.i2)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Stanim=findViewById(R.id.H)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim=findViewById(R.id.D)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Stanim=findViewById(R.id.A)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Stanim=findViewById(R.id.M)).setText("S");
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
                        (Ttanim=findViewById(R.id.I)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.S)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.T)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.i2)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim=findViewById(R.id.H)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.D)).setText("T");
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Itanim2=findViewById(R.id.I)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim2=findViewById(R.id.S)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim2=findViewById(R.id.T)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim2=findViewById(R.id.i2)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim2=findViewById(R.id.H)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim2=findViewById(R.id.D)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Itanim2=findViewById(R.id.A)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Itanim2=findViewById(R.id.M)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
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
                        (Htanim=findViewById(R.id.I)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Htanim=findViewById(R.id.S)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Htanim=findViewById(R.id.T)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Htanim=findViewById(R.id.i2)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Htanim=findViewById(R.id.H)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Htanim=findViewById(R.id.D)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Htanim=findViewById(R.id.A)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Htanim=findViewById(R.id.M)).setText("H");
                        Htanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegish(view);
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
                        (Dtanim=findViewById(R.id.I)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Dtanim=findViewById(R.id.S)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Dtanim=findViewById(R.id.T)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Dtanim=findViewById(R.id.i2)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Dtanim=findViewById(R.id.H)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Dtanim=findViewById(R.id.D)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Dtanim=findViewById(R.id.A)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Dtanim=findViewById(R.id.M)).setText("D");
                        Dtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisd(view);
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
                        (Atanim=findViewById(R.id.I)).setText("A");
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
                        (Atanim=findViewById(R.id.T)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.i2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.H)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.D)).setText("A");
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
                        (Atanim=findViewById(R.id.M)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
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
                        (Mtanim=findViewById(R.id.I)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.S)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.T)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.i2)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.H)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.D)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Mtanim=findViewById(R.id.A)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Mtanim=findViewById(R.id.M)).setText("M");
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca1");
                ActivityCompat.finishAffinity(seviye3bulmaca1.this);
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
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegisd(View view){
        Dtanim.setBackgroundColor(Color.GRAY);
        kelime+="D";
    }
    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegish(View view){
        Htanim.setBackgroundColor(Color.GRAY);
        kelime+="H";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }

    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void renkdegisi2(View view){
        Itanim2.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void renkdegiss(View view){
        Stanim.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("İDAM") && girisizniidam == 1) {
            puan+=70;
            idami.setText("İ");
            idami.setBackgroundColor(Color.GREEN);
            idamd.setText("D");
            idamd.setBackgroundColor(Color.GREEN);
            idama.setText("A");
            idama.setBackgroundColor(Color.GREEN);
            idamm.setText("M");
            idamm.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniidam=0;
        }
        else if(kelime.equalsIgnoreCase("DAHİ") && girisiznidahi== 1) {
            puan+=100;
            dahii.setText("İ");
            dahii.setBackgroundColor(Color.GREEN);
            idamd.setText("D");
            idamd.setBackgroundColor(Color.GREEN);
            dahia.setText("A");
            dahia.setBackgroundColor(Color.GREEN);
            dahih.setText("H");
            dahih.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznidahi=0;
        }
        else if(kelime.equalsIgnoreCase("MİAT") && girisiznimiat== 1) {
            puan+=50;
            miati.setText("İ");
            miati.setBackgroundColor(Color.GREEN);
            idamm.setText("M");
            idamm.setBackgroundColor(Color.GREEN);
            miata.setText("A");
            miata.setBackgroundColor(Color.GREEN);
            miatt.setText("T");
            miatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimiat=0;
        }
        else if(kelime.equalsIgnoreCase("AHİ") && girisizniahi== 1) {
            puan+=70;
            miati.setText("İ");
            miati.setBackgroundColor(Color.GREEN);
            dahia.setText("A");
            dahia.setBackgroundColor(Color.GREEN);
            ahih.setText("H");
            ahih.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniahi=0;
        }
        else if(kelime.equalsIgnoreCase("SAH") && girisiznisah== 1) {
            puan+=80;
            sahs.setText("S");
            sahs.setBackgroundColor(Color.GREEN);
            idama.setText("A");
            idama.setBackgroundColor(Color.GREEN);
            ahih.setText("H");
            ahih.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisah=0;
        }
        else if(kelime.equalsIgnoreCase("ASİT") && girisizniasit== 1) {
            puan+=50;
            asits.setText("S");
            asits.setBackgroundColor(Color.GREEN);
            miata.setText("A");
            miata.setBackgroundColor(Color.GREEN);
            asiti.setText("İ");
            asiti.setBackgroundColor(Color.GREEN);
            asitt.setText("T");
            asitt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniasit=0;
        }
        else if(kelime.equalsIgnoreCase("İMDAT") && girisizniimdat== 1) {
            puan+=80;
            imdati.setText("İ");
            imdati.setBackgroundColor(Color.GREEN);
            imdata.setText("A");
            imdata.setBackgroundColor(Color.GREEN);
            imdatd.setText("D");
            imdatd.setBackgroundColor(Color.GREEN);
            imdatm.setText("M");
            imdatm.setBackgroundColor(Color.GREEN);
            asitt.setText("T");
            asitt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniimdat=0;
        }
        else{
            puan-=2;
        }
        int gecis=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].getText().equals("")){
                gecis=0;
                break;
            }
            else{
                gecis=1;
            }
        }
        if(sayac==7 || gecis==1){
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
                db.puanguncelle("seviye3bulmaca1",puan,database.kadi);
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
        Mtanim.setBackgroundColor(Color.CYAN);
        Htanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Itanim2.setBackgroundColor(Color.CYAN);
        Dtanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca1.this, seviye3bulmaca2.class);
        startActivity(gecisYap);
        finish();
    }
}
