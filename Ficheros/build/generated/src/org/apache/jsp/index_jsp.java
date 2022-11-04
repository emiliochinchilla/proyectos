package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Producto farmaceutico</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>Registro de productos</h1>\n");
      out.write("        ");

            FileWriter fichero = null;
            PrintWriter lapicero = null; 
            
            String nombre = request.getParameter("nombre");
            String codigo = request.getParameter("codigo");
            String fechaingreso = request.getParameter("fechaingreso");
            String proveedor = request.getParameter("proveedor");
            String tipoproducto = request.getParameter("tipoproducto");
            String refrigeracion = request.getParameter("refrigeracion");
            String receta = request.getParameter("receta");
            String cantidad = request.getParameter("cantidad");
            int cantidad2 = Integer.parseInt(cantidad);
            String precio = request.getParameter("precio");
            int precio2 = Integer.parseInt(precio);
            String detalles = request.getParameter("detalles");
      
            
            if(nombre != null && codigo != null && fechaingreso != null && proveedor != null && tipoproducto != null && proveedor != null && cantidad != null && precio != null){
                out.print("El nombre del producto es: " + nombre + "<br>" + "<br>");
                out.print("El codigo de producto es: " + codigo + "<br>" + "<br>");
                out.print("La fecha en la que se ingresó el producto: " + fechaingreso + "<br>" + "<br>");
                out.print("El proveedor es: " + proveedor + "<br>" + "<br>");
                out.print("El tipo de producto es: " + tipoproducto + "<br>" + "<br>");
                out.print("La cantidad de producto ingresado es: " + cantidad + "<br>" + "<br>");
                out.print("El precio del producto por unidad es: " + precio + "<br>" + "<br>");
                out.print("El precio total de los productos es: " + precio2*cantidad2 + "<br>" + "<br>");
                
                
                
                if(refrigeracion == null && receta == null){
                out.print("El producto no tiene requerimientos especiales" + "<br>" + "<br>");
                out.print("El precio total de los productos + IVA es: " + precio2*cantidad2*1.13 + "<br>" + "<br>");
                } else {
                out.print("Los requerimientos del producto son: " + "<br>" + "<br>");
                
                if (receta != null){
                out.print("**Requiere receta médica" + "<br>" + "<br>");
                }
                
                if (refrigeracion != null){
                out.print("**Requiere refrigeración" + "<br>" + "<br>");
                out.print("El precio total de los productos con costos de refrigeración es: " + precio2*cantidad2*1.07 + "<br>" + "<br>");
                out.print("El precio total de los productos con costos de refrigeración + IVA es: " + precio2*cantidad2*1.07*1.13 + "<br>" + "<br>" + "<br>" + "<br>");
                }
                
                  
                
                }
                
                if(detalles == null){
                out.print("No se incluyeron detalles adicionales" + "<br>");
                } else {
                out.print("Los detalles adicionales del producto son: " + detalles);
                

                
                  
                
                }
            }
            

            
            
            
           

    
        
      out.write("\n");
      out.write("    </body>\n");
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
