const Url = 'http://localhost:8080/airports/';


var consultModule = (function() {

var getAirportsByName = function(name,callback){
    jQuery.ajax({
      url: Url + name,
      success: function (result) {
        callback(result);
      },
    });
  }

  return {
    getAirportsByName: getAirportsByName
  };

var save = function(){
          
    console.log(cuenta);
    $.ajax({
        url: "cuentas/",
        type: "post",
        data: cuenta,
        contentType: "application/json"
    });
}


})();

