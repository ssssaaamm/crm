package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
@Table(name="usuario")
public class Usuario extends Model{
	@Id
	public Long id;

	public String codigo;

	@Constraints.Required(message="Debe ingresar el nombre")
	public String nombre;

	@Constraints.Required(message="Debe seleccionar")
	public int genero;

	@Constraints.Required(message="Debe ingresar su correo electronico")
	@Constraints.Email
	public String email;

	@Constraints.Required(message="Debe ingresar un nick o username")
	public String username;

	@Constraints.Required(message="Debe ingresar el password")
	public String password;

	@ManyToOne
	public TipoUsuario tipo;

	@ManyToMany
	public List<Categoria> gustos;

	@OneToMany(mappedBy="cliente")
	public List<Compra> compras;
	
    public static Finder<Long, Usuario> find = new Finder<Long,Usuario>(Usuario.class);

}