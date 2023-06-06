import java.util.ArrayList;
public class CarroController {

    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public void cadastrar(Carro carro) {
        carros.add(carro);
    }

    public ArrayList<Carro> listar() {
        return carros;
    }
    
}
