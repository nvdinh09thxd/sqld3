package Buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void NhapThongTin(List<giaoVien> dsgv, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin thu: " + (i + 1) + ": ");
			giaoVien gv = new giaoVien();
			gv.nhapGiaoVien();
			dsgv.add(gv);
		}
	}

	public static void xuatThongTin(List<giaoVien> dsgv) {
		if (dsgv.size() == 0)
			System.out.println("Danh sach trong!");
		else
			for (int i = 0; i < dsgv.size(); i++) {
				dsgv.get(i).inGiaoVien();
				System.out.println("------------------");
			}
	}

	public static void xuatCaoTuoi(List<giaoVien> dsgv) {
		if (dsgv.size() == 0)
			System.out.println("Danh sach trong!");
		else {
			int max = dsgv.get(0).tuoi();
			int j=0;
			// tim tuoi cao nhat trong danh sach
			for (int i = 1; i < dsgv.size(); i++) {
				if (dsgv.get(i).tuoi() > max){
					max = dsgv.get(i).tuoi();
					j=i;
				}
			}
			//xuat thong tin giao vien cao tuoi nhat
					dsgv.get(j).inGiaoVien();
		}
	}

	public static void main(String[] args) {
		List<giaoVien> DSGiaoVien = new ArrayList<giaoVien>();
		int chon;
		do {
			System.out.println("===MENU===");
			System.out.println("1. Nhap thong tin");
			System.out.println("2. Xuat thong tin");
			System.out.println("3. Xuat giao vien cao tuoi nhat");
			System.out.println("4. Thoat");
			System.out.println("==========");
			System.out.print("Nhap lua chon: ");
			Scanner sc = new Scanner(System.in);
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1:
				System.out.print("Nhap so luong: ");
				int n = sc.nextInt();
				NhapThongTin(DSGiaoVien, n);
				break;
			case 2:
				System.out.println("DANH SACH GIAO VIEN:");
				xuatThongTin(DSGiaoVien);
				break;
			case 3:
				System.out.println("THONG TIN GIAO VIEN CAO TUOI NHAT:");
				xuatCaoTuoi(DSGiaoVien);
				break;
			case 4:
				chon = 4;
				System.out.println("Thoat khoi chuong trinh!");
				break;
			}
		} while (chon != 4);
	}
}
