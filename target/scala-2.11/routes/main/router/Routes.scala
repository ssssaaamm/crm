
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/crm/conf/routes
// @DATE:Thu Nov 03 23:24:47 CST 2016

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
  HomeController_2: controllers.HomeController,
  // @LINE:17
  ClienteController_6: controllers.ClienteController,
  // @LINE:24
  AgenteServicioController_7: controllers.AgenteServicioController,
  // @LINE:28
  AgenteMarketingController_0: controllers.AgenteMarketingController,
  // @LINE:32
  AdministradorController_4: controllers.AdministradorController,
  // @LINE:43
  CountController_1: controllers.CountController,
  // @LINE:45
  AsyncController_3: controllers.AsyncController,
  // @LINE:49
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:17
    ClienteController_6: controllers.ClienteController,
    // @LINE:24
    AgenteServicioController_7: controllers.AgenteServicioController,
    // @LINE:28
    AgenteMarketingController_0: controllers.AgenteMarketingController,
    // @LINE:32
    AdministradorController_4: controllers.AdministradorController,
    // @LINE:43
    CountController_1: controllers.CountController,
    // @LINE:45
    AsyncController_3: controllers.AsyncController,
    // @LINE:49
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_2, ClienteController_6, AgenteServicioController_7, AgenteMarketingController_0, AdministradorController_4, CountController_1, AsyncController_3, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ClienteController_6, AgenteServicioController_7, AgenteMarketingController_0, AdministradorController_4, CountController_1, AsyncController_3, Assets_5, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agente_s/incidencias""", """controllers.AgenteServicioController.incidencias"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agente_m/ofertas""", """controllers.AgenteMarketingController.ofertas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados""", """controllers.AdministradorController.empleados"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/productos""", """controllers.AdministradorController.productos"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados/new""", """controllers.AdministradorController.empleado_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados/edit/""" + "$" + """id<[^/]+>""", """controllers.AdministradorController.empleado_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/empleados/remove/""" + "$" + """id<[^/]+>""", """controllers.AdministradorController.empleado_remove(id:Long)"""),
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
    HomeController_2.index,
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
    HomeController_2.login,
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
    HomeController_2.login_post,
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
    HomeController_2.logout,
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
    HomeController_2.register,
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
    HomeController_2.register_post,
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
    HomeController_2.about,
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
    ClienteController_6.productos,
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
    ClienteController_6.ofertas,
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
    ClienteController_6.incidentes,
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
    ClienteController_6.carretilla,
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

  // @LINE:24
  private[this] lazy val controllers_AgenteServicioController_incidencias11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agente_s/incidencias")))
  )
  private[this] lazy val controllers_AgenteServicioController_incidencias11_invoker = createInvoker(
    AgenteServicioController_7.incidencias,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AgenteServicioController",
      "incidencias",
      Nil,
      "GET",
      """ Rutas del AgenteServicioController""",
      this.prefix + """agente_s/incidencias"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AgenteMarketingController_ofertas12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agente_m/ofertas")))
  )
  private[this] lazy val controllers_AgenteMarketingController_ofertas12_invoker = createInvoker(
    AgenteMarketingController_0.ofertas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AgenteMarketingController",
      "ofertas",
      Nil,
      "GET",
      """ Rutas del AgenteServicioController""",
      this.prefix + """agente_m/ofertas"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdministradorController_empleados13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados")))
  )
  private[this] lazy val controllers_AdministradorController_empleados13_invoker = createInvoker(
    AdministradorController_4.empleados,
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
  private[this] lazy val controllers_AdministradorController_productos14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/productos")))
  )
  private[this] lazy val controllers_AdministradorController_productos14_invoker = createInvoker(
    AdministradorController_4.productos,
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
  private[this] lazy val controllers_AdministradorController_empleado_new15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados/new")))
  )
  private[this] lazy val controllers_AdministradorController_empleado_new15_invoker = createInvoker(
    AdministradorController_4.empleado_new,
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
  private[this] lazy val controllers_AdministradorController_empleado_edit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdministradorController_empleado_edit16_invoker = createInvoker(
    AdministradorController_4.empleado_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "empleado_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/empleados/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_AdministradorController_empleado_remove17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/empleados/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdministradorController_empleado_remove17_invoker = createInvoker(
    AdministradorController_4.empleado_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "empleado_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/empleados/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AdministradorController_producto_new18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/productos/new")))
  )
  private[this] lazy val controllers_AdministradorController_producto_new18_invoker = createInvoker(
    AdministradorController_4.producto_new,
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

  // @LINE:43
  private[this] lazy val controllers_CountController_count19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count19_invoker = createInvoker(
    CountController_1.count,
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

  // @LINE:45
  private[this] lazy val controllers_AsyncController_message20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message20_invoker = createInvoker(
    AsyncController_3.message,
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

  // @LINE:49
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_login1_route(params) =>
      call { 
        controllers_HomeController_login1_invoker.call(HomeController_2.login)
      }
  
    // @LINE:8
    case controllers_HomeController_login_post2_route(params) =>
      call { 
        controllers_HomeController_login_post2_invoker.call(HomeController_2.login_post)
      }
  
    // @LINE:9
    case controllers_HomeController_logout3_route(params) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_2.logout)
      }
  
    // @LINE:10
    case controllers_HomeController_register4_route(params) =>
      call { 
        controllers_HomeController_register4_invoker.call(HomeController_2.register)
      }
  
    // @LINE:11
    case controllers_HomeController_register_post5_route(params) =>
      call { 
        controllers_HomeController_register_post5_invoker.call(HomeController_2.register_post)
      }
  
    // @LINE:12
    case controllers_HomeController_about6_route(params) =>
      call { 
        controllers_HomeController_about6_invoker.call(HomeController_2.about)
      }
  
    // @LINE:17
    case controllers_ClienteController_productos7_route(params) =>
      call { 
        controllers_ClienteController_productos7_invoker.call(ClienteController_6.productos)
      }
  
    // @LINE:18
    case controllers_ClienteController_ofertas8_route(params) =>
      call { 
        controllers_ClienteController_ofertas8_invoker.call(ClienteController_6.ofertas)
      }
  
    // @LINE:19
    case controllers_ClienteController_incidentes9_route(params) =>
      call { 
        controllers_ClienteController_incidentes9_invoker.call(ClienteController_6.incidentes)
      }
  
    // @LINE:20
    case controllers_ClienteController_carretilla10_route(params) =>
      call { 
        controllers_ClienteController_carretilla10_invoker.call(ClienteController_6.carretilla)
      }
  
    // @LINE:24
    case controllers_AgenteServicioController_incidencias11_route(params) =>
      call { 
        controllers_AgenteServicioController_incidencias11_invoker.call(AgenteServicioController_7.incidencias)
      }
  
    // @LINE:28
    case controllers_AgenteMarketingController_ofertas12_route(params) =>
      call { 
        controllers_AgenteMarketingController_ofertas12_invoker.call(AgenteMarketingController_0.ofertas)
      }
  
    // @LINE:32
    case controllers_AdministradorController_empleados13_route(params) =>
      call { 
        controllers_AdministradorController_empleados13_invoker.call(AdministradorController_4.empleados)
      }
  
    // @LINE:33
    case controllers_AdministradorController_productos14_route(params) =>
      call { 
        controllers_AdministradorController_productos14_invoker.call(AdministradorController_4.productos)
      }
  
    // @LINE:34
    case controllers_AdministradorController_empleado_new15_route(params) =>
      call { 
        controllers_AdministradorController_empleado_new15_invoker.call(AdministradorController_4.empleado_new)
      }
  
    // @LINE:35
    case controllers_AdministradorController_empleado_edit16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdministradorController_empleado_edit16_invoker.call(AdministradorController_4.empleado_edit(id))
      }
  
    // @LINE:36
    case controllers_AdministradorController_empleado_remove17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdministradorController_empleado_remove17_invoker.call(AdministradorController_4.empleado_remove(id))
      }
  
    // @LINE:37
    case controllers_AdministradorController_producto_new18_route(params) =>
      call { 
        controllers_AdministradorController_producto_new18_invoker.call(AdministradorController_4.producto_new)
      }
  
    // @LINE:43
    case controllers_CountController_count19_route(params) =>
      call { 
        controllers_CountController_count19_invoker.call(CountController_1.count)
      }
  
    // @LINE:45
    case controllers_AsyncController_message20_route(params) =>
      call { 
        controllers_AsyncController_message20_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:49
    case controllers_Assets_versioned21_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
