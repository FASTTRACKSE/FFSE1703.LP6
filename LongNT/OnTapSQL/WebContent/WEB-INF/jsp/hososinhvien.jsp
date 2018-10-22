<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="app-content content container-fluid">
		<div class="content-wrapper">
			<!-- Path -->
			<a class="btn btn-outline-success round btn-min-width mr-1 mb-1"
				href="list">Sinh viên nước Viêt Nam </a> <a
				class="btn btn-outline-success round btn-min-width mr-1 mb-1"
				href="SVQTVietNam">Sinh viên quốc tịch Việt Nam </a> <a
				class="btn btn-outline-success round btn-min-width mr-1 mb-1"
				href="thongkediem">Thống kê điểm của sinh viên </a>
			<div class="content-header row">
				<div class="container">
					<div>

						<h3 style="text-align: center;">Danh Sách</h3>
					</div>
					<div class="table-responsive">
						<table class="table table-bordered"
							style="text-align: center; background: white">
							<thead style="background: #D3D3D3">
								<tr>
									<th>STT</th>
									<th>Mã SV</th>
									<th>Tên SV</th>
									<th>Tuôi SV</th>
									<th>Tỉnh Thành Phố</th>
									<th>Tên Nước</th>
									<th>Tên Quốc Tịch</th>
									<th>Mã lớp</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="nv" items="${list}" varStatus="count">
								<tr>
										<th scope="row">${count.count}</th>
										<td>${nv.maSV}</td>
										<td>${nv.tenSV}</td>
										<td>${nv.ngaySinh}</td>
										<td>${nv.tinhThanhPho}</td>
										<td>${nv.nuoc}</td>
										<td>${nv.quocTich}</td>
										<td>${nv.maLop}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>