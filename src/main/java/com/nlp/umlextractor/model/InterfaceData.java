
package com.nlp.umlextractor.model;

/**
 * Maintains interface property information 
 * @author SRatnavel
 * @since 1.0
 * @version 1.1
 */
public class InterfaceData extends ClassData
{
  public InterfaceData()
  {
    setIsFinal("false");
    setIsAbstract("true");
    setType("Interface");
  }
}
