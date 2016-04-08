user = 0;

function loadUserPreference4User(user_ID) {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "rest/userPreferences/" + user_ID,
        success: function (data) {
            $("#userPreferenaceDisplayTable").empty();
            $('#userPreferenaceDisplayTable').append('<thead><tr><th>Preference</th><th>Value</th><th>Edit</th><th>Deactivate</th></tr></thead><tbody>');

            for (var i = 0; i < data.length; i++) {
                $('#userPreferenaceDisplayTable').append('<tr><td>' + data[i].key + '</td> <td>' + data[i].value + '</td> <td> <button type="button" data-toggle="modal" data-target="#editUserPreference" onclick="editUserPreference(' + data[i].id + ',\'' + data[i].key + '\',\'' + data[i].value + '\')" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-pencil"></span></button></td><td><a href="javascript:removeUserPreference(' + data[i].id + ')" class="btn btn-danger btn-lg"><span class="glyphicon glyphicon-trash"></span></a></td>');
            }
            $('#userPreferenaceDisplayTable').append('</tbody>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert("error");
        }
    });
}

function loadUserPreferenceHistory4User() {
    if (user > 0) {
        $.ajax({
            type: "GET",
            dataType: "json",
            url: "rest/historyUserPreferences/" + user,
            success: function (data) {
                $("#historyUserPreferenaceTable").empty();
                $('#historyUserPreferenaceTable').append('<thead><tr><th>Preference</th><th>Value</th><th>Status</th><th>Date</th></tr></thead><tbody>');

                for (var i = 0; i < data.length; i++) {
                    $('#historyUserPreferenaceTable').append(' <tr><td>' + data[i].key + '</td> <td>' + data[i].value + '</td> <td>' + ((data[i].isActive) == true ? "Enable" : "Disable") + '</td><td>' + new Date(data[i].timeStamp).getMonth() + "/" + new Date(data[i].timeStamp).getDay() + "/" + new Date(data[i].timeStamp).getFullYear() + '</td>');
                }
                $('#historyUserPreferenaceTable').append('</tbody>');
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("error");
            }
        });
    } else {
        alert("Please select a user first.");
    }
}

function saveUserPerference(newUP) {
    $.ajax({url: "rest/userPreference4User",
        type: "POST",
        crossDomain: true,
        data: JSON.stringify(newUP),
        contentType: 'application/json; charset=utf-8',
        dataType: "json",
        success: function (data) {
            loadUserPreference4User(user);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert("Error on save or update User Preference");
        }
    });
}
function addUserPreference() {
    if (user > 0) {
        var newUserPreferenc = {
                //since id is integer, quick fix
                "id": Date.now(),
                "key": $('#upKey').val(),
                "value": $('#upVal').val(),
                "userID": parseInt(user),
                "timeStamp": Date.now(),
                "isActive": true
            };

        saveUserPerference(newUserPreferenc);
    } else {
        alert("Please select a user first.");
    }
}
function editUserPreference(up_ID, key, value) {
    $("#upKeyE").val(key);
    $("#upValE").val(value);
}

function editUserPreferenceSave() {
    if (user > 0) {
        var newUserPreferenc = [{
                "id": Math.random().toString(36).substr(2, 9),
                "key": $('#upKeyE').val(),
                "value": $('#upValE').val(),
                "userID": user,
                "timeStamp": Date.now(),
                "isActive": "true"
            }];

        saveUserPerference(newUserPreferenc);
    } else {
        alert("Please select a user first.");
    }
}

function removeUserPreference(up_ID) {
    $.ajax({
        type: "DELETE",
        url: "rest/userPreference4User/" + up_ID,
        success: function (data) {
            loadUserPreference4User(user);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert("error");
        }
    });
}

$('#userSelector').change(function (e) {
    if ($(e.target).val() > 0) {
        user = $(e.target).val();
        loadUserPreference4User(user);
    }
});