/*
 * Copyright (C) 2019  Consiglio Nazionale delle Ricerche
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
