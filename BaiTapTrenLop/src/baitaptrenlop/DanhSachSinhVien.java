package baitaptrenlop;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	List<SinhVien> mang = new ArrayList<SinhVien>();
	
	public boolean ktSV(String masv) {
		for (SinhVien sv : mang) {
			if (sv.getMssv().equalsIgnoreCase(masv))
				return true;
		}
		return false;
	}
	
	public void themSV(SinhVien sv) {
		if (ktSV(sv.getMssv())==false) {
			mang.add(sv);
			System.out.println("sinh vien da duoc them");}
		else 
			System.out.println("sinh vien bi trung ma");
	}
	
	public void suaSV(SinhVien sv , int chiso) {
		mang.set(chiso, sv);
	}
	
	public void xoaSv(int chiso) {
		mang.remove(chiso);
	}
	
	public String hienThi() {
		return mang.toString();
	}
	
	public static void main(String[] agrs) {
		SinhVien s = new SinhVien("222", "hung", "bkhn", "dt9");
		SinhVien s1 = new SinhVien("223", "h", "ff", "dt");
		DanhSachSinhVien y = new DanhSachSinhVien();
		y.themSV(s);
		y.themSV(s1);
		s.toString();
		
		
	}
}
