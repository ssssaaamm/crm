package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
@Table(name="producto")
public class Producto extends Model{
	
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar el codigo del producto")
	public String codigo;

	@Constraints.Required(message="Debe ingresar el nombre del producto")
	public String nombre;

	@Constraints.Required(message="Debe ingresar una descripcion")
	public String descripcion;

	@Constraints.Required(message="Debe ingresar el precio del producto")
	public double precio;

	@Constraints.Required(message="Debe ingresar una cantidad de existencias inicial")
	public int existencias;

	@ManyToOne
	public Categoria categoria;

    public static Finder<Long, Producto> find = new Finder<Long,Producto>(Producto.class);

}