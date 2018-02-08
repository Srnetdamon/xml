package com.example.damon.xml; /**
 * Created by damon on 26/01/18.
 */
import android.util.Xml;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.namespace.NamespaceContext;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class DamonXml {



    public static String EscreverXML() throws XmlPullParserException, IOException {

        XmlSerializer xmlSerializer = Xml.newSerializer();
        StringWriter writer = new StringWriter();

        xmlSerializer.setOutput(writer);
        // start DOCUMENT
        xmlSerializer.startDocument("UTF-8", true);
        // open tag: <record>
        xmlSerializer.startTag("", "SummonerList");


        xmlSerializer.startTag("","Data");
        xmlSerializer.attribute("", "ID", "30/01/2018");

        xmlSerializer.startTag("","Scrool_Mistico_3");
        xmlSerializer.text("seila");
        xmlSerializer.endTag("","Scrool_Mistico_3");

        xmlSerializer.startTag("","Scrool_Mistico_3");
        xmlSerializer.text("4 fake");
        xmlSerializer.endTag("","Scrool_Mistico_3");

        xmlSerializer.endTag("","Data");


        // close tag: </record>
        xmlSerializer.endTag("", "SummonerList");

        // end DOCUMENT
        xmlSerializer.endDocument();

        return writer.toString();
    }




}


