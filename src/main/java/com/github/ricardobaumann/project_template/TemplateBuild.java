/**
 * 
 */
package com.github.ricardobaumann.project_template;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import hudson.model.Build;

/**
 * @author ricardo
 *
 */
public class TemplateBuild extends Build<TemplateProject, TemplateBuild> {

	protected TemplateBuild(TemplateProject project) throws IOException {
		super(project);
	}

	public TemplateBuild(TemplateProject job, Calendar timestamp) {
		super(job, timestamp);
	}

	public TemplateBuild(TemplateProject project, File buildDir)
			throws IOException {
		super(project, buildDir);
	}
	
	@Override
	public void run() {
		System.out.println("\n\n\n\nRunning template build");
		super.run();
	}

}
