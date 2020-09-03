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

public class seviye2bulmaca5 extends AppCompatActivity {
    String kelime="";
    Button Atanim2;
    Button Vtanim;
    Button Utanim;
    Button Ktanim;
    Button Atanim;
    Button Ttanim;
    Button onayla;
    Button devamet;
    Button vaatv;
    Button vaata;
    Button vaata2;
    Button vaatt;
    Button vakaa;
    Button vakak;
    Button vakaa2;
    Button tavaa;
    Button tavav;
    Button tavaa2;
    Button akvak;
    Button akvav;
    Button akutu;
    Button akutk;
    Button akutt;
    Button ataka;
    Button ataka2;
    Button atakk;
    int sayac=0;
    int girisiznivaat=1;
    int girisiznivaka=1;
    int girisiznitava=1;
    int girisizniakva=1;
    int girisizniakut=1;
    int girisizniatak=1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca5);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca4");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Atanim2=(Button) findViewById(R.id.A2);
        Vtanim=(Button) findViewById(R.id.V);
        Atanim=(Button) findViewById(R.id.A);
        Utanim=(Button) findViewById(R.id.U);
        Ktanim=(Button) findViewById(R.id.K);
        Ttanim=(Button) findViewById(R.id.T);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Vtanim.setBackgroundColor(Color.CYAN);
        Utanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        vaatv=(Button) findViewById(R.id.vaatv);
        vaata=(Button) findViewById(R.id.vaata);
        vaata2=(Button) findViewById(R.id.vaata2);
        vaatt=(Button) findViewById(R.id.vaatt);
        vakaa=(Button) findViewById(R.id.vakaa);
        vakak=(Button) findViewById(R.id.vakak);
        vakaa2=(Button) findViewById(R.id.vakaa2);
        tavaa=(Button) findViewById(R.id.tavaa);
        tavav=(Button) findViewById(R.id.tavav);
        tavaa2=(Button) findViewById(R.id.tavaa2);
        akvav=(Button) findViewById(R.id.akvav);
        akvak=(Button) findViewById(R.id.akvak);
        akutu=(Button) findViewById(R.id.akutu);
        akutt=(Button) findViewById(R.id.akutt);
        akutk=(Button) findViewById(R.id.akutk);
        ataka=(Button) findViewById(R.id.ataka);
        ataka2=(Button) findViewById(R.id.ataka2);
        atakk=(Button) findViewById(R.id.atakk);
    }

    //0-a,1-v,2-u,3-k,4-a2,5-t
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
                        (Atanim=findViewById(R.id.V)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim=findViewById(R.id.U)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.K)).setText("A");
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
                        (Atanim=findViewById(R.id.T)).setText("A");
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
                        (Vtanim=findViewById(R.id.A)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Vtanim=findViewById(R.id.V)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Vtanim=findViewById(R.id.U)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Vtanim=findViewById(R.id.K)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Vtanim=findViewById(R.id.A2)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Vtanim=findViewById(R.id.T)).setText("V");
                        Vtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisv(view);
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
                        (Utanim=findViewById(R.id.A)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Utanim=findViewById(R.id.V)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Utanim=findViewById(R.id.U)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Utanim=findViewById(R.id.K)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Utanim=findViewById(R.id.A2)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Utanim=findViewById(R.id.T)).setText("U");
                        Utanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisu(view);
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
                        (Ktanim=findViewById(R.id.V)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ktanim=findViewById(R.id.U)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ktanim=findViewById(R.id.K)).setText("K");
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
                        (Ktanim=findViewById(R.id.T)).setText("K");
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
                        (Atanim2=findViewById(R.id.V)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Atanim2=findViewById(R.id.U)).setText("A");
                        Atanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim2=findViewById(R.id.K)).setText("A");
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
                        (Atanim2=findViewById(R.id.T)).setText("A");
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
                        (Ttanim=findViewById(R.id.A)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ttanim=findViewById(R.id.V)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ttanim=findViewById(R.id.U)).setText("T");
                        Ttanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegist(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ttanim=findViewById(R.id.K)).setText("T");
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca5");
                ActivityCompat.finishAffinity(seviye2bulmaca5.this);
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
    public void renkdegisv(View view){
        Vtanim.setBackgroundColor(Color.GRAY);
        kelime+="V";
    }
    public void renkdegisu(View view){
        Utanim.setBackgroundColor(Color.GRAY);
        kelime+="U";
    }
    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }

    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegist(View view){
        Ttanim.setBackgroundColor(Color.GRAY);
        kelime+="T";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("VAAT") && girisiznivaat == 1) {
            puan+=100;
            vaatv.setText("V");
            vaatv.setBackgroundColor(Color.GREEN);
            vaata.setText("A");
            vaata.setBackgroundColor(Color.GREEN);
            vaata2.setText("A");
            vaata2.setBackgroundColor(Color.GREEN);
            vaatt.setText("T");
            vaatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznivaat=0;
        }
       else if(kelime.equalsIgnoreCase("VAKA") && girisiznivaka == 1) {
            puan+=100;
            vaatv.setText("V");
            vaatv.setBackgroundColor(Color.GREEN);
            vakaa.setText("A");
            vakaa.setBackgroundColor(Color.GREEN);
            vakaa2.setText("A");
            vakaa2.setBackgroundColor(Color.GREEN);
            vakak.setText("K");
            vakak.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznivaka=0;
        }
       else if(kelime.equalsIgnoreCase("TAVA") && girisiznitava == 1) {
            puan+=100;
            tavav.setText("V");
            tavav.setBackgroundColor(Color.GREEN);
            tavaa2.setText("A");
            tavaa2.setBackgroundColor(Color.GREEN);
            tavaa.setText("A");
            tavaa.setBackgroundColor(Color.GREEN);
            vaatt.setText("T");
            vaatt.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznitava=0;
        }
       else if(kelime.equalsIgnoreCase("AKVA") && girisizniakva == 1) {
            puan+=100;
            akvav.setText("V");
            akvav.setBackgroundColor(Color.GREEN);
            vakaa2.setText("A");
            vakaa2.setBackgroundColor(Color.GREEN);
            tavaa2.setText("A");
            tavaa2.setBackgroundColor(Color.GREEN);
            akvak.setText("K");
            akvak.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniakva=0;
        }
        else if(kelime.equalsIgnoreCase("AKUT") && girisizniakut == 1) {
            puan+=50;
            akutt.setText("T");
            akutt.setBackgroundColor(Color.GREEN);
            akutu.setText("U");
            akutu.setBackgroundColor(Color.GREEN);
            tavaa.setText("A");
            tavaa.setBackgroundColor(Color.GREEN);
            akutk.setText("K");
            akutk.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniakut=0;
        }
        else if(kelime.equalsIgnoreCase("ATAK") && girisizniatak == 1) {
            puan+=40;
            akutt.setText("T");
            akutt.setBackgroundColor(Color.GREEN);
            ataka2.setText("A");
            ataka2.setBackgroundColor(Color.GREEN);
            ataka.setText("A");
            ataka.setBackgroundColor(Color.GREEN);
            atakk.setText("K");
            atakk.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniatak=0;
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
                db.puanguncelle("seviye2bulmaca5",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Vtanim.setBackgroundColor(Color.CYAN);
        Utanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Atanim2.setBackgroundColor(Color.CYAN);
        Ttanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca5.this, seviye2bulmaca6.class);
        startActivity(gecisYap);
        finish();
    }
}
