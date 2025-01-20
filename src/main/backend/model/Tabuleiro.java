package main.backend.model;

import main.backend.enums.CorDaPeca;
import main.backend.enums.NomeDaPeca;

public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[7][7];

    public void montarTabuleiro(){
        Peca pecaTeste = new Peca(NomeDaPeca.REI, CorDaPeca.BRANCA);
        tabuleiro[0][0] = pecaTeste;
        System.out.println(tabuleiro[0][0]);
    }
}
