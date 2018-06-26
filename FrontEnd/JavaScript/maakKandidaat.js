$(document).ready(function(){
    $("#registreerKandidaatForm").submit(function(event) {
        event.preventDefault();
        var naam = $("#naamTextBox").val();
        var email = $("#emailTextBox").val();
        var telnr = $("#telefoonnummerTextBox").val();
        var dataJson = '{"naam":"'+naam+'", "email":"'+email+'", "telnr":"'+telnr+'"}';
        var xhttp = new XMLHttpRequest();
        xhttp.open("POST", "http://localhost:8082/api/kandidaat", true);
        xhttp.setRequestHeader("Content-type", "application/json");
        xhttp.send(dataJson);
        alert(naam + " is toegevoegd.");
    });
});