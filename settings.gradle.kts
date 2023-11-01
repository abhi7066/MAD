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

rootProject.name = "MCAII"
include(":app")
include(":app:question1")
include(":app:question2")
include(":app:question3a")
include(":app:question3b")
include(":app:question4")
include(":app:question5")
include(":app:question6")
include(":app:question7")
include(":app:question8")
