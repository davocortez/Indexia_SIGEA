<%-- 
    Document   : JspAsignarEspecialidad
    Created on : 22-ago-2014, 12:39:46
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JspAsignarEspecialidad</title>
        <meta name="viewport" content="width=device-width intial-scale=1.0 "/>
        <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/Css/css_main.css" rel="stylesheet" type="text/css" />
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
                    <div class="span12">
                        <form action="registrarEspecialidad">
                            <fieldset  class="span10">
                                <legend >Asignar Especialidad</legend>
                                <p>Nombre Profesor</p>
                            <s:select list="ListaNombreProfesores" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un profesor:" >
                            </s:select>
                            <p>Especialidad</p>
                            <select  name="descripcion">
                                <option>Programacion 1</option>
                                <option>Programacion 2</option>
                            </select>
                            <button class="btn btn-primary">Registrar</button>
                        </fieldset>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="hero-unit">

                </div>
            </div>
        </div>

    </body>
</html>
