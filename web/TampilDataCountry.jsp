<%-- 
    Document   : TampilDataCountry
    Created on : Mar 11, 2019, 8:18:52 PM
    Author     : AdhityaWP
--%>

<%@page import="models.Region"%>
<%@page import="java.util.List"%>
<%@page import="models.Country"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tampil Data Country</title>
    </head>
    <body bgcolor='#FFFAF0'>
        <table align='center' size='+4'> 
            <thead>
                <tr>
                    <th colspan="2" >TAMPIL DATA COUNTRY</th>
                </tr>
            </thead> </table>
        <form action="CountryServlet" method="POST">
            <table cellspacing='50' align ='center' border="2">
                <thead>
                    <tr>
                        <th colspan="4">Insert Country</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id</td>
                        <td><input type="text" name="countryId" value="<%= (session.getAttribute("countryId") != null)?session.getAttribute("countryId"):"" %>"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="countryName" value="<%= (session.getAttribute("countryName") != null)?session.getAttribute("countryName"):"" %>"/></td>
                    </tr>
                    <tr>
                        <td>Region</td>
                        <td><select name="countryRegion" >
                                <% for (Region elem : (List<Region>) session.getAttribute("regiondata")) {
                                        out.print("<option "
                                                + "value=\"" + elem.getId() + "\" "
                                                + (elem.getId().equals(session.getAttribute("countryRegion")) ? "selected" : "") + ">"
                                                + elem.getName() + "</option>");
                                    }%>

                            </select></td>
                    </tr>
                    <tr>
                        <td colspan="2" align='center' ><input type="submit" value="Save" name="save" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

        <table cellspacing='30' align='center' border='1'>
            <tr>
                <th>No.</th>
                <th>Id</th>
                <th>Name</th>
                <th>Region</th>
                <th>Aksi</th>
            </tr>
            <% int j = 1;
                for (Country elem : (List<Country>) session.getAttribute(
                        "data")) {%>
            <tr>
                <td><%= j++%></td>
                <td><%= elem.getId()%></td>
                <td><%= elem.getName()%></td>
                <td><%= elem.getRegion().getName()%></td>
                <td>
                    <a href="CountryServlet?action=update&id=<%= elem.getId()%>">Edit</a>
                    <a href="CountryServlet?action=delete&id=<%= elem.getId()%>">Hapus</a>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
    <% session.removeAttribute(
                "countryId"); %>
    <% session.removeAttribute(
                "countryName");%>
    <% session.removeAttribute(
                "countryRegion");%>
</html>
