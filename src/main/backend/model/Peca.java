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

    public void setNomeDaPeca(NomeDaPeca nomeDaPeca){
        this.nomeDaPeca = nomeDaPeca;
    }
    public NomeDaPeca getNomeDaPeca(){
        return nomeDaPeca;
    }
    public void setCorDaPeca(CorDaPeca corDaPeca){
        this.corDaPeca = corDaPeca;
    }
    public CorDaPeca getCorDaPeca(){
        return corDaPeca;
    }

    public static void main(String[] args){
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.iniciarPecas();
    }
}