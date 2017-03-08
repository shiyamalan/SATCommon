package com.nlp.umlextractor.model;

/**
 * Maintains Class property information
 * 
 * @author SRatnavel
 * @since 1.0
 * @version 1.1
 */
public class ClassData extends ModelData
{

  private boolean isAbstract;

  private boolean isFinal;

  public ClassData()
  {
    setType("Class");
  }

  /**
   * @return the isAbstract
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * @param isAbstract the isAbstract to set
   */
  public void setIsAbstract(String isAbstract)
  {
    if (isAbstract.equals("true"))
    {
      this.isAbstract = true;
    }
    else
    {
      this.isAbstract = false;
    }
  }

  /**
   * @return the isFinal
   */
  public boolean isIsFinal()
  {
    return isFinal;
  }

  /**
   * @param isFinal the isFinal to set
   */
  public void setIsFinal(String isFinal)
  {

    if (isFinal.equals("true"))
    {
      this.isFinal = true;
    }
    else
    {
      this.isFinal = false;
    }
  }

}
