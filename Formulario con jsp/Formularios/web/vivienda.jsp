<%-- 
    Document   : vivienda
    Created on : 4 oct. 2022, 21:28:01
    Author     : laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro de vivienda</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body>
        
        <div class="formulario">
        <h3>Registro de vivienda</h3> 
        
        <form name="vivienda" action="" method="POST">
            
            <label class="titulo">Seleccione el numero de pisos:</label><br/><br/>
            <input  id="1" type="radio" name="pisos" value="1" required>
            <label for="1">1 piso</label><br/><br/>
            <input  id="2" type="radio" name="pisos" value="2" required>
            <label for="2">2 pisos</label><br/><br/>
            <input  id="3" type="radio" name="pisos" value="3" required>
            <label for="3">3 pisos</label><br/><br/>
            <br/>
            <br/>
            
            <label class="titulo">Ingrese el precio:</label>
            <br/>
            <br/>
            <div class="no-spin">
            <input class="" type="number" name="precio" value="" required>
            </div>
            <br/>
            <br/>
            
            <label class="titulo">Seleccione el color de la fachada:</label><br/>            
            <br/>
            <input class="" type="color" name="color" value="" required>
            <br/>
            <br/>
            
            <label class="titulo">Selecciones los extras de la vivienda:</label> 
            <br/>
            <br/>
            <input class="" type="checkbox" id="piscina" name="piscina" value="" >
            <label for="piscina">Piscina</label><br/><br/>
            <input class="" type="checkbox" id="garaje" name="garaje" value="" >
            <label for="garaje">Garaje</label><br/><br/>
            <input class="" type="checkbox" id="jardin" name="jardin" value="" >
            <label for="jardin">Jardin</label><br/><br/>
            <br/>
            <br/>
            
            <label for="observaciones">Observaciones</label>
            <br/>
            <br/>
            <textarea id="observaciones" name="observaciones" rows="5" cols="42"></textarea>
            <br>
            <br>
            
            <input class="boton" type="submit" value="Login" name="login">
            <input class="boton" type="reset" value="Reset" name="reset">
            
        </form>
        
        <%
            String pisos = request.getParameter("pisos");
            String precio = request.getParameter("precio");
            String color = request.getParameter("color");
            String piscina = request.getParameter("piscina");
            String garaje = request.getParameter("garaje");
            String jardin = request.getParameter("jardin");
            String obs = request.getParameter("observaciones");
      
            
            if(pisos != null && precio != null && color != null && obs != null){
                out.print("El numero de pisos es: " + pisos + "<br>");
                out.print("El precio es: " + precio + "<br>");
                out.print("El codigo de color es: " + color + "<br>");
                
                out.print("Observaciones: " + obs + "<br>");
                
                if(piscina == null && garaje == null &&jardin == null ){
                out.print("La casa no tiene extras" + "<br>");
                } else {
                out.print("Las extras de la casa son: " + "<br>");
                
                if (jardin != null){
                out.print("Jardin" + "<br>");
                }
                if (garaje != null){
                out.print("Garaje" + "<br>");
                }
                if (piscina != null){
                out.print("Picina" + "<br>");
                }   
                
                }
            }
            

            
            
            
           

    
        %>
        
        </div>
    </body>
</html>
