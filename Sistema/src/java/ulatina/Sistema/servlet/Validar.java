/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ulatina.Sistema.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author laboratorio
 */
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {

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
            String codigo = request.getParameter("codigo");
            String marca = request.getParameter("marca");
            String precio = request.getParameter("precio");
            String proveedor = request.getParameter("proveedor");
            String cantidad = request.getParameter("cantidad");
            double precio2 = Double.parseDouble(precio);
            double cantidad2 = Double.parseDouble(cantidad);
            double impuesto = 350;
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido " + "</h1>");
            out.println("<p>El codigo del producto es: " + codigo + "</p>");
            out.println("<p>La marca del producto es: " + marca + "</p>");
            out.println("<p>El precio del producto es: " + precio + "</p>");
            out.println("<p>El proveedor del producto es: " + proveedor + "</p>");
            out.println("<p>La cantidad del producto es: " + cantidad + "</p></br></br>");
            switch (proveedor) {
                case "Z1":
                    out.println("<p> El precio total del producto es: " + cantidad2*precio2*1.13*0.9 + "</p></br></br>");
                    break;
                case "Z2":
                    out.println("<p> El precio total del producto es: " + cantidad2*precio2*1.13*1.03 + "</p></br></br>");
                    break;
                default:
                    out.println("<p> El precio total del producto es: " + (cantidad2*precio2*1.13+ impuesto) + "</p></br></br>");
                    break;
            }
            
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
