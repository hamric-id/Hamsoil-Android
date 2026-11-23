import java.util.Properties

val localProperties = Properties().apply {
    val propFile = rootDir.resolve("local.properties")
    if (propFile.exists()) {
        propFile.inputStream().use { load(it) }
    }
}

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")

        maven {
            url = uri("https://maven.pkg.github.com/hamric-id/soil-eight-Android")
            credentials {
                username = localProperties.getProperty("gpr.user")
                password = localProperties.getProperty("gpr.key")
            }
        }
    }
}

rootProject.name = "Hamsoil"
include(":app")
 