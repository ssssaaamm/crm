
package views.html.administrador

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
                        """),_display_(/*55.26*/if(activo=="empleados")/*55.49*/{_display_(Seq[Any](format.raw/*55.50*/("""
                            """),format.raw/*56.29*/("""<li class="active">
                        """)))}/*57.26*/else/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
                            """),format.raw/*58.29*/("""<li>
                        """)))}),format.raw/*59.26*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.AdministradorController.empleados),format.raw/*60.79*/(""""><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Empleados</a>
                        </li>
                        """),_display_(/*62.26*/if(activo=="productos")/*62.49*/{_display_(Seq[Any](format.raw/*62.50*/("""
                            """),format.raw/*63.29*/("""<li class="active">
                        """)))}/*64.26*/else/*64.30*/{_display_(Seq[Any](format.raw/*64.31*/("""
                            """),format.raw/*65.29*/("""<li>
                        """)))}),format.raw/*66.26*/("""
                            """),format.raw/*67.29*/("""<a href=""""),_display_(/*67.39*/routes/*67.45*/.AdministradorController.productos),format.raw/*67.79*/(""""><span class="glyphicon glyphicon-tags" aria-hidden="true"></span> Productos</a>
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
                                """),_display_(/*86.34*/opcion),format.raw/*86.40*/("""
                                """),format.raw/*87.33*/("""<small>"""),_display_(/*87.41*/descripcion),format.raw/*87.52*/("""</small>
                            </h1>
                            """),_display_(/*89.30*/content),format.raw/*89.37*/("""

                            """),format.raw/*91.29*/("""<div class="well">
                                
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




        

        """),format.raw/*118.32*/("""
        

        """),format.raw/*121.9*/("""<script src=""""),_display_(/*121.23*/routes/*121.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*121.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*122.23*/routes/*122.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*122.78*/("""" type="text/javascript"></script>
        """),_display_(/*123.10*/js),format.raw/*123.12*/("""
    """),format.raw/*124.5*/("""</body>
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
                  DATE: Thu Nov 03 21:36:24 CST 2016
                  SOURCE: /home/sarahi/crm/app/views/administrador/base.scala.html
                  HASH: b1294b6ccedd90fd0c06a8f583c990a723abe602
                  MATRIX: 1047->260|1269->386|1297->388|1377->493|1413->502|1448->510|1474->515|1568->582|1583->588|1646->629|1734->690|1749->696|1810->735|1897->795|1912->801|1984->851|2067->907|2082->913|2149->958|2248->1030|2263->1036|2343->1094|2382->1106|2406->1109|2448->1124|3214->1863|3229->1869|3278->1897|3663->2254|3682->2263|3720->2279|3750->2280|3983->2486|3998->2492|4041->2514|4547->2993|4579->3016|4618->3017|4675->3046|4739->3091|4752->3095|4791->3096|4848->3125|4909->3155|4966->3184|5003->3194|5018->3200|5073->3234|5242->3376|5274->3399|5313->3400|5370->3429|5434->3474|5447->3478|5486->3479|5543->3508|5604->3538|5661->3567|5698->3577|5713->3583|5768->3617|6407->4229|6434->4235|6495->4268|6530->4276|6562->4287|6661->4359|6689->4366|6747->4396|7175->4885|7222->4904|7264->4918|7280->4924|7344->4966|7429->5023|7445->5029|7516->5078|7588->5122|7612->5124|7645->5129
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|51->21|66->36|66->36|66->36|72->42|72->42|72->42|72->42|76->46|76->46|76->46|85->55|85->55|85->55|86->56|87->57|87->57|87->57|88->58|89->59|90->60|90->60|90->60|90->60|92->62|92->62|92->62|93->63|94->64|94->64|94->64|95->65|96->66|97->67|97->67|97->67|97->67|116->86|116->86|117->87|117->87|117->87|119->89|119->89|121->91|147->118|150->121|150->121|150->121|150->121|151->122|151->122|151->122|152->123|152->123|153->124
                  -- GENERATED --
              */
          