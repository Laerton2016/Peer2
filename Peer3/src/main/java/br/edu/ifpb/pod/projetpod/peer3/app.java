/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.projetpod.peer3;

/**
 *
 * @author Laerton
 */
public class app {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("111.111.111-11", "Laerton");
        Contexto.perssitPessoa(p);
        
    }
}
