/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1.Program;

public class Pieczywo
{
    private int id_produktu;
    private String nazwa_produktu;
    private Double cena;
    
    public Pieczywo() {  }
    public Pieczywo(int id_produktu, String nazwa_produktu, Double cena)
    {
        this.setId(id_produktu);
        this.setNazwa(nazwa_produktu);
        this.setCena(cena);
        
    }
    
    public int getId(){
        return id_produktu;
    }
    
    public void setId(int id_produktu)
    {
        this.id_produktu = id_produktu;
    }
    
    public String getNazwa(){
        return nazwa_produktu;
    }
    
    public void setNazwa(String nazwa_produktu)
    {
        this.nazwa_produktu = nazwa_produktu;
    }
    
    public Double getCena() {
        return cena;
    }
    
    public void setCena(Double cena)
    {
        this.cena = cena;
    }
    

    @Override
    public String toString()
    {
        return "Pieczywo{" +
                "id=" + id_produktu +
                ", nazwa='" + nazwa_produktu + '\'' +
                ", cena='" + cena + '\'' +
                '}';
    }
}
