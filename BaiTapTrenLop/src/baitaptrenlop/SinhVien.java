package baitaptrenlop;




public class SinhVien {
	private String mssv;
	private String tenSV;
	//private Date namSinh;
	private String diaChi;
	private String lop;
	
	
	
	public SinhVien(String mssv, String tenSV, String diaChi,
			String lop) {
		this.mssv = mssv;
		this.tenSV = tenSV;
//		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.lop = lop;
	}



	public String getMssv() {
		return mssv;
	}



	public void setMssv(String mssv) {
		this.mssv = mssv;
	}



	public String toString() {
		return "SinhVien [mssv=" + mssv + ", tenSV=" + tenSV + ", diaChi="
				+ diaChi + ", lop=" + lop + "]";
	}
	
	
}
