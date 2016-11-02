
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cliente_form: Form[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.9*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/login.css")),format.raw/*5.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/bootstrap-select.min.css")),format.raw/*6.113*/("""">

""")))};def /*9.2*/js/*9.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.6*/("""
	"""),format.raw/*10.2*/("""<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("javascripts/bootstrap-select.min.js")),format.raw/*10.78*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*8.2*/("""
"""),format.raw/*11.2*/("""
"""),_display_(/*12.2*/base("Registro CRM",css,js)/*12.29*/{_display_(Seq[Any](format.raw/*12.30*/("""
"""),format.raw/*13.1*/("""<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-12">
						<p class="active" id="login-form-link">Registrarse</p>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						"""),_display_(/*27.8*/if(flash.containsKey("wp"))/*27.35*/{_display_(Seq[Any](format.raw/*27.36*/("""
							"""),format.raw/*28.8*/("""<div class="alert alert-danger" role="alert">
								<p>"""),_display_(/*29.13*/flash/*29.18*/.get("wp")),format.raw/*29.28*/("""</p>
							</div>
						""")))}),format.raw/*31.8*/("""
						"""),_display_(/*32.8*/if(flash.containsKey("registered"))/*32.43*/{_display_(Seq[Any](format.raw/*32.44*/("""
							"""),format.raw/*33.8*/("""<div class="alert alert-success" role="alert">
								<p>"""),_display_(/*34.13*/flash/*34.18*/.get("registered")),format.raw/*34.36*/("""</p>
							</div>
							<script>
						        var timer = setTimeout(function() """),format.raw/*37.49*/("""{"""),format.raw/*37.50*/("""
						            """),format.raw/*38.19*/("""window.location='"""),_display_(/*38.37*/routes/*38.43*/.HomeController.login),format.raw/*38.64*/("""'
						        """),format.raw/*39.15*/("""}"""),format.raw/*39.16*/(""", 5000);
						    </script>
						""")))}),format.raw/*41.8*/("""
						"""),_display_(/*42.8*/form(action = routes.HomeController.register_post())/*42.60*/{_display_(Seq[Any](format.raw/*42.61*/("""

							"""),format.raw/*44.8*/("""<div class="form-group">
								"""),_display_(/*45.10*/inputText(cliente_form("nombre"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Juan Perez", '_label -> "Nombre: ")),format.raw/*45.150*/("""
	  						"""),format.raw/*46.10*/("""</div>

	  						<div class="form-group">
	  							"""),_display_(/*49.12*/select(cliente_form("genero"), options=(Seq("1"->"Masculino", "2"->"Femenino")), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Elija su genero",'_label -> "Genero: ")),format.raw/*49.203*/("""
							"""),format.raw/*50.8*/("""</div>

	  						<div class="form-group">
								"""),_display_(/*53.10*/inputText(cliente_form("email"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "juan.perez@dominio.com",'_label -> "Correo: ")),format.raw/*53.160*/("""
	  						"""),format.raw/*54.10*/("""</div>

	  						<div class="form-group">
								"""),_display_(/*57.10*/inputText(cliente_form("telefono"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "7859-8956",'_label -> "Telefono: ")),format.raw/*57.152*/("""
	  						"""),format.raw/*58.10*/("""</div>

	  						<div class="form-group">
								"""),_display_(/*61.10*/inputText(cliente_form("tarjeta.numero"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "54953865-898",'_label -> "No. Tarjeta: ")),format.raw/*61.164*/("""
	  						"""),format.raw/*62.10*/("""</div>

							<div class="form-group">
								"""),_display_(/*65.10*/inputText(cliente_form("username"), '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "juanito89",'_label -> "Usuario: ")),format.raw/*65.151*/("""
	  						"""),format.raw/*66.10*/("""</div>

	  						<div class="form-group">
								"""),_display_(/*69.10*/inputText(cliente_form("password"),'type -> "password", '_showConstraints -> false ,'class -> "form-control", 'placeholder -> "Secreto123!#",'_label -> "Contrase;a: ")),format.raw/*69.177*/("""
	  						"""),format.raw/*70.10*/("""</div>

	  						<div class="form-group">
	  							<label for="password_confirm">Confirme Contrase;a: </label>
    							<input type="password" id="password_confirm" name="password_confirm" value="" placeholder="Secreto123!#" class="form-control"/>
	  						</div>

	  						<div class="form-group">
	  							"""),_display_(/*78.12*/select(cliente_form("categorias"), options(Categoria.options), '_showConstraints -> false ,'class -> "form-control selectpicker", 'multiple -> "true", 'placeholder -> "Intereses",'_label -> "Intereses: ")),format.raw/*78.216*/("""
	  						"""),format.raw/*79.10*/("""</div>

	  						<input type = "submit" class="btn btn-primary form-control" value="Registrarme"/>
						""")))}),format.raw/*82.8*/("""
					"""),format.raw/*83.6*/("""</div>
				</div>
			</div>
		</div>
	</div>
</div>

""")))}),format.raw/*90.2*/("""



				"""))
      }
    }
  }

  def render(cliente_form:Form[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(cliente_form)

  def f:((Form[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (cliente_form) => apply(cliente_form)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 15:10:24 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/register.scala.html
                  HASH: 71a92c3387aac3c78478e8b0a76609a5e9c799ac
                  MATRIX: 758->1|880->50|890->53|969->57|1000->62|1071->107|1085->113|1147->155|1225->207|1239->213|1317->270|1344->277|1353->279|1432->281|1461->283|1502->297|1517->303|1594->359|1669->30|1696->48|1723->275|1751->395|1779->397|1815->424|1854->425|1882->426|2271->789|2307->816|2346->817|2381->825|2466->883|2480->888|2511->898|2567->924|2601->932|2645->967|2684->968|2719->976|2805->1035|2819->1040|2858->1058|2969->1141|2998->1142|3045->1161|3090->1179|3105->1185|3147->1206|3191->1222|3220->1223|3286->1259|3320->1267|3381->1319|3420->1320|3456->1329|3517->1363|3679->1503|3717->1513|3797->1566|4010->1757|4045->1765|4123->1816|4295->1966|4333->1976|4411->2027|4575->2169|4613->2179|4691->2230|4867->2384|4905->2394|4981->2443|5144->2584|5182->2594|5260->2645|5449->2812|5487->2822|5827->3135|6053->3339|6091->3349|6227->3455|6260->3461|6344->3515
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|37->9|37->9|39->9|40->10|40->10|40->10|40->10|42->1|43->3|44->8|45->11|46->12|46->12|46->12|47->13|61->27|61->27|61->27|62->28|63->29|63->29|63->29|65->31|66->32|66->32|66->32|67->33|68->34|68->34|68->34|71->37|71->37|72->38|72->38|72->38|72->38|73->39|73->39|75->41|76->42|76->42|76->42|78->44|79->45|79->45|80->46|83->49|83->49|84->50|87->53|87->53|88->54|91->57|91->57|92->58|95->61|95->61|96->62|99->65|99->65|100->66|103->69|103->69|104->70|112->78|112->78|113->79|116->82|117->83|124->90
                  -- GENERATED --
              */
          