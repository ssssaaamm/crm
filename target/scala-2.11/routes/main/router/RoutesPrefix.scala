
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/crm/conf/routes
// @DATE:Thu Nov 03 22:47:22 CST 2016


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
