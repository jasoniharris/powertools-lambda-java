plugins {
    id("io.freefair.aspectj.post-compile-weaving") version "6.6.3"
    kotlin("jvm") version "1.9.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.amazonaws:aws-lambda-java-core:1.2.2")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.2.2")
    implementation("com.amazonaws:aws-lambda-java-events:3.11.0")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.2")
    aspect("software.amazon.lambda:powertools-tracing:1.17.0")
    aspect("software.amazon.lambda:powertools-logging:1.17.0")
    aspect("software.amazon.lambda:powertools-metrics:1.17.0")
    testImplementation("junit:junit:4.13.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_1_8
}
