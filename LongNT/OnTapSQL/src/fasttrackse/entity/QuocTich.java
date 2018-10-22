package fasttrackse.entity;
import org.springframework.stereotype.Component;

@Component
public class QuocTich {
	private int id;
	private String maQuocTich;
	private String tenQuocTich;
	public QuocTich() {
		super();
	}
	public QuocTich(int id) {
		super();
		this.id = id;
	}
	public QuocTich(String maQuocTich, String tenQuocTich) {
		super();
		this.maQuocTich = maQuocTich;
		this.tenQuocTich = tenQuocTich;
	}
	public QuocTich(int id, String maQuocTich, String tenQuocTich) {
		super();
		this.id = id;
		this.maQuocTich = maQuocTich;
		this.tenQuocTich = tenQuocTich;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaQuocTich() {
		return maQuocTich;
	}
	public void setMaQuocTich(String maQuocTich) {
		this.maQuocTich = maQuocTich;
	}
	public String getTenQuocTich() {
		return tenQuocTich;
	}
	public void setTenQuocTich(String tenQuocTich) {
		this.tenQuocTich = tenQuocTich;
	}
	
	
}
