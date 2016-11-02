
package views.html.cliente

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
        
        
    </head>
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
                        """),_display_(/*55.26*/if(activo=="productos")/*55.49*/{_display_(Seq[Any](format.raw/*55.50*/("""actiactiveve
                            <li class="active">
                        """)))}/*57.26*/else/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
                            """),format.raw/*58.29*/("""<li>
                        """)))}),format.raw/*59.26*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.ClienteController.productos),format.raw/*60.73*/(""""><span class="glyphicon glyphicon-tag" aria-hidden="true"></span> Productos</a>
                        </li>
                        """),_display_(/*62.26*/if(activo=="ofertas")/*62.47*/{_display_(Seq[Any](format.raw/*62.48*/("""
                            """),format.raw/*63.29*/("""<li class="active">
                        """)))}/*64.26*/else/*64.30*/{_display_(Seq[Any](format.raw/*64.31*/("""
                            """),format.raw/*65.29*/("""<li>
                        """)))}),format.raw/*66.26*/("""
                            """),format.raw/*67.29*/("""<a href=""""),_display_(/*67.39*/routes/*67.45*/.ClienteController.ofertas),format.raw/*67.71*/(""""><span class="glyphicon glyphicon-usd" aria-hidden="true"></span> Ofertas</a>
                        </li>
                        """),_display_(/*69.26*/if(activo=="incidentes")/*69.50*/{_display_(Seq[Any](format.raw/*69.51*/("""
                            """),format.raw/*70.29*/("""<li class="active">
                        """)))}/*71.26*/else/*71.30*/{_display_(Seq[Any](format.raw/*71.31*/("""
                            """),format.raw/*72.29*/("""<li>
                        """)))}),format.raw/*73.26*/("""
                            """),format.raw/*74.29*/("""<a href=""""),_display_(/*74.39*/routes/*74.45*/.ClienteController.incidentes),format.raw/*74.74*/(""""><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Incidentes</a>
                        </li>
                        """),_display_(/*76.26*/if(activo=="carretilla")/*76.50*/{_display_(Seq[Any](format.raw/*76.51*/("""
                            """),format.raw/*77.29*/("""<li class="active">
                        """)))}/*78.26*/else/*78.30*/{_display_(Seq[Any](format.raw/*78.31*/("""
                            """),format.raw/*79.29*/("""<li>
                        """)))}),format.raw/*80.26*/("""
                            """),format.raw/*81.29*/("""<a href=""""),_display_(/*81.39*/routes/*81.45*/.ClienteController.carretilla),format.raw/*81.74*/(""""><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Carretilla <span class="badge badge-notify">3</span></a>
                        </li>
                        <li>
                            <a href="#"><span class="glyphicon glyphicon-console" aria-hidden="true"></span> Chat</a>
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
                                """),_display_(/*104.34*/opcion),format.raw/*104.40*/("""
                                """),format.raw/*105.33*/("""<small>"""),_display_(/*105.41*/descripcion),format.raw/*105.52*/("""</small>
                            </h1>
                            """),_display_(/*107.30*/content),format.raw/*107.37*/("""

                            """),format.raw/*109.29*/("""<div class="well">
                                
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




        

        """),format.raw/*136.32*/("""
        

        """),format.raw/*139.9*/("""<script src=""""),_display_(/*139.23*/routes/*139.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*139.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*140.23*/routes/*140.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*140.78*/("""" type="text/javascript"></script>
    </body>
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
                  DATE: Tue Nov 01 16:46:06 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/cliente/base.scala.html
                  HASH: a25be42a9e77cd50f6bac990d50aa91672e2b295
                  MATRIX: 1041->260|1263->386|1291->388|1371->493|1407->502|1442->510|1468->515|1562->582|1577->588|1640->629|1728->690|1743->696|1804->735|1891->795|1906->801|1978->851|2061->907|2076->913|2143->958|2242->1030|2257->1036|2337->1094|3128->1858|3143->1864|3192->1892|3577->2249|3596->2258|3634->2274|3664->2275|3897->2481|3912->2487|3955->2509|4461->2988|4493->3011|4532->3012|4637->3098|4650->3102|4689->3103|4746->3132|4807->3162|4864->3191|4901->3201|4916->3207|4965->3235|5128->3371|5158->3392|5197->3393|5254->3422|5318->3467|5331->3471|5370->3472|5427->3501|5488->3531|5545->3560|5582->3570|5597->3576|5644->3602|5805->3736|5838->3760|5877->3761|5934->3790|5998->3835|6011->3839|6050->3840|6107->3869|6168->3899|6225->3928|6262->3938|6277->3944|6327->3973|6494->4113|6527->4137|6566->4138|6623->4167|6687->4212|6700->4216|6739->4217|6796->4246|6857->4276|6914->4305|6951->4315|6966->4321|7016->4350|7886->5192|7914->5198|7976->5231|8012->5239|8045->5250|8145->5322|8174->5329|8233->5359|8661->5848|8708->5867|8750->5881|8766->5887|8830->5929|8915->5986|8931->5992|9002->6041
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|66->36|66->36|66->36|72->42|72->42|72->42|72->42|76->46|76->46|76->46|85->55|85->55|85->55|87->57|87->57|87->57|88->58|89->59|90->60|90->60|90->60|90->60|92->62|92->62|92->62|93->63|94->64|94->64|94->64|95->65|96->66|97->67|97->67|97->67|97->67|99->69|99->69|99->69|100->70|101->71|101->71|101->71|102->72|103->73|104->74|104->74|104->74|104->74|106->76|106->76|106->76|107->77|108->78|108->78|108->78|109->79|110->80|111->81|111->81|111->81|111->81|134->104|134->104|135->105|135->105|135->105|137->107|137->107|139->109|165->136|168->139|168->139|168->139|168->139|169->140|169->140|169->140
                  -- GENERATED --
              */
          