name := "nikt"

version := "1.0"

lazy val `nikt` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  