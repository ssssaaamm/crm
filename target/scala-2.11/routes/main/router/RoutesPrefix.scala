
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/crm/conf/routes
// @DATE:Thu Nov 03 23:24:47 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
