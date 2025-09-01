package br.fiap.ex2_gerenciador_de_matricula;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(559149, "A", "Adm"));
        turmaBD.add(new Aluno(555908,"B", "Ads"));
        turmaBD.add(new Aluno(559149, "C", "Eng"));


        Set<Aluno> turmaED = new HashSet<>();
        turmaBD.add(new Aluno(559149, "A", "Eng"));
        turmaBD.add(new Aluno(555908,"B", "Adm"));

        //lista contendo alunos matriculados nas duas turmas
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.retainAll(turmaED);
        uniao.forEach(aluno -> System.out.println(aluno));
    }
}
