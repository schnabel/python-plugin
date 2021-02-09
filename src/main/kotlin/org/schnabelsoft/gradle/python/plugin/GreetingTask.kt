package org.schnabelsoft.gradle.python.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

open class GreetingTask : DefaultTask() {
    @Input
    @Optional
    @Option(description = "Message from command line", option = "message")
    var message: String? = null

    @TaskAction
    fun run() {
        val extension = project.extensions.findByName("python") as PythonPluginExtension
        extension.message.let {
            println(extension.message)
        }
        message?.let {
            println("Hello from command line $message")
        }
    }
}