<%-- 
    Document   : registro
    Created on : 4 oct. 2022, 20:56:00
    Author     : laboratorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ingreso de usuarios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles.css"/>
    </head>
    <body>
        
        <div class="formulario">
        <h3>Ingreso de usuarios</h3> 
        
        <form name="login" action="" method="POST">
            
            <label class="titulo">Nombre</label> 
            <input class="campo" type="text" name="nombre" value="" placeholder="Ingrese su nombre" required>
            <br/>
            <br/>
            
            <label class="titulo">Cédula</label>
            <div class="no-spin">
            <input class="campo" type="number" name="cedula" value="" placeholder="Ingrese su cédula" required>
            </div>
            <br/>
            <br/>
            
            <label class="titulo">Fecha de nacimiento</label> 
            <input class="campo" type="date" name="edad" value="" required>
            <br/>
            <br/>
            
            <label class="titulo">Seleccione su perfil de usuario</label>
            <select class="campo" id="perfil" name="perfil" required>
                <option value="administrador">Administrador</option>
                <option value="supervisor">Supervisor</option>
                <option value="consultor">Consultor</option>
            </select>
            <br/>
            <br/>
            
            
            <label class="titulo">Correo electrónico</label>            
            <input class="campo" type="email" name="email" value="" placeholder="Ingrese su email" required>
            <br/>
            <br/>
            
            <label class="titulo">Usuario</label> 
            <input class="campo" type="text" name="usuario" value="" placeholder="Usuario" required>
            <br/>
            <br/>
            
            <label class="titulo">Digite su contraseña</label> 
            <input class="campo" type="password" name="pass" value="" placeholder="Contraseña" required>
            <br>
            <br>
            <input class="boton" type="submit" value="Login" name="login">
            <input class="boton" type="reset" value="Reset" name="reset">
        </form>
        
        <%
            String nombre = request.getParameter("nombre");
            String cedula = request.getParameter("cedula");
            String edad = request.getParameter("edad");
            String perfil = request.getParameter("perfil");
            String email = request.getParameter("email");
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            

            out.print("La cedula es: " + cedula + "<br>");
            out.print("La edad es: " + edad + "<br>");
            out.print("El perfil es: " + perfil + "<br>");
            out.print("La email es: " + email + "<br>");
            out.print("El usuario es: " + usuario + "<br>");
            out.print("El password es: " + pass);
            
            
           

    
        %>

        </div>
    </body>
</html>
