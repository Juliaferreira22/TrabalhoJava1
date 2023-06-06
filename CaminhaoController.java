import java.util.ArrayList;

public class CaminhaoController {

    
    private static ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();

    public void cadastrar(Caminhao caminhao){
        caminhoes.add(caminhao);
    }

    public ArrayList<Caminhao> listar() {
        return caminhoes;
    }
    
}
