import complete.DefaultParsers._
import scala.reflect.runtime.universe

lazy val eulerProblem = inputKey[Unit]("Runs the specified Project Euler problem")

lazy val root = (project in file(".")).
  settings(
    name := "euler",
    version := "1.0.0",
    scalaVersion := "2.11.5",
    eulerProblem := {
      val arg = spaceDelimited("<arg>").parsed
    }
  )

mainClass in (Compile, run) := Some("euler.EulerMain")
