<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>공지사항</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>

<article>
	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>공지사항</h2>
						<div class="bt-option">
							<a href="/">Home</a> <span>Our Schedule</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Schedule Table Section Begin -->
	<section class="schedule-table-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="schedule-table-tab">
						<ul class="nav nav-tabs" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								data-toggle="tab" href="#tabs-1" role="tab">Marketing</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								href="#tabs-2" role="tab">Business</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								href="#tabs-3" role="tab">Technology</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								href="#tabs-4" role="tab">Experience</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								href="#tabs-5" role="tab">Event</a></li>
						</ul>
						<!-- Tab panes -->
						<div class="tab-content">
							<div class="tab-pane active" id="tabs-1" role="tabpanel">
								<div class="schedule-table-content">
									<table>
										<thead>
											<tr>
												<th><span>글번호</span></th>
												<th><span>분류</span></th>
												<th><span>제목</span></th>
												<th><span>조회수</span></th>
												<th><span>작성일</span></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach begin="0" end="4">
												<tr>
													<td>1</td>
													<td>기본</td>
													<td class="hover-bg">
														<a href="#">
															제목입니다제목입니다제목입니다제목입니다제목입니다제목입니다제목입니다제목입니다제목입니다
														</a>
													</td>
													<td>3</td>
													<td>2020-10-12</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Schedule Table Section End -->
</article>

<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
</html>