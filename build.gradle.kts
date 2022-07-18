import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Refs:
// https://docs.gradle.org/current/userguide/building_java_projects.html
// https://docs.gradle.org/current/userguide/tutorial_using_tasks.html
// https://docs.gradle.org/current/userguide/migrating_from_groovy_to_kotlin_dsl.html

plugins {
    kotlin("jvm") version "1.6.21"
    java

    // for tasks.shadowJar
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

// required for runtime
tasks.jar {
    manifest {
        attributes("Main-Class" to "net.example.MainClass")
    }
}

tasks.shadowJar {
    minimize()
}