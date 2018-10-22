package fasttrackse.entity;
import org.springframework.stereotype.Component;

@Component
public class Nuoc {
	private int id;
	private String maNuoc;
	private String tenNuoc;
	public Nuoc() {
		super();
	}
	public Nuoc(int id) {
		super();
		this.id = id;
	}
	public Nuoc(String maNuoc, String tenNuoc) {
		super();
		this.maNuoc = maNuoc;
		this.tenNuoc = tenNuoc;
	}
	public Nuoc(int id, String maNuoc, String tenNuoc) {
		super();
		this.id = id;
		this.maNuoc = maNuoc;
		this.tenNuoc = tenNuoc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaNuoc() {
		return maNuoc;
	}
	public void setMaNuoc(String maNuoc) {
		this.maNuoc = maNuoc;
	}
	public String getTenNuoc() {
		return tenNuoc;
	}
	public void setTenNuoc(String tenNuoc) {
		this.tenNuoc = tenNuoc;
	}
	
}
