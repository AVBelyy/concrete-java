name := "concrete-scala"

version := "2.0.3-SNAPSHOT"

organization := "edu.jhu.hlt"

scalaVersion := "2.10.3"

com.twitter.scrooge.ScroogeSBT.newSettings

scroogeThriftSourceFolder in Compile <<= (baseDirectory in Compile) { _ / ".." / "thrift" }

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.9.1",
  "com.twitter" %% "scrooge-core" % "3.11.2",
  "com.twitter" %% "finagle-thrift" % "6.10.0"
)

// resolvers += "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"

// publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
