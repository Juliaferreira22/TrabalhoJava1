//Classe de modelo
public class Automovel {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int valor;

    // Métodos de acesso ao atributo NOME
    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getplaca() {
        return  this.placa;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return this.marca;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return this.cor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }

    public int getvalor() {
        return this.valor;
    }

    public void cadastrar(){

    }

    public void imprimir_enum(){
        for (Carros_vendidos carros_vendidos : Carros_vendidos.values()){
            System.out.println("Nome:" + carros_vendidos.name());
            System.out.println("Marca:" + carros_vendidos.getmarca()); 
            System.out.println("Nome:" + carros_vendidos.getquantidades_vendidos());       
        }
    }

    public Automovel(String placa , String marca, String modelo, String cor, int valor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor; 

         
    }

    public Automovel(){
        
    }

   
}

// Atributos ou propriedades
/*
 * id -> int
 * páginas -> string
 * autor -> string
 * editora -> string
 * nome -> string
 * genero -> string
 * data lançamento -> string
 * edição -> string
 * material capa -> string
 * isbn -> string
 */

// private int somarDoisNumeros(int numero1, int numero2){
// return numero1 + numero2;
// }

// public String retornarTexto(String nome, int idade){
// return "Nome: " + nome;
// }

// public String retornarTexto(int idade, String nome){
// return "CPF: " + cpf;
// }
