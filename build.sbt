ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

lazy val E2E = Configuration.of("E2E", "e2e") extend(Test)
lazy val e2eSettings: Seq[Setting[?]] = inConfig(E2E) { Defaults.testSettings }

val scalatestDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.18" % "test,e2e",
  "org.scalatestplus" %% "testng-7-5" % "3.2.17.0" % "test,e2e"
)

lazy val root = (project in file("."))
  .configs(E2E)
  .settings(
    name := "scalatestplus-testng-configuration-mwe",
    libraryDependencies ++= scalatestDependencies
  )
  .settings(e2eSettings)
