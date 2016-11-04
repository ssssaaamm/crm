
package views.html.agente_marketing

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
                        """),_display_(/*55.26*/if(activo=="ofertas")/*55.47*/{_display_(Seq[Any](format.raw/*55.48*/("""
                            """),format.raw/*56.29*/("""<li class="active">
                        """)))}/*57.26*/else/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
                            """),format.raw/*58.29*/("""<li>
                        """)))}),format.raw/*59.26*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.AgenteMarketingController.ofertas),format.raw/*60.79*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Ofertas</a>
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
                                """),_display_(/*77.34*/opcion),format.raw/*77.40*/("""
                                """),format.raw/*78.33*/("""<small>"""),_display_(/*78.41*/descripcion),format.raw/*78.52*/("""</small>
                            </h1>
                            """),_display_(/*80.30*/content),format.raw/*80.37*/("""

                            """),format.raw/*82.29*/("""<div class="well">
                                
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




        

        """),format.raw/*109.32*/("""
        

        """),format.raw/*112.9*/("""<script src=""""),_display_(/*112.23*/routes/*112.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*112.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*113.23*/routes/*113.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*113.78*/("""" type="text/javascript"></script>
        """),_display_(/*114.10*/js),format.raw/*114.12*/("""
    """),format.raw/*115.5*/("""</body>
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
                  DATE: Fri Nov 04 00:22:51 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/agente_marketing/base.scala.html
                  HASH: b8d782854aca44d87bec4cf3dedaa0e10289bb34
                  MATRIX: 1050->260|1272->386|1300->388|1380->493|1416->502|1451->510|1477->515|1571->582|1586->588|1649->629|1737->690|1752->696|1813->735|1900->795|1915->801|1987->851|2070->907|2085->913|2152->958|2251->1030|2266->1036|2346->1094|2385->1106|2409->1109|2451->1124|3217->1863|3232->1869|3281->1897|3666->2254|3685->2263|3723->2279|3753->2280|3986->2486|4001->2492|4044->2514|4550->2993|4580->3014|4619->3015|4676->3044|4740->3089|4753->3093|4792->3094|4849->3123|4910->3153|4967->3182|5004->3192|5019->3198|5074->3232|5684->3815|5711->3821|5772->3854|5807->3862|5839->3873|5938->3945|5966->3952|6024->3982|6452->4471|6499->4490|6541->4504|6557->4510|6621->4552|6706->4609|6722->4615|6793->4664|6865->4708|6889->4710|6922->4715
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|51->21|66->36|66->36|66->36|72->42|72->42|72->42|72->42|76->46|76->46|76->46|85->55|85->55|85->55|86->56|87->57|87->57|87->57|88->58|89->59|90->60|90->60|90->60|90->60|107->77|107->77|108->78|108->78|108->78|110->80|110->80|112->82|138->109|141->112|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|144->115
                  -- GENERATED --
              */
          