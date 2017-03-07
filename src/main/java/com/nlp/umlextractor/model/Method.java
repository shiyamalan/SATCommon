/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nlp.umlextractor.model;

import java.util.List;

/**
 *
 * @author shiyam
 */
public class Method extends Property{
    
    private boolean isAbstract;
    private String returnType;
    private List<Parameter> parameterList;
    private String paramString;
    /**
     * @return the isAbstract
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * @param isAbstract the isAbstract to set
     */
    public void setIsAbstract(String isAbstract) {
        this.isAbstract = Boolean.parseBoolean(isAbstract);
    }

    /**
     * @return the parameterList
     */
    public List<Parameter> getParameterList() {
        return parameterList;
    }

    /**
     * @param parameterList the parameterList to set
     */
    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    /**
     * @return the returnType
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * @param returnType the returnType to set
     */
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
    
    public void setParamString(String paramString){
    	this.paramString = paramString;
    }
    
    public String getParamString(){
    	return paramString;
    }
    
}
