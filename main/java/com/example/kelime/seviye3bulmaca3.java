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

public class seviye3bulmaca3 extends AppCompatActivity {
    String kelime="";
    Button Atanim;
    Button Ptanim;
    Button Otanim;
    Button Ltanim;
    Button Itanim;
    Button Ttanim;
    Button Ktanim;
    Button Itanim2;
    Button onayla;
    Button devamet;
    Button politikap;
    Button politikao;
    Button politikal;
    Button politikai;
    Button politikat;
    Button politikai2;
    Button politikak;
    Button politikaa;
    Button optikp;
    Button optikt;
    Button optiki;
    Button optikk;
    Button italikt;
    Button italika;
    Button italikl;
    Button italiki;
    Button italikk;
    Button iptalp;
    Button iptalt;
    Button iptala;
    Button iptall;
    Button iplikp;
    Button ipliki;
    Button iplikk;
    Button altl;
    int sayac=0;
    int girisiznipolitika=1;
    int girisiznioptik=1;
    int girisizniitalik=1;
    int girisizniiptal=1;
    int girisizniiplik=1;
    int girisiznialt=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye3bulmaca3);
        startTime = System.currentTimeMillis();


        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye3bulmaca3");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim=(Button) findViewById(R.id.A);
        Ptanim=(Button) findViewById(R.id.P);
        Otanim=(Button) findViewById(R.id.O);
        Ltanim=(Button) findViewById(R.id.L);
        Itanim=(Button) findViewById(R.id.I);
        Ttanim=(Button) findViewById(R.id.T);
        Ktanim=(Button) findViewById(R.id.K);
        Itanim2=(Button) findViewById(R.id.I2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Itanim2.setBackgroundColor(Color.CYAN);
        politikap=(Button) findViewById(R.id.politikap);
        politikao=(Button) findViewById(R.id.politikao);
        politikal=(Button) findViewById(R.id.politikal);
        politikai=(Button) findViewById(R.id.politikai);
        politikat=(Button) findViewById(R.id.politikat);
        politikai2=(Button) findViewById(R.id.politikai2);
        politikak=(Button) findViewById(R.id.politikak);
        politikaa=(Button) findViewById(R.id.politikaa);
        optikp=(Button) findViewById(R.id.optikp);
        optikt=(Button) findViewById(R.id.optikt);
        optiki=(Button) findViewById(R.id.optiki);
        optikk=(Button) findViewById(R.id.optikk);
        italikt=(Button) findViewById(R.id.italikt);
        italika=(Button) findViewById(R.id.italika);
        italikl=(Button) findViewById(R.id.italikl);
        italiki=(Button) findViewById(R.id.italiki);
        italikk=(Button) findViewById(R.id.italikk);
        iptalp=(Button) findViewById(R.id.iptalp);
        iptalt=(Button) findViewById(R.id.iptalt);
        iptala=(Button) findViewById(R.id.iptala);
        iptall=(Button) findViewById(R.id.iptall);
        iplikp=(Button) findViewById(R.id.iplikp);
        ipliki=(Button) findViewById(R.id.ipliki);
        iplikk=(Button) findViewById(R.id.iplikk);
        altl=(Button) findViewById(R.id.altl);
    }

    //0-p,1-o,2-l,3-i,4-t,5-i2,6-k,7-a
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
                        (Ptanim=findViewById(R.id.P)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ptanim=findViewById(R.id.O)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ptanim=findViewById(R.id.L)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ptanim=findViewById(R.id.I)).setText("P");
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
                        (Ptanim=findViewById(R.id.I2)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ptanim=findViewById(R.id.K)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ptanim=findViewById(R.id.A)).setText("P");
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
            int a=r.nextInt(8);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Otanim=findViewById(R.id.P)).setText("O");
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
                        (Otanim=findViewById(R.id.L)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Otanim=findViewById(R.id.I)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Otanim=findViewById(R.id.T)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Otanim=findViewById(R.id.I2)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Otanim=findViewById(R.id.K)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Otanim=findViewById(R.id.A)).setText("O");
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
                        (Ltanim=findViewById(R.id.P)).setText("L");
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
                        (Ltanim=findViewById(R.id.I)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ltanim=findViewById(R.id.T)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ltanim=findViewById(R.id.I2)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ltanim=findViewById(R.id.K)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ltanim=findViewById(R.id.A)).setText("L");
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
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Itanim=findViewById(R.id.P)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim=findViewById(R.id.O)).setText("İ");
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
                        (Itanim=findViewById(R.id.I)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim=findViewById(R.id.T)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim=findViewById(R.id.I2)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Itanim=findViewById(R.id.K)).setText("İ");
                        Itanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Itanim=findViewById(R.id.A)).setText("İ");
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
                        (Ttanim=findViewById(R.id.P)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.O)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.L)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.I)).setText("T");
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
                        (Ttanim=findViewById(R.id.I2)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ttanim=findViewById(R.id.K)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ttanim=findViewById(R.id.A)).setText("T");
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
                        (Itanim2=findViewById(R.id.P)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Itanim2=findViewById(R.id.O)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Itanim2=findViewById(R.id.L)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Itanim2=findViewById(R.id.I)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Itanim2=findViewById(R.id.T)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Itanim2=findViewById(R.id.I2)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Itanim2=findViewById(R.id.K)).setText("İ");
                        Itanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi2(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Itanim2=findViewById(R.id.A)).setText("İ");
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
                        (Ktanim=findViewById(R.id.P)).setText("K");
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
                        (Ktanim=findViewById(R.id.I)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.T)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.I2)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Ktanim=findViewById(R.id.K)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Ktanim=findViewById(R.id.A)).setText("K");
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
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Atanim=findViewById(R.id.P)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.O)).setText("A");
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
                        (Atanim=findViewById(R.id.I)).setText("A");
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
                        (Atanim=findViewById(R.id.I2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==6){
                        (Atanim=findViewById(R.id.K)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==7){
                        (Atanim=findViewById(R.id.A)).setText("A");
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
                db.guncelle(database.kadi,database.sifresi,"seviye3bulmaca3");
                ActivityCompat.finishAffinity(seviye3bulmaca3.this);
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
    public void renkdegisp(View view){
        Ptanim.setBackgroundColor(Color.GRAY);
        kelime+="P";
    }
    public void renkdegiso(View view){
        Otanim.setBackgroundColor(Color.GRAY);
        kelime+="O";
    }
    public void renkdegisl(View view){
        Ltanim.setBackgroundColor(Color.GRAY);
        kelime+="L";
    }
    public void renkdegisi(View view){
        Itanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }

    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void renkdegisi2(View view){
        Itanim2.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("POLİTİKA") && girisiznipolitika == 1) {
            puan+=130;
            politikap.setText("P");
            politikap.setBackgroundColor(Color.GREEN);
            politikao.setText("O");
            politikao.setBackgroundColor(Color.GREEN);
            politikal.setText("L");
            politikal.setBackgroundColor(Color.GREEN);
            politikai.setText("İ");
            politikai.setBackgroundColor(Color.GREEN);
            politikat.setText("T");
            politikat.setBackgroundColor(Color.GREEN);
            politikai2.setText("İ");
            politikai2.setBackgroundColor(Color.GREEN);
            politikak.setText("K");
            politikak.setBackgroundColor(Color.GREEN);
            politikaa.setText("A");
            politikaa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipolitika=0;
        }
        else if(kelime.equalsIgnoreCase("OPTİK") && girisiznioptik == 1) {
            puan+=100;
            optikp.setText("P");
            optikp.setBackgroundColor(Color.GREEN);
            politikao.setText("O");
            politikao.setBackgroundColor(Color.GREEN);
            optikt.setText("T");
            optikt.setBackgroundColor(Color.GREEN);
            optiki.setText("İ");
            optiki.setBackgroundColor(Color.GREEN);
            optikk.setText("K");
            optikk.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznioptik=0;
        }
        else if(kelime.equalsIgnoreCase("İTALİK") && girisizniitalik== 1) {
            puan+=60;
            italikt.setText("T");
            italikt.setBackgroundColor(Color.GREEN);
            italika.setText("A");
            italika.setBackgroundColor(Color.GREEN);
            italikl.setText("L");
            italikl.setBackgroundColor(Color.GREEN);
            italiki.setText("İ");
            italiki.setBackgroundColor(Color.GREEN);
            italikk.setText("K");
            italikk.setBackgroundColor(Color.GREEN);
            politikai.setText("İ");
            politikai.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniitalik=0;
        }
        else if(kelime.equalsIgnoreCase("İPTAL") && girisizniiptal== 1) {
            puan+=90;
            iptalp.setText("P");
            iptalp.setBackgroundColor(Color.GREEN);
            iptalt.setText("T");
            iptalt.setBackgroundColor(Color.GREEN);
            iptala.setText("A");
            iptala.setBackgroundColor(Color.GREEN);
            iptall.setText("L");
            iptall.setBackgroundColor(Color.GREEN);
            politikai2.setText("İ");
            politikai2.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniiptal=0;
        }
        else if(kelime.equalsIgnoreCase("İPLİK") && girisizniiplik== 1) {
            puan+=90;
            iplikp.setText("P");
            iplikp.setBackgroundColor(Color.GREEN);
            ipliki.setText("İ");
            ipliki.setBackgroundColor(Color.GREEN);
            iplikk.setText("K");
            iplikk.setBackgroundColor(Color.GREEN);
            italiki.setText("İ");
            italiki.setBackgroundColor(Color.GREEN);
            iptall.setText("L");
            iptall.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniiplik=0;
        }
        else if(kelime.equalsIgnoreCase("ALT") && girisiznialt== 1) {
            puan+=30;
            altl.setText("L");
            altl.setBackgroundColor(Color.GREEN);
            italika.setText("A");
            italika.setBackgroundColor(Color.GREEN);
            iptalt.setText("T");
            iptalt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznialt=0;
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
                db.puanguncelle("seviye3bulmaca3",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Itanim.setBackgroundColor(Color.CYAN);
        Itanim2.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye3bulmaca3.this, seviye3bulmaca4.class);
        startActivity(gecisYap);
        finish();
    }
}
