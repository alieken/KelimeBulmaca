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

public class seviye1bulmaca4 extends AppCompatActivity {
    String kelime="";
    Button Stanim;
    Button Ptanim;
    Button Ütanim;
    Button Atanim;
    Button Ktanim;
    Button Mtanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button küpk;
    Button küpü;
    Button küpp;
    Button pasa;
    Button pass;
    Button küsk;
    Button küsü;
    Button kasa;
    Button kass;
    Button aksk;
    Button akss;
    Button sapa;
    Button sapp;
    Button paka;
    Button pakk;
    int girisizniküp=1;
    int girisiznipas=1;
    int girisizniküs=1;
    int girisiznikas=1;
    int girisizniaks=1;
    int girisiznisap=1;
    int girisiznipak=1;
    Button[] dizi = new Button[15];
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca4);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca4");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim=(Button) findViewById(R.id.A);
        Ptanim=(Button) findViewById(R.id.P);
        Stanim=(Button) findViewById(R.id.S);
        Ktanim=(Button) findViewById(R.id.K);
        Mtanim=(Button) findViewById(R.id.M);
        Ütanim=(Button) findViewById(R.id.Ü);
        onayla=(Button) findViewById(R.id.onay);
        Atanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ütanim.setBackgroundColor(Color.CYAN);
        Stanim.setBackgroundColor(Color.CYAN);
        devamet=(Button) findViewById(R.id.devambutonu);
        küpk=(Button) findViewById(R.id.küpk);
        dizi[0]=küpk;
        küpü=(Button) findViewById(R.id.küpü);
        dizi[1]=küpü;
        küpp=(Button) findViewById(R.id.küpp);
        dizi[2]=küpp;
        pasa=(Button) findViewById(R.id.pasa);
        dizi[3]=pasa;
        pass=(Button) findViewById(R.id.pass);
        dizi[4]=pass;
        küsk=(Button) findViewById(R.id.küsk);
        dizi[5]=küsk;
        küsü=(Button) findViewById(R.id.küsü);
        dizi[6]=küsü;
        kasa=(Button) findViewById(R.id.kasa);
        dizi[7]=kasa;
        kass=(Button) findViewById(R.id.kass);
        dizi[8]=kass;
        aksk=(Button) findViewById(R.id.aksk);
        dizi[9]=aksk;
        akss=(Button) findViewById(R.id.akss);
        dizi[10]=akss;
        sapa=(Button) findViewById(R.id.sapa);
        dizi[11]=sapa;
        sapp=(Button) findViewById(R.id.sapp);
        dizi[12]=sapp;
        paka=(Button) findViewById(R.id.paka);
        dizi[13]=paka;
        pakk=(Button) findViewById(R.id.pakk);
        dizi[14]=pakk;
    }
    //0-k,1-a,2-m,3-p,4-ü2,5-s
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
                        (Ktanim=findViewById(R.id.M)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.P)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.Ü)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.S)).setText("K");
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
                        (Atanim=findViewById(R.id.M)).setText("A");
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
                        (Atanim=findViewById(R.id.Ü)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.S)).setText("A");
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
                        (Mtanim=findViewById(R.id.K)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.A)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.P)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.Ü)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.S)).setText("M");
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
                        (Ptanim=findViewById(R.id.M)).setText("P");
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
                        (Ptanim=findViewById(R.id.Ü)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ptanim=findViewById(R.id.S)).setText("P");
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
                        (Ütanim=findViewById(R.id.K)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ütanim=findViewById(R.id.A)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ütanim=findViewById(R.id.M)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ütanim=findViewById(R.id.P)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ütanim=findViewById(R.id.Ü)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ütanim=findViewById(R.id.S)).setText("Ü");
                        Ütanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisü(view);
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
                        (Stanim=findViewById(R.id.K)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Stanim=findViewById(R.id.A)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Stanim=findViewById(R.id.M)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Stanim=findViewById(R.id.P)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Stanim=findViewById(R.id.Ü)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Stanim=findViewById(R.id.S)).setText("S");
                        Stanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiss(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca4");
                ActivityCompat.finishAffinity(seviye1bulmaca4.this);
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
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }

    public void renkdegisü(View view){
        Ütanim.setBackgroundColor(Color.GRAY);
        kelime+="Ü";
    }
    public void renkdegiss(View view){
        Stanim.setBackgroundColor(Color.GRAY);
        kelime+="S";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("KÜP") && girisizniküp == 1) {
            puan+=90;
            küpk.setText("K");
            küpk.setBackgroundColor(Color.GREEN);
            küpü.setText("Ü");
            küpü.setBackgroundColor(Color.GREEN);
            küpp.setText("P");
            küpp.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniküp=0;
        }
        else if(kelime.equalsIgnoreCase("PAS") && girisiznipas == 1) {
            puan+=80;
            pass.setText("S");
            pass.setBackgroundColor(Color.GREEN);
            pasa.setText("A");
            pasa.setBackgroundColor(Color.GREEN);
            küpp.setText("P");
            küpp.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipas=0;
        }
        else if(kelime.equalsIgnoreCase("KÜS") && girisizniküs == 1) {
            puan+=60;
            pass.setText("S");
            pass.setBackgroundColor(Color.GREEN);
            küsk.setText("K");
            küsk.setBackgroundColor(Color.GREEN);
            küsü.setText("Ü");
            küsü.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniküs=0;
        }
        else if(kelime.equalsIgnoreCase("KAS") && girisiznikas == 1) {
            puan+=40;
            kass.setText("S");
            kass.setBackgroundColor(Color.GREEN);
            küsk.setText("K");
            küsk.setBackgroundColor(Color.GREEN);
            kasa.setText("A");
            kasa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikas=0;
        }
        else if(kelime.equalsIgnoreCase("AKS") && girisizniaks == 1) {
            puan+=40;
            akss.setText("S");
            akss.setBackgroundColor(Color.GREEN);
            aksk.setText("K");
            aksk.setBackgroundColor(Color.GREEN);
            pasa.setText("A");
            pasa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniaks=0;
        }
        else if(kelime.equalsIgnoreCase("SAP") && girisiznisap == 1) {
            puan+=80;
            akss.setText("S");
            akss.setBackgroundColor(Color.GREEN);
            sapp.setText("P");
            sapp.setBackgroundColor(Color.GREEN);
            sapa.setText("A");
            sapa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznisap=0;
        }
        else if(kelime.equalsIgnoreCase("PAK") && girisiznipak == 1) {
            puan+=70;
            pakk.setText("K");
            pakk.setBackgroundColor(Color.GREEN);
            sapp.setText("P");
            sapp.setBackgroundColor(Color.GREEN);
            paka.setText("A");
            paka.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipak=0;
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
                db.puanguncelle("seviye1bulmaca4",puan,database.kadi);
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
        Ptanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Ütanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye1bulmaca4.this, seviye1bulmaca5.class);
        startActivity(gecisYap);
        finish();
    }
}
