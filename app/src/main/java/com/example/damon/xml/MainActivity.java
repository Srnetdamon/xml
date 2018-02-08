package com.example.damon.xml;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    String Teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DamonXml damon = new DamonXml();
        ListaScrool LeitorXml = new ListaScrool();

        try {
            Teste = damon.EscreverXML();
            LeitorXml.readText(Teste);
        } catch (Exception e) {
            Log.wtf("Damon", e.getMessage());
        }

        Log.e("msg", Teste);

// sub que enche o estrutura e faz a leitura


        Trabalhador();



    }


    private void Gravador() {
        String filename = "DamonPicudo.xml";
        String string = Teste;
        FileOutputStream outputStream;

        try {

            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            Log.e("ArquivoDamon", e.getMessage());
            e.printStackTrace();
        }

    }

    private void Trabalhador() {
        int a;

        BaseDadosScrool Base = new BaseDadosScrool();

        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);

        List<BaseDadosScrool> ListaScrool = new ArrayList<BaseDadosScrool>();

        Base.setData(dataFormatada);
        Base.setNumero_Scrool_Mistico_3_Estrela(1);
        Base.setNumero_Scrool_Mistico_4_Estrela(1);
        Base.setNumero_Scrool_Mistico_4_Estrela_Fake(1);
        Base.setNumero_Scrool_Mistico_5_Estrela(1);
        Base.setNumero_Scrool_Mistico_5_Estrela_Fake(1);

        Base.setNumero_Scrool_Luz_Escuridao_3_Estrela(1);
        Base.setNumero_Scrool_Luz_Escuridao_4_Estrela(1);
        Base.setNumero_Scrool_Luz_Escuridao_4_Estrela_Fake(1);
        Base.setNumero_Scrool_Luz_Escuridao_5_Estrela(1);
        Base.setNumero_Scrool_Luz_Escuridao_5_Estrela_Fake(1);

        Base.setNumero_Pedra_de_Evocacao_3_Estrela(1);
        Base.setNumero_Pedra_de_Evocacao_4_Estrela(1);
        Base.setNumero_Pedra_de_Evocacao_4_Estrela_Fake(1);
        Base.setNumero_Pedra_de_Evocacao_5_Estrela(1);
        Base.setNumero_Pedra_de_Evocacao_5_Estrela_Fake(1);

        Base.setNumero_Scrool_Lendario_4_Estrela(1);
        Base.setNumero_Scrool_Lendario_4_Estrela_Fake(1);
        Base.setNumero_Scrool_Lendario_5_Estrela(1);
        Base.setNumero_Scrool_Lendario_5_Estrela_Fake(1);


        ListaScrool.add(Base);

/*

        for (int i = 0; i < 100; i++) {
            Base.setNumero_Scrool_Mistico_3_Estrela(2 * i);
            Base.setData(dataFormatada);
            ListaScrool.add(Base);
        }
*/
        for (int i = 0; i < ListaScrool.size(); i++) {
            a = ListaScrool.get(i).getNumero_Scrool_Mistico_3_Estrela();

            Log.i("LISTA", Integer.toString(a));
            Log.i("LISTA1", ListaScrool.get(i).getData());
        }



    }

    public void Leitor() {
        try {

            String FILENAME = "DamonPicudo.xml";

            ListaScrool LL= new ListaScrool();
            InputStream Arquivo = null;


            FileInputStream in = openFileInput(FILENAME);

            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }

            Log.e("Arquivo", sb.toString());

        //LL.Leitor(sb.toString());

        } catch (Exception e) {
            Log.e("Falha", e.getMessage());
        }
    }


    }











