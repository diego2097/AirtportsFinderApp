var appModule = (function() {
   
    var consult = function(){
        var ciudad = $("#ciudad").val();
        consultModule.getAirportsByName(ciudad,_generarTable)
    };
  
   var _generarTable = function (name,json) {
		console.log(json)
		$("#cuerpo").html("");
		var total=0
		json.map(function(f) {
			$('#cuerpo')
				.append(
				  `<tr>
					<td>`+f.code+`</td>
                    <td>`+f.name+`</td>`+
                    `<td>`+f.city+`</td>`+
					`<td>`+f.countryCode+`</td>`
				);
		});
	  };
  
  
    return {
      consult: consult,
      _generarTable: _generarTable
    };
  })();
  