package controllers;

import models.Listing;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import play.db.ebean.Model;
import java.util.List;
import java.text.SimpleDateFormat;
import static play.libs.Json.toJson;

public class Application extends Controller {

    //Renders the main page
    public Result index() {
        return ok(index.render(""));
    }

    //Upon form submission, Play creates a new Model of Listing to store in the database
    // then redirects the client to the index page
    public Result addListing(){
    	Listing listing = Form.form(Listing.class).bindFromRequest().get();
        listing.setTimeStamp(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date()));
    	listing.save();
    	return redirect(routes.Application.index());
    }

    //Gets the Listing instances to call POST method so store the JSON at "/listings"
    //Javascript can then parse and use the scripts accordingly
    public Result getListings(){
    	List<Listing> listings = new Model.Finder(String.class, Listing.class).all();
    	return ok(toJson(listings));
    }

    //Renders each of the subject pages with thier respective paths
    public Result math(){
        return ok(math.render(" "));
    }

    public Result english(){
        return ok(english.render(" "));
    }
    public Result cs(){
        return ok(cs.render(" "));
    }
    public Result artHist(){
        return ok(artHist.render(" "));
    }

    public Result chemistry(){
        return ok(chemistry.render(" "));
    }
    public Result physics(){
        return ok(physics.render(" "));
    }
    public Result history(){
        return ok(history.render(" "));
    }

    public Result music(){
        return ok(music.render(" "));
    }
    public Result socialsci(){
        return ok(socialsci.render(" "));
    }
     public Result makePost(){
        return ok(post.render(" "));
    }
}
