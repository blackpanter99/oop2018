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
public class CamThanhPhong extends Cam{
    private double kichco; //  theo ban kinh
    private String muivi; // theo thang tuoi
    private String mausactheotangtruong; // mausac theo do tang truong
    private int tgThuhoach; // thoi gian thu hoach
    public CamThanhPhong(float khoiluong, String mausac, String hinhdang, float giaban, String ngaynhap, String nguongoc, String ten) {
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
            this.mausactheotangtruong = "Mau Vang";
        }
        
        return this.mausactheotangtruong;
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
    public int getSoluong() {
        return super.getSoluong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTen() {
        return super.getTen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mausaclucchin() {
        return super.mausaclucchin(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mausaclucnon() {
        return super.mausaclucnon(); //To change body of generated methods, choose Tools | Templates.
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
    public void setNgaynhap(int ngaynhap) {
        super.setNgaynhap(ngaynhap); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNguongoc(String nguongoc) {
        super.setNguongoc(nguongoc); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSoluong(int soluong) {
        super.setSoluong(soluong); //To change body of generated methods, choose Tools | Templates.
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
        CamThanhPhong camthanhphong = new CamThanhPhong(50, "mau vang", "hinh cau", 30000, "30/10/2016", "Viet Nam", "Cam Thanh Phong");
        System.out.println(camthanhphong.toString());
    }
    
    
}
