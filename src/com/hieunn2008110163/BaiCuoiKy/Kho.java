package com.hieunn2008110163.BaiCuoiKy;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public  class Kho  {
  
    private static final String ngayNhap = null;
    static ArrayList<hangHoa> arr =new ArrayList<hangHoa>();
    private static Object date;
    public static void them() {
        DateFormat df;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập Loại: ");
        String Loai =sc.nextLine();
        System.out.println("Nhập Mã Hàng : ");
        String maHang =sc.nextLine();
        System.out.println("Nhập Tên Hàng : ");
        String tenHang =sc.nextLine();
        System.out.println("Nhập Giá: ");
        System.out.println("Ngày Nhập Kho:"+df.format(date));
        Date date = df.parse(sc.nextLine());
        Float giaNhap =sc.nextFloat();
        System.out.println("Nhập Số Lượng: ");
        int soLuong = sc.nextInt();
        System.out.println("Nhập Ký Tự: ");
        String kiTUPB =sc.nextLine();
        hangHoa hh = new hangHoa();
        arr.add(hh);
     }
    public static void sua(){
        DateFormat df;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập Số Lượng cần sửa:");
        int soLuong =sc.nextInt();
        boolean timThay =false;
        for(int i;i< arr.size();i++){
            if(soLuong == arr.get(i).getSoLuong()){
        System.out.println("Nhập Loại: ");
        String Loai =sc.nextLine();  
        System.out.println("Nhập Mã Hàng : ");
        String maHang =sc.nextLine();
        System.out.println("Nhập Tên Hàng : ");
        String tenHang =sc.next();
        System.out.println("Nhập Giá: ");
        System.out.println("Ngày Nhập Kho:"+df.format(date));
        Date date = df.parse(sc.nextLine());
        Float giaNhap =sc.nextFloat();
        System.out.println("Nhập Ký Tự: ");
        String kiTuPB =sc.nextLine();

        arr.get(i).setLoai(Loai);
        arr.get(i).setMaHang(maHang);
        arr.get(i).setTenHang(tenHang);
        arr.get(i).setGiaNhap(giaNhap);
        arr.get(i).getNgayNhap(ngayNhap);
        arr.get(i).setPhanBiet(kiTuPB);
        timThay=true;
        break;
            }
        }
        if(timThay == false) System.out.println("không tìm thấy hàng hóa!!!");
     }
    
     public static void xoa(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số lượng cần xóa:");
        int soLuong =sc.nextInt();
        int d;
        boolean timThay=false;
        for(int i ;i<arr.size();i++){
            if(d==arr.get(i).getSoLuong()){
                timThay=true;
                d=i;
                break;
            }
        }
       if(timThay==false) System.out.println("không thấy hàng hóa!!!");
    else{
           arr.remove(d);
    }
}
public void sapxeptheogia(){
    Collections.sort(arr,new Comparator<hangHoa>(){

        @Override
        public int compare(hangHoa o1, hangHoa o2) {
         if(o1.getGiaNhap()<o2.getGiaNhap()){
             return -1;
         }else{
            if(o1.getGiaNhap() == o2.getGiaNhap()){
                return 0;
         }else{
             return 1;
         }
        }
    }
    });
}
public void sapxeptheogiagiamdan(){
    Collections.sort(arr,new Comparator<hangHoa>(){

        @Override
        public int compare(hangHoa o1, hangHoa o2) {
         if(o1.getGiaNhap()>o2.getGiaNhap()){
             return -1;
         }else{
            if(o1.getGiaNhap() == o2.getGiaNhap()){
                return 0;
         }else{
             return 1;
         }
        }
    }
    });
}
public void sapxeptheongay(){
    Collections.sort(arr,new Comparator<hangHoa>(){
        @Override
        public int compare(hangHoa o1, hangHoa o2) {
         if(o1.getNgayNhap().after(o2.getNgayNhap())){
             return 1;
         }else{
            if(o1.getNgayNhap().equals(o2.getNgayNhap())){
                return 0;
         }else{
             return -1;
         }
        }
    }
    });
}
public void sapxeptheongaygiamdan(){
    Collections.sort(arr,new Comparator<hangHoa>(){
        @Override
        public int compare(hangHoa o1, hangHoa o2) {
         if(o1.getNgayNhap().after(o2.getNgayNhap())){
             return -1;
         }else{
            if(o1.getNgayNhap().equals(o2.getNgayNhap())){
                return 0;
         }else{
             return 1;
         }
        }
    }
    });
}





    
    