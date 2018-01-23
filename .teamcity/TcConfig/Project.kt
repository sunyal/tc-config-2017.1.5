package TcConfig

import TcConfig.buildTypes.*
import TcConfig.vcsRoots.*
import TcConfig.vcsRoots.TcConfig_TcConfig
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "11c73cd4-09b8-437b-a459-e8d11ac99130"
    extId = "TcConfig"
    parentId = "_Root"
    name = "TC Config"

    vcsRoot(TcConfig_TcConfig)

    buildType(TcConfig_Build)

    params {
        param("my_branch", "master")
    }

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = TcConfig_TcConfig.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
