package TcConfig.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object TcConfig_Build : BuildType({
    uuid = "7a483bc6-0899-487e-b0ac-370b9fe370f1"
    extId = "TcConfig_Build"
    name = "Build"

    vcs {
        root(TcConfig.vcsRoots.TcConfig_TcConfig)

    }

    steps {
        script {
            scriptContent = """
                echo branch_1
                echo --------------2017.1.5----------------
                cat README.md
                echo --------------2017.1.5----------------
                echo environment vars
                printenv
            """.trimIndent()
        }
    }
})
