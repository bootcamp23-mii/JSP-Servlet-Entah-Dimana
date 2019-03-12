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
<jsp:include page="header.jsp" />
<body bgcolor='#F0FFFF'> 
    <table align='center' size='+4'> 
        <thead>
            <tr>
                <th colspan="2" >TAMPIL DATA REGION</th>
            </tr>
        </thead> </table>
    <form action="RegionServlet" method="POST">
        <table class="table table-striped" cellspacing='50' align ='center' border="2">
            <thead>
                <tr>
                    <th class="active" colspan="2">Insert Region</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Id</td>
                    <td><input type="text" name="regionId" value="<% if (session.getAttribute("regionId") != null) {
                            out.print(session.getAttribute("regionId"));
                        }   %>" /></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="regionName" value="<% if (session.getAttribute("regionName") != null) {
                            out.print(session.getAttribute("regionName"));
                        }   %>" /></td>
                </tr>
                <tr>
                    <td colspan="2" align='center'><input type="submit" value="Save" name="save" /></td>
                </tr>
            </tbody>
        </table>
    </form>

    <table class="table table-striped" cellspacing='30' align ='center' border="1">
        <tr class="active">
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
                <a class="btn btn-success" href="RegionServlet?action=update&id=<%= elem.getId()%>">Edit</a>
                <a class="btn btn-danger" href="RegionServlet?action=delete&id=<%= elem.getId()%>">Hapus</a>
            </td>
        </tr>
        <%}%>
    </table>
</body>
<% session.removeAttribute("regionId"); %>
<% session.removeAttribute("regionName");%>
<jsp:include page="footer.jsp" />