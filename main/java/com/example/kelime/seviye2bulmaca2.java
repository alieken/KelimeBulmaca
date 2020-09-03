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

public class seviye2bulmaca2 extends AppCompatActivity {
    String kelime="";
    Button Etanim2;
    Button Mtanim;
    Button Ntanim;
    Button Etanim;
    Button Atanim;
    Button Ttanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button namen;
    Button namea;
    Button namee;
    Button namem;
    Button temat;
    Button temaa;
    Button temam;
    Button tanet;
    Button tanea;
    Button tanee;
    Button metat;
    Button metae;
    Button metaa;
    Button neman;
    Button nemae;
    Button nemam;
    int girisizniname =1 ;
    int girisiznitema =1 ;
    int girisiznitane=1 ;
    int girisiznimeta=1 ;
    int girisizninema=1 ;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca2);

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca2");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());
        startTime = System.currentTimeMillis();
        Etanim=(Button) findViewById(R.id.E);
        Mtanim=(Button) findViewById(R.id.M);
        Atanim=(Button) findViewById(R.id.A);
        Ntanim=(Button) findViewById(R.id.N);
        Ttanim=(Button) findViewById(R.id.T);
        Etanim2=(Button) findViewById(R.id.E2);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Etanim2.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        namee=(Button) findViewById(R.id.namee);
        namen=(Button) findViewById(R.id.namen);
        namea=(Button) findViewById(R.id.namea);
        namem=(Button) findViewById(R.id.namem);
        temat=(Button) findViewById(R.id.temat);
        temaa=(Button) findViewById(R.id.temaa);
        temam=(Button) findViewById(R.id.temam);
        tanet=(Button) findViewById(R.id.tanet);
        tanea=(Button) findViewById(R.id.tanea);
        tanee=(Button) findViewById(R.id.tanee);
        metat=(Button) findViewById(R.id.metat);
        metae=(Button) findViewById(R.id.metae);
        metaa=(Button) findViewById(R.id.metaa);
        neman=(Button) findViewById(R.id.neman);
        nemam=(Button) findViewById(R.id.nemam);
        nemae=(Button) findViewById(R.id.nemae);
    }
    //0-e,1-m,2-a,3-n,4-e2,5-t
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
                        (Etanim=findViewById(R.id.E)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim=findViewById(R.id.M)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.A)).setText("E");
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
                        (Etanim=findViewById(R.id.E2)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.T)).setText("E");
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
                        (Mtanim=findViewById(R.id.E)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.A)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.N)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.E2)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.T)).setText("M");
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
                        (Atanim=findViewById(R.id.E)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.M)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.A)).setText("A");
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
                        (Atanim=findViewById(R.id.E2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.T)).setText("A");
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
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ntanim=findViewById(R.id.E)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ntanim=findViewById(R.id.M)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ntanim=findViewById(R.id.A)).setText("N");
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
                        (Ntanim=findViewById(R.id.E2)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ntanim=findViewById(R.id.T)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
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
                        (Etanim2=findViewById(R.id.E)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim2=findViewById(R.id.M)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim2=findViewById(R.id.A)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim2=findViewById(R.id.N)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim2=findViewById(R.id.E2)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim2=findViewById(R.id.T)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
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
                        (Ttanim=findViewById(R.id.E)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.M)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.N)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim=findViewById(R.id.E2)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.T)).setText("T");
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca2");
                ActivityCompat.finishAffinity(seviye2bulmaca2.this);
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
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegisn(View view){
        Ntanim.setBackgroundColor(Color.GRAY);
        kelime+="N";
    }

    public void renkdegise2(View view){
        Etanim2.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("NAME") && girisizniname == 1) {
            puan+=50;
            namea.setText("A");
            namea.setBackgroundColor(Color.GREEN);
            namen.setText("N");
            namen.setBackgroundColor(Color.GREEN);
            namem.setText("M");
            namem.setBackgroundColor(Color.GREEN);
            namee.setText("E");
            namee.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniname=0;
        }
        else if(kelime.equalsIgnoreCase("TEMA") && girisiznitema == 1) {
            puan+=50;
            temaa.setText("A");
            temaa.setBackgroundColor(Color.GREEN);
            temat.setText("T");
            temat.setBackgroundColor(Color.GREEN);
            temam.setText("M");
            temam.setBackgroundColor(Color.GREEN);
            namee.setText("E");
            namee.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitema=0;
        }
        else if(kelime.equalsIgnoreCase("TANE") && girisiznitane == 1) {
            puan+=40;
            tanea.setText("A");
            tanea.setBackgroundColor(Color.GREEN);
            tanet.setText("T");
            tanet.setBackgroundColor(Color.GREEN);
            namen.setText("N");
            namen.setBackgroundColor(Color.GREEN);
            tanee.setText("E");
            tanee.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitane=0;
        }
        else if(kelime.equalsIgnoreCase("META") && girisiznimeta == 1) {
            puan+=50;
            metaa.setText("A");
            metaa.setBackgroundColor(Color.GREEN);
            metat.setText("T");
            metat.setBackgroundColor(Color.GREEN);
            temam.setText("M");
            temam.setBackgroundColor(Color.GREEN);
            metae.setText("E");
            metae.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimeta=0;
        }
        else if(kelime.equalsIgnoreCase("NEMA") && girisizninema == 1) {
            puan+=50;
            metaa.setText("A");
            metaa.setBackgroundColor(Color.GREEN);
            neman.setText("N");
            neman.setBackgroundColor(Color.GREEN);
            nemam.setText("M");
            nemam.setBackgroundColor(Color.GREEN);
            nemae.setText("E");
            nemae.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizninema=0;
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
                db.puanguncelle("seviye2bulmaca2",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Etanim2.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca2.this, seviye2bulmaca3.class);
        startActivity(gecisYap);
        finish();
    }
}
