plugins {
  java
  application
}

repositories {
  mavenCentral()
}

dependencies{
}

application{
  mainClass.set("me.hatkid.Main")
}

tasks.named<JavaExec>("run"){
  standardInput = System.`in`
}

tasks.jar{
  manifest{
    attributes["Main-Class"] = "me.hatkid.Main"
  }
}
