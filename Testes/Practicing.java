package Testes;
import java.util.ArrayList;
import java.util.List;

import Array;
import Contato;

class Contato {
    private String nome;
    private String email;
    private boolean favorito;

    public Contato(String nome, String email, boolean favorito) {
        this.nome = nome;
        this.email = email;
        this.favorito = favorito;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public String toString() {
        return "Nome: " + nome + ", Email: " + email + (favorito ? " (Favorito)" : "");
    }
}

class Array {
    private List<Contato> contatos;

    public Array() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void mostrarTodosOsContatos() {
        System.out.println("Todos os Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void mostrarContatosFavoritos() {
        System.out.println("Contatos Favoritos:");
        for (Contato contato : contatos) {
            if (contato.isFavorito()) {
                System.out.println(contato);
            }
        }
    }
}

public class Practicing {
    public static void main(String[] args) {
        Array agenda = new Array();

        agenda.adicionarContato(new Contato("João Silva", "joao@email.com", true));
        agenda.adicionarContato(new Contato("Maria Oliveira", "maria@email.com", false));
        agenda.adicionarContato(new Contato("Pedro Santos", "pedro@email.com", true));
        agenda.adicionarContato(new Contato("Ana Costa", "ana@email.com", false));

        agenda.mostrarTodosOsContatos();
        
        agenda.mostrarContatosFavoritos();
    }
}
