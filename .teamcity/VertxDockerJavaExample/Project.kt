package VertxDockerJavaExample

import VertxDockerJavaExample.buildTypes.*
import VertxDockerJavaExample.vcsRoots.*
import VertxDockerJavaExample.vcsRoots.VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "80cb5963-8e40-40e6-b782-f6961fb60688"
    id = "VertxDockerJavaExample"
    parentId = "_Root"
    name = "Vertx Docker Java Example"

    vcsRoot(VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea)

    buildType(VertxDockerJavaExample_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
