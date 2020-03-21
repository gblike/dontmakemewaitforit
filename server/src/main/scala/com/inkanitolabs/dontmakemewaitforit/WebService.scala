package com.inkanitolabs.dontmakemewaitforit

import akka.http.scaladsl.server.Directives
import com.inkanitolabs.dontmakemewaitforit.shared.SharedMessages
import com.inkanitolabs.dontmakemewaitforit.twirl.Implicits._

class WebService() extends Directives {

  val route = {
    pathSingleSlash {
      get {
        complete {
          com.inkanitolabs.dontmakemewaitforit.html.index.render(SharedMessages.itWorks)
        }
      }
    } ~
      pathPrefix("assets" / Remaining) { file =>
        // optionally compresses the response with Gzip or Deflate
        // if the client accepts compressed responses
        encodeResponse {
          getFromResource("public/" + file)
        }
      }
  }
}
