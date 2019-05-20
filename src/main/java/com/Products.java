package com;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Products extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("list"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float number =((price*discount)/100);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description:  " + product +"</h1>"+"<br>");
        writer.println("<h1> Price :" +price + "</h1>" + "<br>");
        writer.println("<h1>Discount Percent:  "+ discount + "</h1>" + "<br>");
        writer.println("<h1>Discount Amount: " + number + "</h1>"+ "<br>");
        writer.println("<h1>Discount Price: " + (price - number) + "<h1>" + "<br>");




    }
}