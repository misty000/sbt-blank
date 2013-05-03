name := "projectName"

sbtVersion := "0.12.3"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
	"org.slf4j"                %  "slf4j-api"          % "1.7.5",
	"ch.qos.logback"           %  "logback-core"       % "1.0.12",
	"ch.qos.logback"           %  "logback-classic"    % "1.0.12",
	"org.scalatest"            %% "scalatest"          % "1.9.1"   % "test",
	"org.specs2"               %% "specs2"             % "1.14"    % "test"
)