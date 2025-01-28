package main.backend.enums;

public enum CorDaCasa {
    PRETA("preta"),
    BRANCA("branca");

    private String valor;

    CorDaCasa(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
