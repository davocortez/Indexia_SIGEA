<%-- 
    Document   : JspEntregarPortafolio
    Created on : 12-jun-2014, 0:09:50
    Author     : Erick Herrera
--%>

<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib uri="/struts-tags" prefix="s" %>--%>

<!DOCTYPE html>
<html>
    <head>
        <%@taglib prefix="s" uri="/struts-tags" %>
        <title>JSPEntregaPortafolio</title>
        <meta name="viewport" content="width=device-width intial-scale=1.0 " />
        <link href="<%=context%>/Css/css_main.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/Css/cssMenu.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="<%=context%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
        <Link href=" <%=context%>/bootstrap/css/slimmenu.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" language="javascript" src="<%=context%>/bootstrap/media/js/jquery.js"></script>
        <script type="text/javascript" language="javascript" src="<%=context%>/bootstrap/media/js/jquery.dataTables.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <link rel="stylesheet" href="<%=context%>/bootstrap/media/css/demo_table.css" />  
        <script type="text/javascript" charset="utf&minus;8">
            $(document).ready(function() {
                $('#example').dataTable({
                    "oLanguage": {
                        "sUrl": "<%=context%>/media/js/datatable.spanish.txt"
                    }
                });
            });
        </script>
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
                        <legend >Entrega de Portafolios</legend>

                        <table  class="table table-striped">
                            <thead>
                                <tr>
                                    <th name="nombre">
                                        Nombre Profesor:
                                    </th>
                                    <th name="nombre">
                                        Portafolio
                                    </th>
                                </tr>
                            <tbody>
                            <s:iterator var="listaPortafolios" value="listaProfesores">
                            
                                <tr>
                                    <td id="datos" > 
                                        <input value="<s:property value="idProfesor"/>" type="hidden" name="idProfesor">
                                        <s:property value="nombreProfesor"/>
                                    </td>
                                    <td id="datos">
                                        <s:iterator var="bean" value="portafolios">
                                            
                                            <input value="<s:property value="#bean.idReportes"/>" type="hidden" name="idReporte"/>
                                            <s:if test="#bean.estado == 1">
                                                <form action="modificarPortafolio">
                                                    <input value="<s:property value="#bean.idReportes"/>" type="hidden" name="idReporte"/>
                                                    Portafolio <s:property value="#bean.descripcion"/> <button class="btn btn-danger">entregar</button>
                                                </form>
                                            </s:if>
                                            <s:else>
                                                <form>
                                                    Portafolio <s:property value="#bean.descripcion"/><button class="btn btn-success">listo</button>
                                                </form>
                                                
                                            </s:else>
                                            
                                        </s:iterator>
                                    </td>
                                </tr>
                            
                            </s:iterator>
                            </tbody>    
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


