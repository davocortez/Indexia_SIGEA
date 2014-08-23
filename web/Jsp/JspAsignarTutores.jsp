<%-- 
    Document   : AsdignarTutores
    Created on : 22-ago-2014, 16:06:31
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib  prefix="s" uri="/struts-tags" %>
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
                 <s:include value="/Jsp/Menu.jsp"></s:include>

            </div>
                
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
                                       <thead>
                                           <th id="nombreTutor">Nombre</th>
                                           <th id="cuatrimestre">Cuatrimestre</th>
                                           <th id="grupo">Grupo</th>
                                   </thead>>
                                       <s:iterator value="consultaProfesoresSelect">
                                       <tr>
                                       <td id="datosTutores">
                                           <s:property value="nombre"/>
                                       </td>
                                       <td id="datosTutores">
                                             <s:property value="cuatrimestre"/>
                                       </td>
                                       <td id="datosTutores">
                                             <s:property value="grupo"/>
                                       </td>
                                       </tr>
                                         </s:iterator>  
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
