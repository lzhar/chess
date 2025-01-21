package main.backend.enums;

public enum CorDaPeca {
    PRETA("preta"),
    BRANCA("branca");

    private String valor;

    CorDaPeca(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
