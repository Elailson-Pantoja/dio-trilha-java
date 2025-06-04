package com.elailson.equipamentos.multfuncional;

import com.elailson.equipamentos.copiadora.Copiadora;
import com.elailson.equipamentos.digitalizadora.Digitalizadora;
import com.elailson.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

    @Override
    public void copiar() {
        System.out.println("Copiando pela multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo pela multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digiitalizando pela multifuncional");
    }
    
}
