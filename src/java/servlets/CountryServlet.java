/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.CountryController;
import controllers.CountryControllerInterface;
import controllers.RegionController;
import controllers.RegionControllerInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Country;
import models.Region;
import tools.HibernateUtil;

/**
 *
 * @author AdhityaWP
 */
@WebServlet(name = "CountryServlet", urlPatterns = {"/CountryServlet"})
public class CountryServlet extends HttpServlet {

    CountryControllerInterface cc = new CountryController(HibernateUtil.getSessionFactory());
    RegionControllerInterface rc = new RegionController(HibernateUtil.getSessionFactory());
    List<Country> data = null;
    List<Region> regiondata = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            data = cc.getAll();
            regiondata = rc.getAll();
            request.getSession().setAttribute("data", data);
            request.getSession().setAttribute("regiondata", regiondata);
            response.sendRedirect("TampilDataCountry.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("delete")) {
                cc.delete(request.getParameter("id"));
            } else if (action.equalsIgnoreCase("update")) {
                Country country = cc.getById(request.getParameter("id"));
                request.getSession().setAttribute("countryId", country.getId());
                request.getSession().setAttribute("countryName", country.getName());
                request.getSession().setAttribute("countryRegion", country.getRegion().getId());
            }
        }
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (cc.save(request.getParameter("countryId"), request.getParameter("countryName"), request.getParameter("countryRegion")) != null) {
            processRequest(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
