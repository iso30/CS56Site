$-->
	jQuery.get "/listings", (listings) ->
		jQuery.each listings, (index, listing) ->
			jQuery('#listings').prepend jQuery("<h3>").text listing.timestamp 
			jQuery('#listings').prepend jQuery("<h2>").text listing.personal 
			jQuery('#listings').prepend jQuery("<h2>").text listing.content 
			jQuery('#listings').prepend jQuery("<h1>").text listing.title 
	
