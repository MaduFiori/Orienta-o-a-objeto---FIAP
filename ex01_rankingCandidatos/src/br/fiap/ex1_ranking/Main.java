package br.fiap.ex1_ranking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Candidatos> lista = new ArrayList<>();
        lista.add(new Candidatos("Ala", 2, 7.9));
        lista.add(new Candidatos("Bola",1, 10));
        lista.add(new Candidatos("Maria", 1,9.9));

        Comparator<Candidatos> cmp =
                Comparator.comparing(Candidatos::getNota).reversed()
                        .thenComparing(Candidatos::getExperiencia).reversed()
                                .thenComparing(Candidatos::getNome);
        lista.sort(cmp);
        AtomicInteger cont = new AtomicInteger(1);
        lista.forEach(candidato ->{
            System.out.println(cont.incrementAndGet() + " | " + candidato);
        });
    }
}