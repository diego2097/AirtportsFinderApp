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

 var save = function(airport){
          
    console.log(airport);
    $.ajax({
        url: "airports/",
        type: "post",
        data: airport,
        contentType: "application/json"
    });
}



  return {
    save: save,
    getAirportsByName: getAirportsByName
  };




})();

