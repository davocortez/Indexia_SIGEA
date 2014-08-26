<%-- 
    Document   : JspAsignarGrupo
    Created on : 12-jun-2014, 0:08:04
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSPAsignarGrupo</title>
        <meta name="viewport" content="width=device-width intial-scale=1.0 "/>
        <link href="<%=context%>/Css/css_main.css" rel="stylesheet" type="text/css" />
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
                    <div class="span12 ">
                        <fieldset class="span10">
                            <legend>Consulta de Materias</legend>
                            <table id="tablaNormal">
                                <thead>
                                <th class="span3">Materia</th>
                                <th class="span2">Horas</th>
                                <th class="span1">Profesor</th>
                                </thead>
                            <s:iterator value="listaMaterias">
                                <tr>
                                    <td class="span3">
                                        <s:property value="nombreMateria" />
                                    </td>
                                    <td class="span1">
                                        <s:property value="horas" />
                                    </td>
                                    <td class="">
                                        <s:select list="listaProfesores" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                                  headerKey="0" headerValue="Seleccione un profesor:" id="alinearSeleccionar"></s:select>
                                        </td>
                                    </tr>
                            </s:iterator>
                        </table>
                    </fieldset>
                </div>
            </div>
        </div> 
    </div>

</body>
</html>
