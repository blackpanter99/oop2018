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
public class CamSanh extends Cam{
    private double kichco; //  theo ban kinh
    private String muivi; // theo thang tuoi
    private String mausactheotangtruong; // mausac theo do tang truong
    private int tgThuhoach; // thoi gian thu hoach
    public CamSanh(float khoiluong, String mausac, String hinhdang, float giaban, String ngaynhap, String nguongoc, String ten) {
        super(khoiluong, mausac, hinhdang, giaban, ngaynhap, nguongoc, ten);
    }
    public String mausacTangTruong(int thang)
    {
        if(thang >=1 && thang <= 3)
        {
            this.mausactheotangtruong = "Mau Xanh";
        }
        else if(thang > 3 && thang <= 5)
        {
            this.mausactheotangtruong = "Xanh Vang";
        }
        else
        {
            this.mausactheotangtruong = "Mau Vang Sam";
        }
        
        return this.mausactheotangtruong;
    }
    public void dacdiem()
    {
        System.out.println("Cây có tán cây hình dù, lá không eo, màu xanh đậm. Cây cao 3-3,5 m, đường kính 3-4 m.");
    }
    public String getMausac() {
        return mausac;
    }

    @Override
    public int getSoluong() {
        return soluong;
    }

    @Override
    public float getGiaban() {
        return giaban;
    }

    @Override
    public String getHinhdang() {
        return hinhdang;
    }

    @Override
    public float getKhoiluong() {
        return khoiluong;
    }

    @Override
    public String getNgaynhap() {
        return ngaynhap;
    }

    @Override
    public String getNguongoc() {
        return nguongoc;
    }

    @Override
    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    @Override
    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    @Override
    public void setKhoiluong(float khoiluong) {
        this.khoiluong = khoiluong;
    }

  

    @Override
    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public void setTen(String ten) {
        this.ten = ten;
    }
    public static void main(String args[])
    {
        
        CamSanh camsanh = new CamSanh(30,"Xanh Vang","Hinh Cau", 30000, "20/12/2010", "VietNam", "camSanh");
    }
    
}
