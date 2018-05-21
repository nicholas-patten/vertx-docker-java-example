package VertxDockerJavaExample

import VertxDockerJavaExample.buildTypes.*
import VertxDockerJavaExample.vcsRoots.*
import VertxDockerJavaExample.vcsRoots.VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "06ad5108-7f9c-468e-919d-296094950e38"
    id = "VertxDockerJavaExample"
    parentId = "_Root"
    name = "Vertx Docker Java Example"

    vcsRoot(VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea)

    buildType(VertxDockerJavaExample_Build)

    params {
        password("env.GITHUB_TOKEN", "credentialsJSON:31430087-7c10-409d-b44d-5e03b5fc5df8", display = ParameterDisplay.HIDDEN, readOnly = true)
    }

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
