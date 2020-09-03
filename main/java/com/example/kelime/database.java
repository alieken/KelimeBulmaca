package com.example.kelime;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class database extends SQLiteOpenHelper {
    public static String KaldigiBolum;
    public static String kadi;
    public static String bestkadi;
    public static Double bestpuan;
    public static String sifresi;
    public static int sayacbulmaca=0;
    public static int veritabanisayaci=0;
    private static final String vtname="bulmacalar10";
    private static final String kullanici_tablosu="kullanici_tablo";
    private static final String puan_tablosu="puan_tablo3";
    private static final String kontroltablosu="kontroltbl";
    private static final int versiyon=1;
   // private static final String olustur="CREATE TABLE " +kullanicitablosu+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, kullaniciAdi TEXT, sifre TEXT,kaldigibolum TEXT)";

    public database(@Nullable Context context) {
        super(context, vtname, null, versiyon);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREATE TABLE tbl_kullanici(id INTEGER PRIMARY KEY AUTOINCREMENT, puan INTEGER, bolum INTEGER);
        String sql_tablosu_olusturma="CREATE TABLE "+kullanici_tablosu+"(id INTEGER PRIMARY KEY AUTOINCREMENT, kullaniciadi TEXT, sifre TEXT, kaldigiBolum TEXT)";
        db.execSQL(sql_tablosu_olusturma);
        String sql_tablosu_olusturma2="CREATE TABLE "+puan_tablosu+"(id INTEGER PRIMARY KEY AUTOINCREMENT, bulmaca TEXT, puan DOUBLE,kullaniciadi TEXT)";
        db.execSQL(sql_tablosu_olusturma2);
        String sql_tablosu_olusturma3="CREATE TABLE "+kontroltablosu+"(id INTEGER PRIMARY KEY AUTOINCREMENT, saydir INTEGER)";
        db.execSQL(sql_tablosu_olusturma3);
        }

    public long ekle(){
        long id=0;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 7; j++) {
                sayacbulmaca++;
                String ol="seviye"+i+"bulmaca"+j;
                SQLiteDatabase db=this.getWritableDatabase();
                ContentValues cv=new ContentValues();
                cv.put("bulmaca",ol);
                cv.put("puan",0);
                cv.put("kullaniciadi","");
                db.insert(puan_tablosu,null,cv);
            }
        }
        return id;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+kullanici_tablosu);
    }
    public void bestsorgu(String seviye){
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT  * FROM " + puan_tablosu+" WHERE bulmaca="+"'"+seviye+"'";
        System.out.println("4444444444444444444444444444");
        System.out.println(selectQuery);
        System.out.println("4444444444444444444444444444");
        Cursor c = db.rawQuery(selectQuery, null);
        if (c.moveToFirst()) {
            do {
                bestpuan=c.getDouble(2);
                bestkadi=c.getString(3);
            } while (c.moveToNext());
        }
    }
    public void puanguncelle(String seviye,Double puan,String kadir){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("bulmaca",seviye);
        cv.put("puan",puan);
        cv.put("kullaniciadi",kadir);
        db.update(puan_tablosu,cv,"bulmaca='"+seviye+"'",null);
    }
    public void seviyebulmacalarikontrol(){
        SQLiteDatabase db=this.getWritableDatabase();
        String selectQuery = "SELECT  * FROM " + kontroltablosu;
        Cursor c = db.rawQuery(selectQuery, null);
        int sayac=0;
        if (c.moveToFirst()) {
            do {
                sayac++;
            } while (c.moveToNext());
        }
        if(sayac==0){
            ContentValues cv=new ContentValues();
            cv.put("saydir",1);
            //  cv.put("bolum",123);
            db.insert(kontroltablosu,null,cv);
            ekle();
        }
    }
    public long ekleKullanici(String adii,String sifresii,String kaldigii) {
        ////////////
        seviyebulmacalarikontrol();

        ///////////
        long id=0;
        SQLiteDatabase db=this.getWritableDatabase();
        String selectQuery = "SELECT  * FROM " + kullanici_tablosu+" WHERE kullaniciadi="+"'"+adii+"'" +"AND sifre="+"'"+sifresii+"'";
        Cursor c = db.rawQuery(selectQuery, null);
        int sayac=0;
        if (c.moveToFirst()) {
            do {
                sayac++;
            } while (c.moveToNext());
        }

        if(sayac==0){
            ContentValues cv=new ContentValues();
            database.kadi=adii;
            cv.put("kullaniciadi",adii);
            cv.put("sifre",sifresii);
            cv.put("kaldigiBolum",kaldigii);
            //  cv.put("bolum",123);
            id=db.insert(kullanici_tablosu,null,cv);
        }else{
            id=-10;
        }

        return id;
    }
    public int kontrol(String ad,String sifre){
        String selectQuery = "SELECT  * FROM " + kullanici_tablosu+" WHERE kullaniciadi="+"'"+ad+"'" +"AND sifre="+"'"+sifre+"'";
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(selectQuery);
        System.out.println("-----------------------------------------------------------------------------------------");

       // Log.e(String.valueOf(LOG), selectQuery);
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
        int sayac=0;
        if (c.moveToFirst()) {
            do {
                sayac++;
                kadi=ad;
                sifresi=sifre;
                KaldigiBolum=c.getString(3);
                System.out.println("*****************************************");
                System.out.println(KaldigiBolum);
                System.out.println("*****************************************");
            } while (c.moveToNext());
        }
        return sayac;
    }

  /*  public void guncelle(int id,int genel_puan, int kalinan_yer) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("puan", genel_puan);
        values.put("bolum", kalinan_yer);
        // updating row
        db.update(kullanici_tablosu, values,  "id="+id,null);
    }*/

    public void guncelle(String kadi, String sifresi,String kalinan) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("kullaniciadi",kadi);
        cv.put("sifre",sifresi);
        cv.put("kaldigiBolum",kalinan);
        db.update(kullanici_tablosu,cv,"kullaniciadi='"+kadi+"'",null);
    }
}
