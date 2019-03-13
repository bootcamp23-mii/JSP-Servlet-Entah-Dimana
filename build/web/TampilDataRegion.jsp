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
<html>
    <body>
        <a class="btn btn-success" data-target="#modalRegion" data-toggle="modal">Test Modal</a>
        <a class="btn btn-success" data-target="#modalRegion" data-toggle="modal">Delete</a>
        <!--Show form-->
        <!--<form action="RegionServlet" method="POST">
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
        </form>-->
        <!--end of show form-->

        <!--show modal form-->
        <div class="modal fade" id="modalRegion" tabindex="-1" role="dialog" 
             aria-labelledby="myModalLabel" aria-hidden="true">
            <form action="RegionServlet" method="POST">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header text-center">
                            <h3 class="modal-title">Region CRUD</h3>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body mx-3">
                            <div class="md-form my-5">
                                <label data-error="wrong" data-success="true">ID</label>
                                <input type="text" name="regionId" id="id-r" class="form-control" value="<% if (session.getAttribute("regionId") != null) {
                                        out.print(session.getAttribute("regionId"));
                                    }   %>">
                            </div>
                            <div class="md-form my-5">
                                <label data-error="wrong" data-success="true">NAMA</label>
                                <input type="text" name="regionName" id="name-r" class="form-control" value="<% if (session.getAttribute("regionName") != null) {
                                        out.print(session.getAttribute("regionName"));
                                    }   %>">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="submit" value="Save" name="save" />
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <!--end of show modal form-->

        <!--show table list-->
        <table class="table table-striped" cellspacing='30' align ='center' border="1">
            <tr class="active">
                <th>No.</th>
                <th>Id</th>
                <th>Name</th>
                <th>Aksi</th>
            </tr>
            <% int i = 1;
                if (session.getAttribute("data") != null) {
                    for (Region elem : (List<Region>) session.getAttribute("data")) {%>
            <tr>
                <td><%= i++%></td>
                <td><%= elem.getId()%></td>
                <td><%= elem.getName()%></td>
                <td>
        <!--            <a class="btn btn-success" data-target="#modalRegion" data-toggle="modal" data-getid="<%= elem.getId()%>" data-getname="<%= elem.getName()%>"> <%
            if (session.getAttribute("regionId") != null) {
                if (session.getAttribute("regionId").equals(elem.getId())) {
                    // out.print("checked");
                } else {
                    //                        out.print("edit");
                }
            } else {
                //                    out.print("edit");
            }%></a>-->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalRegion" 
                            data-getid="<%= elem.getId()%>" data-getname="<%= elem.getName()%>">Edit</button>
                    <a class="btn btn-danger" href="RegionServlet?action=delete&id=<%= elem.getId()%>"><%
                        if (session.getAttribute("regionId") != null) {
                            if (session.getAttribute("regionId").equals(elem.getId())) {
                                out.print("checked");
                            } else {
                                out.print("Hapus");
                            }
                        } else {
                            out.print("Hapus");
                        }%></a>
                </td>
            </tr>
            <%}
                } else {
                    response.sendRedirect("./RegionServlet");
                }%>
        </table>
        <!--end of show table list-->

        <!--set modal js-->
        <script>
            $('#modalRegion').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget)
                var id = button.data('getid')
                var name = button.data('getname')
                var modal = $(this)
                modal.find('#id-r').val(id)
                modal.find('#name-r').val(name)
            })
        </script>
        <!--end of set modal js-->
    </body>
</html>
<jsp:include page="footer.jsp" />