package com.util;

import java.io.File;

/**
 *  It contains default path names and folder names
 *  @author SRatnavel
 *  @since 1.0
 *  @version 1.0
 */
public class FilePropertyName
{

  public static String user_home = System.getProperty("user.home") + File.separator
      + PropertyFileReader.getInstance().getProjectPropertie().getProperty("project.name");

  public static String RESOURCE_PATH = getPathFormat(
      PropertyFileReader.getInstance().getProjectPropertie().getProperty("path.resource"));

  public static final String XML = PropertyFileReader.getInstance().getProjectPropertie().getProperty("folder.xml");

  public static final String REQUIREMENT = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("folder.txt");

  public static final String UML = PropertyFileReader.getInstance().getProjectPropertie().getProperty("folder.uml");

  public static final String SOURCE_CODE = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("folder.src");

  public static final String PROPERTY = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("folder.property");

  public static final String TEMP = PropertyFileReader.getInstance().getProjectPropertie().getProperty("folder.temp");

  public static final String RELATION_ARTIFACT_NAME = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("file.relation");

  public static final String UML_ARTIFACT_NAME = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("file.uml");

  public static final String REQUIREMENT_ARTIFACT_NAME = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("file.txt");

  public static String SOURCE_ARTIFACT_NAME = PropertyFileReader.getInstance().getProjectPropertie()
      .getProperty("file.src");

  private static String getPathFormat(String property2)
  {
    if(property2 == null)
    {
      return "";
    }
    property2 = property2.replaceAll("user.home", System.getProperty("user.home"));
    property2 = property2.replaceAll("#", File.separator + "" +File.separator);
    return property2;
  }



}
