<%--
  Created by IntelliJ IDEA.
  User: duy
  Date: 20/05/2019
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style type="text/css">
      h1{
        border: 1px solid blue;
        width: 500px;
        height: 500px;
        margin-left: 413px;
        text-align: center;
        color: blue;

      }
    </style>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/convert" method="post">
    <h1>Product Discount Caculator
      <br>
    Product Description:
      <input type="text"name="product">
    <br>
    List Price         :
      <input type="text"name="list">
    <br>
    Discount Percent   :
      <input type="text"name="discount"> (%)
      <br>
      <input type="submit"value="Calculate Discount">
    </h1>


  </form>
  </body>
</html>
