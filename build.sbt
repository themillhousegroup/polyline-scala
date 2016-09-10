name := "polyline-scala"

// If the CI supplies a "build.version" environment variable, inject it as the rev part of the version number:
version := s"${sys.props.getOrElse("build.majorMinor", "1.0")}.${sys.props.getOrElse("build.version", "SNAPSHOT")}"

organization := "trifectalabs"

scalaVersion := "2.11.7"

publishArtifact in (Compile, packageDoc) := false

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
