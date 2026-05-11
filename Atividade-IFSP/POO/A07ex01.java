class Fabricante {
    private String nome;

    public Fabricante() {
    }
    
    public Fabricante(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
class Produto {
    private String nome;
    private String modelo;
    private Fabricante fabricante;
    
    public Produto() {
    }
    
    public Produto(String nome, String modelo, Fabricante fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}

public class A07ex01 {
    
    public static void main(String[] args) {
        Fabricante logitech = new Fabricante("Logitech");
        Fabricante dell = new Fabricante("Dell");
        Fabricante samsung = new Fabricante("Samsung");
        
        Produto hd = new Produto("HD Externo", "1TB", samsung);
        Produto mouse = new Produto("Mouse Gamer", "G502", logitech);
        Produto teclado = new Produto("Teclado Mecânico", "K380", logitech);
        Produto monitor = new Produto("Monitor", "27 polegadas", dell);
        
        System.out.println("===== INFORMAÇÕES DO PRODUTO =====");
        System.out.println("Nome: " + hd.getNome());
        System.out.println("Modelo: " + hd.getModelo());
        System.out.println("Fabricante: " + hd.getFabricante().getNome());
        
        System.out.println();
        
        System.out.println("===== TODOS OS PRODUTOS =====");
        exibirProduto("Produto 1 (HD)", hd);
        exibirProduto("Produto 2 (Mouse)", mouse);
        exibirProduto("Produto 3 (Teclado)", teclado);
        exibirProduto("Produto 4 (Monitor)", monitor);
    }
    
    public static void exibirProduto(String titulo, Produto produto) {
        System.out.println(titulo + ":");
        System.out.println("  Nome: " + produto.getNome());
        System.out.println("  Modelo: " + produto.getModelo());
        System.out.println("  Fabricante: " + produto.getFabricante().getNome());
        System.out.println();
    }
}
