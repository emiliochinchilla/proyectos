/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ulatina.FormularioServlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Familia
 */
@WebServlet(name = "ValidarVivienda", urlPatterns = {"/ValidarVivienda"})
public class ValidarVivienda extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String pisos = request.getParameter("pisos");
            String precio = request.getParameter("precio");
            String color = request.getParameter("color");
            String piscina = request.getParameter("piscina");
            String garaje = request.getParameter("garaje");
            String jardin = request.getParameter("jardin");
            String observaciones = request.getParameter("observaciones");
            String extras = "";
            
            if(piscina == null && garaje == null &&jardin == null ){
                extras = "La vivienda no tiene extras";
                } else {
                out.print("Las extras de la casa son: " + "<br>");
                extras = "Las extras de la casa son: <br>";
                if (jardin != null){
                extras = extras + "Jardin <br>";
                }
                if (garaje != null){
                extras = extras + "Garaje <br>";
                }
                if (piscina != null){
                extras = extras + "Piscina <br>";
                }   
                
                }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidarVivienda</title>");    
            out.println("<link rel=\"stylesheet\" href=\"styles.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resumen de la vivienda ingresada " + "</h1></br>"
                    + "<div class=\"form\">Cantidad de pisos: " + pisos + "</br>"
                    + "Precio: " + precio + "</br>"
                    + "Color de la vivienda: " + color + "</br>"
                    + "Observaciones adicionales: " + observaciones + "</br>"
                            + extras + "</div>" );
               
 
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
