plugins {
    alias(libs.plugins.java)
}

allprojects {
    group = "practice.mrasadatik"
    version = "unspecified"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(providers.gradleProperty("javaVersion").get()))
        }
    }

    dependencies {
        testImplementation(platform(rootProject.libs.junitBom))
        testImplementation(rootProject.libs.junitJupiter)
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}