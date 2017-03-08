package com.nlp.umlextractor.model;

import java.util.List;

/**
 * Maintains attributes list, and method list
 * @author SRatnavel
 * @since 1.0
 * @version 1.0
 */
public class ModelData extends Property
{
  private List<Attribute> attributeList;

  private List<Method> operationList;

  private String interfaces;

  private String superClasses;

  public ModelData()
  {
  }

  /**
   * @return the attributeList
   */
  public List<Attribute> getAttributeList()
  {
    return attributeList;
  }

  /**
   * @param attributeList the attributeList to set
   */
  public void setAttributeList(List<Attribute> attributeList)
  {
    this.attributeList = attributeList;
  }

  /**
   * @return the operationList
   */
  public List<Method> getOperationList()
  {
    return operationList;
  }

  public String getInterfaceNames()
  {
    return this.interfaces;
  }

  public String getSuperclassNames()
  {
    return this.superClasses;
  }

  /**
   * @param operationList the operationList to set
   */
  public void setOperationList(List<Method> operationList)
  {
    this.operationList = operationList;
  }

  public void setInterfaceNames(String nameString)
  {
    this.interfaces = nameString;
  }

  public void setSuperClassNames(String nameString)
  {
    this.superClasses = nameString;
  }

}
