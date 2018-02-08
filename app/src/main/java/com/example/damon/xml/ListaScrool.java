package com.example.damon.xml;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by damon on 01/02/18.
 */

public class ListaScrool
{
    public static void Leitor( String XML )
            throws XmlPullParserException, IOException
    {

        Log.i("TodoDocumento",XML);

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);

        XmlPullParser xpp = factory.newPullParser();

        xpp.setInput( new StringReader(XML));

        int eventType = xpp.getEventType();
        while (eventType != XmlPullParser.END_DOCUMENT) {
            if(eventType == XmlPullParser.START_DOCUMENT) {
                Log.i("Printf",("Start document"));
            } else if(eventType == XmlPullParser.START_TAG) {
                Log.i("Printfvalue",xpp.getName()); Log.i("Printfvalue",xpp.getAttributeValue(null,"ID"));
            } else if(eventType == XmlPullParser.END_TAG) {
                Log.i("Printf",xpp.getName());
            } else if(eventType == XmlPullParser.TEXT) {
                Log.i("Printf",xpp.getText());
            }
            eventType = xpp.next();
        }
        Log.i("Printf","End document");

    }

    public void readText(String XML) throws Exception {

        Log.i("TodoDocumento",XML);

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);

        XmlPullParser xpp = factory.newPullParser();

        xpp.setInput( new StringReader(XML));

        int eventType = xpp.getEventType();
        while (eventType != XmlPullParser.END_DOCUMENT) {


            switch (eventType)
            {
                case XmlPullParser.START_TAG:

                    Log.i("Case",xpp.getName());
                    if (xpp.getName().equals("Data")) {
                        Log.i("evento",xpp.getAttributeValue(null,"ID"));
                        Log.i("evento3",xpp.getName());
                    } else { Log.i("evento1",xpp.getName()); }
                    break;

                case XmlPullParser.END_TAG:
                        if(xpp.getName().equals("Data")) {
                        Log.i("evento4",xpp.getName());

                        }
                    break;

            }




          //  Log.i("evento",xpp.getAttributeValue(null,"ID"));

            eventType = xpp.next();
        }
        Log.i("Printf","End document");

    }






}
