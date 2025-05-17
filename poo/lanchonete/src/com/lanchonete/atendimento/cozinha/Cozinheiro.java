package com.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche no balcão");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao(){
        prepararCombo();
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private  void prepararlanche(){
        lavarIngredientes();
        System.out.println("Preparando lanche");
    }

    private  void prepararVitamina(){
        lavarIngredientes();
        selecionarIngredientesVitamina();
        baterVitaminaNoLiquidificador();
        prepararVitamina();
        System.out.println("Preparando vitamina");
    }

    private void prepararCombo(){
        prepararlanche();
        prepararVitamina();
    }

    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaNoLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando ingredientes para vitamina");
    }

    private void pedirParaTrocargas(Almoxarifado meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarifado almoxarifado){
        almoxarifado.entregarIngredientes();
    }

}
