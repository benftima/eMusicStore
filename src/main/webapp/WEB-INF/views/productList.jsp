<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
        <div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All products</h1>
            <p class="lead">Checkout all the awesome products available now !</p>


        </div>
        <table class="table table-bordered table-responsive">
        <thead>
        <tr class="bg-success">
            <th>Photo thumb</th>
            <th>Product Name</th>
            <th>Category</th>
            <th>Condition</th>
            <th>Price</th>

        </tr>

        </thead>
            <c:forEach items="${products}" var="product">
        <tr>
            <td>
                <image src="#" alt="image"/>
            </td>
            <td>${product.productName}</td>
            <td>${product.productCategory}</td>
            <td>${product.productCondition}</td>
            <td>${product.productPrice}  DT</td>


        </tr>
            </c:forEach>
        </table>
       <%@include file="/WEB-INF/views/template/footer.jsp"%>