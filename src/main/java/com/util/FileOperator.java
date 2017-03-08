package com.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * 
 * @author SRatnavel
 * @since 1.0
 * @version 1.0
 */
public abstract class FileOperator
{

  /**
   * TO WRITE THE CLASS DIAGRAM CONTENTS AS XML FILE FORMAT.
   * 
   * @param filePath,WHERE THIS CONTENTS IS GOING TO SAVE
   * @param doc, contents of file
   * @throws TransformerException
   */
  public static void writeToXML(String filePath, Document doc) throws TransformerException
  {
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
    DOMSource source = new DOMSource(doc);

    File f = new File(filePath);
    StreamResult result = new StreamResult(f.getPath());
    transformer.transform(source, result);
  }

  public void addSubFolderIntoProject(File folder)
  {

    if (!folder.exists())
    {
      folder.mkdirs();
    }
    File add_file = new File(folder, FilePropertyName.XML);
    add_file.mkdirs();
    add_file = new File(folder, FilePropertyName.UML);
    add_file.mkdirs();
    add_file = new File(folder, FilePropertyName.REQUIREMENT);
    add_file.mkdirs();
    add_file = new File(folder, FilePropertyName.SOURCE_CODE);
    add_file.mkdirs();
    add_file = new File(folder, FilePropertyName.PROPERTY);
    add_file.mkdirs();
  }

  /**
   * Get the document Java object for existing file.
   * 
   * @param path for a file which contains XML or XMI format contents.
   * @return document object of file
   * @throws ParserConfigurationException
   * @throws SAXException
   * @throws IOException
   */
  public static Document getXMLDocument(String path) throws ParserConfigurationException, SAXException, IOException
  {
    File fXmlFile = new File(path);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile);
    return doc;
  }
}
