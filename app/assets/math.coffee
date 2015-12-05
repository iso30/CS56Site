$-->
	jQuery.get "/listings", (listings) ->
		jQuery.each listings, (index, listing) ->
			jQuery('#listings').prepend jQuery("<h3>").text listing.time_Stamp if listing.subject is "math"
			jQuery('#listings').prepend jQuery("<h2>").text listing.personal if listing.subject is "math"
			jQuery('#listings').prepend jQuery("<h2>").text listing.content if listing.subject is "math"
			jQuery('#listings').prepend jQuery("<h1>").text listing.title if listing.subject is "math"
	
