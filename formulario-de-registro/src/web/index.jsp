<%-- 
    Document   : index
    Created on : 10-jun-2014, 11:34:29
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Formulario de Registro</title>
    
    <!-- CSS -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="css/logo-nav.css" rel="stylesheet" type="text/css" />
    
    </head>
    <body>
       <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <h1 class="text-center login-title">Registro de Usuario</h1>
                    <div class="account-wall">
                        <br>
                        <div class="form-signin">
                            <input type="text" class="form-control" placeholder="Nombres" name="nombre" id="nombre" required autofocus>
                            <br>
                            
                            <input type="text" class="form-control" placeholder="Apellidos" name="apellido" id="apellido" required>
                            <br>
                            
                            <input type="text" class="form-control" placeholder="Numero Documento Identidad" name="id" id="id" required>
                            <br>
                            
                            <input type="email" class="form-control" placeholder="Correo" name="correo" id="correo" required>
                            <br>
                            
                            <input type="email" class="form-control" placeholder=" Confirme Correo" name="correo2" id="correo2" required>
                            <br>
                            
                            <input type="text" class="form-control" placeholder="Programa Academico" name="programa" id="programa" required>
                            <br>
                             
                            <button id="registro" class="btn btn-lg btn-primary btn-block" type="submit">
                                Enviar Formulario
                            </button>
                       </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Javascript -->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/registrar.js"></script>
      
    </body>
</html>
