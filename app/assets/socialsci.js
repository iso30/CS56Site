
$(document).ready(function(){
	$.get("/listings", function(listings){
		$.each(listings, function(index, listing){
			if(listing.subject == "socialsci"){
				$('#listings').prepend($("<h3>").text(listing.time_Stamp));
				$('#listings').prepend($("<h2>").text(listing.personal));
				$('#listings').prepend($("<h2>").text(listing.content));
				$('#listings').prepend($("<h1>").text(listing.title));
			}
		});
	});
});