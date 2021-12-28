package com.hieunn2008110163.BaiCuoiKy;
import java.util.Date;
public class hangHoa {
 private String Loai;
 private String maHang;
 private String tenHang;
 private Float giaNhap;
 private Date ngayNhap;
 private int  soLuong;
 private String kiTuPB;


public String getLoai(){
    return Loai;
 }
 public void setLoai(String Loai) {
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
 public float getGiaNhap(){
    return giaNhap;
 }
 public void setGiaNhap(Float giaNhap) {
     this.giaNhap = giaNhap;
 }
 public int getSoLuong(){
    return soLuong;
 }
 public void setSoLuong(int soLuong) {
     this.soLuong = soLuong;
}
public Date getNgayNhap(){
    return ngayNhap;
 }
public void setNgayNhap(Date ngayNhap) {
     this.ngayNhap = ngayNhap;
}
public String getPhanBiet(){
    return kiTuPB;
 }
 public void setPhanBiet(String kiTuPhanBiet) {
     this.kiTuPB = kiTuPB;
}
public void hangHoa(String Loai,String maHang,String tenHang,Float giaNhap,int soLuong,Date ngayNhap,String kiTuPhanBiet){
this.Loai=Loai;    
this.maHang=maHang;
this.tenHang=tenHang;
this.giaNhap=giaNhap;
this.soLuong=soLuong;
this.ngayNhap=ngayNhap;
this.kiTuPB=kiTuPB;
}
public String toString(){
    return Loai+"::"+ maHang +"::"+tenHang+"::"+giaNhap+"::"+soLuong+"::"+ngayNhap+"::"+kiTuPB;
}
public void getNgayNhap(String ngaynhap2) {
}
}
