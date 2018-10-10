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
public class Cam extends HoaQua{
    protected  int soluong;
    public Cam(float khoiluong,String mausac,String hinhdang,float giaban,String ngaynhap,String nguongoc,String ten)
    {
       this.mausac = mausac;
       this.khoiluong = khoiluong;
       this.hinhdang = hinhdang;
       this.ngaynhap = ngaynhap;
       this.nguongoc = nguongoc;
       this.giaban = giaban;
       this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
   
    
   
    public String mausaclucnon()
    {
        return "Mau Xanh";
    }
    public String mausaclucchin()
    {
        return "Mau Vang";
    }
    public static void main(String args[])
    {
        Cam cam = new Cam(10,"Vang","tron",50000,"28/11/2017","Trung Quoc","Cam");
        System.out.println(cam.toString());
        //cam.set
        
    }

    void setNgaynhap(int ngaynhap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
