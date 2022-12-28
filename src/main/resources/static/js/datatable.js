$(document).ready( function () {
	var productos = $.ajax({
		url:"/api/productos",
		type:"get",
		dataType: 'json',
		success : (function (data) {
                      console.log(data);
                  })
	});
	
	
	//console.log(productos);
	
	$('#productosTable').DataTable({
			ajax: {
				url: "/api/productos",
				dataSrc: ''
			},
			columns: [
				{data:"id"},
				{data:"nombre"},
				{data:"categoria"},
				{data:"fabricante"}
			]
	 });
});