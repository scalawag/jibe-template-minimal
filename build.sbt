name := """jibe-template-minimal"""

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

sourcesInBase := false

// TODO When this project is templatized we will want to be able to inject the jibe version when it is reified.

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "org.scalawag" %% "jibe-core" % "0.1-SNAPSHOT"
