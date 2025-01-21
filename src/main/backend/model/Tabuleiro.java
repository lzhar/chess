package main.backend.model;

import main.backend.enums.CorDaCasa;
import main.backend.enums.CorDaPeca;
import main.backend.enums.NomeDaPeca;

import java.util.ArrayList;

public class Tabuleiro {
    private Peca[][] tabuleiro = new Peca[7][7];
    private CorDaCasa corDaCasa;


    public void montarTabuleiro() {

        ArrayList<Peca> listaDePecas = new ArrayList<>();
        for (int i = 0; i <= 32; i++) {
            if (i == 0) {
                Peca torrePretaUm = new Peca(NomeDaPeca.TORRE, CorDaPeca.PRETA);
                listaDePecas.add(torrePretaUm);
            } else if (i == 1) {
                Peca cavaloPretoUm = new Peca(NomeDaPeca.CAVALO, CorDaPeca.PRETA);
                listaDePecas.add(cavaloPretoUm);
            } else if (i == 2) {
                Peca bispoPretoUm = new Peca(NomeDaPeca.BISPO, CorDaPeca.PRETA);
                listaDePecas.add(bispoPretoUm);
            } else if (i == 3) {
                Peca reiPreto = new Peca(NomeDaPeca.REI, CorDaPeca.PRETA);
                listaDePecas.add(reiPreto);
            } else if (i == 4) {
                Peca rainhaPreta = new Peca(NomeDaPeca.RAINHA, CorDaPeca.PRETA);
                listaDePecas.add(rainhaPreta);
            } else if (i == 5) {
                Peca bispoPretoDois = new Peca(NomeDaPeca.BISPO, CorDaPeca.PRETA);
                listaDePecas.add(bispoPretoDois);
            } else if (i == 6) {
                Peca cavaloPretoDois = new Peca(NomeDaPeca.CAVALO, CorDaPeca.PRETA);
                listaDePecas.add(cavaloPretoDois);
            } else if (i == 7) {
                Peca torrePretaDois = new Peca(NomeDaPeca.TORRE, CorDaPeca.PRETA);
                listaDePecas.add(torrePretaDois);
            } else if (i == 8) {
                Peca peaoPretoUm = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoUm);
            } else if (i == 9) {
                Peca peaoPretoDois = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoDois);
            } else if (i == 10) {
                Peca peaoPretoTres = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoTres);
            } else if (i == 11) {
                Peca peaoPretoQuatro = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoQuatro);
            } else if (i == 12) {
                Peca peaoPretoCinco = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoCinco);
            } else if (i == 13) {
                Peca peaoPretoSeis = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoSeis);
            } else if (i == 14) {
                Peca peaoPretoSete = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoSete);
            } else if (i == 15) {
                Peca peaoPretoOito = new Peca(NomeDaPeca.PEAO, CorDaPeca.PRETA);
                listaDePecas.add(peaoPretoOito);
            } else if (i == 16) {
                Peca torreBrancaUm = new Peca(NomeDaPeca.TORRE, CorDaPeca.BRANCA);
                listaDePecas.add(torreBrancaUm);
            } else if (i == 17) {
                Peca cavaloBrancoUm = new Peca(NomeDaPeca.CAVALO, CorDaPeca.BRANCA);
                listaDePecas.add(cavaloBrancoUm);
            } else if (i == 18) {
                Peca bispoBrancoUm = new Peca(NomeDaPeca.BISPO, CorDaPeca.BRANCA);
                listaDePecas.add(bispoBrancoUm);
            } else if (i == 19) {
                Peca reiBranco = new Peca(NomeDaPeca.REI, CorDaPeca.BRANCA);
                listaDePecas.add(reiBranco);
            } else if (i == 20) {
                Peca rainhaBranca = new Peca(NomeDaPeca.RAINHA, CorDaPeca.BRANCA);
                listaDePecas.add(rainhaBranca);
            } else if (i == 21) {
                Peca bispoBrancoDois = new Peca(NomeDaPeca.BISPO, CorDaPeca.BRANCA);
                listaDePecas.add(bispoBrancoDois);
            } else if (i == 22) {
                Peca cavaloBrancoDois = new Peca(NomeDaPeca.CAVALO, CorDaPeca.BRANCA);
                listaDePecas.add(cavaloBrancoDois);
            } else if (i == 23) {
                Peca torreBrancaDois = new Peca(NomeDaPeca.TORRE, CorDaPeca.BRANCA);
                listaDePecas.add(torreBrancaDois);
            } else if (i == 24) {
                Peca peaoBrancoUm = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoUm);
            } else if (i == 25) {
                Peca peaoBrancoDois = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoDois);
            } else if (i == 26) {
                Peca peaoBrancoTres = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoTres);
            } else if (i == 27) {
                Peca peaoBrancoQuatro = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoQuatro);
            } else if (i == 28) {
                Peca peaoBrancoCinco = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoCinco);
            } else if (i == 29) {
                Peca peaoBrancoSeis = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoSeis);
            } else if (i == 30) {
                Peca peaoBrancoSete = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoSete);
            } else if (i == 31) {
                Peca peaoBrancoOito = new Peca(NomeDaPeca.PEAO, CorDaPeca.BRANCA);
                listaDePecas.add(peaoBrancoOito);
            }

        }
        for (int j = 0; j < listaDePecas.size(); j++) {
            String mensagem = "Nome da peça: " + listaDePecas.get(j).getNomeDaPeca() + " cor da peça: " + listaDePecas.get(j).getCorDaPeca();
            System.out.println(mensagem);
        }

    }
}
