package com.inkanitolabs.dontmakemewaitforit

import com.inkanitolabs.dontmakemewaitforit.shared.SharedMessages
import org.scalajs.dom

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
