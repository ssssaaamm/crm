
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/css/*1.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.9*/("""
    """),format.raw/*2.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.50*/routes/*2.56*/.Assets.versioned("stylesheets/login.css")),format.raw/*2.98*/("""">
""")))};
Seq[Any](format.raw/*3.2*/("""
"""),_display_(/*4.2*/base("Login CRM",css)/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
"""),format.raw/*5.1*/("""<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-12">
						<p class="active" id="login-form-link">Iniciar Sesion</p>
					</div>
				</div>
				<hr>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						"""),_display_(/*19.8*/if(flash.containsKey("no_registered"))/*19.46*/{_display_(Seq[Any](format.raw/*19.47*/("""
							"""),format.raw/*20.8*/("""<div class="alert alert-danger" role="alert">
								<p>"""),_display_(/*21.13*/flash/*21.18*/.get("no_registered")),format.raw/*21.39*/("""</p>
							</div>
						""")))}),format.raw/*23.8*/("""
						
						"""),_display_(/*25.8*/if(flash.containsKey("no_password"))/*25.44*/{_display_(Seq[Any](format.raw/*25.45*/("""
							"""),format.raw/*26.8*/("""<div class="alert alert-warning" role="alert">
								<p>"""),_display_(/*27.13*/flash/*27.18*/.get("no_password")),format.raw/*27.37*/("""</p>
							</div>
						""")))}),format.raw/*29.8*/("""
						"""),format.raw/*30.7*/("""<form id="login-form" action=""""),_display_(/*30.38*/routes/*30.44*/.HomeController.login_post),format.raw/*30.70*/("""" method="post" role="form" style="display: block;">
							<div class="form-group">
								<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
							</div>
							<div class="form-group">
								<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-sm-6 col-sm-offset-3">
										<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="row">
									<div class="col-lg-12">
										<div class="text-center">
											<a href=""""),_display_(/*48.22*/routes/*48.28*/.HomeController.register),format.raw/*48.52*/("""" tabindex="5" class="forgot-password">Registrarse</a>
										</div>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 16:10:57 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/login.scala.html
                  HASH: ed9512098558a7b30ef154fee4a1557359b2870f
                  MATRIX: 811->1|821->4|900->8|931->13|1002->58|1016->64|1078->106|1120->110|1147->112|1176->133|1214->134|1241->135|1633->501|1680->539|1719->540|1754->548|1839->606|1853->611|1895->632|1951->658|1992->673|2037->709|2076->710|2111->718|2197->777|2211->782|2251->801|2307->827|2341->834|2399->865|2414->871|2461->897|3308->1717|3323->1723|3368->1747
                  LINES: 31->1|31->1|33->1|34->2|34->2|34->2|34->2|36->3|37->4|37->4|37->4|38->5|52->19|52->19|52->19|53->20|54->21|54->21|54->21|56->23|58->25|58->25|58->25|59->26|60->27|60->27|60->27|62->29|63->30|63->30|63->30|63->30|81->48|81->48|81->48
                  -- GENERATED --
              */
          