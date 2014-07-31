<%-- 
    Document   : JspAsignarHorarios
    Created on : 11-jun-2014, 23:52:34
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSPAsignarHorarios</title>
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
                    </div>   </div>
            </div>
            <div class="row">
                <div class="span12 ">
                    <ul  class = "slimmenu" >
                        <li><a  href= "#" > Horarios </a>
                            <ul> 
                                <li><a  href="<%=context%>/Jsp/JspAsignarHorarios.jsp" > Asignar Horarios </a></li> 
                            </ul> 
                        </li>        
                        <li> 
                            <a  href= "#" > Tutores </a> 
                            <ul> 
                                <li><a  href= "<%=context%>/Jsp/JspAsignarGrupo.jsp"> Asignar Grupo </a></li> 
                                <li><a  href= "<%=context%>/Jsp/JspSeguimientoAlumnos.jsp"> Seguimiento de Alumnos </a> </li>
                                <li><a  href="<%=context%>/Jsp/JspGenerarReporte.jsp"  > Generar Reporte </a> </li> 
                            </ul> 
                        </li> 
                        <li><a  href="<%=context%>/Jsp/JspEntregarPortafolio.jsp">Entrega de Portafolios </a></li> 
                        <li><a  href="<%=context%>/Jsp/JspLogin.jsp">Cerrar Sesión</a></li>
                    </ul>
                </div>
            </div> 
            <script src="<%=context%>/bootstrap/js/jquery.slimmenu.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
            <script type="text/javascript"src="<%=context%>/Js/Validaciones.js"></script>
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

                </div>

            </div>
            <div class="row">
                <div class="hero-unit">
                    <s:form action="consultaProfe" id="formulario">
                        <s:select list="listaMaterias" label="Lista Materia" 
                                  listKey="idEspecialidad" listValue="descripcion" name="listaMate" 
                                  onchange="valCombo();" id="listaMate"/> 
                    </s:form>                

                    <s:if  test="listaProfesor==null">
                        <s:select list="listaProfesor" label="Lista Materia" 
                                  listKey="idProfesor" listValue="nomCompleto" name="listaProfe" 
                                  id="listaProfe"/>                       
                    </s:if>
                    <s:else>
                        <s:select list="listaProfesor" label="Lista Materia" 
                                  listKey="idProfesor" listValue="nomCompleto" name="listaProfe" 
                                  id="listaProfe"/> 
                    </s:else>

                </div>
            </div>
        </div>
    </body>
</html>

