package it.cnr.si.cool.jconon.service;

import com.google.gson.JsonObject;
import it.cnr.si.cool.jconon.dto.SiperSede;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Primary
public class SiperSZNService extends SiperService {
    @Override
    public JsonObject getAnagraficaDipendente(String username) {
        return new JsonObject();
    }

    @Override
    public Collection<SiperSede> cacheableSiperSedi() {
        List<SiperSede> siperSedes = new ArrayList<SiperSede>();

        SiperSede s1 = new SiperSede();
        s1.setDescrizione("Stazione Zoologica Anton Dohrn");
        s1.setCap("80121");
        s1.setIndirizzo("Villa Comunale");
        s1.setCitta("Napoli");
        s1.setSedeId("-1");
        siperSedes.add(s1);

        SiperSede s2 = new SiperSede();
        s2.setDescrizione("Stazione Zoologica Anton Dohrn");
        s2.setCap("80077");
        s2.setIndirizzo("Punta S. Pietro");
        s2.setCitta("Ischia");
        s2.setSedeId("-2");
        siperSedes.add(s2);

        return siperSedes;
    }
}
