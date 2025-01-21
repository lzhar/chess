package main.backend.enums;

public enum NomeDaPeca {
    REI("rei"),
    RAINHA("rainha"),
    TORRE("torre"),
    CAVALO("cavalo"),
    BISPO("bispo"),
    PEAO("peao");

    private String valor;

    NomeDaPeca(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
