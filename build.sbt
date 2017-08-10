lazy val compileScalastyle = taskKey[Unit]("compileScalastyle")
compileScalastyle := scalastyle.in(Compile).toTask("").value
(compile in Compile) := ((compile in Compile) dependsOn compileScalastyle).value

onLoadMessage := ""
showSuccess := false
logLevel := Level.Warn

lazy val root = (project in file(".")).settings(
  scalaVersion in Global := "2.12.3",
  scalacOptions ++= Seq("-unchecked", "-deprecation"),
  name := "homeworks",
  resolvers += "EECS Repo" at "http://www-internal.eecs.usma.edu/courses/scala/releases",
  libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.1",
  libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4",
  libraryDependencies += "eecs" % "eecstester_2.12" % "0.3.2",

  wartremoverWarnings ++= Seq(
    Wart.Any,Wart.NonUnitStatements,Wart.Nothing,
    Wart.Null,Wart.Overloading,Wart.Product,Wart.Serializable
  ),

  scalafmtTestOnCompile := true,
  scalafmtFailTest := false,

  scalastyleSources := Seq(baseDirectory.value) // make scalastyle look here instead of src/main/scala
)
