package controllers;

import play.mvc.*;
import play.data.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
//import java.nio.Files;

import views.html.administrador.*;
import models.*;

public class AdministradorController extends Controller {

    public Result empleados() {
        Form<Empleado> empleado_form = Form.form(Empleado.class);

        List<Empleado> empleados_list = Empleado.find.findList();
        ArrayList<Form<Empleado>> empleados_forms=new ArrayList<Form<Empleado>>();

        for(int i =0; i< empleados_list.size(); i++){
        	empleados_forms.add(Form.form(Empleado.class).fill(empleados_list.get(i)));
        }


		return ok(empleados.render(empleado_form,empleados_list));
    }


    public Result productos() {
    	Form<Producto> producto_form = Form.form(Producto.class);

		return ok(productos.render(producto_form));    
    }

    public Result empleado_new() {
    	Form<Empleado> empleado_form = Form.form(Empleado.class);
    	return ok("hola");
		//return ok(empleados.render(empleado_form));   
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