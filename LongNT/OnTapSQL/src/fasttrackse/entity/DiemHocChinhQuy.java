package fasttrackse.entity;

import org.springframework.stereotype.Component;

@Component
public class DiemHocChinhQuy {
	private int id;
	private int maSV;
	private int monLP1;
	private int monLP2;
	private int monLP3;
	private int monLP4;
	private int monLP5;
	public DiemHocChinhQuy() {
		super();
	}
	public DiemHocChinhQuy(int id) {
		super();
		this.id = id;
	}
	public DiemHocChinhQuy(int maSV, int monLP1, int monLP2, int monLP3, int monLP4, int monLP5) {
		super();
		this.maSV = maSV;
		this.monLP1 = monLP1;
		this.monLP2 = monLP2;
		this.monLP3 = monLP3;
		this.monLP4 = monLP4;
		this.monLP5 = monLP5;
	}
	public DiemHocChinhQuy(int id, int maSV, int monLP1, int monLP2, int monLP3, int monLP4, int monLP5) {
		super();
		this.id = id;
		this.maSV = maSV;
		this.monLP1 = monLP1;
		this.monLP2 = monLP2;
		this.monLP3 = monLP3;
		this.monLP4 = monLP4;
		this.monLP5 = monLP5;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getMonLP1() {
		return monLP1;
	}
	public void setMonLP1(int monLP1) {
		this.monLP1 = monLP1;
	}
	public int getMonLP2() {
		return monLP2;
	}
	public void setMonLP2(int monLP2) {
		this.monLP2 = monLP2;
	}
	public int getMonLP3() {
		return monLP3;
	}
	public void setMonLP3(int monLP3) {
		this.monLP3 = monLP3;
	}
	public int getMonLP4() {
		return monLP4;
	}
	public void setMonLP4(int monLP4) {
		this.monLP4 = monLP4;
	}
	public int getMonLP5() {
		return monLP5;
	}
	public void setMonLP5(int monLP5) {
		this.monLP5 = monLP5;
	}
	
}
