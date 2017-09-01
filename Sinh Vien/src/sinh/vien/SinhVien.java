/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinh.vien;

/**
 *
 * @author Blue Nowhere
 */
public class SinhVien {
    private String HoTen;
    private int MSSV;
    private BangDiem BangDiem;
    
    public void sethoTen(String hoten) {
        this.HoTen= hoten;
    }
    public String gethoTen(){
        return HoTen;
    }
    public void setMSSV(int MSSV){
        this.MSSV=MSSV;
    }
    public int getMSSV(){
        return MSSV;
    }
    public void setbangDiem(BangDiem BangDiem){
        this.BangDiem=BangDiem;
    }
    public BangDiem getbangDiem(){
        return BangDiem;
    }
}
