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

public class seviye2bulmaca4 extends AppCompatActivity {
    String kelime="";
    Button Btanim;
    Button Otanim;
    Button Ytanim;
    Button Ltanim;
    Button Atanim;
    Button Mtanim;
    Button onayla;
    Button devamet;
    int sayac=0;
    Button boyab;
    Button boyao;
    Button boyay;
    Button boyaa;
    Button olayl;
    Button olaya;
    Button olayy;
    Button mayom;
    Button mayoa;
    Button mayoo;
    Button molao;
    Button molal;
    Button molaa;
    Button balob;
    Button balol;
    Button baloo;
    int girisizniboya = 1;
    int girisizniolay = 1;
    int girisiznimayo = 1;
    int girisiznibalo = 1;
    int girisiznimola = 1;
    long startTime;
    double puan=0;
    TextView bestkadi;
    TextView bestpuan;
    TextView yourpuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seviye2bulmaca4);
        startTime = System.currentTimeMillis();

        bestkadi=(TextView) findViewById(R.id.bestkadi);
        bestpuan=(TextView) findViewById(R.id.bestpuan);
        yourpuan=(TextView) findViewById(R.id.yourpuan);
        database db= new database(getApplicationContext());
        db.bestsorgu("seviye2bulmaca4");
        bestkadi.setText(database.bestkadi);
        bestpuan.setText(database.bestpuan.toString());

        Btanim=(Button) findViewById(R.id.B);
        Otanim=(Button) findViewById(R.id.O);
        Atanim=(Button) findViewById(R.id.A);
        Ytanim=(Button) findViewById(R.id.Y);
        Ltanim=(Button) findViewById(R.id.L);
        Mtanim=(Button) findViewById(R.id.M);
        onayla=(Button) findViewById(R.id.onay);
        devamet=(Button) findViewById(R.id.devambutonu);
        Atanim.setBackgroundColor(Color.CYAN);
        Btanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ytanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        boyao=(Button) findViewById(R.id.boyao);
        boyay=(Button) findViewById(R.id.boyay);
        boyab=(Button) findViewById(R.id.boyab);
        boyaa=(Button) findViewById(R.id.boyaa);
        olayl=(Button) findViewById(R.id.olayl);
        olaya=(Button) findViewById(R.id.olaya);
        olayy=(Button) findViewById(R.id.olayy);
        mayom=(Button) findViewById(R.id.mayom);
        mayoa=(Button) findViewById(R.id.mayoa);
        mayoo=(Button) findViewById(R.id.mayoo);
        molao=(Button) findViewById(R.id.molao);
        molal=(Button) findViewById(R.id.molal);
        molaa=(Button) findViewById(R.id.molaa);
        balob=(Button) findViewById(R.id.balob);
        balol=(Button) findViewById(R.id.balol);
        baloo=(Button) findViewById(R.id.baloo);
    }

    //0-b,1-o,2-y,3-l,4-a,5-m
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
                        (Btanim=findViewById(R.id.B)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Btanim=findViewById(R.id.O)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Btanim=findViewById(R.id.Y)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Btanim=findViewById(R.id.L)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Btanim=findViewById(R.id.A)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Btanim=findViewById(R.id.M)).setText("B");
                        Btanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisb(view);
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
                        (Otanim=findViewById(R.id.B)).setText("O");
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
                        (Otanim=findViewById(R.id.Y)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Otanim=findViewById(R.id.L)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Otanim=findViewById(R.id.A)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Otanim=findViewById(R.id.M)).setText("O");
                        Otanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegiso(view);
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
                        (Ytanim=findViewById(R.id.B)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Ytanim=findViewById(R.id.O)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Ytanim=findViewById(R.id.Y)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ytanim=findViewById(R.id.L)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ytanim=findViewById(R.id.A)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ytanim=findViewById(R.id.M)).setText("Y");
                        Ytanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisy(view);
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
                        (Ltanim=findViewById(R.id.B)).setText("L");
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
                        (Ltanim=findViewById(R.id.Y)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Ltanim=findViewById(R.id.L)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Ltanim=findViewById(R.id.A)).setText("L");
                        Ltanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisl(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
                        (Ltanim=findViewById(R.id.M)).setText("L");
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
                        (Atanim=findViewById(R.id.B)).setText("A");
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
                        (Atanim=findViewById(R.id.Y)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Atanim=findViewById(R.id.L)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Atanim=findViewById(R.id.A)).setText("A");
                        Atanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegisa(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
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
            int a=r.nextInt(6);
            for (int j = 0; j < ar.size() ; j++) {
                if(ar.get(j)==a){
                    gecis=0;
                    ar.set(j,10);
                    if(a==0){
                        (Mtanim=findViewById(R.id.B)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==1){
                        (Mtanim=findViewById(R.id.O)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==2){
                        (Mtanim=findViewById(R.id.Y)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==3){
                        (Mtanim=findViewById(R.id.L)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==4){
                        (Mtanim=findViewById(R.id.A)).setText("M");
                        Mtanim.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                renkdegism(view);
                            }
                        });
                        break;
                    }
                    else if(a==5){
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
                db.guncelle(database.kadi,database.sifresi,"seviye2bulmaca4");
                ActivityCompat.finishAffinity(seviye2bulmaca4.this);
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
    public void renkdegisb(View view){
        Btanim.setBackgroundColor(Color.GRAY);
        kelime+="B";
    }
    public void renkdegiso(View view){
        Otanim.setBackgroundColor(Color.GRAY);
        kelime+="O";
    }
    public void renkdegisy(View view){
        Ytanim.setBackgroundColor(Color.GRAY);
        kelime+="Y";
    }
    public void renkdegisl(View view){
        Ltanim.setBackgroundColor(Color.GRAY);
        kelime+="L";
    }

    public void renkdegisa(View view){
        Atanim.setBackgroundColor(Color.GRAY);
        kelime+="A";
    }
    public void renkdegism(View view){
        Mtanim.setBackgroundColor(Color.GRAY);
        kelime+="M";
    }
    public void onaylandi(View view){
        if(kelime.equalsIgnoreCase("BOYA") && girisizniboya == 1) {
            puan+=90;
            boyab.setText("B");
            boyab.setBackgroundColor(Color.GREEN);
            boyao.setText("O");
            boyao.setBackgroundColor(Color.GREEN);
            boyay.setText("Y");
            boyay.setBackgroundColor(Color.GREEN);
            boyaa.setText("A");
            boyaa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniboya=0;
        }
        else if(kelime.equalsIgnoreCase("OLAY") && girisizniolay == 1) {
            puan+=70;
            olayl.setText("L");
            olayl.setBackgroundColor(Color.GREEN);
            boyao.setText("O");
            boyao.setBackgroundColor(Color.GREEN);
            olayy.setText("Y");
            olayy.setBackgroundColor(Color.GREEN);
            olaya.setText("A");
            olaya.setBackgroundColor(Color.GREEN);
            sayac++;
            girisizniolay=0;
        }
        else if(kelime.equalsIgnoreCase("MAYO") && girisiznimayo == 1) {
            puan+=80;
            mayom.setText("M");
            mayom.setBackgroundColor(Color.GREEN);
            mayoo.setText("O");
            mayoo.setBackgroundColor(Color.GREEN);
            olayy.setText("Y");
            olayy.setBackgroundColor(Color.GREEN);
            mayoa.setText("A");
            mayoa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimayo=0;
        }
       else if(kelime.equalsIgnoreCase("MOLA") && girisiznimola == 1) {
            puan+=60;
            mayom.setText("M");
            mayom.setBackgroundColor(Color.GREEN);
            molao.setText("O");
            molao.setBackgroundColor(Color.GREEN);
            molal.setText("L");
            molal.setBackgroundColor(Color.GREEN);
            molaa.setText("A");
            molaa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznimola=0;
        }
        else if(kelime.equalsIgnoreCase("BALO") && girisiznibalo== 1) {
            puan+=70;
            balob.setText("B");
            balob.setBackgroundColor(Color.GREEN);
            baloo.setText("O");
            baloo.setBackgroundColor(Color.GREEN);
            balol.setText("L");
            balol.setBackgroundColor(Color.GREEN);
            molaa.setText("A");
            molaa.setBackgroundColor(Color.GREEN);
            sayac++;
            girisiznibalo=0;
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
                db.puanguncelle("seviye2bulmaca4",puan,database.kadi);
                bestkadi.setText(database.kadi);
                bestpuan.setText(st);
                Toast.makeText(this, "BEST SCORE !!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Best scoru gecemediniz!!", Toast.LENGTH_SHORT).show();
            }
        }
        Atanim.setBackgroundColor(Color.CYAN);
        Btanim.setBackgroundColor(Color.CYAN);
        Ytanim.setBackgroundColor(Color.CYAN);
        Mtanim.setBackgroundColor(Color.CYAN);
        Otanim.setBackgroundColor(Color.CYAN);
        Ltanim.setBackgroundColor(Color.CYAN);
        kelime="";
    }
    public void devamke(View view){
        Intent gecisYap = new Intent(seviye2bulmaca4.this, seviye2bulmaca5.class);
        startActivity(gecisYap);
        finish();
    }
}
