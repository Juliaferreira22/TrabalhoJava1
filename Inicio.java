import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        
        Scanner menu = new Scanner (System.in);

            System.out.println("---- CONCESSIONÁRIA ----");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Cadastrar moto");
            System.out.println("3 - Cadastrar caminhao");
            System.out.println("4 - Mostrar carros mais vendidos");
            System.out.println("0 - Sair\n");

            int opcao = menu.nextInt();
            
            switch (opcao) {
                case 1:
                CadastrarCarro cadastrarCarro = new CadastrarCarro();
                cadastrarCarro.cadastrar();
                break;

                case 2:
                CadastrarMoto cadastrarMoto = new CadastrarMoto();
                cadastrarMoto.cadastrar();
                break;

                case 4: 
                Automovel al = new Automovel();
                al.imprimir_enum(); 
                break;
            
            }

            



         
       
    }
    
}
