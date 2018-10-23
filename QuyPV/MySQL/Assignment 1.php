<?php 

1) SELECT SinhVien.TenSInhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QuocTich.TenNuoc AS 'Nuoc' FROM `SinhVien` INNER JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh INNER JOIN QuocTich ON SinhVien.Nuoc = QuocTich.MaNuoc WHERE SinhVien.Nuoc = 'VN'

2) SELECT SinhVien.TenSInhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QuocTich.TenNuoc AS 'Nuoc', QuocTich.TenNuoc AS 'QuocTich'  FROM `SinhVien` INNER JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh INNER JOIN QuocTich ON SinhVien.QuocTich = QuocTich.MaNuoc WHERE SinhVien.Nuoc = 'VN' AND SinhVien.QuocTich = 'VN'

3) SELECT SinhVien.MaSV, SinhVien.TenSInhVien, DiemHocChinhQuy.LP1, DiemHocChinhQuy.LP2, DiemHocChinhQuy.LP3, DiemHocChinhQuy.LP4, DiemHocChinhQuy.LP5 FROM `SinhVien` INNER JOIN DiemHocChinhQuy ON SinhVien.MaSV = DiemHocChinhQuy.MaSV

 ?>