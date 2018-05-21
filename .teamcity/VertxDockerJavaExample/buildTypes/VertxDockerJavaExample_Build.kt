package VertxDockerJavaExample.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dockerBuild
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object VertxDockerJavaExample_Build : BuildType({
    uuid = "8e09c2e4-e159-497e-9b10-dc8e75fcbebb"
    id = "VertxDockerJavaExample_Build"
    name = "Build"

    vcs {
        root(VertxDockerJavaExample.vcsRoots.VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea)

    }

    steps {
        maven {
            goals = "clean install"
            mavenVersion = defaultProvidedVersion()
        }
        dockerBuild {
            source = path {
                path = "Dockerfile"
            }
            namesAndTags = "sample/vertx-java"
            commandArgs = ""
        }
    }

    triggers {
        vcs {
        }
    }
})
