<%-- 
    Document   : Jsp1erCuatri
    Created on : 21-ago-2014, 10:38:11
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
        <title>JSP1erCuatri</title>
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

        <script type="text/javascript" charset="utf-8">

            < script src = "<%=context%>/media/js/jquery.js" type = "text/javascript" ></script>
        <script src="<%=context%>/media/js/jquery.dataTables.js" type="text/javascript" ></script>
        <link rel="stylesheet"media="all" href="<%=context%>/media/css/mics.css"/>



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
                                <li><a  href= "<%=context%>/Jsp/JspAsignarTutores.jsp"> Asignar Tutor </a></li> 
                                <li><a  href= "<%=context%>/Jsp/JspSeguimientodeAlumnos.jsp"> Seguimiento de Alumnos </a> </li>
                                <li><a  href="<%=context%>/Jsp/JspGenerarReporte.jsp"  > Generar Reporte </a> </li> 
                            </ul> 
                        </li> 
                        <li>
                            <a href="">Profesores</a>
                            <ul>
                                <li><a  href="<%=context%>/Jsp/JspAltaProfesores.jsp">Registrar Profesor</a></li> 
                                <li><a href="<%=context%>/Jsp/JspAsignarEspecialidad.jsp">Asignar Especialidad<li></a>
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
                    <label id="label1erCuatri">1er Cuatrimestre</label>
                    <table id="datos1Cuatri">
                        <tr>
                            <td id="no">No</td>
                            <td id="materia">Materias</td>
                            <td id="profesor">Profesor</td>
                            <td id="hora">Horas</td>    
                        </tr>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Desarrollo de Habilidades</td>
                            <td id="datos"><s:select list="listaDesarrollo" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                           headerKey="0" headerValue="Seleccione un Profesor" id="combo1"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Soporte Técnico</td>
                            <td id="datos"><s:select list="listaSoporte" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor"id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Metodología de la Programación</td>
                            <td id="datos"><s:select list="listaMetodologia" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos">7</td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Expresión Oral y Escrita I</td>
                            <td id="datos"><s:select list="listaExprecion" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Ofimática</td>
                            <td id="datos"><s:select list="listaOfimatica" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Fundamentos de Redes</td>
                            <td id="datos"><s:select list="listaFundamentos" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Inglés I</td>
                            <td id="datos"><s:select list="listaIngles" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>
                        <tr>
                            <td id="datos"><%=contador%></td>
                            <td id="datos">Formación Sociocultural I</td>
                            <td id="datos"><s:select list="listaFormacion" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" 
                                      headerKey="0" headerValue="Seleccione un Profesor" id="combo2"/></td>
                            <td id="datos"></td>    
                        </tr>
                        <%=contador++%>                        
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="hero-unit">
                </div>
            </div>
        </div>

    </body>
</html>
