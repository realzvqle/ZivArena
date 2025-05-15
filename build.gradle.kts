plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.zivarena"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("uk.co.electronstudio.jaylib:jaylib:5.5.+")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveBaseName.set("arena");
    archiveVersion.set("SNAPSHOT");
    manifest {
        attributes["Main-Class"] = "org.zivarena.Main"
    }
}