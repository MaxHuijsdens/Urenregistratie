$(document).ready(function(){
    $("#registreerKandidaatForm").submit(function(event) {
        event.preventDefault();
        var naam = $("#naamTextBox").val();
        var email = $("#emailTextBox").val();
        var telefoon = $("#telefoonnummerTextBox").val();
        var dataJson = '{"naam":"'+naam+'", "email":"'+email+'", "telefoon":"'+telefoon+'"}';
        var xhttp = new XMLHttpRequest();
        xhttp.open("POST", "http://localhost:8082/api/testclass", true);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send(dataJson);
        alert(naam + " is toegevoegd.");
    });
});