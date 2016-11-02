
package views.html.cliente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object carretilla_Scope0 {
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

class carretilla extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/cliente/*1.9*/.base("Cliente CRM","Carretilla","Articulos a comprar","carretilla")/*1.77*/{_display_(Seq[Any](format.raw/*1.78*/("""
    """),format.raw/*2.5*/("""<div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Articulos en carretilla</h3>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-bordered table-hover table-striped">
                    <thead>
                        <tr>
                            <th>Producto</th>
                            <th>Cantidad</th>
                            <th>Precio</th>
                            <th>Subtotal</th>
                            <th>Quitar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><a href="#">Camisa</a></td>
                            <td><input type="number" name="cantidad" min="1" max="5" class="form-control btn-number"/></td>
                            <td>$321.33</td>
                            <td>$500.33</td>
                            <td><button type="button" class="btn btn-danger" aria-label="Left Align"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button></td>   
                        </tr>

                        <tr>
                            <td><a href="#">Camisa</a></td>
                            <td><input type="number" name="cantidad" min="1" max="5" class="form-control btn-number"/></td>
                            <td>$321.33</td>
                            <td>$500.33</td>
                            <td><button type="button" class="btn btn-danger" aria-label="Left Align"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button></td>
                        </tr>

                        <tr>
                            <td><a href="#">Camisa</a></td>
                            <td><input type="number" name="cantidad" min="1" max="5" class="form-control btn-number"/></td>
                            <td>$321.33</td>
                            <td>$500.33</td>
                            <td><button type="button" class="btn btn-danger" aria-label="Left Align"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button></td>
                        </tr>

                        <tr>
                            <td><a href="#">Camisa</a></td>
                            <td><input type="number" name="cantidad" min="1" max="5" class="form-control btn-number"/></td>
                            <td>$321.33</td>
                            <td>$500.33</td>
                            <td><button type="button" class="btn btn-danger" aria-label="Left Align"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button></td>
                        </tr>
                        
                    </tbody>
                </table>
            </div>
            <div class="row">
                <div class="col-lg-6">
                    <p><a href="#" class="btn btn-warning" role="button">Realizar Compra</a></p>
                </div>

                <div class="col-lg-6">
                    <div class="text-right">
                        Monto total (USD): $568948.99
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
object carretilla extends carretilla_Scope0.carretilla
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 16:50:45 CST 2016
                  SOURCE: /home/samuel/Desarrollo/crm/app/views/cliente/carretilla.scala.html
                  HASH: 773a211c51120e8f9e59b3568da8ea56040c575c
                  MATRIX: 845->1|859->8|935->76|973->77|1004->82
                  LINES: 32->1|32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          