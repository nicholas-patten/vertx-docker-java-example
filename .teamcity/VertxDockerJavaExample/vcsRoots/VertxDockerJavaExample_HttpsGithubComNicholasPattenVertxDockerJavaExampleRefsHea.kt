package VertxDockerJavaExample.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea : GitVcsRoot({
    uuid = "7f264b96-8f61-40d1-ae5c-985ab967e5f2"
    id = "VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea"
    name = "https://github.com/nicholas-patten/vertx-docker-java-example#refs/heads/master"
    url = "https://github.com/nicholas-patten/vertx-docker-java-example"
    authMethod = password {
        userName = "nicholas-patten"
        password = "credentialsJSON:1fe79483-bcde-475e-b313-39ed5fbb0162"
    }
})
