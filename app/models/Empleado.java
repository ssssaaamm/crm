package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="empleado")
public class Empleado extends Model{
	@Id
	public Long id;

	public String codigo;

	@Constraints.Required(message="Debe ingresar el nombre")
	public String nombre;

	public String telefono;

	@Constraints.Required(message="Debe ingresar su correo electronico")
	@Constraints.Email
	public String email;

	@Constraints.Required(message="Debe ingresar un nick o username")
	public String username;

	@Constraints.Required(message="Debe ingresar el password")
	public String password;

	@ManyToOne
	public TipoEmpleado tipo;

	@OneToMany(mappedBy="empleado")
	public List<Incidencia> resueltas;
	
    public static Finder<Long, Empleado> find = new Finder<Long,Empleado>(Empleado.class);

    public Form<Empleado> getForm(){
    	Form<Empleado> returning=Form.form(Empleado.class).fill(Empleado.find.byId(this.id));
    	return returning;
    }

}