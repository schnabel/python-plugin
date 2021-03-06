package org.schnabelsoft.gradle.python.plugin

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.*
import org.gradle.work.Incremental

abstract class PipenvRunTask : Exec() {

    @Input
    var command = "echo running in pipenv"
        set(value) {
            args = ("run " + value).split(regex = Regex("\\s+"))
            println("running in pipenv")
        }

    init {
        val env = mapOf("WORKON_HOME" to "build/venv")
        environment(env)
        args = ("run " + command).split(regex = Regex("\\s+"))
        executable("pipenv")
        group = "python"
    }
}