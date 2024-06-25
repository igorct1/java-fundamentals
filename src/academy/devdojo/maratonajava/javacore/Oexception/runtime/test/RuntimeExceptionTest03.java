package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        connection();

    }

    private static String connection() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta!";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
