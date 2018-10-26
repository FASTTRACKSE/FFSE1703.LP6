<?php 

1) SELECT SinhVien.TenSInhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QG.TenNuoc AS 'Nuoc', QT.TenNuoc AS 'QuocTich' FROM `SinhVien` LEFT JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh LEFT JOIN QuocTich QG ON SinhVien.Nuoc = QG.MaNuoc LEFT JOIN QuocTich QT ON SinhVien.QuocTich = QT.MaNuoc WHERE SinhVien.Nuoc = 'VN'

2) SELECT SinhVien.TenSInhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QG.TenNuoc AS 'Nuoc', QT.TenNuoc AS 'QuocTich'  FROM `SinhVien` LEFT JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh LEFT JOIN QuocTich QG ON SinhVien.Nuoc = QG.MaNuoc LEFT JOIN QuocTich QT ON SinhVien.QuocTich = QT.MaNuoc WHERE SinhVien.Nuoc = 'VN' AND SinhVien.QuocTich = 'VN'

3) SELECT SinhVien.MaSV, SinhVien.TenSInhVien,YEAR(CURDATE()) - YEAR(SinhVien.NgaySinh) AS 'Tuoi' ,DiemHocChinhQuy.LP1, DiemHocChinhQuy.LP2, DiemHocChinhQuy.LP3, DiemHocChinhQuy.LP4, DiemHocChinhQuy.LP5 FROM `SinhVien` INNER JOIN DiemHocChinhQuy ON SinhVien.MaSV = DiemHocChinhQuy.MaSV




4) SELECT LopHocCHinhQuy.MaLop, COUNT(SinhVien.MaLop) AS 'SoLuongSinhVien', MAX((DiemHocChinhQuy.LP1 + DiemHocChinhQuy.LP2 + DiemHocChinhQuy.LP3 + DiemHocChinhQuy.LP4 + DiemHocChinhQuy.LP5) / 5) AS 'DTBmax', MIN((DiemHocChinhQuy.LP1 + DiemHocChinhQuy.LP2 + DiemHocChinhQuy.LP3 + DiemHocChinhQuy.LP4 + DiemHocChinhQuy.LP5) / 5) AS 'DTBmin' FROM LopHocCHinhQuy LEFT JOIN SinhVien ON SinhVien.MaLop = LopHocCHinhQuy.MaLop LEFT JOIN DiemHocChinhQuy ON SinhVien.MaSV = DiemHocChinhQuy.MaSV GROUP BY LopHocCHinhQuy.MaLop

5) SELECT SinhVien.MaSV, YEAR(CURDATE()) - YEAR(SinhVien.NgaySinh) AS 'Tuoi' , SinhVien.TenSInhVien, BS1.Diem AS 'BS1', BS2.Diem AS 'BS2', BS3.DIem AS 'BS3', AVG(DiemMonHocBoSung.Diem) AS 'DTB' FROM SinhVien LEFT JOIN DiemMonHocBoSung BS1 ON BS1.MaMonHoc = 'BS1' AND BS1.MaSV = SinhVien.MaSV LEFT JOIN DiemMonHocBoSung BS2 ON BS2.MaMonHoc = 'BS2' AND BS2.MaSV = SinhVien.MaSV LEFT JOIN DiemMonHocBoSung BS3 ON BS3.MaMonHoc = 'BS3' AND BS3.MaSV = SinhVien.MaSV LEFT JOIN DiemMonHocBoSung ON DiemMonHocBoSung.MaSV = SinhVien.MaSV GROUP BY SinhVien.MaSV

 ?>
