import java.util.Scanner;

public class CadastrarCarro{

    
    public void cadastrar(){
        Scanner sc = new  Scanner (System.in);

        Carro carro = new Carro();
        CarroController carroController = new CarroController();

        System.out.println("\n -- CADASTRO DE CARROS -- \n");

        System.out.println("Digite a placa do carro: ");
        String placa = sc.nextLine(); 
        carro.setplaca(placa);

        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine(); 
        carro.setmarca(marca);


        System.out.println("Digite a modelo do carro: ");
        String modelo = sc.nextLine();
        carro.setmodelo(modelo);

        System.out.println("Digite a cor do carro: ");
        String cor = sc.nextLine();
        carro.setcor(cor);

        System.out.println("Digite o valor do carro: ");
        int valor = sc.nextInt();
        carro.setvalor(valor);

        carroController.cadastrar(carro);

        System.out.println("---CARRO CADASTRADO----");


    }
    
}
