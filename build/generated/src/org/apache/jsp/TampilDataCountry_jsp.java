package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tampil Data Country</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tampil Data</h1><form action=\"CountryServlet\" method=\"POST\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">Insert Country</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Id</td>\n");
      out.write("                        <td><input type=\"text\" name=\"countryId\" value=\"");
 if (session.getAttribute("countryId") != null) {
                                out.print(session.getAttribute("countryId"));
                            }   
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"countryName\" value=\"");
 if (session.getAttribute("countryName") != null) {
                                out.print(session.getAttribute("countryName"));
                            }   
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Region</td>\n");
      out.write("                        <td><select name=\"countryRegion\">\n");
      out.write("                                ");
 for (Country elem : (List<Country>) session.getAttribute("data")) {
                                        if (elem.getId().equals(session.getAttribute("countryRegion"))) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( session.getAttribute("countryRegion"));
      out.write("\" selected>");
      out.print( session.getAttribute("countryRegion"));
      out.write("</option>\n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( session.getAttribute("countryRegion"));
      out.write('"');
      out.write('>');
      out.print( session.getAttribute("countryRegion"));
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" value=\"Save\" name=\"save\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>No.</th>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Region</th>\n");
      out.write("                <th>Aksi</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 int j = 1;
                for (Country elem : (List<Country>) session.getAttribute("data")) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( j++);
      out.write("</td>\n");
      out.write("                <td>");
      out.print( elem.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( elem.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( elem.getRegion().getName());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"CountryServlet?action=update&id=");
      out.print( elem.getId());
      out.write("\">Edit</a>\n");
      out.write("                    <a href=\"CountryServlet?action=delete&id=");
      out.print( elem.getId());
      out.write("\">Hapus</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("    ");
 session.removeAttribute(
                "CountryId"); 
      out.write("\n");
      out.write("    ");
 session.removeAttribute(
                "CountryName");
      out.write("\n");
      out.write("</html>\n");
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
