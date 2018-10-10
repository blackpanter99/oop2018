/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author nchdz
 */
public class HoaQua {
    protected String ten;   
    protected float khoiluong; // kg
    protected String mausac; // mau sac
    protected String hinhdang; // hinh dang be ngoai ( hinh bau duc , tron ....)
    protected float giaban; // VND
    protected String ngaynhap; // ngay nhap
    protected String nguongoc ; //  nguon goc

      public HoaQua(String ten, float khoiluong, String mausac, String hinhdang, float giaban, String ngaynhap, String nguongoc) {
        this.ten = ten;
        this.khoiluong = khoiluong;
        this.mausac = mausac;
        this.hinhdang = hinhdang;
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
 
    public float getGiaban() {
        return giaban;
    }

    public String getHinhdang() {
        return hinhdang;
    }

    public float getKhoiluong() {
        return khoiluong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public String getMausac() {
        return mausac;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    public void setKhoiluong(float khoiluong) {
        this.khoiluong = khoiluong;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public HoaQua() {
    }

    @Override
    public String toString() {
        return this.ten +" "+this.hinhdang+" "+this.nguongoc +" "+this.mausac +" "+Float.toString(this.giaban) +" "+ (this.ngaynhap)+" "+Float.toString(this.khoiluong);
    }
    
    
}
