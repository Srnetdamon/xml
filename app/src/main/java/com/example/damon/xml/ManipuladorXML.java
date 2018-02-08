package com.example.damon.xml;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by damon on 07/02/18.
 */

public class ManipuladorXML {
    public void AdicionarScrool(String Nome)
    {

switch (Nome) {

    case "Mistico3":

        BaseDadosScrool Base = new BaseDadosScrool();

        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);

        List<BaseDadosScrool> ListaScrool = new ArrayList<BaseDadosScrool>();

        Base.setData(dataFormatada);

        Base.setNumero_Scrool_Mistico_3_Estrela(1);



        ListaScrool.add(Base);



        break;



}


    }





}
