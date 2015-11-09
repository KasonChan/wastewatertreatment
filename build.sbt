lazy val buildSettings = Seq(
  name := "wastewatertreatment",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val compilerOptions = Seq(
  "-encoding", "UTF-8",
  "-feature"
)

val testDependencies = Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.5",
  "org.scalatest" %% "scalatest" % "2.2.5"
)

val akkaStreamV = "1.0"

val baseSettings = Seq(
  libraryDependencies ++= Seq(
    "org.jfree" % "jfreechart" % "1.0.17",
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamV
  ) ++ testDependencies.map(_ % "test"),
  scalacOptions in(Compile, console) := compilerOptions
)

lazy val publishSettings = Seq(
  publishMavenStyle := true,
  publishArtifact := true,
  publishArtifact in Test := false,
  licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  autoAPIMappings := true,
  apiURL := Some(url("https://kasonchan.github.io/wastewatertreatment/docs")),
  pomExtra :=
    <developers>
      <developer>
        <id>KasonChan</id>
        <name>Kason Chan</name>
      </developer>
    </developers>
)

lazy val noPublish = Seq(
  publish := {},
  publishLocal := {}
)

lazy val allSettings = baseSettings ++ buildSettings ++ publishSettings

lazy val root = project.in(file("."))
  .settings(moduleName := "wastewatertreatment")
  .settings(allSettings)
  .settings(noPublish)
