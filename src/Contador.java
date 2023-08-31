import managers.ContadorManager;

import exceptions.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) {

        try {
            new ContadorManager().contar();

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Encerrando o contador...");
        }
    }
}