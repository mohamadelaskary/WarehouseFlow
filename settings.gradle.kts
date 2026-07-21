pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "WarehouseFlow"

include(":app")
include(":core:ui")
include(":core:database")
include(":core:network")
include(":core:data")
include(":feature:inventory")
