$('document').ready(function(){
	
	$('table #editBtn').on('click',function(event){
		event.preventDefault();
		
		/* 
		 * /countries/findById/?id=1 
		 */
		var hrefVal = $(this).attr('href');
		
		$.get(hrefVal, function(data, status){
			$('#idEdit').val(data.id);
			$('#codeEdit').val(data.code);
			$('#capitalEdit').val(data.capital);
			$('#descriptionEdit').val(data.description);
			$('#nationalityEdit').val(data.nationality);
			$('#continentEdit').val(data.continent);
		})
		
		$('#editModal').modal();
	})
});