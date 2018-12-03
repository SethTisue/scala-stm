
name := "scala-stm-dep-tests-sbt"

organization := "org.scala-stm"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.12.7", "2.11.6")

resolvers += ("releases" at "https://oss.sonatype.org/content/repositories/releases")

resolvers += ("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")

libraryDependencies += ("org.scala-stm" %% "scala-stm" % "0.9")
