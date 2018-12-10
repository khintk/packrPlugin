package org.example.KhinPackrPlugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class KhinPackrPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("helloGradle", Greeting.class, (task) -> {
            task.setMessage("Hello");
            task.setRecipient("World");
        });

        project.getTasks().create("applyPlugin",  (task) -> {
            project.getPluginManager().apply("com.hendraanggrian.packr");
        });

    }

}
