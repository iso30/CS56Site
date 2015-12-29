$(document).ready(function(){
	$.get("/listings", function(listings){
		$.each(listings, function(index, listing){
			var i = index;
			if(i > 2){
				i = i -2;
			}
			else{
				i = 0;
			}
			if(index - i > 0){
				$('#listings').prepend($("<h3>").text(listing.time_Stamp));
				$('#listings').prepend($("<h2>").text(listing.personal));
				$('#listings').prepend($("<h2>").text(listing.content));
				$('#listings').prepend($("<h1>").text(listing.title));
			}
		});
	});
});
	