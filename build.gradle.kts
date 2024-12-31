plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "dev.ole.lib"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.projectlombok:lombok:1.18.30")
    implementation("io.netty:netty5-all:5.0.0.Alpha5")

    annotationProcessor("org.projectlombok:lombok:1.18.30")
}


tasks.build {
    dependsOn(tasks.named("shadowJar"))
}