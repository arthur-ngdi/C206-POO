package fetin;

import exceptions.NomeProjetoException;
import exceptions.NotaException;

import java.util.HashMap;
import java.util.Map;

public class OrganizaFetin {

    Map<String, Double> projetos = new HashMap<>();


    public void addProjeto(String chave, double valor) throws NomeProjetoException, NotaException {

        if (projetos.get(chave) != null)
            throw new NomeProjetoException("Nome ja cadastrado");
        else if (valor < 60) {
            projetos.put(chave, valor);
            throw new NotaException("Nota insuficiente");
        }else
            projetos.put(chave,valor);
    }
}
