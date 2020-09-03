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

public class seviye1bulmaca2 extends AppCompatActivity {
    String kadi;
    String sifresi;
    String kelime="";
    Button Mtanim;
    Button İtanim;
    Button Ltanim;
    Button Ktanim;
    Button Etanim;
    Button Etanim2;
    Button onayla;
    Button kemk;
    Button keme;
    Button kemm;
    Button ekee;
    Button ekek;
    Button elkl;
    Button elkk;
    Button kimi;
    Button kimm;
    Button mili;
    Button mill;
    Button ilel;
    Button ilee;
    Button kelk;
    Button kell;
    Button devamet;
    int girisiznikem=1;
    int girisiznieke=1;
    int girisiznielk=1;
    int girisiznikim=1;
    int girisiznimil=1;
    int girisizniile=1;
    int girisiznikel=1;
    int sayac=0;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye1bulmaca2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            kadi = bundle.getString("kadi");
            sifresi = bundle.getString("sifre");
        }

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye1bulmaca2");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        startTime = System.currentTimeMillis();
        İtanim=(Button) findViewById(R.id.İ);
        Mtanim=(Button) findViewById(R.id.M);
        Ltanim=(Button) findViewById(R.id.L);
        Ktanim=(Button) findViewById(R.id.K);
        Etanim=(Button) findViewById(R.id.E);
        Etanim2=(Button) findViewById(R.id.E2);
        onayla=(Button) findViewById(R.id.onay);
        İtanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Etanim2.setBackgroundColor(Color.CYAN);
        kemk=(Button) findViewById(R.id.kemk);
        keme=(Button) findViewById(R.id.keme);
        kemm=(Button) findViewById(R.id.kemm);
        ekee=(Button) findViewById(R.id.ekee);
        ekek=(Button) findViewById(R.id.ekek);
        elkl=(Button) findViewById(R.id.elkl);
        elkk=(Button) findViewById(R.id.elkk);
        kimi=(Button) findViewById(R.id.kimi);
        kimm=(Button) findViewById(R.id.kimm);
        mili=(Button) findViewById(R.id.mili);
        mill=(Button) findViewById(R.id.mill);
        ilel=(Button) findViewById(R.id.ilel);
        ilee=(Button) findViewById(R.id.ilee);
        kelk=(Button) findViewById(R.id.kelk);
        kell=(Button) findViewById(R.id.kell);
        devamet=(Button) findViewById(R.id.devambutonu);
    }//0-K,1-e,2-l,3-i,4-m,5-e2
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
                        (Ktanim=findViewById(R.id.E)).setText("K");
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
                        (Ktanim=findViewById(R.id.İ)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ktanim=findViewById(R.id.M)).setText("K");
                        Ktanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisk(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ktanim=findViewById(R.id.E2)).setText("K");
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
                        (Etanim=findViewById(R.id.L)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim=findViewById(R.id.İ)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim=findViewById(R.id.M)).setText("E");
                        Etanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim=findViewById(R.id.E2)).setText("E");
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
                        (Ltanim=findViewById(R.id.K)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ltanim=findViewById(R.id.E)).setText("L");
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
                        (Ltanim=findViewById(R.id.İ)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ltanim=findViewById(R.id.M)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ltanim=findViewById(R.id.E2)).setText("L");
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
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (İtanim=findViewById(R.id.K)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (İtanim=findViewById(R.id.E)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (İtanim=findViewById(R.id.L)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (İtanim=findViewById(R.id.İ)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (İtanim=findViewById(R.id.M)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisi(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (İtanim=findViewById(R.id.E2)).setText("İ");
                        İtanim.setOnClickListener(new View.OnClickListener() {
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
                        (Mtanim=findViewById(R.id.E)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.L)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.İ)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.M)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Mtanim=findViewById(R.id.E2)).setText("M");
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
                        (Etanim2=findViewById(R.id.K)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Etanim2=findViewById(R.id.E)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Etanim2=findViewById(R.id.L)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Etanim2=findViewById(R.id.İ)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Etanim2=findViewById(R.id.M)).setText("E");
                        Etanim2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegise2(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Etanim2=findViewById(R.id.E2)).setText("E");
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
                db.guncelle(database.kadi,database.sifresi,"seviye1bulmaca2");
                ActivityCompat.finishAffinity(seviye1bulmaca2.this);
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
    public void renkdegisi(View view){
        İtanim.setBackgroundColor(Color.GRAY);
        kelime+="İ";
    }
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void renkdegisl(View view){
        Ltanim.setBackgroundColor(Color.GRAY);
        kelime+="L";
    }
    public void renkdegisk(View view){
        Ktanim.setBackgroundColor(Color.GRAY);
        kelime+="K";
    }
    public void renkdegise(View view){
        Etanim.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void renkdegise2(View view){
        Etanim2.setBackgroundColor(Color.GRAY);
        kelime+="E";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("KEM") &&  girisiznikem==1) {
            puan+=40;
            kemk.setText("K");
            kemk.setBackgroundColor(Color.GREEN);
            keme.setText("E");
            keme.setBackgroundColor(Color.GREEN);
            kemm.setText("M");
            kemm.setBackgroundColor(Color.GREEN);
            girisiznikem=0;
            sayac++;
        }
        else if(kelime.equalsIgnoreCase("EKE") &&  girisiznieke==1) {
            puan+=30;
           ekee.setText("E");
            ekee.setBackgroundColor(Color.GREEN);
           keme.setText("E");
            keme.setBackgroundColor(Color.GREEN);
           ekek.setText("K");
            ekek.setBackgroundColor(Color.GREEN);
            girisiznieke=0;
            sayac++;
        }
        else if(kelime.equalsIgnoreCase("ELK") &&  girisiznielk==1) {
            puan+=30;
            elkl.setText("L");
            elkl.setBackgroundColor(Color.GREEN);
            ekee.setText("E");
            ekee.setBackgroundColor(Color.GREEN);
            elkk.setText("K");
            elkk.setBackgroundColor(Color.GREEN);
            girisiznielk=0;
            sayac++;
        }
        else if(kelime.equalsIgnoreCase("KİM") &&  girisiznikim==1) {
            puan+=40;
            kimm.setText("M");
            kimm.setBackgroundColor(Color.GREEN);
            elkk.setText("K");
            elkk.setBackgroundColor(Color.GREEN);
            kimi.setText("İ");
            kimi.setBackgroundColor(Color.GREEN);
            girisiznikim=0;
            sayac++;
        }
        else if(kelime.equalsIgnoreCase("MİL") &&  girisiznimil==1) {
            puan+=40;
            mill.setText("L");
            mill.setBackgroundColor(Color.GREEN);
            kimm.setText("M");
            kimm.setBackgroundColor(Color.GREEN);
            mili.setText("İ");
            mili.setBackgroundColor(Color.GREEN);
            girisiznimil=0;
            sayac++;
        }
        else if(kelime.equalsIgnoreCase("KEL") &&  girisiznikel==1) {
            puan+=30;
            kelk.setText("K");
            kelk.setBackgroundColor(Color.GREEN);
            kell.setText("L");
            kell.setBackgroundColor(Color.GREEN);
            ilee.setText("E");
            ilee.setBackgroundColor(Color.GREEN);
            girisiznikel=0;
            sayac++;
        }
       else if(kelime.equalsIgnoreCase("İLE") &&  girisizniile==1) {
            puan+=30;
            ilel.setText("L");
            ilel.setBackgroundColor(Color.GREEN);
            ilee.setText("E");
            ilee.setBackgroundColor(Color.GREEN);
            mili.setText("İ");
            mili.setBackgroundColor(Color.GREEN);
            girisizniile=0;
            sayac++;
        }
        else{

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
                db.puanguncelle("seviye1bulmaca2",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }

        }
        İtanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Ktanim.setBackgroundColor(Color.CYAN);
        Etanim.setBackgroundColor(Color.CYAN);
        Etanim2.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye1bulmaca2.this, seviye1bulmaca3.class);
        startActivity(gecisYap);
        finish();
    }
}
