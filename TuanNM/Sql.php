Bai 1:Liệt kê tên, tuổi, tỉnh thành những sinh viên thuộc nước Việt Nam

SELECT sinh_vien.fullname , (YEAR(CURRENT_DATE) - YEAR(sinh_vien.birthday)) AS tuoi , tinhthanh.TenTinhThanh , nation.name_nation AS nuoc ,quoctich.name_nation AS quoc_tich
FROM ((sinh_vien 
LEFT JOIN tinhthanh ON sinh_vien.province = tinhthanh.MaTinhThanh) 
LEFT JOIN nation ON sinh_vien.nation = nation.id_nation )  
LEFT JOIN nation quoctich ON sinh_vien.nationality = quoctich.code_nation 
WHERE sinh_vien.nation  = 704

Bài 2 :Liệt kê tên, tuổi, tỉnh thành những sinh viên nước Việt Nam và quốc tịch Việt Nam

SELECT sinh_vien.fullname , (YEAR(CURRENT_DATE) - YEAR(sinh_vien.birthday)) AS tuoi , tinhthanh.TenTinhThanh , nation.name_nation,quoctich.name_nation
FROM ((sinh_vien 
LEFT JOIN tinhthanh ON sinh_vien.province = tinhthanh.MaTinhThanh) 
LEFT JOIN nation ON sinh_vien.nation = nation.id_nation )  
LEFT JOIN nation quoctich ON sinh_vien.nationality = quoctich.code_nation 
WHERE sinh_vien.nation  = 704 AND sinh_vien.nationlity ='VN'

Bài 3 : Liệt kê sinh viên thống kê các điểm môn học chính quy

SELECT sinh_vien.fullname , (YEAR(CURRENT_DATE) - YEAR(sinh_vien.birthday)) AS tuoi ,score.lp1,score.lp2, score.lp3, score.lp4, score.lp5,  tinhthanh.TenTinhThanh , nation.name_nation,quoctich.name_nation
FROM ((((sinh_vien LEFT JOIN class ON sinh_vien.ma_class = class.ma_class)
INNER JOIN score ON sinh_vien.ma_sv = score.ma_sv)
LEFT JOIN tinhthanh ON sinh_vien.province = tinhthanh.MaTinhThanh) 
LEFT JOIN nation ON sinh_vien.nation = nation.id_nation )  
LEFT JOIN nation quoctich ON sinh_vien.nationality = quoctich.code_nation 

Bai 4:

SELECT class.name_class AS lop ,COUNT(sinh_vien.ma_sv) AS soluong , MAX((score.lp1+score.lp2+score.lp3+score.lp4+score.lp5)/5) AS diem_TB_cao_nhat,
MIN((score.lp1+score.lp2+score.lp3+score.lp4+score.lp5)/5) AS diem_TB_thap_nhat
FROM ((((sinh_vien LEFT JOIN class ON sinh_vien.ma_class = class.ma_class)
INNER JOIN score ON sinh_vien.ma_sv = score.ma_sv)
LEFT JOIN tinhthanh ON sinh_vien.province = tinhthanh.MaTinhThanh) 
LEFT JOIN nation ON sinh_vien.nation = nation.id_nation )  
LEFT JOIN nation quoctich ON sinh_vien.nationality = quoctich.code_nation  GROUP BY sinh_vien.ma_class

Bai 5
SELECT sinh_vien.ma_sv , sinh_vien.fullname , (YEAR(CURRENT_DATE) - YEAR(sinh_vien.birthday)) AS tuoi,mhbs.*, dhbs.* FROM ((mon_hoc_bo_sung mhbs 
RIGHT JOIN diem_hoc_bo_sung dhbs ON mhbs.ma_mh = dhbs.ma_mh) LEFT JOIN sinh_vien ON sinh_vien.ma_sv = dhbs.ma_sv