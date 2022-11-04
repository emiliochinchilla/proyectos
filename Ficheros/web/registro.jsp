<%-- 
    Document   : index
    Created on : 18 oct. 2022, 18:35:20
    Author     : laboratorio
--%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto farmaceutico</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="header">
			<ul class="nav">
				<li><a href="">Inicio</a></li>
				<li><a href="">Servicios</a>
					<ul>
						<li><a href="">Submenu1</a></li>
						<li><a href="">Submenu2</a></li>
						<li><a href="">Submenu3</a></li>
						<li><a href="">Submenu4</a>
							<ul>
								<li><a href="">Submenu1</a></li>
								<li><a href="">Submenu2</a></li>
								<li><a href="">Submenu3</a></li>
								<li><a href="">Submenu4</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li><a href="">Acerca de</a>
					<ul>
						<li><a href="">Submenu1</a></li>
						<li><a href="">Submenu2</a></li>
						<li><a href="">Submenu3</a></li>
						<li><a href="">Submenu4</a></li>
					</ul>
				</li>
				<li><a href="">Contacto</a></li>
			</ul>
		</div>
        <br/>
        <br/>
        <h1>Registro de productos</h1>
        
        
        <form action="registro.jsp" name="producto" method="POST">
            <label class="titulo">Nombre del producto</label> 
            <input class="campo" type="text" name="nombre" value="" placeholder="Ingrese el nombre del producto" required>
            <br/>
            <br/>
            
            <label class="titulo">Código numérico</label>
            <input class="campo" type="number" name="codigo" value="" placeholder="Ingrese el código del producto" required>
            <br/>
            <br/>
            
            <label>Fecha de ingreso</label>
            <input type="date" name="fechaingreso" value="">
            <br/>
            <br/>
            
            <label class="titulo">Seleccione su proveedor</label>
            <select class="campo" name="proveedor" required>
                <option value="p1">P1</option>
                <option value="p2">P2</option>
                <option value="p3">P3</option>
            </select>
            <br/>
            <br/>
            
            <label class="titulo">Seleccione el tipo de producto</label>
            <select class="campo" name="tipoproducto" required>
                <option value="inyectable">Inyectable</option>
                <option value="topico">Uso tópico</option>
                <option value="oral">Oral</option>
            </select>
            <br/>
            <br/>
            
            <label class="titulo">Requerimientos adicionales:</label> 
            <br/>
            <br/>
            <input class="" type="checkbox"  name="refrigeracion" value="Necesita refrigeración" >
            <label for="refrigeracion">Necesita refrigeración</label><br/><br/>
            <input class="" type="checkbox"  name="receta" value="" >
            <label for="receta">Unicamente con receta médica</label><br/><br/>
            <br/>
            <br/>
            
            <label class="titulo">Cantidad a registrar</label>
            <input class="campo" type="number" name="cantidad" value="" placeholder="Ingrese la cantidad a registrar" required>
            <br/>
            <br/>
            
            <label class="titulo">Precio unitario</label>
            <input class="campo" type="number" name="precio" value="" placeholder="Ingrese el precio unitario" required>
            <br/>
            <br/>
            
            <label for="detalles">Detalles</label>
            <br/>
            <br/>
            <textarea id="detalles" name="detalles" rows="5" cols="42"></textarea>
            <br>
            <br>
            
            <input class="boton" type="submit" value="Registrar" name="registrar">
            <input class="boton" type="reset" value="Borrar" name="borrar">
            
        </form>
        
        <%
            FileWriter fichero = null;
            PrintWriter lapicero = null; 
            
            try{
            fichero = new FileWriter("C:\\Users\\laboratorio\\Desktop\\Ficheros\\Productos.txt", true);
            lapicero = new PrintWriter(fichero);
            
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
                lapicero.println(" *** Datos del producto ***");
                lapicero.println("El nombre del producto es: " + nombre + "<br>" + "<br>");
                lapicero.println("El codigo de producto es: " + codigo + "<br>" + "<br>");
                lapicero.println("La fecha en la que se ingresó el producto: " + fechaingreso + "<br>" + "<br>");
                lapicero.println("El proveedor es: " + proveedor + "<br>" + "<br>");
                lapicero.println("El tipo de producto es: " + tipoproducto + "<br>" + "<br>");
                lapicero.println("La cantidad de producto ingresado es: " + cantidad + "<br>" + "<br>");
                lapicero.println("El precio del producto por unidad es: " + precio + "<br>" + "<br>");
                lapicero.println("El precio total de los productos es: " + precio2*cantidad2 + "<br>" + "<br>");
                
                
                
                if(refrigeracion == null && receta == null){
                lapicero.println("El producto no tiene requerimientos especiales" + "<br>" + "<br>");
                lapicero.println("El precio total de los productos + IVA es: " + precio2*cantidad2*1.13 + "<br>" + "<br>");
                } else {
                lapicero.println("Los requerimientos del producto son: " + "<br>" + "<br>");
                
                if (receta != null){
                lapicero.println("**Requiere receta médica" + "<br>" + "<br>");
                }
                
                if (refrigeracion != null){
                lapicero.println("**Requiere refrigeración" + "<br>" + "<br>");
                lapicero.println("El precio total de los productos con costos de refrigeración es: " + precio2*cantidad2*1.07 + "<br>" + "<br>");
                lapicero.println("El precio total de los productos con costos de refrigeración + IVA es: " + precio2*cantidad2*1.07*1.13 + "<br>" + "<br>" + "<br>" + "<br>");
                }
                
                  
                
                }
                
                if(detalles == null){
                lapicero.println("No se incluyeron detalles adicionales" + "<br>");
                } else {
                lapicero.println("Los detalles adicionales del producto son: " + detalles);
                }
            }
            System.out.println("<script type='text/javascript'>alert('Datos guardados en el fichero');</script>");
            }catch(Exception ex){
            System.out.println("<script type='text/javascript'>alert('Error al guardar los datos');</script>");
            
            }
            finally{
            fichero.close();
            }
            

        %>
    </body>
</html>
