	package ntu.vinh.controllers;

	
	public class SinhVien {
		private final String mssv;
		private final String hoTen;
		private final double diemTb;
	
	    public SinhVien(String mssv, String hoTen, double diemTb) {
	        this.mssv = mssv;
	        this.hoTen = hoTen;
	        this.diemTb = diemTb;
	    }
	
	    public String getMssv() { return mssv; }
	    public String getHoTen() { return hoTen; }
	    public double getDiemTb() { return diemTb; }
	}