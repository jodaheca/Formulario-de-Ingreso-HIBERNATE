$(window).ready(function () {    
  $("#registro").click(function () {
    registrar();
  });
});

function registrar(){

  datos = {
    "nombre"   : $("#nombre").val(),
    "apellido" : $("#apellido").val(),
    "id"       : $("#id").val(),
    "correo"   : $("#correo").val(),
    "correo2"  : $("#correo2").val(),
    "programa" : $("#programa").val()
  }

  $.ajax({
      url: "resources/Usuario",
      type: "POST",
      contentType: "application/json",
      data: JSON.stringify(datos),
      dataType: "json",
      success: function(json){
          if (json.mensaje){
              console.log("Success: " + json.tipo  + " - " +json.mensaje);
              alert("Felicitaciones! Se ha inscrito correctamente!");    
          }
          else {
              console.log("Failed: " + json.tipo  + " - " +json.mensaje);
              alert("Ha ocurrido un enviando el formulario de registro. Intente más tarde.");
          }
      },
      error: function(xhr, ajaxOptions, thrownError) {
          console.log(xhr.status +"\n" + thrownError);
          alert("Ha ocurrido un enviando el formulario de registro. Intente más tarde.");
      }
  });
}