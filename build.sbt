name := """ServiceOne"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava) // in play 2.2 == .settings(playJavaSettings: _*)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  "junit" % "junit" % "4.12" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test exclude("junit", "junit-dep")
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
