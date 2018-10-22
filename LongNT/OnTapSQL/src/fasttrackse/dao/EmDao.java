package fasttrackse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.ParsedSql;
import org.springframework.ui.Model;

import fasttrackse.entity.DiemHocChinhQuy;
import fasttrackse.entity.LopHocChinhQuy;
import fasttrackse.entity.SinhVien;


public class EmDao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  

	}
	
	 public List<SinhVien> getAllStudentWhereNation(){
		 String sql = "SELECT  sinhvien.tensv, sinhvien.ngaysinh,sinhvien.matinh,sinhvien.manuoc, tinhthanhpho.tentinh, nuoc.tennuoc"
		 		+ "  FROM ((sinhvien INNER JOIN tinhthanhpho ON sinhvien.matinh = tinhthanhpho.matinh)"
		 		+ " INNER JOIN nuoc ON sinhvien.manuoc = nuoc.manuoc) where  sinhvien.manuoc = 'VN'";
		
		 
		 
		 return template.query(sql, new ResultSetExtractor<List<SinhVien>>(){
				@Override
			 public List<SinhVien> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<SinhVien> list = new ArrayList<SinhVien>();
				 
					while (rs.next()) {
						String tenSV = rs.getString("tensv");
						String ngaySinh = rs.getString("ngaysinh");
						String maTinh = rs.getString("tentinh");
						String maNuoc = rs.getString("tennuoc");
						
						SinhVien sv = new SinhVien(tenSV, ngaySinh, maTinh, maNuoc);
						list.add(sv);
					}
					return list;
		}
		 });

}
	 public List<SinhVien> getAllStudentWhereNationally(){
		 String sql = "SELECT  sinhvien.tensv, sinhvien.ngaysinh, sinhvien.matinh, sinhvien.manuoc, tinhthanhpho.tentinh, nuoc.tennuoc, quoctich.tenquoctich"
			 		+ "  FROM (((sinhvien INNER JOIN tinhthanhpho ON sinhvien.matinh = tinhthanhpho.matinh)"
			 		+ " INNER JOIN nuoc ON sinhvien.manuoc = nuoc.manuoc)"
			 		+ " INNER JOIN quoctich ON sinhvien.maquoctich = quoctich.maquoctich) where  sinhvien.manuoc = 'VN' and quoctich.maquoctich = 'VN' ";
		 return template.query(sql, new ResultSetExtractor<List<SinhVien>>(){
			 @Override
			 public List<SinhVien> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<SinhVien> list = new ArrayList<SinhVien>();
				 while (rs.next()) {
					 String tenSV = rs.getString("tensv");
					 String ngaySinh = rs.getString("ngaysinh");
					 String maTinh = rs.getString("tentinh");
					 String maNuoc = rs.getString("tennuoc");
					 String maQuocTich = rs.getString("tenquoctich");
					SinhVien sv = new SinhVien(tenSV, ngaySinh,maTinh,maNuoc,maQuocTich);
					list.add(sv);
				 }
				 return list;
			 }
		 });
	 }
	 public List<SinhVien> getAllStudent(){
		 String sql = "SELECT  sinhvien.masv, sinhvien.tensv, sinhvien.ngaysinh, sinhvien.matinh, sinhvien.manuoc, tinhthanhpho.tentinh, nuoc.tennuoc, quoctich.tenquoctich, sinhvien.malop, lophocchinhquy.tenlop"
			 		+ "  FROM ((((sinhvien INNER JOIN tinhthanhpho ON sinhvien.matinh = tinhthanhpho.matinh)"
			 		+ " INNER JOIN nuoc ON sinhvien.manuoc = nuoc.manuoc)"
			 		+ " INNER JOIN quoctich ON sinhvien.maquoctich = quoctich.maquoctich)"
			 		+ "INNER JOIN lophocchinhquy ON sinhvien.malop = lophocchinhquy.malop) where sinhvien.malop = lophocchinhquy.malop ";
		 return template.query(sql, new ResultSetExtractor<List<SinhVien>>(){
			 @Override
			 public List<SinhVien> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<SinhVien> list = new ArrayList<SinhVien>();
				 while (rs.next()) {
					 int maSV = rs.getInt("masv");
					 String tenSV = rs.getString("tensv");
					 String ngaySinh = rs.getString("ngaysinh");
					 String maTinh = rs.getString("tentinh");
					 String maNuoc = rs.getString("tennuoc");
					 String maQuocTich = rs.getString("tenquoctich");
					 String maLop = rs.getString("tenlop");
					SinhVien sv = new SinhVien(maSV, tenSV, ngaySinh,maTinh,maNuoc,maQuocTich,maLop);
					list.add(sv);
				 }
				 return list;
			 }
		 });
	 }
	 
	public List<DiemHocChinhQuy> getAllStudentAndScore(){
		String sql = "SELECT diemhocchinhquy.masv, diemhocchinhquy.monlp1, diemhocchinhquy.monlp2, diemhocchinhquy.monlp3, diemhocchinhquy.monlp4,diemhocchinhquy.monlp5, sinhvien.masv "
				+ "from(diemhocchinhquy INNER JOIN sinhvien ON diemhocchinhquy.masv =  sinhvien.masv)";
		return template.query(sql, new ResultSetExtractor<List<DiemHocChinhQuy>>(){
			 @Override
			 public List<DiemHocChinhQuy> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<DiemHocChinhQuy> list = new ArrayList<DiemHocChinhQuy>();
				 while (rs.next()) {
					 int maSV =  rs.getInt("masv");
					 int monLP1 = rs.getInt("monlp1");
					 int monLP2 = rs.getInt("monlp2");
					 int monLP3 = rs.getInt("monlp3");
					 int monLP4 = rs.getInt("monlp4");
					 int monLP5 = rs.getInt("monlp5");
					 DiemHocChinhQuy dhcq = new DiemHocChinhQuy(maSV, monLP1, monLP2, monLP3, monLP4, monLP5);
					list.add(dhcq);
				 }
				 return list;
			 }
		 });
	}
	 
}
