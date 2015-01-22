/**
 * 
 */
package com.github.ricardobaumann.project_template;

import hudson.Extension;
import hudson.model.ItemGroup;
import hudson.model.TopLevelItem;
import hudson.model.TopLevelItemDescriptor;
import hudson.model.Project;

/**
 * @author ricardo
 *
 */
@SuppressWarnings("unchecked")
public class TemplateProject extends Project<TemplateProject, TemplateBuild> implements TopLevelItem {

	@SuppressWarnings("rawtypes")
	public TemplateProject(ItemGroup parent, String name) {
		super(parent, name);
	}

	@Override
	public TopLevelItemDescriptor getDescriptor() {  
		return DESCRIPTOR;
	}

	@Override
	protected Class<TemplateBuild> getBuildClass() {
		return TemplateBuild.class;
	}  

	@Extension(ordinal=3000)
	public static final TemplateProjectDescriptor DESCRIPTOR = new TemplateProjectDescriptor();
	
	public static final class TemplateProjectDescriptor extends AbstractProjectDescriptor {

		@Override
		public String getDisplayName() {
			return "Project based on template";
		}

		@SuppressWarnings("rawtypes")
		@Override
		public TopLevelItem newInstance(ItemGroup arg0, String arg1) {
			return new TemplateProject(arg0, arg1);  
		}
		
	}


}
