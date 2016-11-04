
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_success_Scope0 {
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

class register_success extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/js/*2.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.6*/("""
	"""),format.raw/*3.2*/("""<script>
        var timer = setTimeout(function() """),format.raw/*4.43*/("""{"""),format.raw/*4.44*/("""
            """),format.raw/*5.13*/("""window.location='"""),_display_(/*5.31*/routes/*5.37*/.HomeController.login),format.raw/*5.58*/("""'
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/(""", 3000);
    </script>
""")))};
Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*8.2*/("""
"""),_display_(/*9.2*/base("Usuario Registrado",js)/*9.31*/{_display_(Seq[Any](format.raw/*9.32*/("""
	"""),format.raw/*10.2*/("""<div class="alert alert-success" role="alert">
		<p>Usuario """),_display_(/*11.15*/username),format.raw/*11.23*/(""" """),format.raw/*11.24*/("""creado con Exito!</p>
		<p>Seras redirigido en 5 segundos a la pantalla de logueo...</p>
	</div>
""")))}))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


}

/**/
object register_success extends register_success_Scope0.register_success
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 21:36:24 CST 2016
                  SOURCE: /home/sarahi/crm/app/views/register_success.scala.html
                  HASH: cc3837eaa1c6775316fcdffd5ada5a930c6cb3de
                  MATRIX: 767->1|863->21|872->23|951->25|979->27|1057->78|1085->79|1125->92|1169->110|1183->116|1224->137|1260->147|1288->148|1351->19|1378->172|1405->174|1442->203|1480->204|1509->206|1597->267|1626->275|1655->276
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|40->1|41->8|42->9|42->9|42->9|43->10|44->11|44->11|44->11
                  -- GENERATED --
              */
          