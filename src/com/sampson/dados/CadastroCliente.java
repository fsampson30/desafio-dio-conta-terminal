package com.sampson.dados;

import java.util.Scanner;

public class CadastroCliente {

    public void cadastrarCliente(){
        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da Agência");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor digite o número da Conta");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor digite o seu Nome");
        conta.setNomeCliente(scanner.next());

        System.out.println("Por favor digite o Saldo");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá " +  conta.getNomeCliente() + ", obrigado por criar uma conta em nosso Banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                + " já está disponível para saque.");
    }

}