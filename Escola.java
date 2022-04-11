package escola;

import java.util.Scanner;
//import java.io.IOException;

public class Main {

    public static void main(String[] args) /*throws IOException*/{

      Scanner sc1 = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);
      Scanner sc3 = new Scanner(System.in);
      Scanner sc4 = new Scanner(System.in);
      Scanner sc5 = new Scanner(System.in);

      /*
      String nome = "João";
      int idade = 13;
      int RA = 123456;

      String rua = "Rua 2";
      int numero = 315;
      String cidade = "Hortolândia";
      
      String rua1 = "Rua 3";
      int numero1 = 300;
      String cidade1 = "Campinas";
      
      String nomeResponsavel = "Pedro";
      String email = "pedro@gmail.com";
      int telefone = 992831903;
      */

      System.out.println("\n  DADOS DO ALUNO  \n");
      System.out.print("Informe o nome: ");
      String nome = sc1.nextLine();
      System.out.print("Informe a idade: ");
      int idade = sc1.nextInt();
      System.out.print("Informe o RA: ");
      int RA = sc1.nextInt();

      System.out.println("\n    ENDEREÇO  \n");
      System.out.print("Informe o endereço: ");
      String rua = sc2.nextLine();
      System.out.print("Informe o número: ");
      int numero = sc1.nextInt();
      System.out.print("Informe a cidade: ");
      String cidade = sc3.nextLine();

      System.out.println("\n  DADOS DO RESPONSÁVEL  \n");
      System.out.print("Informe o nome: ");
      String nomeResponsavel = sc4.nextLine();
      System.out.print("Informe o e-mail: ");
      String email = sc5.nextLine();
      System.out.print("Informe o telefone: ");
      int telefone = sc2.nextInt();

      /*
      System.out.println("Press Enter to continue…");
      System.in.read();
      */
      
      Endereco end = new Endereco(rua, numero, cidade);
      //Endereco end_2 = new Endereco(rua1, numero1, cidade1);
      Responsavel resp = new Responsavel(nomeResponsavel, email, telefone); 
      Aluno alun = new Aluno(nome, idade, RA, end, resp);
      
      alun.getNome();
      alun.getIdade();
      alun.getRA();
      alun.mostraEndereco();
      alun.mostraResponsavel();
        
    }    
}