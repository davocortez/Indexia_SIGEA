<%-- 
    Document   : JspRegistrarUsuario
    Created on : 21-ago-2014, 3:44:07
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
 
<!DOCTYPE html>
<html>
    <head>
       <title>JSPEALtaProfesores</title>
       <meta name="viewport" content="width=device-width intial-scale=1.0 ">
              <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
              <link href="<%=context%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
               <link href="<%=context%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
               <Link href=" <%=context%>/bootstrap/css/slimmenu.css" rel="stylesheet" type="text/css"/>
               
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
                       <div class="span121">
                           <fieldset id="fieldsetProfesor">
                           <legend>Registrar Profesor</legend>
                           <form action="accionInsertar" >
                                    <table id="registrarProfesor">
                                        <input type="text" id="nombreProfesor" placeholder="Nombre" cssClass="nomAlumno"label="Nombre Profesor"  name="nombre"/>
                                        <input type="text" id="apellidoPaterno" placeholder="Apellido Paterno" cssClass="apPaterno" label="Apellido Paterno" name="apePaterno"/>
                                        <input type="text" id="apellidoMaterno" placeholder="Apellido Materno" cssClass="apMaterno" label="Apellido Materno" name="apeMaterno"/>
                                        <input type="text" id="tipoProfesor" placeholder="TipoProfesor" cssClass="apMaterno" label="Tipo Profesor" name="disponibilidad"/>
       
                                    </table>
                                       <button class="botonRegistrarAlumno">Registrar</button>
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


