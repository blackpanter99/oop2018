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
public class Tao extends HoaQua{
    private String mausactheotangtruong; // mausac theo do tang truong
    private int tgThuhoach; // thoi gian thu hoach
    public Tao() {
    }
    public Tao(String ten, float khoiluong, String mausac, String hinhdang, float giaban, String ngaynhap, String nguongoc) {
        this.ten = ten;
        this.khoiluong = khoiluong;
        this.mausac = mausac;
        this.hinhdang = hinhdang;
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }
    public String chatluongcamquan()
    {
        return "Ngon, thom";
    }
    public String chatluongsinhhoa()
    {
        return "Đường tổng số (%):7,15 ± 0,24." +" "+"Vitamin C (mg/100g): 41,23 ± 4,51."+" "+"Chất khô (%): 10,34 ± 0,23.";
    }
    public String mausacTangTruong(int thang)
    {
        if(thang >=1 && thang <= 3)
        {
            this.mausactheotangtruong = "Mau Xanh";
        }
        else if(thang > 3 && thang <= 5)
        {
            this.mausactheotangtruong = "Xanh do";
        }
        else
        {
            this.mausactheotangtruong = "Mau do";
        }
        
        return this.mausactheotangtruong;
    }
    public String getMausactheotangtruong() {
        return mausactheotangtruong;
    }

    public int getTgThuhoach() {
        return tgThuhoach;
    }

    public void setTgThuhoach(int tgThuhoach) {
        this.tgThuhoach = tgThuhoach;
    }
    
    @Override
    public float getGiaban() {
        return super.getGiaban(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHinhdang() {
        return super.getHinhdang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getKhoiluong() {
        return super.getKhoiluong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMausac() {
        return super.getMausac(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNgaynhap() {
        return super.getNgaynhap(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNguongoc() {
        return super.getNguongoc(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTen() {
        return super.getTen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGiaban(float giaban) {
        super.setGiaban(giaban); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHinhdang(String hinhdang) {
        super.setHinhdang(hinhdang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKhoiluong(float khoiluong) {
        super.setKhoiluong(khoiluong); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMausac(String mausac) {
        super.setMausac(mausac); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNgaynhap(String ngaynhap) {
        super.setNgaynhap(ngaynhap); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNguongoc(String nguongoc) {
        super.setNguongoc(nguongoc); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTen(String ten) {
        super.setTen(ten); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    public static void main(String args[])
    {
        
        Tao tao = new Tao("Qua Tao", 50, "Do nhat","Hinh cau" , 50000,"23/6/2017", "Nhieu khu Vuc");
        System.out.println(tao.mausacTangTruong(3));
        System.out.println(tao.chatluongcamquan());
        System.out.println(tao.chatluongsinhhoa());
    }
}
