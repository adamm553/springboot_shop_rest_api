/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1.Program;

import java.util.ArrayList;
import java.util.List;

public class PieczywoStatyczne
{
    private List<Pieczywo> pieczywo;
    
    private static PieczywoStatyczne instance=null;
    
    public static PieczywoStatyczne getInstance(){
        if (instance==null){
            instance = new PieczywoStatyczne();
        }
        return instance;
    }
    public PieczywoStatyczne(){
        pieczywo = new ArrayList<Pieczywo>();
        pieczywo.add(new Pieczywo(1, "Chleb bialy", 2.99));
        pieczywo.add(new Pieczywo(2, "Chleb zdrowy", 3.99));
        pieczywo.add(new Pieczywo(3, "Bulka grahamka", 5.99));
        pieczywo.add(new Pieczywo(4, "Bulka kajzerka", 1.99));
        pieczywo.add(new Pieczywo(5, "Bulka serowa", 2.99));
    }
    public List<Pieczywo> pobierzProdukty(){
        return pieczywo;
    }
    
    public Pieczywo getPieczywoById(int id)
    {
        for (Pieczywo chleb: pieczywo)
        {
            if (chleb.getId() == id)
            {
                return chleb;
            }
        }
        return null;
    }
    
    public List<Pieczywo> getPieczywoByCena(Double cenaOd, Double cenaDo)
    {
        List<Pieczywo> pieczywo_cena = new ArrayList<Pieczywo>();
        
        for (Pieczywo chleb: pieczywo)
        {
            if (chleb.getCena() >= cenaOd & chleb.getCena() <= cenaDo)
            {
                pieczywo_cena.add(chleb);
            }
        }
        return pieczywo_cena;
    }
    
    public Pieczywo tworzeniePieczywa(int id, String nazwa, Double cena)
    {
        Pieczywo nowyChleb = new Pieczywo(id, nazwa, cena);
        pieczywo.add(nowyChleb);
        return nowyChleb;
    }
    
    public Pieczywo zmianaPieczywa(int id, String nazwa, Double cena)
    {
        for (Pieczywo chleb: pieczywo)
        {
            if (chleb.getId() == id)
            {
                int indexProduktu = pieczywo.indexOf(chleb);
                chleb.setNazwa(nazwa);
                chleb.setCena(cena);
                pieczywo.set(indexProduktu, chleb);
                return chleb;
            }
        }
        return null;
    }
    
    public boolean usuwaniePieczywa(int id){
        int indexProduktu = -1;
        for (Pieczywo chleb: pieczywo)
        {
            if (chleb.getId() == id){
                indexProduktu = pieczywo.indexOf(chleb);
                continue;
            }
        }
        if (indexProduktu > -1){
            pieczywo.remove(indexProduktu);
            return true;
        }
        return false;
    }
    
    
    
    public String pobierzProduktyHTML(){
String tabela = "<style> td, th { border: lpx solid black; } </style>" +
"<table>                                                             " +
"   <thead>                                                          " +
"       <tr> <th> Identyfikator <th> Nazwa <th> Cena                 " +
"   <tbody>                                                          ";
    for (Pieczywo chleb: pieczywo) {
       tabela = tabela + "<tr><th>" + chleb.getId() + "<td>" +chleb.getNazwa()+"<td>" +chleb.getCena();
}
    tabela=tabela+"</table>";
    
    return tabela;
    }
    
    public String pobierzChlebHTML() {
        StringBuilder tabela = new StringBuilder();
        tabela.append("<style> td, th {border: lpx solid black; } </style>")
                .append("<table>")
                .append("<thead>")
                .append("<tr> <th> ID produktu </th><th> Nazwa Produktu </th><th> Cena </th>")
                .append("</thead>")
                .append("</tbody>");
        
        for (Pieczywo chleb: pieczywo)
        {
            tabela.append("<tr><td>").append(chleb.getId()).append("</td><td>")
                    .append(chleb.getNazwa()).append("/td><td>").append(chleb.getCena())
                    .append("</td></tr>");
        }
        
        tabela.append("</tbody")
                .append("</table>");
        
        return tabela.toString();
                
    }
    
    public void dodajCheleb(Pieczywo chleb)
    {
        pieczywo.add(chleb);
    }
}