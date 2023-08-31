package managers;

import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class ContadorManager {
    Scanner scanner = new Scanner(System.in);
    int parametroUm;
    int parametroDois;
    public ContadorManager() {
        this.registrar();
    }

    private void registrar() {
        System.out.print("Informe o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();

        System.out.print("Informe o segundo parâmetro: ");
        parametroDois = scanner.nextInt();
    }

    public void contar() throws ParametrosInvalidosException {
        if (parametroUm > parametroDois || parametroUm == parametroDois)  {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) System.out.println("Contagem atual " + i);
    }
}
