package dao;

import model.Aluno;

public class AlunoDAO {
    private Aluno[] alunos;

    public AlunoDAO() {
        this.alunos = new Aluno[10];
    }

    public void adicionar(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                System.out.println("Aluno adicionado com sucesso na posição " + i);
                return;
            }
        }
        System.out.println("Não foi possível adicionar o aluno. Vetor cheio.");
    }

    public void atualizar(int indice, Aluno aluno) {
        if (indice >= 0 && indice < alunos.length) {
            alunos[indice] = aluno;
            System.out.println("Aluno atualizado na posição " + indice);
        } else {
            System.out.println("Índice inválido. Não foi possível atualizar o aluno.");
        }
    }

    public Aluno buscar(int indice) {
        if (indice >= 0 && indice < alunos.length) {
            return alunos[indice];
        } else {
            System.out.println("Índice inválido. Não foi possível encontrar o aluno.");
            return null;
        }
    }

    public boolean remover(int indice) {
        if (indice >= 0 && indice < alunos.length && alunos[indice] != null) {
            alunos[indice] = null;
            System.out.println("Aluno removido na posição " + indice);
            return true;
        } else {
            System.out.println("Índice inválido. Não foi possível remover o aluno.");
            return false;
        }
    }
}