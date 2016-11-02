
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/crm/conf/routes
// @DATE:Tue Nov 01 21:48:51 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:17
  ClienteController_5: controllers.ClienteController,
  // @LINE:32
  AdministradorController_3: controllers.AdministradorController,
  // @LINE:41
  CountController_0: controllers.CountController,
  // @LINE:43
  AsyncController_2: controllers.AsyncController,
  // @LINE:47
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:17
    ClienteController_5: controllers.ClienteController,
    // @LINE:32
    AdministradorController_3: controllers.AdministradorController,
    // @LINE:41
    CountController_0: controllers.CountController,
    // @LINE:43
    AsyncController_2: controllers.AsyncController,
    // @LINE:47
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, ClienteController_5, AdministradorController_3, CountController_0, AsyncController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ClienteController_5, AdministradorController_3, CountController_0, AsyncController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos""", """controllers.ClienteController.productos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ofertas""", """controllers.ClienteController.ofertas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """incidentes""", """controllers.ClienteController.incidentes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carretilla""", """controllers.ClienteController.carretilla"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados""", """controllers.AdministradorController.empleados"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/productos""", """controllers.AdministradorController.productos"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados/new""", """controllers.AdministradorController.empleado_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/productos/new""", """controllers.AdministradorController.producto_new"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ Rutas del HomeController""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login1_invoker = createInvoker(
    HomeController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_login_post2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login_post2_invoker = createInvoker(
    HomeController_1.login_post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login_post",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout3_invoker = createInvoker(
    HomeController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register4_invoker = createInvoker(
    HomeController_1.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_register_post5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register_post5_invoker = createInvoker(
    HomeController_1.register_post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register_post",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_about6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about6_invoker = createInvoker(
    HomeController_1.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ClienteController_productos7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos")))
  )
  private[this] lazy val controllers_ClienteController_productos7_invoker = createInvoker(
    ClienteController_5.productos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "productos",
      Nil,
      "GET",
      """ Rutas del ClienteController""",
      this.prefix + """productos"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ClienteController_ofertas8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ofertas")))
  )
  private[this] lazy val controllers_ClienteController_ofertas8_invoker = createInvoker(
    ClienteController_5.ofertas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "ofertas",
      Nil,
      "GET",
      """""",
      this.prefix + """ofertas"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ClienteController_incidentes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("incidentes")))
  )
  private[this] lazy val controllers_ClienteController_incidentes9_invoker = createInvoker(
    ClienteController_5.incidentes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "incidentes",
      Nil,
      "GET",
      """""",
      this.prefix + """incidentes"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ClienteController_carretilla10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carretilla")))
  )
  private[this] lazy val controllers_ClienteController_carretilla10_invoker = createInvoker(
    ClienteController_5.carretilla,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "carretilla",
      Nil,
      "GET",
      """""",
      this.prefix + """carretilla"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdministradorController_empleados11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados")))
  )
  private[this] lazy val controllers_AdministradorController_empleados11_invoker = createInvoker(
    AdministradorController_3.empleados,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "empleados",
      Nil,
      "GET",
      """ Rutas del AdministradorController""",
      this.prefix + """admin/empleados"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AdministradorController_productos12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/productos")))
  )
  private[this] lazy val controllers_AdministradorController_productos12_invoker = createInvoker(
    AdministradorController_3.productos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "productos",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/productos"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AdministradorController_empleado_new13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados/new")))
  )
  private[this] lazy val controllers_AdministradorController_empleado_new13_invoker = createInvoker(
    AdministradorController_3.empleado_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "empleado_new",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/empleados/new"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AdministradorController_producto_new14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/productos/new")))
  )
  private[this] lazy val controllers_AdministradorController_producto_new14_invoker = createInvoker(
    AdministradorController_3.producto_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "producto_new",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/productos/new"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CountController_count15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count15_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AsyncController_message16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message16_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_login1_route(params) =>
      call { 
        controllers_HomeController_login1_invoker.call(HomeController_1.login)
      }
  
    // @LINE:8
    case controllers_HomeController_login_post2_route(params) =>
      call { 
        controllers_HomeController_login_post2_invoker.call(HomeController_1.login_post)
      }
  
    // @LINE:9
    case controllers_HomeController_logout3_route(params) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_1.logout)
      }
  
    // @LINE:10
    case controllers_HomeController_register4_route(params) =>
      call { 
        controllers_HomeController_register4_invoker.call(HomeController_1.register)
      }
  
    // @LINE:11
    case controllers_HomeController_register_post5_route(params) =>
      call { 
        controllers_HomeController_register_post5_invoker.call(HomeController_1.register_post)
      }
  
    // @LINE:12
    case controllers_HomeController_about6_route(params) =>
      call { 
        controllers_HomeController_about6_invoker.call(HomeController_1.about)
      }
  
    // @LINE:17
    case controllers_ClienteController_productos7_route(params) =>
      call { 
        controllers_ClienteController_productos7_invoker.call(ClienteController_5.productos)
      }
  
    // @LINE:18
    case controllers_ClienteController_ofertas8_route(params) =>
      call { 
        controllers_ClienteController_ofertas8_invoker.call(ClienteController_5.ofertas)
      }
  
    // @LINE:19
    case controllers_ClienteController_incidentes9_route(params) =>
      call { 
        controllers_ClienteController_incidentes9_invoker.call(ClienteController_5.incidentes)
      }
  
    // @LINE:20
    case controllers_ClienteController_carretilla10_route(params) =>
      call { 
        controllers_ClienteController_carretilla10_invoker.call(ClienteController_5.carretilla)
      }
  
    // @LINE:32
    case controllers_AdministradorController_empleados11_route(params) =>
      call { 
        controllers_AdministradorController_empleados11_invoker.call(AdministradorController_3.empleados)
      }
  
    // @LINE:33
    case controllers_AdministradorController_productos12_route(params) =>
      call { 
        controllers_AdministradorController_productos12_invoker.call(AdministradorController_3.productos)
      }
  
    // @LINE:34
    case controllers_AdministradorController_empleado_new13_route(params) =>
      call { 
        controllers_AdministradorController_empleado_new13_invoker.call(AdministradorController_3.empleado_new)
      }
  
    // @LINE:35
    case controllers_AdministradorController_producto_new14_route(params) =>
      call { 
        controllers_AdministradorController_producto_new14_invoker.call(AdministradorController_3.producto_new)
      }
  
    // @LINE:41
    case controllers_CountController_count15_route(params) =>
      call { 
        controllers_CountController_count15_invoker.call(CountController_0.count)
      }
  
    // @LINE:43
    case controllers_AsyncController_message16_route(params) =>
      call { 
        controllers_AsyncController_message16_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:47
    case controllers_Assets_versioned17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
