val name = "wastewatertreatment"

lazy val buildSettings = Seq(
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
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
  },
  publishArtifact in Test := false,
  licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  homepage := Some(url("https://github.com/KasonChan/wastewatertreatment")),
  autoAPIMappings := true,
  apiURL := Some(url("https://kasonchan.github.io/wastewatertreatment/docs")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/KasonChan/wastewatertreatment"),
      "scm:git:git@github.com:KasonChan/wastewatertreatment.git"
    )
  ),
  pomExtra :=
    <developers>
      <developer>
        <id>KasonChan</id>
        <name>Kason Chan</name>
        <url>https://github.com/KasonChan</url>
      </developer>
    </developers>
)

lazy val noPublish = Seq(
  publish := {},
  publishLocal := {}
)

lazy val allSettings = baseSettings ++ buildSettings ++ publishSettings

lazy val docSettings = site.settings ++ ghpages.settings ++ unidocSettings ++ Seq(
  site.addMappingsToSiteDir(mappings in(ScalaUnidoc, packageDoc), "docs"),
  git.remoteRepo := s"git@github.com:KasonChan/wastewatertreatment.git"
)

lazy val wastewatertreatment = project.in(file("."))
  .settings(moduleName := name)
  .settings(allSettings: _*)
  .settings(docSettings: _*)
  .settings(noPublish: _*)
  .settings(
    libraryDependencies ++= testDependencies
  )
  .aggregate(core, objects)
  .dependsOn(core, objects)

lazy val core = project
  .settings(moduleName := name + "-" + "core")
  .settings(allSettings: _*)
  .settings(
    libraryDependencies ++= testDependencies
  )

lazy val objects = project
  .settings(moduleName := name + "-" + "objects")
  .settings(allSettings: _*)
  .settings(
    libraryDependencies ++= testDependencies
  )
  .dependsOn(core)
