
package views.html.cliente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object incidentes_Scope0 {
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

class incidentes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/cliente/*1.9*/.base("Cliente CRM","Incidentes","Reporta cualquier problema con tu compra","incidentes")/*1.98*/{_display_(Seq[Any](format.raw/*1.99*/("""
    
    """),format.raw/*3.5*/("""<div class="row">
        <div class="col-lg-8">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Crear nueva incidencia</h3>
                </div>
                <div class="panel-body">
                    <form>
                        <div class="form-group col-lg-8">
                            <label for="formGroupExampleInput">Codigo de compra</label>
                                <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input">
                        </div>
                        <div class="form-group col-lg-8">
                            <label for="formGroupExampleInput2">Descripcion del problema</label>
                            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input">
                        </div>
                    </form>
                </div>
            </div>           
        </div>
    </div>


    <div class="row">
    <div class="col-lg-8">
        <h2>Contextual Classes</h2>
        <div class="table-responsive">
            <table class="table table-bordered table-hover table-striped">
                <thead>
                    <tr>
                        <th>Page</th>
                        <th>Visits</th>
                        <th>% New Visits</th>
                        <th>Revenue</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="active">
                        <td>/index.html</td>
                        <td>1265</td>
                        <td>32.3%</td>
                        <td>$321.33</td>
                    </tr>
                    <tr class="success">
                        <td>/about.html</td>
                        <td>261</td>
                        <td>33.3%</td>
                        <td>$234.12</td>
                    </tr>
                    <tr class="warning">
                        <td>/sales.html</td>
                        <td>665</td>
                        <td>21.3%</td>
                        <td>$16.34</td>
                    </tr>
                    <tr class="danger">
                        <td>/blog.html</td>
                        <td>9516</td>
                        <td>89.3%</td>
                        <td>$1644.43</td>
                    </tr>
                    <tr>
                        <td>/404.html</td>
                        <td>23</td>
                        <td>34.3%</td>
                        <td>$23.52</td>
                    </tr>
                    <tr>
                        <td>/services.html</td>
                        <td>421</td>
                        <td>60.3%</td>
                        <td>$724.32</td>
                    </tr>
                    <tr>
                        <td>/blog/post.html</td>
                        <td>1233</td>
                        <td>93.2%</td>
                        <td>$126.34</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!-- /.row -->
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
object incidentes extends incidentes_Scope0.incidentes
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 21:36:24 CST 2016
                  SOURCE: /home/sarahi/crm/app/views/cliente/incidentes.scala.html
                  HASH: bdf38d020b0c43e0dd9a78a4f160b98571c95ed3
                  MATRIX: 845->1|859->8|956->97|994->98|1030->108
                  LINES: 32->1|32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          