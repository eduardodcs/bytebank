package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao ByteBank!");
        Funcionario jose = new Funcionario("Jose", 1, LocalDate.of(1986,8,21));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(2000,5,10));
        System.out.println(jose);
        System.out.println(maria);
    }

}
