package VertxDockerJavaExample.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea : GitVcsRoot({
    uuid = "0e380fe4-0cf6-481e-9d42-b5a6d802f487"
    id = "VertxDockerJavaExample_HttpsGithubComNicholasPattenVertxDockerJavaExampleRefsHea"
    name = "https://github.com/nicholas-patten/vertx-docker-java-example#refs/heads/master"
    url = "https://github.com/nicholas-patten/vertx-docker-java-example"
    authMethod = password {
        userName = "nicholas-patten"
        password = "credentialsJSON:09da0ab6-d15a-4dc7-923c-2bf66d3689aa"
    }
})
