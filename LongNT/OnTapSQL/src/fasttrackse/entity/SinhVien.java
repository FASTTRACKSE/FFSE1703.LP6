package fasttrackse.entity;
import org.springframework.stereotype.Component;

@Component
public class SinhVien {
	private int maSV;
	private String tenSV;
	private String ngaySinh;
	private String tinhThanhPho;
	private String nuoc;
	private String quocTich;
	private String maLop;
	public SinhVien() {
		super();
	}
	public SinhVien(int maSV) {
		super();
		this.maSV = maSV;
	}
	public SinhVien(String tenSV, String ngaySinh, String tinhThanhPho, String nuoc, String quocTich, String maLop) {
		super();
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.tinhThanhPho = tinhThanhPho;
		this.nuoc = nuoc;
		this.quocTich = quocTich;
		this.maLop = maLop;
	}
	
	public SinhVien(String tenSV, String ngaySinh, String tinhThanhPho, String nuoc, String quocTich) {
		super();
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.tinhThanhPho = tinhThanhPho;
		this.nuoc = nuoc;
		this.quocTich = quocTich;
	}
	public SinhVien(int maSV, String tenSV, String ngaySinh, String tinhThanhPho, String nuoc, String quocTich,
			String maLop) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.tinhThanhPho = tinhThanhPho;
		this.nuoc = nuoc;
		this.quocTich = quocTich;
		this.maLop = maLop;
	}
	
	public SinhVien(String tenSV,String ngaySinh, String tinhThanhPho, String nuoc) {
		super();
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.tinhThanhPho = tinhThanhPho;
		this.nuoc = nuoc;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTinhThanhPho() {
		return tinhThanhPho;
	}
	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}
	public String getNuoc() {
		return nuoc;
	}
	public void setNuoc(String nuoc) {
		this.nuoc = nuoc;
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	
	
}
