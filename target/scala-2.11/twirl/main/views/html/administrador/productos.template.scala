
package views.html.administrador

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productos_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class productos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Producto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(producto_form: Form[Producto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.9*/("""
	"""),format.raw/*5.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.105*/("""">
    <!--<link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/btn-file.css")),format.raw/*6.105*/(""""> -->
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("javascripts/bootstrap-filestyle.min.js")),format.raw/*9.81*/("""" type="text/javascript"></script>
 	<script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*7.2*/("""
"""),format.raw/*11.2*/("""
"""),_display_(/*12.2*/administrador/*12.15*/.base("Admin CRM","Productos","Gestion de productos","productos",css,js)/*12.87*/{_display_(Seq[Any](format.raw/*12.88*/("""


	"""),format.raw/*15.2*/("""<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Producto</button>

  	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Agregar nuevo producto</h4>
				</div>
				<div class="modal-body">



					"""),_display_(/*31.7*/form(action=routes.AdministradorController.producto_new())/*31.65*/{_display_(Seq[Any](format.raw/*31.66*/("""
                		 """),format.raw/*32.20*/("""<div class="form-group">
                		 	"""),_display_(/*33.22*/inputText(producto_form("codigo"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Codigo del producto", '_label -> "Codigo de Producto: ")),format.raw/*33.184*/("""
                		 """),format.raw/*34.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*37.22*/inputText(producto_form("nombre"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Nombre del producto", '_label -> "Nombe: ")),format.raw/*37.171*/("""
                		 """),format.raw/*38.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*41.22*/inputText(producto_form("descripcion"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Descripcion del producto", '_label -> "Descripcion: ")),format.raw/*41.187*/("""
                		 """),format.raw/*42.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*45.22*/inputText(producto_form("precio"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Precio en USD", '_label -> "Precio: ")),format.raw/*45.166*/("""
                		 """),format.raw/*46.20*/("""</div>

	  					 <div class="form-group">
								"""),_display_(/*49.10*/inputText(producto_form("existencias"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Cantidad en unidades",'_label -> "Cantidad: ")),format.raw/*49.167*/("""
	  					 """),format.raw/*50.10*/("""</div>

	  					 <div class="form-group">
	  							"""),_display_(/*53.12*/select(producto_form("categoria"), options(Categoria.options), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Categoria",'_label -> "Categoria: ")),format.raw/*53.182*/("""
	  					 """),format.raw/*54.10*/("""</div>

	  					 <label for="imagen">Imagen: </label>
	  					 <input type="file" name="imagen" id="imagen" class="filestyle" data-buttonText="Seleccione Imagen" data-buttonName="btn-primary" data-iconName="glyphicon glyphicon-picture">

              		""")))}),format.raw/*59.18*/("""

				"""),format.raw/*61.5*/("""</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
					<button type="submit" class="btn btn-primary" data-dismiss="modal"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			</div>

		</div>
	</div>

                	





	<div class="table-responsive">
		<div class="form-group pull-right">
		<input type="text" class="search form-control" placeholder="Busqueda">
	</div>
	<span class="counter pull-right"></span>
	<table class="table table-hover table-bordered results">
		<thead>
			<tr>
				<th>Codigo</th>
				<th class="col-md-5 col-xs-5">Nombre</th>
				<th class="col-md-4 col-xs-4">Tipo</th>
				<th class="col-md-3 col-xs-3">Telefono</th>
				<th class="col-md-3 col-xs-3">Correo</th>
				<th class="col-md-3 col-xs-3">Usuario</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>65498</td>
				<td>Samuel Alexander</td>
				<td>Administrador</td>
				<td>54698465</td>
				<td>samuel@samuel.com</td>
				<td>sn036156</td>
				<td><a href="#" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-edit"></span> Editar</a></td>
				<td><a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Eliminar</a></td>
			</tr>
			<tr>
				<td>654686</td>
				<td>Samuel Alexander</td>
				<td>Administrador</td>
				<td>54698465</td>
				<td>samuel@samuel.com</td>
				<td>sn036156</td>
				<td><a href="#" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-edit"></span> Editar</a></td>
				<td><a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Eliminar</a></td>
			</tr>
			<tr>
				<td>654</td>
				<td>Ana Alexander</td>
				<td>Administrador</td>
				<td>54698465</td>
				<td>samuel@samuel.com</td>
				<td>sn036156</td>
				<td><a href="#" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-edit"></span> Editar</a></td>
				<td><a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Eliminar</a></td>
			</tr>
		</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(producto_form:Form[Producto]): play.twirl.api.HtmlFormat.Appendable = apply(producto_form)

  def f:((Form[Producto]) => play.twirl.api.HtmlFormat.Appendable) = (producto_form) => apply(producto_form)

  def ref: this.type = this

}


}

/**/
object productos extends productos_Scope0.productos
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 23:26:14 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/administrador/productos.scala.html
                  HASH: 6a1377cb2ea11d97e3a9f238cbe324f7aff7b8df
                  MATRIX: 775->1|899->52|909->55|988->59|1016->61|1087->106|1101->112|1174->164|1256->220|1270->226|1336->271|1366->281|1375->283|1454->285|1482->287|1522->301|1536->307|1615->366|1693->417|1708->423|1780->474|1855->32|1882->50|1909->279|1937->510|1965->512|1987->525|2068->597|2107->598|2138->602|2714->1152|2781->1210|2820->1211|2868->1231|2941->1277|3125->1439|3173->1459|3273->1532|3444->1681|3492->1701|3592->1774|3779->1939|3827->1959|3927->2032|4093->2176|4141->2196|4219->2247|4398->2404|4436->2414|4516->2467|4708->2637|4746->2647|5032->2902|5065->2908
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->8|36->8|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|42->1|43->3|44->7|45->11|46->12|46->12|46->12|46->12|49->15|65->31|65->31|65->31|66->32|67->33|67->33|68->34|71->37|71->37|72->38|75->41|75->41|76->42|79->45|79->45|80->46|83->49|83->49|84->50|87->53|87->53|88->54|93->59|95->61
                  -- GENERATED --
              */
          