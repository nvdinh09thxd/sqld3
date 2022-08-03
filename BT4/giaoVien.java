package BT4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class giaoVien {
	String hoTen;
	Date ngaySinh;
	int luong;
	String ngStr; //ngay sinh dinh dang kieu String
	
	public void nhapGiaoVien(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Ngay sinh (dd/mm/yyyy): ");
		String date = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinh = dateFormat.parse(date);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		ngStr = dateFormat.format(ngaySinh);
		System.out.print("Luong: ");
		luong = sc.nextInt();
	}
	public void inGiaoVien(){
		
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Ngay sinh: "+ngStr);
		System.out.println("Luong: "+luong);
	}
	public int tuoi(){
		int t;
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(ngaySinh);
		int namsinh = cal.get(Calendar.YEAR);
		cal.setTime(today);
		int namhientai = cal.get(Calendar.YEAR);
		
		t= namhientai - namsinh;
		return t;
	}
}
