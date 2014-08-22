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
                <div class="span12 ">
                    <ul  class = "slimmenu" >
                        <li><a href="<%=context%>/Jsp/JspAltaGrupos.jsp"> Grupos </a>                                                        
                            <ul> 
                                <li><a  href="<%=context%>/Jsp/JspAltaGrupos.jsp" > Alta Grupos </a></li> 
                            </ul> 
                        </li>        
                        <li> 
                            <a  href= "#" > Tutores </a> 
                            <ul> 
                                <li><a  href= "<%=context%>/Jsp/JspAsignarGrupo.jsp"> Asignar Grupo </a></li> 
                                <li><a  href= "<%=context%>/Jsp/JspSeguimientodeAlumnos.jsp"> Seguimiento de Alumnos </a> </li>
                                <li><a  href="<%=context%>/Jsp/JspGenerarReporte.jsp"  > Generar Reporte </a> </li> 
                            </ul> 
                        </li> 
                        <li>
                            <a href="">Profesores</a>
                            <ul>
                                <li><a  href="<%=context%>/Jsp/JspAltaProfesores.jsp">Registrar Profesor</a></li> 
                                <li><a  href="<%=context%>/Jsp/JspEntregarPortafolio.jsp">Entrega de Portafolios </a></li> 
                            </ul>
                        </li>
                       
                        <li><a  href="<%=context%>/Jsp/JspLogin.jsp">Cerrar Sesión</a></li>
                        
                    </ul>
                </div>
            </div> 
            <script src="<%=context%>/bootstrap/js/jquery.slimmenu.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
            <script type="text/javascript">
                $('ul.slimmenu').slimmenu(
                        {
                            resizeWidth: '800',
                            collapserTitle: 'Menu',
                            easingEffect: 'easeInOutQuint',
                            animSpeed: 'medium',
                            indentChildren: true,
                            childrenIndenter: '&raquo;'
                        });
            </script>

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
                                            <td><input name="chk" type="checkbox"/></td>                                                                              
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
