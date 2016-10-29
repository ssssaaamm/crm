package controllers;

import play.mvc.*;

import views.html.*;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	if(session("connected")==null){
    		return ok(index.render());
    	}else{
    		return redirect(routes.ClienteController.productos());
    	}
        
    }

    public Result login(){
    	session("conected","ssssaaamm");
    	return redirect(routes.ClienteController.productos());
    }

    public Result logout(){
    	session().clear();
    	return redirect(routes.HomeController.index());
    }

    public Result register(){
    	session().clear();
    	return redirect(routes.HomeController.index());
    }

    public Result about(){
    	session().clear();
    	return redirect(routes.HomeController.index());
    }
}
