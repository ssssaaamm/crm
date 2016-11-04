
package views.html.agente_marketing

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ofertas_Scope0 {
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

class ofertas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Oferta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(incidencias_list: List[Oferta] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/css/*3.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.7*/("""
	
""")))};def /*7.2*/js/*7.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.6*/("""
	
""")))};
Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*9.2*/("""
"""),_display_(/*10.2*/agente_marketing/*10.18*/.base("Agente Marketing CRM","Ofertas","Gestion de ofertas","ofertas",css,js)/*10.95*/{_display_(Seq[Any](format.raw/*10.96*/("""

""")))}))
      }
    }
  }

  def render(incidencias_list:List[Oferta]): play.twirl.api.HtmlFormat.Appendable = apply(incidencias_list)

  def f:((List[Oferta]) => play.twirl.api.HtmlFormat.Appendable) = (incidencias_list) => apply(incidencias_list)

  def ref: this.type = this

}


}

/**/
object ofertas extends ofertas_Scope0.ofertas
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 23:27:00 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/agente_marketing/ofertas.scala.html
                  HASH: 3f8fcced3f2d890cf37895a4f7477ffbff2db021
                  MATRIX: 772->1|883->37|893->40|972->42|998->49|1007->51|1086->53|1129->34|1157->46|1185->57|1213->59|1238->75|1324->152|1363->153
                  LINES: 27->1|31->3|31->3|33->3|35->7|35->7|37->7|40->1|42->5|44->9|45->10|45->10|45->10|45->10
                  -- GENERATED --
              */
          