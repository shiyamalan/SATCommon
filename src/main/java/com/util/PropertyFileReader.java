package com.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader
{
  public static final String PROPERTY_FILE = "configs.properties";

  public static PropertyFileReader instance = null;

  private PropertyFileReader()
  {

  }

  public static PropertyFileReader getInstance()
  {
    if (instance == null)
    {
      instance = new PropertyFileReader();
    }
    return instance;
  }

  public Properties getProjectPropertie() 
  {

    InputStream inputStream = null;
    Properties prop = new Properties();
    try
    {
      inputStream = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE);
      if (inputStream != null)
      {
        prop.load(inputStream);
      }
      else
      {
        throw new FileNotFoundException("property file '" + PROPERTY_FILE + "' not found in the classpath");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        inputStream.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    return prop;
  }
}
