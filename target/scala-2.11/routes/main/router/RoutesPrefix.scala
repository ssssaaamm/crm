
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/samuel/Desarrollo/crm/conf/routes
// @DATE:Thu Nov 03 23:24:47 CST 2016
=======
// @SOURCE:/home/sarahi/crm/conf/routes
// @DATE:Thu Nov 03 22:47:22 CST 2016
>>>>>>> dadc29268f4be7395842d685b336b675c4282237


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
