package fasttrackse.entity;
import org.springframework.stereotype.Component;

@Component
public class TinhThanhPho {
 private int id;
 private String maTinh;
 private String tenTinh;
 
 
public TinhThanhPho(int id) {
	super();
	this.id = id;
}


public TinhThanhPho(String maTinh, String tenTinh) {
	super();
	this.maTinh = maTinh;
	this.tenTinh = tenTinh;
}


public TinhThanhPho(int id, String maTinh, String tenTinh) {
	super();
	this.id = id;
	this.maTinh = maTinh;
	this.tenTinh = tenTinh;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getMaTinh() {
	return maTinh;
}


public void setMaTinh(String maTinh) {
	this.maTinh = maTinh;
}


public String getTenTinh() {
	return tenTinh;
}


public void setTenTinh(String tenTinh) {
	this.tenTinh = tenTinh;
}
 
 
}