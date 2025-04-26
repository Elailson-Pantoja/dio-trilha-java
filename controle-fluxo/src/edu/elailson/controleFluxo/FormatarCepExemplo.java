package edu.elailson.controleFluxo;

public class FormatarCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("68470000");
            System.out.println(cepFormatado);

        }
        catch (CepInvalidoException e){
            System.out.println("Digite o cep com 8 digitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "68470-000";
    }
}


