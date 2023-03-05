package com.example.customlistview;

public class Monhoc {
    int idAnh;
    String tenMH;
    int soTC;

    public Monhoc(int idAnh, String tenMH, int soTC) {
        this.idAnh = idAnh;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
}
