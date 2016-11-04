
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

class productos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Producto],List[Producto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(producto_form: Form[Producto], productos_list: List[Producto] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.108*/("""">
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("javascripts/bootstrap-filestyle.min.js")),format.raw/*9.81*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*10.73*/("""" type="text/javascript"></script>

	"""),_display_(/*12.3*/if(flash.containsKey("modal"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
		"""),format.raw/*13.3*/("""<script>
	    	$(window).load(function()"""),format.raw/*14.32*/("""{"""),format.raw/*14.33*/("""
	        	"""),format.raw/*15.11*/("""$('#"""),_display_(/*15.16*/flash/*15.21*/.get("modal")),format.raw/*15.34*/("""').modal('show');
	    	"""),format.raw/*16.7*/("""}"""),format.raw/*16.8*/(""");
	    </script>
	""")))}),format.raw/*18.3*/("""

	"""),format.raw/*20.2*/("""<!-- fix modal close -->
	<script>
		$('.modal').on('hidden.bs.modal', function () """),format.raw/*22.49*/("""{"""),format.raw/*22.50*/("""
			"""),format.raw/*23.4*/("""if(window.location.pathname!='"""),_display_(/*23.35*/routes/*23.41*/.AdministradorController.productos),format.raw/*23.75*/("""')"""),format.raw/*23.77*/("""{"""),format.raw/*23.78*/("""
				
				"""),format.raw/*25.5*/("""window.location='"""),_display_(/*25.23*/routes/*25.29*/.AdministradorController.productos),format.raw/*25.63*/("""';
			"""),format.raw/*26.4*/("""}"""),format.raw/*26.5*/("""	
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");
	</script>

""")))};def /*32.2*/errores_formulario/*32.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.22*/("""

	"""),_display_(/*34.3*/if(producto_form.hasGlobalErrors)/*34.36*/ {_display_(Seq[Any](format.raw/*34.38*/("""

        """),_display_(/*36.10*/for(error <- producto_form.globalErrors) yield /*36.50*/ {_display_(Seq[Any](format.raw/*36.52*/("""
	        """),format.raw/*37.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*39.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*39.67*/("""</strong>
			</div>
        """)))}),format.raw/*41.10*/("""
	""")))}),format.raw/*42.3*/("""

	"""),_display_(/*44.3*/for(error <- producto_form("codigo").errors) yield /*44.47*/ {_display_(Seq[Any](format.raw/*44.49*/("""
		"""),format.raw/*45.3*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*47.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*47.66*/("""</strong>
		</div>
	""")))}),format.raw/*49.3*/("""

	"""),_display_(/*51.3*/for(error <- producto_form("nombre").errors) yield /*51.47*/ {_display_(Seq[Any](format.raw/*51.49*/("""
    	"""),format.raw/*52.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*54.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*54.66*/("""</strong>
		</div>
	""")))}),format.raw/*56.3*/("""

	"""),_display_(/*58.3*/for(error <- producto_form("descripcion").errors) yield /*58.52*/ {_display_(Seq[Any](format.raw/*58.54*/("""
    	"""),format.raw/*59.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*61.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*61.66*/("""</strong>
		</div>
	""")))}),format.raw/*63.3*/("""

	"""),_display_(/*65.3*/for(error <- producto_form("precio").errors) yield /*65.47*/ {_display_(Seq[Any](format.raw/*65.49*/("""
    	"""),format.raw/*66.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*68.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*68.66*/("""</strong>
		</div>
	""")))}),format.raw/*70.3*/("""

	"""),_display_(/*72.3*/for(error <- producto_form("existencias").errors) yield /*72.52*/ {_display_(Seq[Any](format.raw/*72.54*/("""
    	"""),format.raw/*73.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*75.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*75.66*/("""</strong>
		</div>
	""")))}),format.raw/*77.3*/("""

	"""),_display_(/*79.3*/for(error <- producto_form("categoria").errors) yield /*79.50*/ {_display_(Seq[Any](format.raw/*79.52*/("""
    	"""),format.raw/*80.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*82.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*82.66*/("""</strong>
		</div>
	""")))}),format.raw/*84.3*/("""

	"""),_display_(/*86.3*/for(error <- producto_form("imagen").errors) yield /*86.47*/ {_display_(Seq[Any](format.raw/*86.49*/("""
    	"""),format.raw/*87.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*89.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*89.66*/("""</strong>
		</div>
	""")))}),format.raw/*91.3*/("""

""")))};
Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*93.2*/("""

"""),_display_(/*95.2*/administrador/*95.15*/.base("Admin CRM","Productos","Gestion de productos","productos",css,js)/*95.87*/{_display_(Seq[Any](format.raw/*95.88*/("""


	"""),format.raw/*98.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar producto</button>

	"""),_display_(/*100.3*/if(flash.containsKey("exito"))/*100.33*/{_display_(Seq[Any](format.raw/*100.34*/("""
		"""),format.raw/*101.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*104.13*/flash/*104.18*/.get("exito")),format.raw/*104.31*/("""</strong>
		</div>
	""")))}),format.raw/*106.3*/("""


  	"""),format.raw/*109.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*116.5*/form(action=routes.AdministradorController.producto_new())/*116.63*/{_display_(Seq[Any](format.raw/*116.64*/("""
				"""),format.raw/*117.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo producto</h4>
				</div>
				"""),_display_(/*121.6*/errores_formulario),format.raw/*121.24*/("""
				"""),format.raw/*122.5*/("""<div class="modal-body">



						
	        		 <div class="form-group">
	        		 	"""),_display_(/*128.15*/inputText(producto_form("codigo"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del producto", '_label -> "Codigo de Producto: ")),format.raw/*128.200*/("""
	        		 """),format.raw/*129.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*132.15*/inputText(producto_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del producto", '_label -> "Nombre: ")),format.raw/*132.188*/("""
	        		 """),format.raw/*133.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*136.15*/inputText(producto_form("decripcion"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Descripción", '_label -> "Descripción: ")),format.raw/*136.189*/("""
	        		 """),format.raw/*137.13*/("""</div>

	        		 <div class="form-group">
	        		 	"""),_display_(/*140.15*/inputText(producto_form("precio"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "29.1", '_label -> "Precio: ")),format.raw/*140.173*/("""
	        		 """),format.raw/*141.13*/("""</div>

	        		  <div class="form-group">
	        		 	"""),_display_(/*144.15*/inputText(producto_form("existencias"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "29", '_label -> "Existencia: ")),format.raw/*144.180*/("""
	        		 """),format.raw/*145.13*/("""</div>


	        		 <div class="form-group">
						"""),_display_(/*149.8*/select(producto_form("categoria.id"), options(Categoria.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Categoria",'_label -> "Categoria: ")),format.raw/*149.204*/("""
					 """),format.raw/*150.7*/("""</div>

					 <label for="imagen">Imagen:</label>
					 <input type="file" name="imagen" id="imagen" class="filestyle" data-buttonText="Seleccione Imagen" data-buttomName="btn-primary" data-iconName="glyphicon glyphicon-picture">

				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*160.5*/("""
		"""),format.raw/*161.3*/("""</div>

		</div>
	</div>

                	


<!--tabla que muestra la lista de productos-->


	<div class="table-responsive">
		<div class="form-group pull-right">
		<input type="text" class="search form-control" placeholder="Busqueda">
	</div>
	<span class="counter pull-right"></span>
	<table class="table table-hover table-bordered results">
		<thead>
			<tr>
				<th class="col-md-2 col-xs-2">Codigo</th>
				<th class="col-md-3 col-xs-3">Imagen</th>
				<th class="col-md-4 col-xs-4">Nombre</th>
				<th class="col-md-3 col-xs-3">Precio</th>
				<th class="col-md-3 col-xs-3">existencias</th>
				<th class="col-md-5 col-xs-5">Categoria</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*194.5*/for(producto <- productos_list) yield /*194.36*/{_display_(Seq[Any](format.raw/*194.37*/("""
				"""),format.raw/*195.5*/("""<tr>
					<td>"""),_display_(/*196.11*/producto/*196.19*/.codigo),format.raw/*196.26*/("""</td>
					<td>"""),_display_(/*197.11*/producto/*197.19*/.imagen),format.raw/*197.26*/("""</td>
					<td>"""),_display_(/*198.11*/producto/*198.19*/.nombre),format.raw/*198.26*/("""</td>
					<td>"""),_display_(/*199.11*/producto/*199.19*/.precio),format.raw/*199.26*/("""</td>
					<td>"""),_display_(/*200.11*/producto/*200.19*/.existencias),format.raw/*200.31*/("""</td>
					<td>"""),_display_(/*201.11*/producto/*201.19*/.categoria.nombre),format.raw/*201.36*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*202.93*/producto/*202.101*/.id),format.raw/*202.104*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*203.94*/producto/*203.102*/.id),format.raw/*203.105*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*209.43*/producto/*209.51*/.id),format.raw/*209.54*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*215.8*/form(action=routes.AdministradorController.producto_edit(producto.id))/*215.78*/{_display_(Seq[Any](format.raw/*215.79*/("""
							"""),format.raw/*216.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar producto: """),_display_(/*218.51*/producto/*218.59*/.nombre),format.raw/*218.66*/("""</h4>
								</div>
								"""),_display_(/*220.10*/errores_formulario),format.raw/*220.28*/("""
								"""),format.raw/*221.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*225.19*/inputText(producto.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del producto", '_label -> "Codigo de producto: ")),format.raw/*225.230*/("""
					        		 """),format.raw/*226.17*/("""</div>
									
					        		 <div class="form-group">
					        		 	"""),_display_(/*229.19*/inputText(producto.getForm()("codigo"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Codigo del producto", '_label -> "Codigo de Producto: ")),format.raw/*229.209*/("""
					        		 """),format.raw/*230.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*233.19*/inputText(producto.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del producto", '_label -> "Nombre: ")),format.raw/*233.197*/("""
					        		 """),format.raw/*234.17*/("""</div>
					        		  <div class="form-group">
					        		 	"""),_display_(/*236.19*/inputText(producto.getForm()("descripcion"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Descripción del producto", '_label -> "Descripción: ")),format.raw/*236.212*/("""
					        		 """),format.raw/*237.17*/("""</div>
									 <div class="form-group">
					        		 	"""),_display_(/*239.19*/inputText(producto.getForm()("precio"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "20.1", '_label -> "Precio: ")),format.raw/*239.182*/("""
					        		 """),format.raw/*240.17*/("""</div>
					        		 <div class="form-group">
					        		 	"""),_display_(/*242.19*/inputText(producto.getForm()("existencias"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Existencias", '_label -> "Existencias: ")),format.raw/*242.199*/("""
					        		 """),format.raw/*243.17*/("""</div>
			        		
					        		 <div class="form-group">
										"""),_display_(/*246.12*/select(producto.getForm()("categoria.id"), options(Categoria.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Categoria",'_label -> "Categoría: ")),format.raw/*246.213*/("""
									 """),format.raw/*247.11*/("""</div>

									<label for="imagen">Imagen:</label>
					 				<input type="file" name="imagen" id="imagen" class="filestyle" data-buttonText="Seleccione Imagen" data-buttomName="btn-primary" data-iconName="glyphicon glyphicon-picture">

									 

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*260.8*/("""
					"""),format.raw/*261.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*269.45*/producto/*269.53*/.id),format.raw/*269.56*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar producto: """),_display_(/*276.52*/producto/*276.60*/.nombre),format.raw/*276.67*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el producto?.
								Tome en cuenta que se eliminaran todos los datos referentes al producto.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
								<!-- <a href=""""),_display_(/*288.24*/routes/*288.30*/.AdministradorController.producto_remove(producto.id)),format.raw/*288.83*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</a> -->
								
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*290.85*/routes/*290.91*/.AdministradorController.producto_remove(producto.id)),format.raw/*290.144*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*299.5*/("""
		"""),format.raw/*300.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(producto_form:Form[Producto],productos_list:List[Producto]): play.twirl.api.HtmlFormat.Appendable = apply(producto_form,productos_list)

  def f:((Form[Producto],List[Producto]) => play.twirl.api.HtmlFormat.Appendable) = (producto_form,productos_list) => apply(producto_form,productos_list)

  def ref: this.type = this

}


}

/**/
object productos extends productos_Scope0.productos
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 23:43:43 CST 2016
                  SOURCE: /home/sarahi/crm/app/views/administrador/productos.scala.html
                  HASH: d2973b69cb0d6dd661779e4307ec50c75d1a4dac
                  MATRIX: 790->1|947->85|957->88|1036->92|1067->97|1138->142|1152->148|1225->200|1251->207|1260->209|1339->211|1367->213|1407->227|1421->233|1500->292|1577->342|1592->348|1664->399|1728->437|1767->467|1807->469|1837->472|1905->512|1934->513|1973->524|2005->529|2019->534|2053->547|2104->571|2132->572|2182->592|2212->595|2323->678|2352->679|2383->683|2441->714|2456->720|2511->754|2541->756|2570->757|2607->767|2652->785|2667->791|2722->825|2755->831|2783->832|2814->836|2842->837|2881->856|2908->874|2989->876|3019->880|3061->913|3101->915|3139->926|3195->966|3235->968|3273->978|3428->1106|3502->1159|3562->1188|3595->1191|3625->1195|3685->1239|3725->1241|3755->1244|3908->1370|3982->1423|4033->1444|4063->1448|4123->1492|4163->1494|4196->1500|4349->1626|4423->1679|4474->1700|4504->1704|4569->1753|4609->1755|4642->1761|4795->1887|4869->1940|4920->1961|4950->1965|5010->2009|5050->2011|5083->2017|5236->2143|5310->2196|5361->2217|5391->2221|5456->2270|5496->2272|5529->2278|5682->2404|5756->2457|5807->2478|5837->2482|5900->2529|5940->2531|5973->2537|6126->2663|6200->2716|6251->2737|6281->2741|6341->2785|6381->2787|6414->2793|6567->2919|6641->2972|6692->2993|6734->65|6761->83|6788->204|6817->853|6846->2996|6875->2999|6897->3012|6978->3084|7017->3085|7048->3089|7280->3294|7320->3324|7360->3325|7391->3328|7621->3530|7636->3535|7671->3548|7723->3569|7757->3575|7941->3732|8009->3790|8049->3791|8082->3796|8288->3975|8328->3993|8361->3998|8475->4084|8683->4269|8725->4282|8812->4341|9008->4514|9050->4527|9137->4586|9334->4760|9376->4773|9463->4832|9644->4990|9686->5003|9774->5063|9962->5228|10004->5241|10084->5294|10303->5490|10338->5497|10881->6009|10912->6012|11859->6932|11907->6963|11947->6964|11980->6969|12023->6984|12041->6992|12070->6999|12114->7015|12132->7023|12161->7030|12205->7046|12223->7054|12252->7061|12296->7077|12314->7085|12343->7092|12387->7108|12405->7116|12439->7128|12483->7144|12501->7152|12540->7169|12666->7267|12685->7275|12711->7278|12902->7441|12921->7449|12947->7452|13122->7599|13140->7607|13165->7610|13315->7733|13395->7803|13435->7804|13471->7812|13658->7971|13676->7979|13705->7986|13763->8016|13803->8034|13840->8043|13948->8123|14182->8334|14228->8351|14332->8427|14545->8617|14591->8634|14686->8701|14887->8879|14933->8896|15028->8963|15244->9156|15290->9173|15378->9233|15564->9396|15610->9413|15704->9479|15907->9659|15953->9676|16054->9749|16278->9950|16318->9961|16922->10534|16956->10540|17070->10626|17088->10634|17113->10637|17416->10912|17434->10920|17463->10927|17858->11294|17874->11300|17949->11353|18179->11555|18195->11561|18271->11614|18462->11774|18493->11777
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|39->10|39->10|39->10|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|49->20|51->22|51->22|52->23|52->23|52->23|52->23|52->23|52->23|54->25|54->25|54->25|54->25|55->26|55->26|56->27|56->27|59->32|59->32|61->32|63->34|63->34|63->34|65->36|65->36|65->36|66->37|68->39|68->39|70->41|71->42|73->44|73->44|73->44|74->45|76->47|76->47|78->49|80->51|80->51|80->51|81->52|83->54|83->54|85->56|87->58|87->58|87->58|88->59|90->61|90->61|92->63|94->65|94->65|94->65|95->66|97->68|97->68|99->70|101->72|101->72|101->72|102->73|104->75|104->75|106->77|108->79|108->79|108->79|109->80|111->82|111->82|113->84|115->86|115->86|115->86|116->87|118->89|118->89|120->91|123->1|124->3|125->6|127->30|129->93|131->95|131->95|131->95|131->95|134->98|136->100|136->100|136->100|137->101|140->104|140->104|140->104|142->106|145->109|152->116|152->116|152->116|153->117|157->121|157->121|158->122|164->128|164->128|165->129|168->132|168->132|169->133|172->136|172->136|173->137|176->140|176->140|177->141|180->144|180->144|181->145|185->149|185->149|186->150|196->160|197->161|230->194|230->194|230->194|231->195|232->196|232->196|232->196|233->197|233->197|233->197|234->198|234->198|234->198|235->199|235->199|235->199|236->200|236->200|236->200|237->201|237->201|237->201|238->202|238->202|238->202|239->203|239->203|239->203|245->209|245->209|245->209|251->215|251->215|251->215|252->216|254->218|254->218|254->218|256->220|256->220|257->221|261->225|261->225|262->226|265->229|265->229|266->230|269->233|269->233|270->234|272->236|272->236|273->237|275->239|275->239|276->240|278->242|278->242|279->243|282->246|282->246|283->247|296->260|297->261|305->269|305->269|305->269|312->276|312->276|312->276|324->288|324->288|324->288|326->290|326->290|326->290|335->299|336->300
                  -- GENERATED --
              */
          