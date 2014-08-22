<%-- 
    Document   : AsdignarTutores
    Created on : 22-ago-2014, 16:06:31
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%--<%@taglib  prefix="s" uri="/struts-tags" %>--%>
<%--<%@taglib uri="/struts-tags" prefix="s" %>--%>
 
<!DOCTYPE html>
<html>
    <head>
       <title>JspAsignarTutores</title>
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
                     </div>    </div>
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
                                
                                <li><s:a action="consultaTutores">Asignar Tutor</s:a>
                                    </li> 
                                
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
                    easingEffect:'easeInOutQuint',
                    animSpeed:'medium',
                    indentChildren: true,
                    childrenIndenter: '&raquo;'
                   });
            </script>
                
                <div class="row">
                       <div class="span121 ">
                           <legend>Asignar Tutores</legend>
                           <fieldset id="tutores">
                                 
                               <form action="RegistrarAsesores">
                                   <table id="asignarTutores">
                                       <tr>
                                           <td>Profesor</td>
                                           <td>

                                               <s:select list="ListaNombreProfesores" name="idProfesor" listKey="idProfesor" listValue="nombreProfesor" headerKey="0" headerValue="Seleccione un profesor:">

                                               </s:select> 
                                           </td>
                                           <td>Grupo</td>
                                           <td>
                                               <s:select list="ListadeGrados" name="idGrupo" listKey="idGrupo" listValue="%{Cuatrimestre + Grupo}" headerKey="0" headerValue="Selecciona  un  grupo:">

                                               </s:select> 
                                           </td>
                                       </tr>

                                       <tr>
                                           <td></td>
                                           <td><button>Guardar</button></td>
                                       </tr>
                                   </table>
                                   <table id="guardarTutores">
                                       <tr>
                                           <td id="nombreTutor">Nombre</td>
                                           <td id="cuatrimestre">Cuatrimestre</td>
                                           <td id="grupo">Grupo</td>
                                       </tr>
                                       <tr>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       </tr>
                                       <tr>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       </tr>
                                       <tr>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       <td id="datosTutores">
                                       </td>
                                       </tr>
                                           
                                   </table>
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
