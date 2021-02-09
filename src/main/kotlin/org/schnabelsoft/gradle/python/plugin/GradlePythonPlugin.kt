/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.schnabelsoft.gradle.python.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

open class PythonPluginExtension {
    var message = "Hello from plugin 'org.schnabelsoft.gradle.python'"
}

class GradlePythonPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<PythonPluginExtension>("python", PythonPluginExtension::class.java)
        val greetingTask = project.tasks.create("greeting", GreetingTask::class.java)
        val pipenvTask = project.tasks.create("pipenv", PipenvInstallTask::class.java)
    }
}
