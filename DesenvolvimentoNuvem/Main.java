package DesenvolvimentoNuvem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		int opcao = 0;

		do {

			System.out.println("1 - Deseja cadastrar clinte?");
			System.out.println("2 - Deseja mostrar a lista?");
			System.out.println("3 - Encerrar?");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("entre com o nome do Cliente");
				String nome = entrada.next();
				System.out.println("entre com o cpf do Cliente");
				String cpf = entrada.next();
				System.out.println("entre com o telefone do Cliente");
				String telefone = entrada.next();

				Cliente cliente = new Cliente(nome, cpf, telefone);
				
				listaClientes.add(cliente);
				System.out.println("Pessoa cadastrada com sucesso!");
				break;

			}

			case 2: {

				for (Cliente c : listaClientes) {
         
					System.out.println("");               
          System.out.println("_______________________________");
          System.out.println("Nome :" + c.getNome());
					System.out.println("CPF :" + c.getCpf());
					System.out.println("Telefone :" + c.getTelefone());
              
          System.out.println("_______________________________");
          System.out.println("");  
				
				
				}
        break;
			}

			}

		} while (opcao != 3);
		
	}
}
