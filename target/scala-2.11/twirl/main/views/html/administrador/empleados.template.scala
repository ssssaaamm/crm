
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
  def apply/*1.2*/(empleado_form: Form[Empleado], empleados_list: List[Empleado] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.108*/("""">
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*9.73*/("""" type="text/javascript"></script>

	"""),_display_(/*11.3*/if(flash.containsKey("modal"))/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""
		"""),format.raw/*12.3*/("""<script>
	    	$(window).load(function()"""),format.raw/*13.32*/("""{"""),format.raw/*13.33*/("""
	        	"""),format.raw/*14.11*/("""$('#"""),_display_(/*14.16*/flash/*14.21*/.get("modal")),format.raw/*14.34*/("""').modal('show');
	    	"""),format.raw/*15.7*/("""}"""),format.raw/*15.8*/(""");
	    </script>
	""")))}),format.raw/*17.3*/("""


	"""),format.raw/*20.2*/("""<!-- fix modal close -->
	<script>
		$('.modal').on('hidden.bs.modal', function () """),format.raw/*22.49*/("""{"""),format.raw/*22.50*/("""
			"""),format.raw/*23.4*/("""if(window.location.pathname!='"""),_display_(/*23.35*/routes/*23.41*/.AdministradorController.empleados),format.raw/*23.75*/("""')"""),format.raw/*23.77*/("""{"""),format.raw/*23.78*/("""
				
				"""),format.raw/*25.5*/("""window.location='"""),_display_(/*25.23*/routes/*25.29*/.AdministradorController.empleados),format.raw/*25.63*/("""';
			"""),format.raw/*26.4*/("""}"""),format.raw/*26.5*/("""	
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");
	</script>






""")))};def /*37.2*/errores_formulario/*37.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*37.22*/("""

	"""),_display_(/*39.3*/if(empleado_form.hasGlobalErrors)/*39.36*/ {_display_(Seq[Any](format.raw/*39.38*/("""

        """),_display_(/*41.10*/for(error <- empleado_form.globalErrors) yield /*41.50*/ {_display_(Seq[Any](format.raw/*41.52*/("""
	        """),format.raw/*42.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*44.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*44.67*/("""</strong>
			</div>
        """)))}),format.raw/*46.10*/("""
	""")))}),format.raw/*47.3*/("""

	"""),_display_(/*49.3*/for(error <- empleado_form("codigo").errors) yield /*49.47*/ {_display_(Seq[Any](format.raw/*49.49*/("""
		"""),format.raw/*50.3*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*52.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*52.66*/("""</strong>
		</div>
	""")))}),format.raw/*54.3*/("""

	"""),_display_(/*56.3*/for(error <- empleado_form("nombre").errors) yield /*56.47*/ {_display_(Seq[Any](format.raw/*56.49*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""

	"""),_display_(/*63.3*/for(error <- empleado_form("telefono").errors) yield /*63.49*/ {_display_(Seq[Any](format.raw/*63.51*/("""
    	"""),format.raw/*64.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*66.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*66.66*/("""</strong>
		</div>
	""")))}),format.raw/*68.3*/("""

	"""),_display_(/*70.3*/for(error <- empleado_form("email").errors) yield /*70.46*/ {_display_(Seq[Any](format.raw/*70.48*/("""
    	"""),format.raw/*71.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*73.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*73.66*/("""</strong>
		</div>
	""")))}),format.raw/*75.3*/("""

	"""),_display_(/*77.3*/for(error <- empleado_form("username").errors) yield /*77.49*/ {_display_(Seq[Any](format.raw/*77.51*/("""
    	"""),format.raw/*78.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*80.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*80.66*/("""</strong>
		</div>
	""")))}),format.raw/*82.3*/("""

	"""),_display_(/*84.3*/for(error <- empleado_form("password").errors) yield /*84.49*/ {_display_(Seq[Any](format.raw/*84.51*/("""
    	"""),format.raw/*85.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*87.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*87.66*/("""</strong>
		</div>
	""")))}),format.raw/*89.3*/("""

	"""),_display_(/*91.3*/for(error <- empleado_form("password_confirmation").errors) yield /*91.62*/ {_display_(Seq[Any](format.raw/*91.64*/("""
    	"""),format.raw/*92.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*94.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*94.66*/("""</strong>
		</div>
	""")))}),format.raw/*96.3*/("""

""")))};
Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*35.2*/("""

"""),format.raw/*98.2*/("""

"""),_display_(/*100.2*/administrador/*100.15*/.base("Admin CRM","Empleados","Gestion de empleados","empleados",css,js)/*100.87*/{_display_(Seq[Any](format.raw/*100.88*/("""


	"""),format.raw/*103.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Empleado</button>

	"""),_display_(/*105.3*/if(flash.containsKey("exito"))/*105.33*/{_display_(Seq[Any](format.raw/*105.34*/("""
		"""),format.raw/*106.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*109.13*/flash/*109.18*/.get("exito")),format.raw/*109.31*/("""</strong>
		</div>
	""")))}),format.raw/*111.3*/("""


  	"""),format.raw/*114.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*121.5*/form(action=routes.AdministradorController.empleado_new())/*121.63*/{_display_(Seq[Any](format.raw/*121.64*/("""
				"""),format.raw/*122.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo empleado</h4>
				</div>
				"""),_display_(/*126.6*/errores_formulario),format.raw/*126.24*/("""
				"""),format.raw/*127.5*/("""<div class="modal-body">



						
	        		 <div class="form-group">
	        		 	"""),_display_(/*133.15*/inputText(empleado_form("codigo"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del empleado", '_label -> "Codigo de Empleado: ")),format.raw/*133.200*/("""
	        		 """),format.raw/*134.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*137.15*/inputText(empleado_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del empleado", '_label -> "Nombe: ")),format.raw/*137.187*/("""
	        		 """),format.raw/*138.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*141.15*/inputText(empleado_form("telefono"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Numero telefonico", '_label -> "Telefono: ")),format.raw/*141.190*/("""
	        		 """),format.raw/*142.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*145.15*/inputText(empleado_form("email"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "empleado@empresa.com", '_label -> "Correo Electronico: ")),format.raw/*145.200*/("""
	        		 """),format.raw/*146.13*/("""</div>

	        		 <div class="form-group">
						"""),_display_(/*149.8*/select(empleado_form("tipo.id"), options(TipoEmpleado.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Empleado",'_label -> "Tipo de Empleado: ")),format.raw/*149.216*/("""
					 """),format.raw/*150.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*153.8*/inputText(empleado_form("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*153.172*/("""
					 """),format.raw/*154.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*157.8*/inputText(empleado_form("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*157.210*/("""
					 """),format.raw/*158.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*161.8*/inputText(empleado_form("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*161.232*/("""
					 """),format.raw/*162.7*/("""</div>




				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*172.5*/("""
		"""),format.raw/*173.3*/("""</div>

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
			"""),_display_(/*206.5*/for(empleado <- empleados_list) yield /*206.36*/{_display_(Seq[Any](format.raw/*206.37*/("""
				"""),format.raw/*207.5*/("""<tr>
					<td>"""),_display_(/*208.11*/empleado/*208.19*/.codigo),format.raw/*208.26*/("""</td>
					<td>"""),_display_(/*209.11*/empleado/*209.19*/.nombre),format.raw/*209.26*/("""</td>
					<td>"""),_display_(/*210.11*/empleado/*210.19*/.tipo.nombre),format.raw/*210.31*/("""</td>
					<td>"""),_display_(/*211.11*/empleado/*211.19*/.telefono),format.raw/*211.28*/("""</td>
					<td>"""),_display_(/*212.11*/empleado/*212.19*/.email),format.raw/*212.25*/("""</td>
					<td>"""),_display_(/*213.11*/empleado/*213.19*/.username),format.raw/*213.28*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*214.93*/empleado/*214.101*/.id),format.raw/*214.104*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*215.94*/empleado/*215.102*/.id),format.raw/*215.105*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*221.43*/empleado/*221.51*/.id),format.raw/*221.54*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*227.8*/form(action=routes.AdministradorController.empleado_edit(empleado.id))/*227.78*/{_display_(Seq[Any](format.raw/*227.79*/("""
							"""),format.raw/*228.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar empleado: """),_display_(/*230.51*/empleado/*230.59*/.nombre),format.raw/*230.66*/("""</h4>
								</div>
								"""),_display_(/*232.10*/errores_formulario),format.raw/*232.28*/("""
								"""),format.raw/*233.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*237.19*/inputText(empleado.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del empleado", '_label -> "Codigo de Empleado: ")),format.raw/*237.230*/("""
					        		 """),format.raw/*238.17*/("""</div>
									
					        		 <div class="form-group">
					        		 	"""),_display_(/*241.19*/inputText(empleado.getForm()("codigo"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del empleado", '_label -> "Codigo de Empleado: ")),format.raw/*241.209*/("""
					        		 """),format.raw/*242.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*245.19*/inputText(empleado.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del empleado", '_label -> "Nombe: ")),format.raw/*245.196*/("""
					        		 """),format.raw/*246.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*249.19*/inputText(empleado.getForm()("telefono"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Numero telefonico", '_label -> "Telefono: ")),format.raw/*249.199*/("""
					        		 """),format.raw/*250.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*253.19*/inputText(empleado.getForm()("email"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "empleado@empresa.com", '_label -> "Correo Electronico: ")),format.raw/*253.209*/("""
					        		 """),format.raw/*254.17*/("""</div>

					        		 <div class="form-group">
										"""),_display_(/*257.12*/select(empleado.getForm()("tipo.id"), options(TipoEmpleado.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Empleado",'_label -> "Tipo de Empleado: ")),format.raw/*257.225*/("""
									 """),format.raw/*258.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*261.12*/inputText(empleado.getForm()("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*261.181*/("""
									 """),format.raw/*262.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*265.12*/inputText(empleado.getForm()("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*265.219*/("""
									 """),format.raw/*266.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*269.12*/inputText(empleado.getForm()("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*269.241*/("""
									 """),format.raw/*270.11*/("""</div>




								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*281.8*/("""
					"""),format.raw/*282.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*290.45*/empleado/*290.53*/.id),format.raw/*290.56*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar empleado: """),_display_(/*297.52*/empleado/*297.60*/.nombre),format.raw/*297.67*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el empleado?.
								Tome en cuenta que se eliminaran todos los datos referentes al empleado.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
								<!-- <a href=""""),_display_(/*309.24*/routes/*309.30*/.AdministradorController.empleado_remove(empleado.id)),format.raw/*309.83*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</a> -->
								
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*311.85*/routes/*311.91*/.AdministradorController.empleado_remove(empleado.id)),format.raw/*311.144*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*320.5*/("""
		"""),format.raw/*321.3*/("""</tbody>
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
                  DATE: Thu Nov 03 00:58:29 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/administrador/empleados.scala.html
                  HASH: 0c9a8aba3147ff7ca0b836ef28eb8630a73fa149
                  MATRIX: 790->1|947->85|957->88|1036->92|1067->97|1138->142|1152->148|1225->200|1251->207|1260->209|1339->211|1367->213|1407->227|1421->233|1492->284|1556->322|1595->352|1635->354|1665->357|1733->397|1762->398|1801->409|1833->414|1847->419|1881->432|1932->456|1960->457|2010->477|2041->481|2152->564|2181->565|2212->569|2270->600|2285->606|2340->640|2370->642|2399->643|2436->653|2481->671|2496->677|2551->711|2584->717|2612->718|2643->722|2671->723|2715->747|2742->765|2823->767|2853->771|2895->804|2935->806|2973->817|3029->857|3069->859|3107->869|3262->997|3336->1050|3396->1079|3429->1082|3459->1086|3519->1130|3559->1132|3589->1135|3742->1261|3816->1314|3867->1335|3897->1339|3957->1383|3997->1385|4030->1391|4183->1517|4257->1570|4308->1591|4338->1595|4400->1641|4440->1643|4473->1649|4626->1775|4700->1828|4751->1849|4781->1853|4840->1896|4880->1898|4913->1904|5066->2030|5140->2083|5191->2104|5221->2108|5283->2154|5323->2156|5356->2162|5509->2288|5583->2341|5634->2362|5664->2366|5726->2412|5766->2414|5799->2420|5952->2546|6026->2599|6077->2620|6107->2624|6182->2683|6222->2685|6255->2691|6408->2817|6482->2870|6533->2891|6575->65|6602->83|6629->204|6658->744|6687->2894|6717->2897|6740->2910|6822->2982|6862->2983|6894->2987|7126->3192|7166->3222|7206->3223|7237->3226|7467->3428|7482->3433|7517->3446|7569->3467|7603->3473|7787->3630|7855->3688|7895->3689|7928->3694|8134->3873|8174->3891|8207->3896|8321->3982|8529->4167|8571->4180|8658->4239|8853->4411|8895->4424|8982->4483|9180->4658|9222->4671|9309->4730|9517->4915|9559->4928|9638->4980|9869->5188|9904->5195|9977->5241|10164->5405|10199->5412|10272->5458|10497->5660|10532->5667|10605->5713|10852->5937|10887->5944|11210->6236|11241->6239|12109->7080|12157->7111|12197->7112|12230->7117|12273->7132|12291->7140|12320->7147|12364->7163|12382->7171|12411->7178|12455->7194|12473->7202|12507->7214|12551->7230|12569->7238|12600->7247|12644->7263|12662->7271|12690->7277|12734->7293|12752->7301|12783->7310|12909->7408|12928->7416|12954->7419|13145->7582|13164->7590|13190->7593|13365->7740|13383->7748|13408->7751|13558->7874|13638->7944|13678->7945|13714->7953|13901->8112|13919->8120|13948->8127|14006->8157|14046->8175|14083->8184|14191->8264|14425->8475|14471->8492|14575->8568|14788->8758|14834->8775|14929->8842|15129->9019|15175->9036|15270->9103|15473->9283|15519->9300|15614->9367|15827->9557|15873->9574|15961->9634|16197->9847|16237->9858|16319->9912|16511->10081|16551->10092|16633->10146|16863->10353|16903->10364|16985->10418|17237->10647|17277->10658|17642->10992|17676->10998|17790->11084|17808->11092|17833->11095|18136->11370|18154->11378|18183->11385|18578->11752|18594->11758|18669->11811|18899->12013|18915->12019|18991->12072|19182->12232|19213->12235
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|40->11|40->11|40->11|41->12|42->13|42->13|43->14|43->14|43->14|43->14|44->15|44->15|46->17|49->20|51->22|51->22|52->23|52->23|52->23|52->23|52->23|52->23|54->25|54->25|54->25|54->25|55->26|55->26|56->27|56->27|64->37|64->37|66->37|68->39|68->39|68->39|70->41|70->41|70->41|71->42|73->44|73->44|75->46|76->47|78->49|78->49|78->49|79->50|81->52|81->52|83->54|85->56|85->56|85->56|86->57|88->59|88->59|90->61|92->63|92->63|92->63|93->64|95->66|95->66|97->68|99->70|99->70|99->70|100->71|102->73|102->73|104->75|106->77|106->77|106->77|107->78|109->80|109->80|111->82|113->84|113->84|113->84|114->85|116->87|116->87|118->89|120->91|120->91|120->91|121->92|123->94|123->94|125->96|128->1|129->3|130->6|132->35|134->98|136->100|136->100|136->100|136->100|139->103|141->105|141->105|141->105|142->106|145->109|145->109|145->109|147->111|150->114|157->121|157->121|157->121|158->122|162->126|162->126|163->127|169->133|169->133|170->134|173->137|173->137|174->138|177->141|177->141|178->142|181->145|181->145|182->146|185->149|185->149|186->150|189->153|189->153|190->154|193->157|193->157|194->158|197->161|197->161|198->162|208->172|209->173|242->206|242->206|242->206|243->207|244->208|244->208|244->208|245->209|245->209|245->209|246->210|246->210|246->210|247->211|247->211|247->211|248->212|248->212|248->212|249->213|249->213|249->213|250->214|250->214|250->214|251->215|251->215|251->215|257->221|257->221|257->221|263->227|263->227|263->227|264->228|266->230|266->230|266->230|268->232|268->232|269->233|273->237|273->237|274->238|277->241|277->241|278->242|281->245|281->245|282->246|285->249|285->249|286->250|289->253|289->253|290->254|293->257|293->257|294->258|297->261|297->261|298->262|301->265|301->265|302->266|305->269|305->269|306->270|317->281|318->282|326->290|326->290|326->290|333->297|333->297|333->297|345->309|345->309|345->309|347->311|347->311|347->311|356->320|357->321
                  -- GENERATED --
              */
          