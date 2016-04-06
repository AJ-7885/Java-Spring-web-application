<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <!-- Include one of jTable styles. -->
        <!--<link href="http://www.jtable.org/Scripts/jtable/themes/metro/blue/jtable.css" rel="stylesheet" type="text/css" />-->
        <script src="/resources/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- Include jTable script file. -->
        <!--<script src="http://www.jtable.org/Scripts/jtable/jquery.jtable.js" type="text/javascript"></script>-->

    <body>
        <div class="container">

            <div class="row">
                <table class="table-hover">
                    <tr>
                        <th>Preferences</th>
                        <th>Values</th>
                    </tr>
                    <tr>
                        <td>TEST 1 </td>
                        <td> 1212</td>
                    </tr>
                </table>
                <div>
                    <p class="greeting-id">The ID is </p>
                    <p class="greeting-content">The content is </p>
                </div>
            </div>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <script>

            $(document).ready(function () {
          
//                $.ajax({
//                    type: "GET",
//                    dataType: "json",
//                    url: "http://localhost:8080/web_test/rest/userPreferences/1",
//                    success: function (data) {
//                        alert(data);
//                    },
//                    error: function (jqXHR, textStatus, errorThrown) {
//                        alert("error");
//                    }
//                });



                $('#PersonTableContainer').jtable({
                  
                    title: 'Table of people',
                    actions: {
                        listAction: 'http://localhost:8080/web_test/rest/userPreferences/1',
                        createAction: '/GettingStarted/CreatePerson',
                        updateAction: '/GettingStarted/UpdatePerson',
                        deleteAction: '/GettingStarted/DeletePerson'
                    },
                    fields: {
                        PersonId: {
                            key: true,
                            list: false
                        },
                        Name: {
                            title: 'Author Name',
                            width: '40%'
                        },
                        Age: {
                            title: 'Age',
                            width: '20%'
                        },
                        RecordDate: {
                            title: 'Record date',
                            width: '30%',
                            type: 'date',
                            create: false,
                            edit: false
                        }
                    }
                });




            });
        </script>
    </body>
</html>
