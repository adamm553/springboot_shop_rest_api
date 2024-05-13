/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1.Program;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
public class Kontroler {
    
    PieczywoStatyczne pieczywoStatyczne = PieczywoStatyczne.getInstance();
    
    
    @RequestMapping("/chleb")
    public String produkt() {
        return new Pieczywo(1, "Piwo", 2.99).toString();
    }
    
    @RequestMapping("/chleby")
    public List<Pieczywo> produkty(){
        return new PieczywoStatyczne().pobierzProdukty();
    }
    
    @RequestMapping("/chlebyHTML")
    public String produktyHTML()
    {
        return new PieczywoStatyczne().pobierzProduktyHTML();
    }
    
    @RequestMapping("/chleb/{id}")
    public Pieczywo pieczywo(@PathVariable int id) {
        return new PieczywoStatyczne().getPieczywoById(id);
    }
    
    @RequestMapping("/chleb/szukajcena")
    public List<Pieczywo> pieczywo(@RequestParam Double cenaOd, @RequestParam Double cenaDo)
    {
        return new PieczywoStatyczne().getPieczywoByCena(cenaOd, cenaDo);
    }
    
    @PostMapping("/chleb/dodaj")
    public Pieczywo utworzProdukt(@RequestBody Map<String, String> body){
        int id = Integer.parseInt(body.get("id"));
        String nazwa = body.get("nazwa");
        Double cena = Double.parseDouble(body.get("cena"));
        return pieczywoStatyczne.tworzeniePieczywa(id, nazwa, cena);
    }
    
    @PutMapping("/chleb/zmien/{id}")
    public Pieczywo zmienProdukt(@PathVariable String id, @RequestBody Map<String, String> body)
    {
        int produktId = Integer.parseInt(id);
        String nazwa = body.get("nazwa");
        Double cena = Double.parseDouble(body.get("cena"));
        return pieczywoStatyczne.zmianaPieczywa(produktId, nazwa, cena);
    }
    
    @DeleteMapping("/chleb/usun/{id}")
    public boolean usunProdukt(@PathVariable String id)
    {
        int produktId = Integer.parseInt(id);
        return pieczywoStatyczne.usuwaniePieczywa(produktId);
    }
}
