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

public class seviye2bulmaca6 extends AppCompatActivity {
    String kelime="";
    Button Atanim2;
    Button Atanim3;
    Button Rtanim;
    Button Ptanim;
    Button Atanim;
    Button Ctanim;
    Button onayla;
    Button devamet;
    Button capaa;
    Button capac;
    Button capap;
    Button capaa2;
    Button pacaa;
    Button pacac;
    Button pacaa2;
    Button arpar;
    Button arpap;
    Button arpaa;
    Button araca;
    Button araca2;
    Button aracr;
    Button paraa;
    Button parap;
    Button parar;
    int sayac=0;
    int girisiznicapa=1;
    int girisiznipaca=1;
    int girisiznipara=1;
    int girisizniarpa=1;
    int girisizniarac=1;
    long startTime;
    double puan =0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca6);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca6");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim2=(Button) findViewById(R.id.A2);
        Atanim3=(Button) findViewById(R.id.A3);
        Atanim=(Button) findViewById(R.id.A);
        Rtanim=(Button) findViewById(R.id.R);
        Ptanim=(Button) findViewById(R.id.P);
        Ctanim=(Button) findViewById(R.id.C);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim3.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ctanim.setBackgroundColor(Color.CYAN);
        capac=(Button) findViewById(R.id.capac);
        capaa=(Button) findViewById(R.id.capaa);
        capap=(Button) findViewById(R.id.capap);
        capaa2=(Button) findViewById(R.id.capaa2);
        pacaa=(Button) findViewById(R.id.pacaa);
        pacac=(Button) findViewById(R.id.pacac);
        pacaa2=(Button) findViewById(R.id.pacaa2);
        arpar=(Button) findViewById(R.id.arpar);
        arpap=(Button) findViewById(R.id.arpap);
        arpaa=(Button) findViewById(R.id.arpaa);
        araca=(Button) findViewById(R.id.araca);
        araca2=(Button) findViewById(R.id.araca2);
        aracr=(Button) findViewById(R.id.aracr);
        paraa=(Button) findViewById(R.id.paraa);
        parar=(Button) findViewById(R.id.parar);
        parap=(Button) findViewById(R.id.parap);
    }

    //0-a,1-r,2-a2,3-p,4-ç,5-a3
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
                        (Atanim=findViewById(R.id.R)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.A2)).setText("A");
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
                        (Atanim=findViewById(R.id.C)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim=findViewById(R.id.A3)).setText("A");
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
                        (Rtanim=findViewById(R.id.R)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Rtanim=findViewById(R.id.A2)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Rtanim=findViewById(R.id.P)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Rtanim=findViewById(R.id.C)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Rtanim=findViewById(R.id.A3)).setText("R");
                        Rtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisr(view);
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
                        (Atanim2=findViewById(R.id.R)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.A2)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.P)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim2=findViewById(R.id.C)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim2=findViewById(R.id.A3)).setText("A");
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
                        (Ptanim=findViewById(R.id.A)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ptanim=findViewById(R.id.R)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ptanim=findViewById(R.id.A2)).setText("P");
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
                        (Ptanim=findViewById(R.id.C)).setText("P");
                        Ptanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisp(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ptanim=findViewById(R.id.A3)).setText("P");
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
                        (Ctanim=findViewById(R.id.A)).setText("Ç");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ctanim=findViewById(R.id.R)).setText("Ç");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ctanim=findViewById(R.id.A2)).setText("Ç");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ctanim=findViewById(R.id.P)).setText("Ç");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ctanim=findViewById(R.id.C)).setText("Ç");
                        Ctanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisc(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ctanim=findViewById(R.id.A3)).setText("Ç");
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
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Atanim3=findViewById(R.id.A)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Atanim3=findViewById(R.id.R)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim3=findViewById(R.id.A2)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim3=findViewById(R.id.P)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim3=findViewById(R.id.C)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Atanim3=findViewById(R.id.A3)).setText("A");
                        Atanim3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa3(view);
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca6");
                ActivityCompat.finishAffinity(seviye2bulmaca6.this);
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
    public void renkdegisa2(View view){
        Atanim2.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisr(View view){
        Rtanim.setBackgroundColor(Color.GRAY);
        kelime+="R";
    }
    public void renkdegisa3(View view){
        Atanim3.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisp(View view){
        Ptanim.setBackgroundColor(Color.GRAY);
        kelime+="P";
    }

    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegisc(View view){
        Ctanim.setBackgroundColor(Color.GRAY);
        kelime+="Ç";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("ÇAPA") && girisiznicapa == 1) {
            puan+=110;
            capac.setText("Ç");
            capac.setBackgroundColor(Color.GREEN);
            capaa.setText("A");
            capaa.setBackgroundColor(Color.GREEN);
            capaa2.setText("A");
            capaa2.setBackgroundColor(Color.GREEN);
            capap.setText("P");
            capap.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznicapa=0;
        }
        else if(kelime.equalsIgnoreCase("PAÇA") && girisiznipaca == 1) {
            puan+=110;
            pacac.setText("Ç");
            pacac.setBackgroundColor(Color.GREEN);
            pacaa.setText("A");
            pacaa.setBackgroundColor(Color.GREEN);
            pacaa2.setText("A");
            pacaa2.setBackgroundColor(Color.GREEN);
            capap.setText("P");
            capap.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipaca=0;
        }
        else if(kelime.equalsIgnoreCase("ARPA") && girisizniarpa == 1) {
            puan+=80;
            arpar.setText("R");
            arpar.setBackgroundColor(Color.GREEN);
            arpaa.setText("A");
            arpaa.setBackgroundColor(Color.GREEN);
            pacaa2.setText("A");
            pacaa2.setBackgroundColor(Color.GREEN);
            arpap.setText("P");
            arpap.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniarpa=0;
        }
        else if(kelime.equalsIgnoreCase("ARAÇ") && girisizniarac == 1) {
            puan+=70;
            pacac.setText("Ç");
            pacac.setBackgroundColor(Color.GREEN);
            araca.setText("A");
            araca.setBackgroundColor(Color.GREEN);
            araca2.setText("A");
            araca2.setBackgroundColor(Color.GREEN);
            aracr.setText("R");
            aracr.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniarac=0;
        }
        else if(kelime.equalsIgnoreCase("PARA") && girisiznipara == 1) {
            puan+=80;
            parap.setText("P");
            parap.setBackgroundColor(Color.GREEN);
            paraa.setText("A");
            paraa.setBackgroundColor(Color.GREEN);
            arpaa.setText("A");
            arpaa.setBackgroundColor(Color.GREEN);
            parar.setText("R");
            parar.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznipara=0;
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
                db.puanguncelle("seviye2bulmaca6",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Atanim3.setBackgroundColor(Color.CYAN);
        Rtanim.setBackgroundColor(Color.CYAN);
        Ptanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ctanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca6.this, seviye3bulmaca1.class);
        startActivity(gecisYap);
        finish();
    }
}
