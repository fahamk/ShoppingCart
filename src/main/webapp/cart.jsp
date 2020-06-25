<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
<link href="${contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('form').submit(function() {
	    	console.log("We came here")
	    	$.ajax({
	            type: 'POST',
	            url: '/ShoppingCartAPI/api/productincart',
	            data: { fk_userId: $(this).fk_userId.value, 
            		fk_productid: $(this).fk_productid.value,
            		quantity: $(this).quantity.value,		
            	}
	        });
	        return false;
	    }); 
	})
</script>
<style>
.quantitycontrol {
	width:50px;
}
</style>
</head>
<body>
 	<div class="container mb-4">
    <div class="row">
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col"> </th>
                            <th scope="col">Product</th>
                            <th scope="col">Quantity</th>
                            <th scope="col" class="text-right">Price</th>
                            <th scope="col" class="text-center">Change Quantity</th>
                            <th scope="col" class="text-center">Delete</th>
                            <th> </th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${productlist}" var="product">
	                    	<tr>
	                            <td><img src="https://dummyimage.com/50x50/55595c/fff" /> </td>
	                            <td><c:out value="${product.name}"/></td>
	                            <td>${product.quantity}</td>
	                            <td class="text-right"><c:out value="${product.price}"/></td>
	                            <td class="text-right">
		                            <form id="addtocartform" action="/ShoppingCartAPI/api/productincartphase2" method="post">
		                            	<input type="hidden" name="fk_userId" value="${user}" />
		                            	<input type="hidden" name="name" value="${product.name}" />
		                            	<input type="hidden" name="price" value="${product.price}" />
		                            	<input type="hidden" name="fk_productid" value="${product.fk_productid}" />
		                            	<input type="text" name="quantity">
									    <input class="submit" type="submit" name="addToCart" value="Update" />
									</form>
								</td>
								<td>
									<a href="/ShoppingCartAPI/api/productincart/${product.pCartid}"> Remove </a>
								</td>
	                        </tr>
                    	</c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col mb-2">
            <div class="row">
            <div class="col-sm-12 col-md-6 text-right">
                    <button class="btn btn-lg btn-block btn-success text-uppercase" onclick="document.location='/ShoppingCartAPI/home'">Shop more</button>
                </div>
                <div class="col-sm-12 col-md-6 text-right">
                    <button class="btn btn-lg btn-block btn-success text-uppercase" onclick="document.location='/ShoppingCartAPI/checkout'">Checkout</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>