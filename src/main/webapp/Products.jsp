<%@page import="com.survivalcoding.domain.repository.ProductRepository"%>
<%@page import="com.survivalcoding.domain.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="p-5 bg-primary text-white">
		<div class="container" align = "center">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
            <%
            //welcome2.jsp에서 저장한 값 가져오기 
            //String name = (String) session.getAttribute("name");
           	//int age = (int) session.getAttribute("age");
           	
           	out.print(session.getAttribute("foods"));
            
            //싱글턴 패턴
            //자바 빈즈를 지우고 33 line을 새로 작성함 new는 사용하면 안됨 매번 새로고침을 하기 때문에 => 생성자를 private으로 막아서 new를 못하게 해야한다 (ProductRepository.java)
            ProductRepository repository = ProductRepository.getInstance(); 
            //out.print(repository.hashCode());
            List<Product> products = repository.getAllProducts();
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
            %>
				<div class="col-md-4">
					<h3><%= product.getName() %></h3>
					<p><%= product.getDescription() %></p>
					<p><%= product.getUnitPrice() %>원</p>
					<p><a href="Product.jsp?id=<%= product.getId() %>" class="btn btn-secondary">상세 정보 &raquo;</a></p>
				</div>
			<%
            }
			%>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>