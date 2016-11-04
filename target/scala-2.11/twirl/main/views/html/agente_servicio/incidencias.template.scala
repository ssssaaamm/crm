
package views.html.agente_servicio

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object incidencias_Scope0 {
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

class incidencias extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Incidencia],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(incidencias_list: List[Incidencia] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/css/*3.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.7*/("""
	
""")))};def /*7.2*/js/*7.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.6*/("""
	
""")))};
Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*9.2*/("""
"""),_display_(/*10.2*/agente_servicio/*10.17*/.base("Agente Servicio CRM","Incidencias","Gestion de incidencias","incidencias",css,js)/*10.105*/{_display_(Seq[Any](format.raw/*10.106*/("""

""")))}))
      }
    }
  }

  def render(incidencias_list:List[Incidencia]): play.twirl.api.HtmlFormat.Appendable = apply(incidencias_list)

  def f:((List[Incidencia]) => play.twirl.api.HtmlFormat.Appendable) = (incidencias_list) => apply(incidencias_list)

  def ref: this.type = this

}


}

/**/
object incidencias extends incidencias_Scope0.incidencias
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 23:23:13 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/agente_servicio/incidencias.scala.html
                  HASH: bf42e363f8c988fa6e82ddd38fd82d7b0b272aa8
                  MATRIX: 783->1|898->41|908->44|987->46|1013->53|1022->55|1101->57|1144->38|1172->50|1200->61|1228->63|1252->78|1350->166|1390->167
                  LINES: 27->1|31->3|31->3|33->3|35->7|35->7|37->7|40->1|42->5|44->9|45->10|45->10|45->10|45->10
                  -- GENERATED --
              */
          