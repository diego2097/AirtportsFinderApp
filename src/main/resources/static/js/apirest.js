const Url = 'airports/';


var consultModule = (function() {

var getAirportsByName = function(name,callback){
    console.log(Url + name)
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




})();

