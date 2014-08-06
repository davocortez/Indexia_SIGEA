<%-- 
    Document   : JspAsignarHorarios
    Created on : 11-jun-2014, 23:52:34
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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

                    <select name="materias" class="pull-right" style="margin-right: 5px">
                        <option value="">Selecciona una materia</option>
                        <s:iterator value="listaMaterias" status="it">
                            <option value="<s:property value="idEspecialidad"/>"><s:property value="descripcion"/></option>
                        </s:iterator>
                    </select>

                    <select name="materias" onchange="valCombo();" class="pull-right" id="combo" style="margin-right: 5px">
                        <option value="">Selecciona una Profesor</option>
                        <s:iterator value="listaProfesor" status="it">
                            <option value="<s:property value="idProfesor"/>"><s:property value="nomCompleto"/></option>
                        </s:iterator>
                    </select>

                    <button class="btn btn-success" onclick="asignarMateriaGrupo('<s:property value="idProfesor"/>', '<s:property value="idEspecialidad"/>')">
                        <i class="icon-arrow-right"></i> 
                    </button>

                    <label>Horas: </label>
                    <input type="text" name="horas" required="required" maxlength="45"/>

                    <select required="required" name="txtNuevoGrupo">
                        <option value="">Selecciona una letra para el grupo</option>
                        <option value="A">A</option>
                        <option value="B">B</option>
                        <option value="C">C</option>
                        <option value="D">D</option>
                        <option value="E">E</option>
                        <option value="F">F</option>
                        <option value="G">G</option>
                        <option value="H">H</option>
                        <option value="I">I</option>
                        <option value="J">J</option>
                        <option value="K">K</option>
                        <option value="L">L</option>
                        <option value="M">M</option>
                        <option value="N">N</option>
                        <option value="O">O</option>
                        <option value="P">P</option>
                        <option value="Q">Q</option>
                        <option value="R">R</option>
                        <option value="S">S</option>
                        <option value="T">T</option>
                        <option value="U">U</option>
                        <option value="V">V</option>
                        <option value="W">W</option>
                        <option value="X">X</option>
                        <option value="Y">Y</option>
                        <option value="Z">Z</option>
                    </select>

                </div>
            </div>
            <div class="row">

                <div class="hero-unit">                   

                </div>
            </div>
        </div>
    </body>
</html>

