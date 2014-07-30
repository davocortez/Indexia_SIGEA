<%-- 
    Document   : JspLogin
    Created on : 24-may-2014, 20:25:20
    Author     : Erick Herrera
--%>
<%String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>JspLogin</title>
        <link rel="stylesheet" href="<%=context%>/bootstrap/css/loginStyle.css" type="text/css" />
    </head>
    <body class="login">
        <div class="row">
            <div class="hero-uniti">
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

        <div class="loginbox radius">

            <div class="loginboxinner radius">
                <div class="loginheader">

                    <div class="logo">
                        <img src="<%=context%>/Img/logodatic.png" name="datic"/>
                    </div>
                </div><!--loginheader-->

                <div class="loginform">

                    <form id="login" action="" method="post">
                        <s:textfield id="nombre" name="username" placeholder="Usuario" value="" cssClass="usuario" />
                        <s:textfield id="password" name="password" placeholder="Contraseña" cssClass="password" />
                        <p>
                            <button class="radius title" name="client_login">Ingresar</button>
                        </p>
                    </form>
                </div><!--loginform-->
            </div><!--loginboxinner-->
        </div><!--loginbox-->

        <div id="ad" style="width:100%; margin-top:50px;">
        </center>
    </div>
</body>
</html>

