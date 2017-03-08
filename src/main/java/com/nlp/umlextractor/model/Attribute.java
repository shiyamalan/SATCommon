package com.nlp.umlextractor.model;

/**
 * Contains Attributes specific information
 * @author SRatnavel
 * @since 1.0
 * @version 1.1
 */
public class Attribute extends Property
{

  private String dataType;

  public Attribute()
  {
    this.setType("Attribute");
  }

  public String getDataType()
  {
    return dataType;
  }

  public void setDataType(String dataType)
  {
    this.dataType = dataType;
  }
}
