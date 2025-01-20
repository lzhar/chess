package main.backend.model;

import main.backend.enums.CorDaPeca;
import main.backend.enums.NomeDaPeca;

public class Peca{
    private NomeDaPeca nomeDaPeca;
    private CorDaPeca corDaPeca;

    public Peca(NomeDaPeca nomeDaPeca, CorDaPeca corDaPeca){
        this.nomeDaPeca = nomeDaPeca;
        this.corDaPeca = corDaPeca;
    }

    public static void main(String[] args){
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.montarTabuleiro();
    }
}