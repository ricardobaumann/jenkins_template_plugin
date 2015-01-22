/**
 * 
 */
package com.github.ricardobaumann.project_template;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.AbstractProject;
import hudson.model.Descriptor;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author ricardo
 *
 */
public class TemplateBuilder extends Builder {

	private String projectName;

	/**
	 * 
	 */
	@DataBoundConstructor
	public TemplateBuilder(String projectName) {
		this.setProjectName(projectName);  
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Override
	public boolean perform(Build<?, ?> build, Launcher launcher,
			BuildListener listener) throws InterruptedException, IOException {
		
		
		listener.getLogger().println("Performing templatebuilder");
		
		return true;
	}
	
	@Override
	public Descriptor<Builder> getDescriptor() {
		return DESCRIPTOR;
	}
	
	@Extension(ordinal=4000)
	public static final TemplateBuilderDescriptor DESCRIPTOR = new TemplateBuilderDescriptor();
	
	public static final class TemplateBuilderDescriptor extends BuildStepDescriptor<Builder> {

		@SuppressWarnings("rawtypes")
		@Override
		public boolean isApplicable(Class<? extends AbstractProject> arg0) {  
			return true;    
		}

		@Override
		public String getDisplayName() {
			return "Inherit builders from";
		}
		
		
		
	}

}
