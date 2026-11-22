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
  mainClass.set("Main")
}

tasks.named<JavaExec>("run"){
  standardInput = System.`in`
}

tasks.jar{
  manifest{
    attributes["Main-Class"] = "Main"
  }
}
