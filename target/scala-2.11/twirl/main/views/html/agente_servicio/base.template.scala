
package views.html.agente_servicio

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, opcion: String, descripcion: String, activo: String, css: Html = Html(""), js: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.128*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.106*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/(""""> -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*16.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("stylesheets/sb-admin.css")),format.raw/*17.105*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*18.70*/routes/*18.76*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*18.134*/("""">
        """),_display_(/*19.10*/css),format.raw/*19.13*/(""" 
        
    """),format.raw/*21.5*/("""</head>
    <body>

        <div id="wrapper">
            
            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*36.52*/routes/*36.58*/.ClienteController.productos),format.raw/*36.86*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(/*42.119*/session()/*42.128*/.get("username")),format.raw/*42.144*/(""" """),format.raw/*42.145*/("""<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="divider"></li>
                            <li>
                                <a href=""""),_display_(/*46.43*/routes/*46.49*/.HomeController.logout),format.raw/*46.71*/(""""><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Salir</a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        """),_display_(/*55.26*/if(activo=="incidencias")/*55.51*/{_display_(Seq[Any](format.raw/*55.52*/("""
                            """),format.raw/*56.29*/("""<li class="active">
                        """)))}/*57.26*/else/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
                            """),format.raw/*58.29*/("""<li>
                        """)))}),format.raw/*59.26*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.AgenteServicioController.incidencias),format.raw/*60.82*/(""""><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span> Incidencias</a>
                        </li>
                    </li>

                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
            <!-- End Navigation -->

            <!--Content-->
            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                """),_display_(/*79.34*/opcion),format.raw/*79.40*/("""
                                """),format.raw/*80.33*/("""<small>"""),_display_(/*80.41*/descripcion),format.raw/*80.52*/("""</small>
                            </h1>
                            """),_display_(/*82.30*/content),format.raw/*82.37*/("""

                            """),format.raw/*84.29*/("""<div class="well">
                                
                            </div>

                        </div>
                    </div>
                    <!-- /.row -->


                </div>
                <!-- /.container-fluid -->

            </div>
            <!--/.page-wrapper-->
            <!--End Content-->



        </div>
        <!--/.wrapper-->




        

        """),format.raw/*111.32*/("""
        

        """),format.raw/*114.9*/("""<script src=""""),_display_(/*114.23*/routes/*114.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*114.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*115.23*/routes/*115.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*115.78*/("""" type="text/javascript"></script>
        """),_display_(/*116.10*/js),format.raw/*116.12*/("""
    """),format.raw/*117.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,opcion:String,descripcion:String,activo:String,css:Html,js:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,opcion,descripcion,activo,css,js)(content)

  def f:((String,String,String,String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,opcion,descripcion,activo,css,js) => (content) => apply(title,opcion,descripcion,activo,css,js)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Fri Nov 04 00:22:50 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/agente_servicio/base.scala.html
                  HASH: 068dbb5b4609ce5d1488f0960ea66865a994f04a
                  MATRIX: 1049->260|1271->386|1299->388|1379->493|1415->502|1450->510|1476->515|1570->582|1585->588|1648->629|1736->690|1751->696|1812->735|1899->795|1914->801|1986->851|2069->907|2084->913|2151->958|2250->1030|2265->1036|2345->1094|2384->1106|2408->1109|2450->1124|3216->1863|3231->1869|3280->1897|3665->2254|3684->2263|3722->2279|3752->2280|3985->2486|4000->2492|4043->2514|4549->2993|4583->3018|4622->3019|4679->3048|4743->3093|4756->3097|4795->3098|4852->3127|4913->3157|4970->3186|5007->3196|5022->3202|5080->3239|5733->3865|5760->3871|5821->3904|5856->3912|5888->3923|5987->3995|6015->4002|6073->4032|6501->4521|6548->4540|6590->4554|6606->4560|6670->4602|6755->4659|6771->4665|6842->4714|6914->4758|6938->4760|6971->4765
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|51->21|66->36|66->36|66->36|72->42|72->42|72->42|72->42|76->46|76->46|76->46|85->55|85->55|85->55|86->56|87->57|87->57|87->57|88->58|89->59|90->60|90->60|90->60|90->60|109->79|109->79|110->80|110->80|110->80|112->82|112->82|114->84|140->111|143->114|143->114|143->114|143->114|144->115|144->115|144->115|145->116|145->116|146->117
                  -- GENERATED --
              */
          