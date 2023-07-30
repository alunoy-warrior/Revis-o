package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
    private static List<Usuario> List;

    static {
        List = new ArrayList<>();
        List.add(new Usuario("usuario1", "senha1"));
        List.add(new Usuario("usuario2", "senha2"));
        List.add(new Usuario("usuario3", "senha3"));
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (Usuario usuario : List) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                System.out.println("Usuário autenticado: " + login);
                return;
            }
        }
        throw new AutenticacaoInvalidaException("Usuário " + login + " não foi encontrado ou a senha está errada");
    }

   
 public static void addUsuario(Usuario usuario) {
        List.add(usuario);
    }
}
