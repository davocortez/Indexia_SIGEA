<%-- 
    Document   : JspAltaProfesores
    Created on : 21-ago-2014, 4:03:13
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSPEntregaPortafolio</title>
        <meta name="viewport" content="width=device-width intial-scale=1.0 "

              <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
        <Link href=" <%=context%>/bootstrap/css/slimmenu.css" rel="stylesheet" type="text/css">

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <script src="bootstrap/js/bootstrap.js"></script>

        <div class="container">
            <div class="row">
                <div class="hero-unit">
                    <img src="<%=context%>/Img/logoempresa.png" name="logoempresa" class="alinear"/>
                    <img src="<%=context%>/Img/logoutez.png" name="Utez" class="alinearlOgoUtez"/>
                    <div class="alinearnombresistema">
                        SIGEA
                    </div>
                    <div class="alinearnombresistema1">
                        Sistema de Gestion Academica
                    </div>              
                </div>
            </div>
            <div class="row">
                 <s:include value="/Jsp/Menu.jsp"></s:include>

            </div>
            <div class="row">
                <div class="span121">


                    <fieldset id="fieldsetProfesor">
                        <legend>Registrar Profesor</legend>
                        <form action="accionInsertar">
                            <table id="registrarProfesor">
                                <tr>
                                    <td>Nombre Profesor</td><td><input type="text" id="nombreProfesor" name="nombre"/></td>  

                                </tr> 
                                <tr>
                                    <td>Apellido Paterno</td><td><input type="text" id="apellidoPaterno" name="apePaterno" /></td>
                                </tr>
                                <tr>
                                    <td>Apellido Materno</td><td> <input type="text" id="apellidoMaterno" name="apeMaterno"/></td>
                                </tr>
                                <tr>
                                    <td>Tipo Profesor</td><td><input type="text" id="tipoProfesor" name="disponibilidad"/></td>
                                </tr>
                            </table>
                            <button class="botonRegistrarAlumno">Registrar</button>
                        </form>
                    </fieldset>
                </div>

            </div>
            <div class="row">
                <div class="hero-unit">

                </div>
            </div>
        </div>

    </body>
</html>


