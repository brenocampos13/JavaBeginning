public class Atribuicao {
    static void main(String[] args) {
        String nome = "Curso";
        String nome1 = "Video";
        String nome2 = nome + nome1;
        String nome3 = "CursoVideo";
        System.out.println(nome2 == nome3);
        System.out.println(nome2.equals(nome3));
    }
}
