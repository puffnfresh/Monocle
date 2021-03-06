resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.url("tpolecat-sbt-plugin-releases",
  url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"           % "0.3.2")
addSbtPlugin("com.github.gseitz"  % "sbt-release"          % "1.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"              % "1.0.0")
addSbtPlugin("org.tpolecat"       % "tut-plugin"           % "0.4.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-ghpages"          % "0.5.3")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"      % "0.1.7")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"             % "0.8.1")
addSbtPlugin("net.virtual-void"   % "sbt-dependency-graph" % "0.7.4")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"         % "0.5.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"              % "0.2.4")