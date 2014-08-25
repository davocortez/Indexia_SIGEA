<%-- 
    Document   : JspCrearGrupo
    Created on : 05-ago-2014, 18:29:19
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();
    int contador = 1;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSPAltaGrupos</title>
        <meta name="viewport" content="width=device-width intial-scale=1.0 "/>
        <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/Css/css_main.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
        <Link href=" <%=context%>/bootstrap/css/slimmenu.css" rel="stylesheet" type="text/css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <script src="<%=context%>/js/animate-table.js" type="text/javascript"></script>
        <script src="<%=context%>/js/Validar.js" type="text/javascript"></script>
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
                    </div>    </div>
            </div>
            <div class="row">
                <s:include value="/Jsp/Menu.jsp"></s:include>
                </div>
                <div class="row">
                    <div class="span12 ">
                        <fieldset class="span3">
                            <legend>Alta de Grupos</legend>
                            <form action="RegistrarGrupos">
                                <p>Grado</p>
                                <input type="number" name="grado"/>
                                <p>Letra</p>
                                <select name="grupo">
                                    <option>a</option>
                                    <option>b</option>
                                    <option>c</option>
                                    <option>d</option>
                                    <option>e</option>
                                    <option>f</option>
                                    <option>g</option>
                                    <option>h</option>
                                    <option>i</option>
                                    <option>j</option>
                                </select>
                                <p>Especialidad</p>
                                <select name="especialidad">
                                    <option>Sistemas Informaticos</option>
                                    <option>Redes y Telecomunicaciones</option>
                                    <option>Multimedia y Comercio Eléctronico</option>
                                </select>
                                <p>Turno</p>
                                <select name="turno">
                                    <option>Matutino</option>
                                    <option>Vespertino</option>
                                </select>
                                <button class="btn btn-primary">Guardar</button>
                            </form>
                        </fieldset>
                        <fieldset class="span7">
                            <legend>Consulta de Grupos</legend>
                            <table class="table" >
                                <thead>

                                <th class="span1">Cuatrimestre</th>
                                <th class="span2">Grupo</th>
                                <th class="span2">Turno</th>
                                </thead>
                            <s:iterator value="listaGrupos">
                                <tr class="span5">
                                    
                                    <td class="span1">
                                        <s:property value="cuatrimestre"/>
                                    </td>
                                    <td class="span2">
                                        <s:property value="grupo"/>
                                    </td>
                                    <td class="span1">
                                        <s:property value="turno"/>
                                    </td>
                                    
                                </tr>
                            </s:iterator>  
                        </table>
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
