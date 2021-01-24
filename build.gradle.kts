fun depver(key: String) : String {
    return project.property(key + "_version").toString()
}

plugins {
    id("com.github.johnrengelman.shadow") version "6.0.0"
    java
}

group = "dk.lessor"
version = "0.0.5-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    // See also META-INF/jboss-deployment-structure.xml where some more dependency stuff has been set up for JBOSS
    // I can't say that I understand it, but it works
    compileOnly("org.keycloak:keycloak-core:${depver("keycloak")}")
    compileOnly("org.keycloak:keycloak-server-spi:${depver("keycloak")}")
    compileOnly("org.keycloak:keycloak-server-spi-private:${depver("keycloak")}")
    compileOnly("org.keycloak:keycloak-services:${depver("keycloak")}")
    compileOnly("org.keycloak:keycloak-model-jpa:${depver("keycloak")}")

    implementation("com.auth0:java-jwt:${depver("java_jwt")}")
    implementation("org.xerial:sqlite-jdbc:${depver("sqlite_jdbc")}")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

// Show linter errors immediately
afterEvaluate {
    tasks.withType(JavaCompile::class) {
        options.compilerArgs.add("-Xlint:unchecked")
        options.compilerArgs.add("-Xlint:deprecation")
    }
}
