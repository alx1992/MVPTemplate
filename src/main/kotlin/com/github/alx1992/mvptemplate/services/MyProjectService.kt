package com.github.alx1992.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.alx1992.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
