
package views.html.cliente

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

class ofertas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/cliente/*1.9*/.base("Cliente CRM","Ofertas","Las mejores ofertas solo para ti","ofertas")/*1.84*/{_display_(Seq[Any](format.raw/*1.85*/("""
	"""),format.raw/*2.2*/("""<div class="row">

	    <div class="col-sm-3 col-lg-3 col-md-3">
	        <div class="thumbnail">
	            <img src="http://placehold.it/320x150" alt="">
	            <div class="caption">
	                <h4 class="pull-right">$24.99</h4>
	                <h4><a href="#">First Product</a>
	                </h4>
	                <p>See more snippets like this online store item at <a target="_blank" href="http://www.bootsnipp.com">Bootsnipp - http://bootsnipp.com</a>.</p>
	            </div>
	        </div>
	    </div>

	    <div class="col-sm-3 col-lg-3 col-md-3">
	        <div class="thumbnail">
	            <img src="http://placehold.it/320x150" alt="">
	            <div class="caption">
	                <h4 class="pull-right">$64.99</h4>
	                <h4><a href="#">Second Product</a>
	                </h4>
	                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	            </div>
	        </div>
	    </div>

	    <div class="col-sm-3 col-lg-3 col-md-3">
	        <div class="thumbnail">
	            <img src="http://placehold.it/320x150" alt="">
	            <div class="caption">
	                <h4 class="pull-right">$74.99</h4>
	                <h4><a href="#">Third Product</a>
	                </h4>
	                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	            </div>
	        </div>
	    </div>

	    <div class="col-sm-3 col-lg-3 col-md-3">
	        <div class="thumbnail">
	            <img src="http://placehold.it/320x150" alt="">
	            <div class="caption">
	                <h4 class="pull-right">$84.99</h4>
	                <h4><a href="#">Fourth Product</a>
	                </h4>
	                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	            </div>

	        </div>
	    </div>

	    <div class="col-sm-3 col-lg-3 col-md-3">
	        <div class="thumbnail">
	            <img src="http://placehold.it/320x150" alt="">
	            <div class="caption">
	                <h4 class="pull-right">$94.99</h4>
	                <h4><a href="#">Fifth Product</a>
	                </h4>
	                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	            </div>
	        </div>
	    </div>

	</div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object ofertas extends ofertas_Scope0.ofertas
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 21:36:24 CST 2016
                  SOURCE: /home/sarahi/crm/app/views/cliente/ofertas.scala.html
                  HASH: 3f531e7f93617f70bff4469f04824b0597e36d34
                  MATRIX: 839->1|853->8|936->83|974->84|1002->86
                  LINES: 32->1|32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          