package VertxDockerJavaExample.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dockerBuild
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object VertxDockerJavaExample_Build : BuildType({
    uuid = "0150a999-e162-417a-8b6e-bf4c1dd6951b"
    id = "VertxDockerJavaExample_Build"
    name = "Build"

    vcs {
        root(VertxDockerJavaExample.vcsRoots.VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea)

    }

    steps {
        maven {
            goals = "clean test"
            mavenVersion = defaultProvidedVersion()
        }
        dockerBuild {
            source = path {
                path = "Dockerfile"
            }
        }
    }

    triggers {
        vcs {
        }
    }
})
