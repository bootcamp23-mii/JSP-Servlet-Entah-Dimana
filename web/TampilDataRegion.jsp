<%-- 
    Document   : TampilDataRegion
    Created on : Mar 11, 2019, 2:42:09 PM
    Author     : AdhityaWP
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="models.Region"%>
<%@page import="java.util.List"%>
<%@page import="controllers.RegionController"%>
<%@page import="controllers.RegionControllerInterface"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tampil data Region</title>
    </head>
    <body>
        <h1>Tampil Data</h1><form action="RegionServlet" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="2">Insert Region</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Id</td>
                        <td><input type="text" name="regionId" value="<% if(session.getAttribute("regionId")!=null) out.print(session.getAttribute("regionId"));   %>" /></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="regionName" value="<% if(session.getAttribute("regionName")!=null) out.print(session.getAttribute("regionName"));   %>" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Save" name="save" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

        <table>
            <tr>
                <th>No.</th>
                <th>Id</th>
                <th>Name</th>
                <th>Aksi</th>
            </tr>
            <% int i = 1;
                for (Region elem : (List<Region>) session.getAttribute("data")) {%>
            <tr>
                <td><%= i++%></td>
                <td><%= elem.getId()%></td>
                <td><%= elem.getName()%></td>
                <td>
                    <a href="RegionServlet?action=update&id=<%= elem.getId()%>">Edit</a>
                    <a href="RegionServlet?action=delete&id=<%= elem.getId()%>">Hapus</a>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
    
    <% session.removeAttribute("regionId"); %>
    <% session.removeAttribute("regionName"); %>
</html>
