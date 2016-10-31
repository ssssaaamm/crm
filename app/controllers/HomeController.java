package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.Map;
//import static play.data.Form.*;

import views.html.*;

import models.*;




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

        return ok(login.render());

    	//session("conected","ssssaaamm");
    	//return redirect(routes.ClienteController.productos());
    }

    public Result logout(){
    	session().clear();
    	return redirect(routes.HomeController.index());
    }

    public Result register(){
        Form<Usuario> usuario_form = Form.form(Usuario.class);
        Form<Tarjeta> tarjeta_form = Form.form(Tarjeta.class);
    	return ok(register.render(tarjeta_form,usuario_form));
    	//return redirect(routes.HomeController.index());
    }


    public Result register_post(){
        Form<Usuario> usuario_form = Form.form(Usuario.class).bindFromRequest();
        Form<Tarjeta> tarjeta_form = Form.form(Tarjeta.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        if(usuario_form.hasErrors() || tarjeta_form.hasErrors() ){
            if(usuario_form.get().password != values.get("password_confirm")[0]){
                flash("wp","Passwords no coinciden");
            }
            return badRequest(register.render(tarjeta_form,usuario_form));
        }
        Usuario usuario=usuario_form.get();
        Tarjeta tarjeta=tarjeta_form.get();
        usuario.save();
        tarjeta.owner=usuario;
        tarjeta.save();
        return ok(register_success.render(usuario.username));
    }

    public Result about(){
    	session().clear();
    	return redirect(routes.HomeController.index());
    }
}
