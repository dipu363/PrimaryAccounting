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

        <title>authorization</title>
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
           var allmenu = ${menulists};

            angular.module('myapp', []).controller('menuctrl',
                    function ($scope) {
                        $scope.allmenus = allmenu;


                        console.log($scope.allmenus);
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
                        <a class="dropdown-item" href="admindeshboard">Hello ${sessionScope.UserLoggedIn}</a>
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
            <ul class="sidebar navbar-nav" style="background:  #0c5460">
                <li class="nav-item active">
                    <a class="nav-link" href="admindeshboard">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Hello ${sessionScope.UserLoggedIn}</span>
                    </a>
                </li>
                
                
                     <li class="nav-item dropdown" >
                    <a class="nav-link dropdown-toggle" href="" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Setting</span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388"  aria-labelledby="pagesDropdown">

                      <a class="dropdown-item" href="showAuthorpage">Author</a>
                        <a class="dropdown-item" href="userauthorizationpage">Authorization permission</a>
                        <a class="dropdown-item" href="showmenuctrlpage">Menu</a>  
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Account </span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        
                                             <a class="dropdown-item" href="addaccountholderpage">Add Account</a>
                                                <a class="dropdown-item" href="showaccountholderpage">Account List</a>
                                        

                    </div>
                </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Account Heads</span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        
                                             <a class="dropdown-item" href="addaccounthead"> Add Account Head</a>
                                                 <a class="dropdown-item" href="showaccounthead">Account Head List</a>
                                        

                    </div>
                </li>
              <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Payment Voucher </span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        
                                            <a class="dropdown-item" href="cashpayment">Cash Payment</a>
                                                <a class="dropdown-item" href="chequepayment">Bank Payment</a>
                                        

                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Received Voucher </span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        
                                            <a class="dropdown-item" href="cashrecived">Cash Receive</a>
                                                <a class="dropdown-item" href="cashrecived">Bank Receive</a>
                                        

                    </div>
                </li>
                    <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Journal Book</span>
                    </a>
                    <div class="dropdown-menu"  style="background:  #02a388" aria-labelledby="pagesDropdown">
                        
                                            <a class="dropdown-item" href="journalctrlpage">General Journal</a>
                                                
                                        

                    </div>
                </li>
                
                

            </ul>

            <div id="content-wrapper">

                <div class="container-fluid">

                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="admindeshboard">Dashboard</a>
                        </li>
                        <li class="breadcrumb-item active">Authorization</li>
                    </ol>
                    <!-- end panel heading -->
                   
                                <div class="panel-body" style="padding-bottom:  100px">
                        <div class="formcontainer ">

                            <c:if test="${check}">
                            <form:form name="addauthorobject"
                                       modelAttribute="authorizationModelobject" action="Addingauthor"
                                       method="post">
                             
                                <div class="row" style="padding-top: 100px ; margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Form Name :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Form Name" type="text" path="form_name" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Permission:</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Permission" type="text" path="parmisson" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Insert :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Insert" type="text" path="p_insert" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Update :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Update" type="text" path="p_update" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style="margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Delete :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Delete" type="text" path="p_delete" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style="padding-top: 100px">
                                    <div class="col-sm-8 " style="align-content: flex-end "></div>
                                 <form:button type="submit" class="btn btn-success" id="editbuttons" name="Addauthor">Submit</form:button>
                                    <form:button type="reset" class="btn btn-danger" id="removebuttons">Reset</form:button>
                                </div>
                            </form:form>
                        </c:if>
                            <c:if test="${!check}">
                                        <form:form name="addauthorobject"
                                       modelAttribute="authorizationModelobject" action="Addingauthor"
                                       method="post">
                             <div class="row" style="padding-top: 100px ; margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h4 style="text-align: right">ID :</h4>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="ID" readonly="true" type="text" path="a_id"  ></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Form Name :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Form Name" type="text" path="form_name" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Permission:</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Permission" type="text" path="parmisson" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Insert :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Insert" type="text" path="p_insert" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style=" margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Update :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Update" type="text" path="p_update" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style="margin-left: 100px">
                                    <div class="col-sm-3">
                                        <h5 style="text-align: right">Delete :</h5>
                                    </div>
                                    <div class="form-group col-sm-6" >
                                        <form:input class="form-control" Placeholder="Delete" type="text" path="p_delete" required="true"></form:input>
                                    </div>

                                </div>
                                <div class="row" style="padding-top: 100px">
                                    <div class="col-sm-8 " style="align-content: flex-end "></div>
                                   <form:button id="editbuttons" type="submit" class="btn btn-success " name="Editauthor">Edit </form:button>
                                    <form:button id="removebuttons" type="reset" class="btn btn-danger ">Reset</form:button>
                                </div>
                            </form:form>
                                
                            </c:if>
                        </div>
                    </div>
                  
                    <!-- panel body end -->
                    <!-- DataTables Example -->
                    <div class="card mb-3">
                        <div class="card-header">
                            <i class="fas fa-table"></i>
                            User Authorization list</div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>

                                            <th> ID</th>
                                            <th>User ID</th>
                                            <th>Author ID</th>
                                            <th>Form Name</th>
                                            <th>Permission</th>
                                            <th>insert</th>
                                            <th>update </th>
                                            <th>delete </th>
                                            <th>status </th>
                                            <th>action </th>

                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>

                                            <th> ID</th>
                                            <th>User ID</th>
                                            <th>Author ID</th>
                                            <th>Form Name</th>
                                            <th>Permission</th>
                                            <th>insert</th>
                                            <th>update </th>
                                            <th>delete </th>
                                            <th>status </th>
                                            <th>action </th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>


                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td>####</td>
                                            <td><a href="#"><button id="editbuttons" type="submit" class="btn">Edit</button></a> <a  href="#"><button id="removebuttons" type="button" class="btn btn-danger ">Delete</button></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>

                    </div>
                </div>
                <!-- /.container-fluid -->
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

