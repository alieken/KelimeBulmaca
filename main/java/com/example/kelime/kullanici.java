package com.example.kelime;

public class kullanici {
    String kullaniciadi;
    String sifre;
    String kaldigibolum;

    public kullanici(String kullaniciadi, String sifre, String kaldigibolum) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
        this.kaldigibolum = kaldigibolum;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKaldigibolum() {
        return kaldigibolum;
    }

    public void setKaldigibolum(String kaldigibolum) {
        this.kaldigibolum = kaldigibolum;
    }
}
