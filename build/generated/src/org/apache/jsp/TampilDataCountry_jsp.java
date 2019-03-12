package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Region;
import java.util.List;
import models.Country;

public final class TampilDataCountry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Tampil Data Country</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor='#FFFAF0'>\r\n");
      out.write("        <table align='center' size='+4'> \r\n");
      out.write("             <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\" >TAMPIL DATA COUNTRY</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead> </table>\r\n");
      out.write("        <form action=\"CountryServlet\" method=\"POST\">\r\n");
      out.write("            <table cellspacing='50' align ='center' border=\"2\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"4\">Insert Country</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Id</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"countryId\" value=\"");
 if (session.getAttribute("countryId") != null) {
                                out.print(session.getAttribute("countryId"));
                            }   
      out.write("\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Name</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"countryName\" value=\"");
 if (session.getAttribute("countryName") != null) {
                                out.print(session.getAttribute("countryName"));
                            }   
      out.write("\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Region</td>\r\n");
      out.write("                        <td><select name=\"countryRegion\" >\r\n");
      out.write("                                ");
 for (Region elem : (List<Region>) session.getAttribute("regiondata")) {
                                        if (elem.getId().equals(session.getAttribute("countryRegion"))) {
                                
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print( elem.getId());
      out.write("\" selected>");
      out.print( elem.getName());
      out.write("</option>");
} else {
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print( elem.getId());
      out.write('"');
      out.write('>');
      out.print( elem.getName());
      out.write("</option>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                            </select></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\" align='center' ><input type=\"submit\" value=\"Save\" name=\"save\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <table cellspacing='30' align='center' border='1'>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>No.</th>\r\n");
      out.write("                <th>Id</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Region</th>\r\n");
      out.write("                <th>Aksi</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 int j = 1;
                for (Country elem : (List<Country>) session.getAttribute("data")) {
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( j++);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( elem.getId());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( elem.getName());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( elem.getRegion().getName());
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"CountryServlet?action=update&id=");
      out.print( elem.getId());
      out.write("\">Edit</a>\r\n");
      out.write("                    <a href=\"CountryServlet?action=delete&id=");
      out.print( elem.getId());
      out.write("\">Hapus</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("    ");
 session.removeAttribute(
                "countryId"); 
      out.write("\r\n");
      out.write("    ");
 session.removeAttribute(
                "countryName");
      out.write("\r\n");
      out.write("    ");
 session.removeAttribute(
                "countryRegion");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
