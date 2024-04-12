import dao.AlunoDAO;
import model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        // Adicionar aluno
        Aluno aluno1 = new Aluno("Caio Andrade", "caioAndrade@gmail.com");
        alunoDAO.adicionar(aluno1);

        Aluno alunoVerificar = alunoDAO.buscar(0);
        System.out.println("Novo aluno: " + alunoVerificar.getNome() + " - " + alunoVerificar.getEmail());

        // Atualizar aluno
        alunoDAO.atualizar(0, new Aluno("Carlos Cubas", "carlosCubas@gmail.com"));

        // Buscar aluno
        Aluno alunoEncontrado = alunoDAO.buscar(0);
        System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " - " + alunoEncontrado.getEmail());

        // Remover aluno
        boolean removido = alunoDAO.remover(0);
        if (removido) {
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Falha ao remover aluno.");
        }
    }
}