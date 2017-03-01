import javax.servlet.ServletContext

import com.kemmar.controller.ExampleController
import org.scalatra._

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new ExampleController, "/*")
//    context.mount(new ExampleController2, "/*")
  }
}