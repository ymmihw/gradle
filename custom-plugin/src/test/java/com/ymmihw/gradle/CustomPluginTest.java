package com.ymmihw.gradle;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;

public class CustomPluginTest {

  @Test
  public void greetingTest() {
    Project project = ProjectBuilder.builder().build();
    project.getPluginManager().apply("com.ymmihw.gradle");

    assertTrue(project.getPluginManager()
        .hasPlugin("com.ymmihw.gradle"));

    assertNotNull(project.getTasks().getByName("hello"));
  }
}
