name := "IntervalTree"

organization := "dscobral"

version := "1.1"

scalaVersion := "2.12.6"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck"      % "1.13.4" % Test
)
