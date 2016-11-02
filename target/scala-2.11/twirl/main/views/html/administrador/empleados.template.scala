
package views.html.administrador

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object empleados_Scope0 {
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

class empleados extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Empleado],List[Empleado],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empleado_form: Form[Empleado], empleados_list: List[Empleado]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.108*/("""">
""")))};def /*7.2*/js/*7.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.6*/("""
	"""),format.raw/*8.2*/("""<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*8.73*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""
"""),format.raw/*9.2*/("""
"""),_display_(/*10.2*/administrador/*10.15*/.base("Admin CRM","Empleados","Gestion de empleados","empleados",css,js)/*10.87*/{_display_(Seq[Any](format.raw/*10.88*/("""


	"""),format.raw/*13.2*/("""<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Empleado</button>

  	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Agregar nuevo empleado</h4>
				</div>
				<div class="modal-body">



					"""),_display_(/*29.7*/form(action=routes.AdministradorController.empleado_new())/*29.65*/{_display_(Seq[Any](format.raw/*29.66*/("""
                		 """),format.raw/*30.20*/("""<div class="form-group">
                		 	"""),_display_(/*31.22*/inputText(empleado_form("codigo"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Codigo del empleado", '_label -> "Codigo de Empleado: ")),format.raw/*31.184*/("""
                		 """),format.raw/*32.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*35.22*/inputText(empleado_form("nombre"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Nombre del empleado", '_label -> "Nombe: ")),format.raw/*35.171*/("""
                		 """),format.raw/*36.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*39.22*/inputText(empleado_form("telefono"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Numero telefonico", '_label -> "Telefono: ")),format.raw/*39.174*/("""
                		 """),format.raw/*40.20*/("""</div>

                		 <div class="form-group">
                		 	"""),_display_(/*43.22*/inputText(empleado_form("email"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "empleado@empresa.com", '_label -> "Correo Electronico: ")),format.raw/*43.184*/("""
                		 """),format.raw/*44.20*/("""</div>

                		 <div class="form-group">
	  							"""),_display_(/*47.12*/select(empleado_form("tipo.id"), options(TipoEmpleado.options), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Tipo de Empleado",'_label -> "Tipo de Empleado: ")),format.raw/*47.197*/("""
	  					 """),format.raw/*48.10*/("""</div>

	  					 <div class="form-group">
								"""),_display_(/*51.10*/inputText(empleado_form("username"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*51.151*/("""
	  					 """),format.raw/*52.10*/("""</div>

	  					 <div class="form-group">
								"""),_display_(/*55.10*/inputText(empleado_form("password"),'type -> "password", '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*55.189*/("""
	  					 """),format.raw/*56.10*/("""</div>

	  					 <div class="form-group">
	  						<label for="password_confirm">Confirme Contraseña: </label>
    						<input type="password" id="password_confirm" name="password_confirm" value="" placeholder="Use contraseñas seguras" class="form-control"/>
	  					 </div>

              		""")))}),format.raw/*63.18*/("""

				"""),format.raw/*65.5*/("""</div>
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
			"""),_display_(/*103.5*/for(empleado <- empleados_list) yield /*103.36*/{_display_(Seq[Any](format.raw/*103.37*/("""
				"""),format.raw/*104.5*/("""<tr>
					<td>"""),_display_(/*105.11*/empleado/*105.19*/.codigo),format.raw/*105.26*/("""</td>
					<td>"""),_display_(/*106.11*/empleado/*106.19*/.nombre),format.raw/*106.26*/("""</td>
					<td>"""),_display_(/*107.11*/empleado/*107.19*/.tipo.nombre),format.raw/*107.31*/("""</td>
					<td>"""),_display_(/*108.11*/empleado/*108.19*/.telefono),format.raw/*108.28*/("""</td>
					<td>"""),_display_(/*109.11*/empleado/*109.19*/.email),format.raw/*109.25*/("""</td>
					<td>"""),_display_(/*110.11*/empleado/*110.19*/.username),format.raw/*110.28*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*111.93*/empleado/*111.101*/.id),format.raw/*111.104*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*112.94*/empleado/*112.102*/.id),format.raw/*112.105*/(""""><span class="glyphicon glyphicon-remove"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*118.43*/empleado/*118.51*/.id),format.raw/*118.54*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Editar empleado: """),_display_(/*125.50*/empleado/*125.58*/.nombre),format.raw/*125.65*/("""</h4>
							</div>
							<div class="modal-body">


								"""),_display_(/*130.10*/form(action=routes.AdministradorController.empleado_new())/*130.68*/{_display_(Seq[Any](format.raw/*130.69*/("""
			                		 """),format.raw/*131.23*/("""<div class="form-group">
			                		 	"""),_display_(/*132.25*/inputText(empleado.getForm()("codigo"), '_showConstraints -> false ,'class -> "form-control",  '_label -> "Codigo de Empleado: ")),format.raw/*132.154*/("""
			                		 """),format.raw/*133.23*/("""</div>

			                		 <div class="form-group">
			                		 	"""),_display_(/*136.25*/inputText(empleado.getForm()("nombre"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Nombre del empleado", '_label -> "Nombe: ")),format.raw/*136.179*/("""
			                		 """),format.raw/*137.23*/("""</div>

			                		 <div class="form-group">
			                		 	"""),_display_(/*140.25*/inputText(empleado.getForm()("telefono"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Numero telefonico", '_label -> "Telefono: ")),format.raw/*140.182*/("""
			                		 """),format.raw/*141.23*/("""</div>

			                		 <div class="form-group">
			                		 	"""),_display_(/*144.25*/inputText(empleado.getForm()("email"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "empleado@empresa.com", '_label -> "Correo Electronico: ")),format.raw/*144.192*/("""
			                		 """),format.raw/*145.23*/("""</div>

			                		 <div class="form-group">
				  							"""),_display_(/*148.15*/select(empleado.getForm()("tipo.id"), options(TipoEmpleado.options), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Tipo de Empleado",'_label -> "Tipo de Empleado: ")),format.raw/*148.205*/("""
				  					 """),format.raw/*149.13*/("""</div>

				  					 <div class="form-group">
											"""),_display_(/*152.13*/inputText(empleado.getForm()("username"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*152.159*/("""
				  					 """),format.raw/*153.13*/("""</div>

				  					 <div class="form-group">
											"""),_display_(/*156.13*/inputText(empleado.getForm()("password"),'type -> "password", '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*156.197*/("""
				  					 """),format.raw/*157.13*/("""</div>

				  					 <div class="form-group">
				  						<label for="password_confirm">Confirme Contraseña: </label>
			    						<input type="password" id="password_confirm" name="password_confirm" value="" placeholder="Use contraseñas seguras" class="form-control"/>
				  					 </div>

			              		""")))}),format.raw/*164.21*/("""

							"""),format.raw/*166.8*/("""</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
								<button type="submit" class="btn btn-primary" data-dismiss="modal"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Editar</button>
							</div>
						</div>

					</div>
				</div>



				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*179.45*/empleado/*179.53*/.id),format.raw/*179.56*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar empleado: """),_display_(/*186.52*/empleado/*186.60*/.nombre),format.raw/*186.67*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el empleado?.
								Tome en cuenta que se eliminaran todos los datos referentes al empleado.


							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
								<button type="submit" class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Eliminar</button>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*205.5*/("""
		"""),format.raw/*206.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(empleado_form:Form[Empleado],empleados_list:List[Empleado]): play.twirl.api.HtmlFormat.Appendable = apply(empleado_form,empleados_list)

  def f:((Form[Empleado],List[Empleado]) => play.twirl.api.HtmlFormat.Appendable) = (empleado_form,empleados_list) => apply(empleado_form,empleados_list)

  def ref: this.type = this

}


}

/**/
object empleados extends empleados_Scope0.empleados
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 01:34:49 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/administrador/empleados.scala.html
                  HASH: d9e3639e18fce5fe19311a440783981575460d00
                  MATRIX: 790->1|946->84|956->87|1035->91|1066->96|1137->141|1151->147|1224->199|1250->205|1259->207|1338->209|1366->211|1406->225|1420->231|1491->282|1566->64|1593->82|1620->203|1647->318|1675->320|1697->333|1778->405|1817->406|1848->410|2424->960|2491->1018|2530->1019|2578->1039|2651->1085|2835->1247|2883->1267|2983->1340|3154->1489|3202->1509|3302->1582|3476->1734|3524->1754|3624->1827|3808->1989|3856->2009|3946->2072|4153->2257|4191->2267|4269->2318|4432->2459|4470->2469|4548->2520|4749->2699|4787->2709|5112->3003|5145->3009|6308->4145|6356->4176|6396->4177|6429->4182|6472->4197|6490->4205|6519->4212|6563->4228|6581->4236|6610->4243|6654->4259|6672->4267|6706->4279|6750->4295|6768->4303|6799->4312|6843->4328|6861->4336|6889->4342|6933->4358|6951->4366|6982->4375|7108->4473|7127->4481|7153->4484|7344->4647|7363->4655|7389->4658|7565->4806|7583->4814|7608->4817|7909->5090|7927->5098|7956->5105|8047->5168|8115->5226|8155->5227|8207->5250|8284->5299|8436->5428|8488->5451|8595->5530|8772->5684|8824->5707|8931->5786|9111->5943|9163->5966|9270->6045|9460->6212|9512->6235|9609->6304|9822->6494|9864->6507|9949->6564|10118->6710|10160->6723|10245->6780|10452->6964|10494->6977|10835->7286|10872->7295|11306->7701|11324->7709|11349->7712|11652->7987|11670->7995|11699->8002|12276->8548|12307->8551
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->7|35->7|37->7|38->8|38->8|38->8|38->8|40->1|41->3|42->6|43->9|44->10|44->10|44->10|44->10|47->13|63->29|63->29|63->29|64->30|65->31|65->31|66->32|69->35|69->35|70->36|73->39|73->39|74->40|77->43|77->43|78->44|81->47|81->47|82->48|85->51|85->51|86->52|89->55|89->55|90->56|97->63|99->65|137->103|137->103|137->103|138->104|139->105|139->105|139->105|140->106|140->106|140->106|141->107|141->107|141->107|142->108|142->108|142->108|143->109|143->109|143->109|144->110|144->110|144->110|145->111|145->111|145->111|146->112|146->112|146->112|152->118|152->118|152->118|159->125|159->125|159->125|164->130|164->130|164->130|165->131|166->132|166->132|167->133|170->136|170->136|171->137|174->140|174->140|175->141|178->144|178->144|179->145|182->148|182->148|183->149|186->152|186->152|187->153|190->156|190->156|191->157|198->164|200->166|213->179|213->179|213->179|220->186|220->186|220->186|239->205|240->206
                  -- GENERATED --
              */
          