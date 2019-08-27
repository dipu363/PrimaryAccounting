<%-- 
    Document   : addsupplier
    Created on : Nov 25, 2018, 2:58:04 PM
    Author     : User
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Accountholder</title>
        <link href="resources/dashboard/img/logo.ico" rel="shortcut icon" />
        <!-- Bootstrap core CSS-->
        <link href="resources/dashboard/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="resources/dashboard/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Page level plugin CSS-->
        <link href="resources/dashboard/datatables/dataTablesbootstrap4.css" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="resources/dashboard/cssnew/sb-admin.css" rel="stylesheet">
        <script src="resources/dashboard/js/angular.js"></script>


        <script>
                var typelist = ${acctypelist};



                angular.module('myapp', []).controller('typecontrl',
                        function ($scope) {
                            $scope.acctypelists = typelist;


                            console.log($scope.acctypelists);
                        });
        </script>

    </head>

    <body id="page-top">

        <nav class="navbar navbar-expand navbar-dark  static-top" style="background: #0c5460">

            <a class="navbar-brand mr-1" href="<%=request.getContextPath()%>">Primary Accounting</a>

            <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
                <i class="fas fa-bars"></i>
            </button>

            <!-- Navbar Search -->
            <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">

            </form>

            <!-- Navbar -->
            <ul class="navbar-nav ml-auto ml-md-0">

                <li class="nav-item dropdown no-arrow">
                    <a class="nav-link dropdown-toggle" href="adminwelcome" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-user-circle fa-fw"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="admindeshboard">Hello ${sessionScope.UserloggedIn}</a>
                        <a class="dropdown-item" href="<%=request.getContextPath()%>">Home</a>
                        <a class="dropdown-item" href="admindeshboard">Admin Signup</a>

                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">Logout</a>
                    </div>
                </li>
            </ul>

        </nav>

        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="sidebar navbar-nav" style="background:  #0c5460">s
                <li class="nav-item active">
                    <a class="nav-link" href="admindeshboard">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Hello ${sessionScope.UserloggedIn}</span>
                    </a>
                </li>
                <li class="nav-item dropdown" >
                    <a class="nav-link dropdown-toggle" href="" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Add</span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388"  aria-labelledby="pagesDropdown">
                        <h6 class="dropdown-header">Settings:</h6>

                        <a class="dropdown-item" href="showAuthorpage">Author</a>
                        <a class="dropdown-item" href="showuserauthorizationctrlpage">Authorization permission</a>
                        <a class="dropdown-item" href="showmenuctrlpage">Menu</a>
                        <a class="dropdown-item" href="showaccounthead">Account Head</a>
                        <a class="dropdown-item" href="showaccountholderpage">Account Type</a>
                        <a class="dropdown-item" href="journalctrlpage"> General Journal</a>
                        <a class="dropdown-item" href="paymentvoucherctrlpage"> Payment Voucher</a>
                        <a class="dropdown-item" href="receivedvoucherctrlpage"> Received Voucher</a>

                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Show</span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        <h6 class="dropdown-header">Settings:</h6>
                        <!--                        <a class="dropdown-item" href="searchattendancsheet">Attendance</a>
                                                <a class="dropdown-item" href="marksheetreportpage"> Result</a>
                                                <a class="dropdown-item" href="userlistinfo">User List</a>
                                                <a class="dropdown-item" href="viewstudent">View one Studentinfo</a>
                                                <a class="dropdown-item" href="noticeboardpage">View Notice Board</a>
                                                <a class="dropdown-item" href="classroutinreportpage">Search class Routine</a>
                                                <a class="dropdown-item" href="paymentreportpage">Search Monthly Payment</a>
                                                <a class="dropdown-item" href="reportView">search Exam</a>
                                                <a class="dropdown-item" href="studentlistreportpage">search Student</a>-->

                    </div>
                </li>

            </ul>

            <div id="content-wrapper">

                <div class="container-fluid" ng-app="myapp" ng-controller="typecontrl">

                    <!-- Breadcrumbs-->
                    <div class="row">
                        <div class="col-lg-10">
                            
                                <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="admindeshboard">Dashboard</a>
                        </li>
                        <li class="breadcrumb-item active">Account Type</li>
                    </ol>
                        </div>
                        <div class="d-flex justify-content-end">
                            <a href="addaccountholderpage"><button id="editbuttons" type="submit" class="btn badge-success" style="font-weight: bold; font-size: 22px">+</button></a>
                            
                        </div>
                 
                
                    </div>
                   
                    <!-- DataTables Example -->
                    <div class="card mb-3 " >
                        <div class="card-header">
                            <i class="fas fa-table"></i>
                            Account List</div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>

                                            <th> ID</th>
                                            <th> Account Type</th>
                                            <th> Name</th>
                                            <th>Address </th>
                                            <th>Phone </th>
                                            <th>Status </th>
                                            <th>Action </th>

                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th> ID</th>
                                            <th> Account Type</th>
                                            <th> Name</th>
                                            <th>Address </th>
                                            <th>Phone </th>
                                            <th>Status </th>
                                            <th>Action </th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr ng-repeat="type in acctypelists">

                                            <td>{{type.at_id}}</td>
                                            <td>{{type.at_type}}</td>
                                            <td>{{type.name}}</td>
                                            <td>{{type.address}}</td>
                                            <td>{{type.phone}}</td>
                                            <td>{{type.status}}</td>
                                            <td><a href="editingaccounttypebtn?getid={{type.at_id}}"><button id="editbuttons" type="submit" class="fa fa-pen" style="background:#5897fb; width: 40px; height: 40px"></button></a> <a  href="removeaccount/{{type.at_id}}"><button id="removebuttons" type="button" class=" fa fa-trash" style="background: red; width: 40px; height: 40px"></button></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                       
                    </div>
                </div>
                <!-- /.container-fluid -->

                <!-- Sticky Footer -->
                <footer class="sticky-footer">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span> Copyrights and copy 2018  | All Rights Reserved | Design by Giyas uddin</span>
                        </div>
                    </div>
                </footer>

            </div>
            <!-- /.content-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="logout">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="resources/dashboard/jquery/jquery.min.js"></script>
        <script src="resources/dashboard/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="resources/dashboard/jquery-easing/jquery.easing.min.js"></script>

        <!-- Page level plugin JavaScript-->
        <script src="resources/dashboard/chart/Chartmin.js"></script>
        <script src="resources/dashboard/datatables/jquerydataTables.js"></script>
        <script src="resources/dashboard/datatables/dataTablesbootstrap4.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="resources/dashboard/jsnew/sb-adminmin.js"></script>

        <!-- Demo scripts for this page-->
        <script src="resources/dashboard/jsnew/demo/datatablesdemo.js"></script>
        <script src="resources/dashboard/jsnew/demo/chartareademo.js"></script>



        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
    </body>
</html>

