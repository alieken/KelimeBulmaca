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

public class seviye1bulmaca3 extends AppCompatActivity {
    String kelime="";
    Button Atanim2;
    Button Ptanim;
    Button Ttanim;
    Button Atanim;
    Button Ktanim;
    Button Ntanim;
    Button onayla;
    Button devamet;
    Button ataa;
    Button ataa2;
    Button atat;
    Button anan;
    Button anaa;
    Button antn;
    Button antt;
    Button tana;
    Button tann;
    Button kana;
    Button kank;
    Button kapa;
    Button kapp;
    Button pata;
    Button patt;
    int girisizniata=1;
    int girisizniana=1;
    int girisizniant=1;
    int girisiznitan=1;
    int girisiznikan=1;
    int girisiznikap=1;
    int girisiznipat=1;
    long startTime;
    int sayac=0;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca3);
        startTime = System.currentTimeMillis();
        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca3");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());
        Atanim=(Button) findViewById(R.id.A);
        Ptanim=(Button) findViewById(R.id.P);
        Ntanim=(Button) findViewById(R.id.N);
        Ktanim=(Button) findViewById(R.id.K);
        Ttanim=(Button) findViewById(R.id.T);
        Atanim2=(Button) findViewById(R.id.A2);
        onayla=(Button) findViewById(R.id.onay);
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        devamet=(Button) findViewById(R.id.devambutonu);
        ataa=(Button) findViewById(R.id.ataa);
        atat=(Button) findViewById(R.id.atat);
        ataa2=(Button) findViewById(R.id.ataa2);
        anan=(Button) findViewById(R.id.anan);
        anaa=(Button) findViewById(R.id.anaa);
        antn=(Button) findViewById(R.id.antn);
        antt=(Button) findViewById(R.id.antt);
        tana=(Button) findViewById(R.id.tana);
        tann=(Button) findViewById(R.id.tann);
        kank=(Button) findViewById(R.id.kank);
        kana=(Button) findViewById(R.id.kana);
        kapa=(Button) findViewById(R.id.kapa);
        kapp=(Button) findViewById(R.id.kapp);
        pata=(Button) findViewById(R.id.pata);
        patt=(Button) findViewById(R.id.patt);

    }
    //0-k,1-a,2-p,3-t,4-a2,5-n
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
            System.out.println("-----------------------------------------------------");
            System.out.println(a);
            System.out.println("-----------------------------------------------------");
            for (int j = 0; j < ar.size() ; j++) {

                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ktanim=findViewById(R.id.K)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ktanim=findViewById(R.id.A)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.P)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.T)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.A2)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.N)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
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
                        (Atanim=findViewById(R.id.K)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim=findViewById(R.id.A)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.P)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.T)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.A2)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.N)).setText("A");
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
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Ptanim=findViewById(R.id.K)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ptanim=findViewById(R.id.A)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ptanim=findViewById(R.id.P)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ptanim=findViewById(R.id.T)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ptanim=findViewById(R.id.A2)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ptanim=findViewById(R.id.N)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
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
                        (Ttanim=findViewById(R.id.K)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.P)).setText("T");
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
                        (Ttanim=findViewById(R.id.A2)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.N)).setText("T");
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
                        (Atanim2=findViewById(R.id.K)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim2=findViewById(R.id.A)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.P)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.T)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim2=findViewById(R.id.A2)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim2=findViewById(R.id.N)).setText("A");
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
                        (Ntanim=findViewById(R.id.K)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ntanim=findViewById(R.id.A)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ntanim=findViewById(R.id.P)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ntanim=findViewById(R.id.T)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ntanim=findViewById(R.id.A2)).setText("N");
                        Ntanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisn(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ntanim=findViewById(R.id.N)).setText("N");
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
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca3");
                ActivityCompat.finishAffinity(seviye1bulmaca3.this);
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
    public void renkdegisp(View view){
        Ptanim.setBackgroundColor(Color.GRAY);
        kelime+="P";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }

    public void renkdegisa2(View view){
        Atanim2.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisn(View view){
        Ntanim.setBackgroundColor(Color.GRAY);
        kelime+="N";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("ATA") && girisizniata == 1) {
            puan+=30;
            ataa.setText("A");
            ataa.setBackgroundColor(Color.GREEN);
            ataa2.setText("A");
            ataa2.setBackgroundColor(Color.GREEN);
            atat.setText("T");
            atat.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniata=0;
        }
        else if(kelime.equalsIgnoreCase("ANA") && girisizniana == 1) {
            puan+=30;
            ataa.setText("A");
            ataa.setBackgroundColor(Color.GREEN);
            anan.setText("N");
            anan.setBackgroundColor(Color.GREEN);
            anaa.setText("A");
            anaa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniana=0;
        }
        else if(kelime.equalsIgnoreCase("ANT") && girisizniant == 1) {
            puan+=30;
            ataa2.setText("A");
            ataa2.setBackgroundColor(Color.GREEN);
            antn.setText("N");
            antn.setBackgroundColor(Color.GREEN);
            antt.setText("T");
            antt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniant=0;
        }
        else if(kelime.equalsIgnoreCase("TAN") && girisiznitan == 1) {
            puan+=30;
            tana.setText("A");
            tana.setBackgroundColor(Color.GREEN);
            tann.setText("N");
            tann.setBackgroundColor(Color.GREEN);
            antt.setText("T");
            antt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitan=0;
        }
        else if(kelime.equalsIgnoreCase("KAN") && girisiznikan == 1) {
            puan+=30;
            kana.setText("A");
            kana.setBackgroundColor(Color.GREEN);
            tann.setText("N");
            tann.setBackgroundColor(Color.GREEN);
            kank.setText("K");
            kank.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikan=0;
        }
        else if(kelime.equalsIgnoreCase("KAP") && girisiznikap == 1) {
            puan+=70;
            kapa.setText("A");
            kapa.setBackgroundColor(Color.GREEN);
            kapp.setText("P");
            kapp.setBackgroundColor(Color.GREEN);
            kank.setText("K");
            kank.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikap=0;
        }
        else if(kelime.equalsIgnoreCase("PAT") && girisiznipat == 1) {
            puan+=70;
            pata.setText("A");
            pata.setBackgroundColor(Color.GREEN);
            kapp.setText("P");
            kapp.setBackgroundColor(Color.GREEN);
            patt.setText("T");
            patt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipat=0;
        }
        else {
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
                db.puanguncelle("seviye1bulmaca3",puan,database.kadi);
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
        Ptanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ntanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye1bulmaca3.this, seviye1bulmaca4.class);
        startActivity(gecisYap);
        finish();
    }
}
