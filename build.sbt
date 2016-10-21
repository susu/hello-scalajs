enablePlugins(ScalaJSPlugin)

name := "Hello Scala.js"

scalaVersion := "2.11.8"

// libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

// Enabling JS bundling
skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

// Testing
jsDependencies += RuntimeDOM
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
