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

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class seviye1bulmaca1 extends AppCompatActivity {
    Button Mtanim;
    Button Atanim;
    Button Rtanim;
    Button Ktanim;
    Button Etanim;
    Button Ttanim;
    Button onayla;
    Button Tbul;
    Button Ebul;
    Button Rbul;
    Button Rbul2;
    Button Kbul;
    Button Ebul2;
    Button Ebul3;
    Button Ebul4;
    Button Abul;
    Button Mbul;
    Button Mbul2;
    Button Abul2;
    Button Abul3;
    Button Abul4;
    Button Tbul2;
    Button Tbul3;
    Button Tbul4;
    Button devamet;
    TextView t7;
    TextView sure;
    TextView t8;
    String[] texts = new String[1];
    String kelime="";
    int sayac=0;
    int girisizniter=1;
    int girisiznitam=1;
    int girisiznimat=1;
    int girisizniart=1;
    int girisiznitek=1;
    int girisiznikat=1;
    int girisizniret=1;
    int girisiznimet=1;
    long startTime;
    double puan=0;
    String kadi;
    String sifresi;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    Button[] butondizisi= new Button[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca1);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            kadi = bundle.getString("kadi");
            sifresi = bundle.getString("sifre");
        }
        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca1");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());
        startTime = System.currentTimeMillis();
        Atanim=(Button) findViewById(R.id.A);
        butondizisi[0]=Atanim;
        butondizisi[0].setText(Atanim.getText().toString());
        Mtanim=(Button) findViewById(R.id.M);
        butondizisi[1]=Mtanim;
        butondizisi[1].setText(Mtanim.getText().toString());
        Rtanim=(Button) findViewById(R.id.R);
        butondizisi[2]=Rtanim;
        butondizisi[2].setText(Rtanim.getText().toString());
        Ktanim=(Button) findViewById(R.id.K);
        butondizisi[3]=Ktanim;
        butondizisi[3].setText(Ktanim.getText().toString());
        Etanim=(Button) findViewById(R.id.E);
        butondizisi[4]=Etanim;
        butondizisi[4].setText(Etanim.getText().toString());
        Ttanim=(Button) findViewById(R.id.T);
        butondizisi[5]=Ttanim;
        butondizisi[5].setText(Ttanim.getText().toString());
        devamet=(Button) findViewById(R.id.devambutonu);
        Tbul=(Button) findViewById(R.id.Tbulmaca);
        Ebul=(Button) findViewById(R.id.Ebulmaca);
        Rbul=(Button) findViewById(R.id.Rbulmaca);
        Rbul2=(Button) findViewById(R.id.Rbulmaca2);
        Ebul2=(Button) findViewById(R.id.Ebulmaca2);
        Ebul3=(Button) findViewById(R.id.Ebulmaca3);
        Ebul4=(Button) findViewById(R.id.Ebulmaca4);
        Kbul=(Button) findViewById(R.id.Kbulmaca);
        Abul=(Button) findViewById(R.id.Abulmaca);
        Mbul=(Button) findViewById(R.id.Mbulmaca);
        Mbul2=(Button) findViewById(R.id.Mbulmaca2);
        Abul2=(Button) findViewById(R.id.Abulmaca2);
        Abul3=(Button) findViewById(R.id.Abulmaca3);
        Abul4=(Button) findViewById(R.id.Abulmaca4);
        Tbul2=(Button) findViewById(R.id.Tbulmaca2);
        Tbul3=(Button) findViewById(R.id.Tbulmaca3);
        Tbul4=(Button) findViewById(R.id.Tbulmaca4);
        onayla=(Button) findViewById(R.id.onay);
        Atanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        texts[0]="TER";

    }
    //0-k,1-a,2-t,3-m-4-e,5-r

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
                        (Atanim=findViewById(R.id.M)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.E)).setText("A");
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
                        (Ktanim=findViewById(R.id.T)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.M)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.E)).setText("K");
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
                        (Ttanim=findViewById(R.id.M)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ttanim=findViewById(R.id.E)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ttanim=findViewById(R.id.R)).setText("T");
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
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.E)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.R)).setText("M");
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
                        (Etanim=findViewById(R.id.K)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim=findViewById(R.id.A)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim=findViewById(R.id.T)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.M)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.E)).setText("E");
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
                        (Rtanim=findViewById(R.id.K)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Rtanim=findViewById(R.id.A)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Rtanim=findViewById(R.id.T)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Rtanim=findViewById(R.id.M)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Rtanim=findViewById(R.id.E)).setText("R");
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
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca1");
                ActivityCompat.finishAffinity(seviye1bulmaca1.this);
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
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegisr(View view){
        Rtanim.setBackgroundColor(Color.GRAY);
        kelime+="R";
    }
    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("TER") && girisizniter == 1) {
                puan+=30;
                Tbul.setText("T");
                Tbul.setBackgroundColor(Color.GREEN);
                Ebul.setText("E");
            Ebul.setBackgroundColor(Color.GREEN);
                Rbul.setText("R");
            Rbul.setBackgroundColor(Color.GREEN);
                sayac++;
            girisizniter=0;
            }
        else if(kelime.equalsIgnoreCase("TEK") && girisiznitek == 1) {
            puan+=30;
            Tbul.setText("T");
            Tbul.setBackgroundColor(Color.GREEN);
            Ebul2.setText("E");
            Ebul2.setBackgroundColor(Color.GREEN);
            Kbul.setText("K");
            Kbul.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitek=0;
        }
        else if(kelime.equalsIgnoreCase("KAT") && girisiznikat == 1) {
            puan+=30;
            Tbul2.setText("T");
            Tbul2.setBackgroundColor(Color.GREEN);
            Abul.setText("A");
            Abul.setBackgroundColor(Color.GREEN);
            Kbul.setText("K");
            Kbul.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznikat=0;
        }
        else if(kelime.equalsIgnoreCase("TAM") && girisiznitam == 1) {
            puan+=40;
            Tbul2.setText("T");
            Tbul2.setBackgroundColor(Color.GREEN);
            Abul2.setText("A");
            Abul2.setBackgroundColor(Color.GREEN);
            Mbul.setText("M");
            Mbul.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitam = 0;
        }
        else if(kelime.equalsIgnoreCase("MAT") && girisiznimat == 1) {
            puan+=40;
            Tbul3.setText("T");
            Tbul3.setBackgroundColor(Color.GREEN);
            Abul3.setText("A");
            Abul3.setBackgroundColor(Color.GREEN);
            Mbul.setText("M");
            Mbul.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimat=0;
        }
        else if(kelime.equalsIgnoreCase("ART") && girisizniart == 1) {
            puan+=40;
            Rbul2.setText("R");
            Rbul2.setBackgroundColor(Color.GREEN);
            Abul4.setText("A");
            Abul4.setBackgroundColor(Color.GREEN);
            Tbul3.setText("T");
            Tbul3.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniart=0;
        }
        else if(kelime.equalsIgnoreCase("RET") && girisizniret == 1) {
            puan+=30;
            Rbul2.setText("R");
            Rbul2.setBackgroundColor(Color.GREEN);
            Ebul3.setText("E");
            Ebul3.setBackgroundColor(Color.GREEN);
            Tbul4.setText("T");
            Tbul4.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniret=0;
        }
       else if(kelime.equalsIgnoreCase("MET") && girisiznimet == 1) {
            puan+=40;
            Mbul2.setText("M");
            Mbul2.setBackgroundColor(Color.GREEN);
            Ebul4.setText("E");
            Ebul4.setBackgroundColor(Color.GREEN);
            Tbul4.setText("T");
            Tbul4.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimet=0;
        }
       else{
           puan-=2;
        }
        if(sayac==8){
            devamet.setVisibility(View.VISIBLE);
            long endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
            double seconds = (double) estimatedTime/1000; // saniyeye çevirmek için 1000'e bölüyoruz.
            puan-=seconds;
            String st=""+puan;
            yourpuan.setText(st);
            if (puan>database.bestpuan){
                database db=new database(getApplicationContext());
                db.puanguncelle("seviye1bulmaca1",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }

        }
        Atanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){

        Intent gecisYap = new Intent(seviye1bulmaca1.this, seviye1bulmaca2.class);
        gecisYap.putExtra("kadi",kadi);
        gecisYap.putExtra("sifre",sifresi);
        startActivity(gecisYap);
        finish();
    }

    public void atla(View view){
        Intent gecisYap = new Intent(seviye1bulmaca1.this, seviye3bulmaca6.class);
        startActivity(gecisYap);
    }
}
