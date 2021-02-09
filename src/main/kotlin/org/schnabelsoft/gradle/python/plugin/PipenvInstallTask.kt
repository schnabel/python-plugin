package org.schnabelsoft.gradle.python.plugin

import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

open class PipenvInstallTask : Exec() {
    init {
        setGroup("python")
        val env = mapOf("WORKON_HOME" to "build")
        environment(env)
        setCommandLine("pipenv", "install", "--dev")
    }
}