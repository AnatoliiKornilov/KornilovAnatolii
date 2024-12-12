package org.example;

import java.io.IOException;
import java.io.StringWriter;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import spark.ModelAndView;
import spark.TemplateEngine;

public class FreeMarkerEngine extends TemplateEngine {

  private Configuration configuration;

  public FreeMarkerEngine() {
    this.configuration = createDefaultConfiguration();
  }

  public FreeMarkerEngine(Configuration configuration) {
    this.configuration = configuration;
  }

  @Override
  public String render(ModelAndView modelAndView) {
    try {
      StringWriter stringWriter = new StringWriter();
      Template template = configuration.getTemplate(modelAndView.getViewName());
      template.process(modelAndView.getModel(), stringWriter);
      return stringWriter.toString();
    } catch (IOException | TemplateException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Deprecated
  public void setConfiguration(Configuration configuration) {
    this.configuration = configuration;
  }

  private Configuration createDefaultConfiguration() {
    Configuration configuration = new Configuration(new Version(2, 3, 23));
    configuration.setClassForTemplateLoading(FreeMarkerEngine.class, "");
    return configuration;
  }

}