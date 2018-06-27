$(document).ready(function(){
    $.getJSON('http://localhost:8082/api/kandidaat', function(data) {
        //alert(data);
        $.each(data, function(key, val) {
            
            $('#contactpersonenTable tr:first').after(
                '<tr>'+
                '<td>'+val.naam+'</td>' +
                '<td>'+val.telnr+'</td>'+
                '<td>'+val.email+'</td>'+
                '<td></td>'+
                '<td>'+val.afdeling+'</td>'+
                '</tr>'
            );
            /*
            $.each(val, function(k, v) {
                alert(k + ' --- ' + v);
            });
            */
        });
    });

});