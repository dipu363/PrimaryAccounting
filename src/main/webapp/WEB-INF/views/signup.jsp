<%-- 
    Document   : login
    Created on : Nov 22, 2018, 12:18:40 PM
    Author     : HP
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SignUp</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="resources/login/images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="resources/login/vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="resources/login/css/util.css">
        <link rel="stylesheet" type="text/css" href="resources/login/css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <form:form modelAttribute="urm" action="reguser" class="login100-form validate-form">
                        <h1 class="login100-form-title p-b-26">
                            Welcome
                        </h1>


                        <div class="wrap-input100 validate-input" data-validate = " Enter User Name">
                            <form:input class="input100" type="text"  path="username"></form:input>
                                <span class="focus-input100" data-placeholder="User Name"></span>
                            </div>
                            <div class="wrap-input100 validate-input" data-validate = "Valid email is: a@b.c">
                            <form:input class="input100" type="text" path="emailid"></form:input>
                                <span class="focus-input100" data-placeholder="Email"></span>
                            </div>
                            <div class="wrap-input100 validate-input" data-validate = "Enter User Contact no">
                            <form:input class="input100" type="text"  path="phone"></form:input>
                                <span class="focus-input100" data-placeholder="Phone No"></span>
                            </div>

                            <div class="wrap-input100 validate-input" data-validate="Enter password">
                                <span class="btn-show-pass">
                                    <i class="zmdi zmdi-eye"></i>
                                </span>
                            <form:input class="input100" type="password" path="password"></form:input>
                                <span class="focus-input100" data-placeholder="Password"></span>
                            </div>



                            <div class="container-login100-form-btn">
                                <div class="wrap-login100-form-btn">
                                    <div class="login100-form-bgbtn"></div>

                                    <button class="login100-form-btn" type="submit"> SignUp </button>
                                </div>
                            </div>

                            <div class="text-center p-t-115">
                                <span class="txt1">
                                    already have an account?
                                </span>

                                <a class="txt2" href="login">
                                    logIn
                                </a>
                            </div>
                    </form:form>
                </div>
            </div>
        </div>


        <div id="dropDownSelect1"></div>

        <!--===============================================================================================-->
        <script src="resources/login/vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/vendor/bootstrap/js/popper.js"></script>
        <script src="resources/login/vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/vendor/daterangepicker/moment.min.js"></script>
        <script src="resources/login/vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="resources/login/js/main.js"></script>

    </body>
</html>
