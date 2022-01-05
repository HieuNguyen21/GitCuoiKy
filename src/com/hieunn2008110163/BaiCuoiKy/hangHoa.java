package com.hieunn2008110163.BaiCuoiKy;
import java.time.LocalDate;
public class hangHoa {
 private Loai Loai;
 private String maHang;
 private String tenHang;
 private double giaNhap;
 private LocalDate ngayNhap;
 private int  soLuong;

public Loai getLoai(){
    return Loai;
 }
 public void setLoai(Loai Loai) {
     this.Loai = Loai;
 }
public String getMaHang(){
    return maHang;
 }
 public void setMaHang(String maHang) {
     this.maHang = maHang;
 }
 public String getTenHang(){
    return tenHang;
 }
 public void setTenHang(String tenHang) {
     this.tenHang = tenHang;
 }
 public double getGiaNhap(){
    return giaNhap;
 }
 public void setGiaNhap(double giaNhap) {
     this.giaNhap = giaNhap;
 }
 public int getSoLuong(){
    return soLuong;
 }
 public void setSoLuong(int soLuong) {
     this.soLuong = soLuong;
}
public LocalDate getNgayNhap(){
    return ngayNhap;
 }
public void setNgayNhap(LocalDate ngayNhap) {
     this.ngayNhap = ngayNhap;
}
public hangHoa(Loai Loai,String maHang,String tenHang,double giaNhap,int soLuong,LocalDate ngayNhap){
this.Loai=Loai;    
this.maHang=maHang;
this.tenHang=tenHang;
this.giaNhap=giaNhap;
this.soLuong=soLuong;
this.ngayNhap=ngayNhap;
}
@Override
public String toString() {
    return "hangHoa [Loai=" + Loai + ", giaNhap=" + giaNhap + ", maHang=" + maHang + ", ngayNhap=" + ngayNhap
            + ", soLuong=" + soLuong + ", tenHang=" + tenHang + "]";
}

}

