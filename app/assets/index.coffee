$-->
	jQuery.get "/listings", (listings) ->
		i = 0
		jQuery.each listings, (index, listing) ->
			i = index
		if i > 2	
			i = i - 2
		else
			i = 0
		jQuery.each listings, (index, listing) ->
			if index - i >= 0
				jQuery('#listings').prepend jQuery("<h3>").text listing.time_Stamp 
				jQuery('#listings').prepend jQuery("<h2>").text listing.personal 
				jQuery('#listings').prepend jQuery("<h2>").text listing.content 
				jQuery('#listings').prepend jQuery("<h1>").text listing.title 
	