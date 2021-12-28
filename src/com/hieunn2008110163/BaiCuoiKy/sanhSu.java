package com.hieunn2008110163.BaiCuoiKy;
import java.util.Date;
public class sanhSu extends hangHoa {
    static int count;
public sanhSu(String Loai,String maHang,String tenHang,Float giaNhap,int soLuong,Date ngayNhap,String kiTuPhanBiet){
    super();
    count ++;
}
    public String getLoai(){
        return super.getLoai();
    }
    public void setLoai(String Loai){
        super.setLoai(Loai);
    }
    public String getMaHang(){
        return super.getMaHang();
     }
     public void setMaHang(String maHang) {
         super.setMaHang(maHang);
     }
     public String getTenHang(){
        return super.getTenHang();
     }
     public void setTenHang(String tenHang) {
         super.setTenHang(tenHang);
     }
     public float getGiaNhap(){
        return super.getGiaNhap();
     }
     public void setGiaNhap(Float giaNhap) {
         super.setGiaNhap(giaNhap);
     }
     public int getSoLuong(){
        return super.getSoLuong();
     }
     public void setSoLuong(int soLuong) {
         super.setSoLuong(soLuong);
    }
    public Date getNgayNhap(){
        return super.getNgayNhap();
     }
     public void setNgayNhap(Date ngayNhap) {
         super.setNgayNhap(ngayNhap);
    }
    public String getPhanBiet(){
        return super.getPhanBiet();
     }
     public void setPhanBiet(String kiTuPhanBiet) {
         super.setPhanBiet(kiTuPhanBiet);
    }
    
}
