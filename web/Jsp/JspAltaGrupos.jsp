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
        <meta name="viewport" content="width=device-width intial-scale=1.0 "
              <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
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
                    </div>
                </div>
            </div>
            <div class="row">
                <s:include value="/Jsp/Menu.jsp"></s:include>

            </div>
            <div class="row">
                <div class="span121 ">
                    <table class="table footable" data-page-size="20" data-filter="#filter" id="table-animate">
                        <thead>
                        <th>No.</th>
                        <th>Grado</th>
                        <th>Grupo</th>
                        <th data-hide="phone,tablet,pc">Turno</th>
                        <th data-hide="phone,tablet,pc">Estado</th>    
                        </thead>
                        <tbody>
                        <tbody>
                            <s:if test="%{listaGrupos.size()>0}">
                                 <s:form action="">
                                <s:iterator value="listaGrupos" >
                                   
                                        <tr class="tr">
                                            <td><%=contador%></td>
                                            <td><s:property value="Grupo"/></td>
                                            <td><s:property value="Descripcion"/></td>
                                            <td><s:property value="Turno"/></td>
                                            <td><s:url id ="altaGrupo" action="%{AltaGrupo}%"></s:url></td>                                                 
                                                <%contador++;%>
                                        </tr>                                                                          
                                </s:iterator>
                                <s:submit value="Enviar"/>
                                 </s:form>
                            </s:if>  
                            <s:else>
                                <s:iterator value="listaBaja" >
                                    <s:form>
                                        <tr class="tr">
                                            <td><%=contador%></td>
                                            <td><s:property value="Grupo"/></td>
                                            <td><s:property value="Descripcion"/></td>
                                            <td><s:property value="Turno"/></td> 
                                            <td>Asignar</td>
                                            <%contador++;%>
                                        </tr>
                                    </s:form>
                                </s:iterator>
                            </s:else>
                        </tbody>
                        <tfoot>
                            <tr>
                                <td colspan="6">
                                    <div class="pagination pagination-centered"></div>
                                </td>
                            </tr>
                        </tfoot>
                    </table>
                    <input type="button" value="Enviar" onclick="valCheckbox();">
                </div>
            </div>
            <div class="row">
                <div class="hero-unit">
                </div>
            </div>
        </div>

    </body>
</html>
