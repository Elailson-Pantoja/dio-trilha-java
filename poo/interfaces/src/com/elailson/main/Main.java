package com.elailson.main;

import com.elailson.equipamentos.copiadora.Copiadora;
import com.elailson.equipamentos.copiadora.Xerox;
import com.elailson.equipamentos.digitalizadora.Digitalizadora;
import com.elailson.equipamentos.impressora.Deskjet;
import com.elailson.equipamentos.impressora.Impressora;
import com.elailson.equipamentos.impressora.Laserjet;
import com.elailson.equipamentos.multfuncional.EquipamentoMultifuncional;

public class Main {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        em.copiar();
        em.imprimir();
        em.digitalizar();

        Impressora impressora = new Laserjet();
        impressora.imprimir();
        Impressora impressora1 = new Deskjet();
        impressora1.imprimir();
        Impressora impressora2 = new EquipamentoMultifuncional();
        impressora2.imprimir();
        
        Copiadora copiadora = new Xerox();
        copiadora.copiar();
        Copiadora copiadora2 = new EquipamentoMultifuncional();
        copiadora2.copiar();

        Digitalizadora digitalizadora = new com.elailson.equipamentos.digitalizadora.Scanner();
        digitalizadora.digitalizar();
        Digitalizadora digitalizadora2 = new EquipamentoMultifuncional();
        digitalizadora2.digitalizar();
    }
}
