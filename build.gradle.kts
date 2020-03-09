plugins {
    java
    application
    idea
}

group = "com.peter.test"
version = "0.0.1-SNAPSHOT"

repositories {
    jcenter()
}

application {
    mainClassName = "com.peter.test.Application"
}

idea {
    module {
        outputDir = file("build/classes/main")
    }
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = application.mainClassName
    }
}
