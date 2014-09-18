<%-- 
    Document   : Checkout
    Created on : 18/09/2014, 9:03:52 PM
    Author     : Kendall Lauren Chin
--%>

<%@page import="domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@page import="domain.Order"%>
<%@page import="domain.OrderItem"%>
<%@page import="domain.OrderItem"%>
<%@page import="java.util.Collection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/shopping/style.css">
        <link href='http://fonts.googleapis.com/css?family=Shadows+Into+Light' rel='stylesheet' type='text/css'>
        <%@include file="/WEB-INF/jspf/NavigationMenu.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout</title>
    </head>
    <body>
        <h1>Checkout</h1>
        <p>You order currently consists of:</p>
        <%String message = "";%>
        <table border="1">
            <thead>
                <tr>
                    <th>Product Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
            </thead>
            <% 
                Order order = (Order)session.getAttribute("order");
                                
                if(order != null){
                        List<OrderItem> orderItems = order.getItems();
                                
                for (OrderItem orderItem:orderItems) {
                    Product product = orderItem.getaProduct();
                    Integer quantity = orderItem.getQuantityPurchased();
                    Double price = product.getPrice();
                    String productName = product.getName();
                    Integer productId = product.getId();
                    Double total = orderItem.getItemTotal();
                    message = String.valueOf(total);
        %>
            <tbody>                              
                <tr>
                    <td><%=productId%></td>
                    <td><%=productName%></td>
                    <td><%="$"+ price%></td>
                    <td><%=quantity%></td>
                    <td><%="$" + total%></td>

                </tr>
                <%} }%>
            </tbody>
        </table>
            <p>Total cost of order: <%=message%><p>
                                <button type="submit" name="ConfirmOrder" value="<%=order%>">Confirm Order</button>
                                
    </body>
</html>
