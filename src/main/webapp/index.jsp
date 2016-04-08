<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">     
        <link href="htdocs/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="htdocs/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="htdocs/css/app.css" rel="stylesheet" type="text/css"/>
    <body >
        <div class="container">
            <div class="jumbotron">
                <h1>User Preference List</h1>
                <div class="row" >
                    <fieldset class="form-group ">
                        <select class="form-control" id="userSelector">
                            <option>Please Select User</option>
                            <option value="1">User A</option>
                            <option value="2">User B</option>
                            <option value="3">User C</option>
                            <option value="4">User D</option>
                        </select>
                    </fieldset>
                    <button type="button" class="btn btn-primary btn-large" data-toggle="modal" data-target="#userPreferenceHistory" onclick="javascript:loadUserPreferenceHistory4User()">User Preferences History</button>
                    <button type="button" class="btn btn-primary btn-large" data-toggle="modal" data-target="#addUserPreference" >Add New User Preference</button>
                </div>
            </div>

            <div class="table-responsive">
                <table class="table table-hover" id="userPreferenaceDisplayTable">
                    <thead>
                        <tr>
                            <th>Preference</th>
                            <th>Value</th>
                            <th>Edit</th>
                            <th>Deactivate</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>




            <!-- User Preference History -->
            <div id="userPreferenceHistory" class="modal fade" role="dialog">
                <div class="modal-dialog">

                    <!-- User Preference History content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">User Preference History</h4>
                        </div>
                        <div class="modal-body">
                            <div class="table-responsive">
                                <table class="table table-hover" id="historyUserPreferenaceTable">
                                    <thead>
                                        <tr>
                                            <th>Preference</th>
                                            <th>Value</th>
                                            <th>Status</th>
                                            <th>Date</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

            <!-- Edit User Preference -->
            <div id="editUserPreference" class="modal fade" role="dialog">
                <div class="modal-dialog">

                    <!-- User Preference form-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Edit User Preference</h4>
                        </div>
                        <div class="modal-body">
                            <div class="table-responsive">
                                <form>
                                    <fieldset class="form-group" style="display: none">
                                        <label for="up_id">ID</label>
                                        <input class="form-control" type="text" id="up_id" name="up_id"/>
                                    </fieldset>

                                    <fieldset class="form-group">
                                        <label for="upKeyE">Preference</label>
                                        <input class="form-control" type="text" id="upKeyE" name="upKeyE" placeholder="Preference" required/>
                                    </fieldset>
                                    <fieldset class="form-group">
                                        <label for="upValE">Value</label>
                                        <input class="form-control" type="text" id="upValE" name="upValE" placeholder="Preference Value" required/>
                                    </fieldset>
                                    <button  class="btn btn-primary" onclick="javascript:editUserPreferenceSave()">Save</button>
                                </form>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button  class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

            <!-- Add User Preference -->
            <div id="addUserPreference" class="modal fade" role="dialog">
                <div class="modal-dialog">

                    <!--Add  User Preference form-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add User Preference</h4>
                        </div>
                        <div class="modal-body">
                            <form method="POST">
                                <fieldset class="form-group">
                                    <label for="upKey">Preference</label>
                                    <input class="form-control" type="text" id="upKey" name="upKey" placeholder="Preference" required/>
                                </fieldset>
                                <fieldset class="form-group">
                                    <label for="upVal">Value</label>
                                    <input class="form-control" type="text" id="upVal" name="upVal" placeholder="Preference Value" required/>
                                </fieldset>
                                <button  class="btn btn-primary" onclick="javascript:addUserPreference()">Save</button>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <script src="htdocs/js/jquery-2.2.0.min.js" type="text/javascript"></script>
        <script src="htdocs/js/jquery-ui.min.js" type="text/javascript"></script>
        <script src="htdocs/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="htdocs/js/app.js" type="text/javascript"></script>
    </body>
</html>
