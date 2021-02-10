package org.schnabelsoft.gradle.python.plugin

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.*
import org.gradle.work.Incremental

abstract class PipenvInstallTask : Exec() {

    @get:Incremental
    @get:InputFile
    abstract val pipfile: RegularFileProperty

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    init {
        val env = mapOf("WORKON_HOME" to "build/venv")
        environment(env)
        setCommandLine("pipenv", "install", "--dev")
        group = "python"
    }
}