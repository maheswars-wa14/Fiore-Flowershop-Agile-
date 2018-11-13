<%-- 
    Document   : MainOrderingPage
    Created on : Nov 13, 2018, 11:48:20 AM
    Author     : Mahes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.Date" %>
<% Class.forName(com.mysql.jdbc.Driver);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flower Ordering</title>
    </head>
    <body>
        <%!
            public class Flowers {

                String URL = "jdbc:derby://localhost:1527/FioreV1.1";
                String USERNAME = "";
                String PASSWORD = "";

                Connection connection = null;
                PreparedStatement selectFlowers = null;
                ResultSet resultSet = null;

                public Flowers() {
                    try {
                        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

                        selectFlowers = connection.prepareStatement(
                                "SELECT flowerID, flowerName, flowerCost FROM flowers");

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                public ResultSet getFlowers() {
                    try {
                        resultSet = selectFlowers.executeQuery();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return resultSet;
                }
            }
        %>
        <%
            Flowers flowers = new Flowers();
            ResultSet flower = flowers.getFlowers();
        %>
        <form name="myForm" action="MainOrderingPage.jsp" method="POST">
            <h1><b><u>Order Page</u></b></h1>
            Available Flowers:
            <table border="1">
                <tbody>
                    <tr>
                        <td>Flowers ID</td>
                        <td>Name</td>
                        <td>Cost</td>
                    </tr>
                    <% while (flower.next()) {%>
                    <tr>
                        <td><%= flower.getInt("flowerID")%></td>
                        <td><%= flower.getString("flowerName")%></td>
                        <td><%= flower.getDouble("flowerCost")%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
            <select>
                <option value="Roses">Roses</option>
                <option value="Chrysanthemums">Chrysanthemums</option>
                <option value="Narcissus">Narcissus</option>
                <option value="Cherry-Blossom">Cherry-Blossoms</option>
            </select>
            <tr>
                <td>Quantity of flowers:</td>
                <td><input type="text" name="dateYear"></td>
            </tr>
        </form>

    </body>
</html>
