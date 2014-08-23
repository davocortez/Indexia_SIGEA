<%-- 
    Document   : Menu
    Created on : 22-ago-2014, 18:35:11
    Author     : Feer
--%>
<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width intial-scale=1.0 "
              <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
        <Link href=" <%=context%>/bootstrap/css/slimmenu.css" rel="stylesheet" type="text/css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <script src="<%=context%>/bootstrap/js/jquery.slimmenu.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    </head>
    <body>
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

                        <s:url id="consultaTutores" action="consultaTutores">                                    
                        </s:url>
                        <li><s:a href="%{consultaTutores}" >Asignar Tutor</s:a></li>                                 
                        <li><a  href= "<%=context%>/Jsp/JspSeguimientodeAlumnos.jsp"> Seguimiento de Alumnos </a> </li>

                        <li><a  href="<%=context%>/Jsp/JspGenerarReporte.jsp"  > Generar Reporte </a> </li> 
                    </ul> 
                </li> 
                <li>
                    <a href="">Profesores</a>
                    <ul>
                        <li><a  href="<%=context%>/Jsp/JspAltaProfesores.jsp">Registrar Profesor</a></li> 
                        <li><a href="<%=context%>/Jsp/JspAsignarEspecialidad.jsp">Asignar Especialidad</a><li>
                            <s:url id="consultarProfesoresPortafolio" action="consultarProfesoresPortafolio">
                            </s:url>
                        <li><s:a href="%{consultarProfesoresPortafolio}">Entrega de Portafolios </s:a></li>  
                        </ul>
                    </li>
                    <li><a  href="<%=context%>/Jsp/JspLogin.jsp">Cerrar Sesión</a></li>
            </ul>
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
    </body>
</html>