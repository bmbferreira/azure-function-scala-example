name := "scala-blog-deploy"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "com.microsoft.azure.functions" % "azure-functions-java-library" % "1.0.0-beta-5"


assemblyOutputPath in assembly := baseDirectory.value / "scala-function-app" / "ScalaFunction" / "ScalaFunction.jar"
