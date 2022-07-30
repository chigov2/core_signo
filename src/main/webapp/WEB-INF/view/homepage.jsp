<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
    <title>Product list</title>
    <!-- reference our style sheet -->
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/style/css/style.css"/>
</head>
<body>
<h2>List of available products</h2>
<!-- div for apply styling to table  -->
<div class="datagrid">
    <table>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Cost($)</th>
        </tr>
        <!-- loop over and print our customers -->
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.productID}</td>
                <td>${product.productName}</td>
                <td>${product.cost}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>