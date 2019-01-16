name := "scala-kafka-consumer"
organization := "pt.sonae.bit"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.0"
val openTracingScalaVersion = "0.0.4"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value,

  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion,
  // https://mvnrepository.com/artifact/io.opentracing.contrib/opentracing-scala-concurrent
  "io.opentracing.contrib" %% "opentracing-scala-concurrent" % openTracingScalaVersion
)