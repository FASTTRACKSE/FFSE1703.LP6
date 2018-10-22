package fasttrackse.entity;
import org.springframework.stereotype.Component;

@Component
public class LopHocChinhQuy {
	private int id;
	private String maLop;
	private String tenLop;
	private String maNganh;
	public LopHocChinhQuy(int id) {
		super();
		this.id = id;
	}
	public LopHocChinhQuy(String maLop, String tenLop, String maNganh) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.maNganh = maNganh;
	}
	public LopHocChinhQuy() {
		super();
	}
	public LopHocChinhQuy(int id, String maLop, String tenLop, String maNganh) {
		super();
		this.id = id;
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.maNganh = maNganh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	
}
