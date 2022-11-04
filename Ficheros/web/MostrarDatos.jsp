<%-- 
    Document   : MostrarDatos
    Created on : 18 oct. 2022, 21:33:29
    Author     : laboratorio
--%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page import="java.io.BufferedReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos almacenados!</h1>
        <%!
        String datos = "";

        %>
        
        <%
        File archivo = null;//tienen que estar en este orden porque dependen entre ellos
        FileReader lentes = null;
        BufferedReader lector = null;
        String datos = "";
        
        
        try{
            archivo = new File ("C:\\Users\\Emili\\Desktop\\Progra3\\Ficheros\\Productos.txt");
            lentes = new FileReader(archivo);
            lector = new BufferedReader(lentes);
            
            while(lector.read() > 0){
                datos+= lector.readLine();
                datos+= "<br>";
                datos.toString();
            }
            System.out.println("***Datos***");
            System.out.println(datos);
        }catch(Exception ex){
        
        }finally{
        lector.close();
            }

        %>
        <%=
         datos

        %>
    </body>
</html>
