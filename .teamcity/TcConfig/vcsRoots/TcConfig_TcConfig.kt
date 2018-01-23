package TcConfig.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object TcConfig_TcConfig : GitVcsRoot({
    uuid = "f73a7472-f2be-4d7a-a1bf-311625236217"
    extId = "TcConfig_TcConfig"
    name = "TC Config"
    url = "git@github.com:sunyal/tc-config-2017.1.5.git"
    branch = "%my_branch%"
    authMethod = customPrivateKey {
        customKeyPath = "//data/teamcity_server/datadir/id_rsa_tc_test"
    }
})
