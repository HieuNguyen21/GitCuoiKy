package com.hieunn2008110163.BaiCuoiKy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class nhapngay {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat df =new SimpleDateFormat("dd-mm-yyyy");{
try {
    System.out.println("nhập ngày:");            
    Date date =df.parse(sc.nextLine());
    System.out.println("ngày:"+df.format(date));
    } catch (Exception e) {
    }
}
}


