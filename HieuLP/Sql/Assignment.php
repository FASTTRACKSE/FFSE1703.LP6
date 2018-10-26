<?php 

1)SELECT SinhVien.TenSinhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QuocTich.TenNuoc AS 'Nuoc' FROM `SinhVien` INNER JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh INNER JOIN QuocTich ON SinhVien.Nuoc = QuocTich.MaNuoc WHERE SinhVien.Nuoc = 'VN'

2) SELECT SinhVien.TenSinhVien, YEAR(CURDATE()) - YEAR( SinhVien.NgaySinh) AS 'Tuoi', TinhThanh.TenTinhThanh AS 'TinhThanh', QuocTich.TenNuoc AS 'Nuoc', QuocTich.TenNuoc AS 'QuocTich'  FROM `SinhVien` INNER JOIN TinhThanh ON SinhVien.TinhThanh = TinhThanh.MaTinhThanh INNER JOIN QuocTich ON SinhVien.QuocTich = QuocTich.MaNuoc WHERE SinhVien.QuocTich = 'VN' AND SinhVien.Nuoc = 'VN' 


 ?>