import java.util.Scanner;

public class CadastrarMoto {

    public void cadastrar(){
        Scanner sc = new  Scanner (System.in);

        Moto moto = new Moto();
        MotoController motoController = new MotoController();

        System.out.println("\n -- CADASTRO DE MOTOS -- \n");

        System.out.println("Digite a placa da moto: ");
        String placa = sc.nextLine(); 
        moto.setplaca(placa);

        System.out.println("Digite a marca da moto: ");
        String marca = sc.nextLine(); 
        moto.setmarca(marca);


        System.out.println("Digite a modelo da moto: ");
        String modelo = sc.nextLine();
        moto.setmodelo(modelo);

        System.out.println("Digite a cor da moto: ");
        String cor = sc.nextLine();
        moto.setcor(cor);

        System.out.println("Digite o valor da moto: ");
        int valor = sc.nextInt();
        moto.setvalor(valor);

        motoController.cadastrar(moto);

        System.out.println("---MOTO CADASTRADA----");

    }
    
}
