package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.io.File;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
//import java.nio.Files;

import views.html.administrador.*;
import models.*;

public class AdministradorController extends Controller {


	///EMPLEADOS

	//list
    public Result empleados() {
        
        Form<Empleado> empleado_form = Form.form(Empleado.class);
		List<Empleado> empleados_list = Empleado.find.findList();
		
		return ok(empleados.render(empleado_form,empleados_list));
    }


    //add
    public Result empleado_new() {

    	Form<Empleado> empleado_form = Form.form(Empleado.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Empleado> empleados_list = Empleado.find.findList();

        //Si hay errores siempre los retornara
        if( empleado_form.hasErrors() ){
        	flash("modal","mod-new");
            return badRequest(empleados.render(empleado_form,empleados_list));
        }

        Empleado nuevo = empleado_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.AdministradorController.empleados());


     //    if( !empleado_form.hasErrors() && empleado.password.equals(values.get("password_confirm")[0])){
     //    	empleado.save();
     //    	return ok("empleado guardado");
     //    }else{
        	

     //    	//Logger.error("Bad in class Foo trying to submit my form: " + empleado_form.errorsAsJson());
  			// //return badRequest(empleados.render(empleado_form,empleados_list));

     //    	//return badRequest(empleados.render(empleado_form,empleados_list));
     //    	return ok("errores en el formulario");
     //    }
    	
    	//return ok("hola");
		//return ok(empleados.render(empleado_form));   
    }


    //edit
    public Result empleado_edit(Long id) {

    	Form<Empleado> empleado_form = Form.form(Empleado.class).bindFromRequest();
        List<Empleado> empleados_list = Empleado.find.findList();

        //Si hay errores siempre los retornara
        if( empleado_form.hasErrors() ){
        	flash("modal","mod-edit-"+id.toString());
            return badRequest(empleados.render(empleado_form,empleados_list));
        }

        Empleado emp = Empleado.find.byId(id);

		if ( emp != null) {
			emp.codigo=empleado_form.get().codigo;
            emp.nombre=empleado_form.get().nombre;
            emp.telefono=empleado_form.get().telefono;
            emp.email=empleado_form.get().email;
            emp.username=empleado_form.get().username;
            emp.password=empleado_form.get().password;
            emp.tipo.id=empleado_form.get().tipo.id;

            emp.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.AdministradorController.empleados());
    	//return ok("hola "+id.toString());
		//return ok(empleados.render(empleado_form));   
    }


    //delete
    public Result empleado_remove(Long id){
    	Empleado emp = Empleado.find.byId(id);
    	if(emp != null){
    		emp.delete();
    		flash("exito","Operacion exitosa!");
    		return redirect(routes.AdministradorController.empleados());
    	}
    	return redirect(routes.AdministradorController.empleados());
    }


    ///PRODUCTOS

    public Result productos() {
    	Form<Producto> producto_form = Form.form(Producto.class);

		return ok(productos.render(producto_form));    
    }



    public Result producto_new() {
    	Form<Producto> producto_form = Form.form(Producto.class);
		return ok(productos.render(producto_form));   
    }




  //   public Result empleados() {
		// if(session("connected")==null){
		// 	return ok(index.render());
		// }else{
		// 	return redirect(routes.HomeController.home());
		// }     
  //   }

}