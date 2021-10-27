/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula08;

/**
 *
 * @author 20931131
 */
import java.io.*;
public class ListaOrdenadaDeCarros {
    ListaDeCarros l;
    int qtd;
    public ListaOrdenadaDeCarros() {
        l = null;
        qtd = 0;
    }
    @Override
    public String toString() {
        return  "Esta lista ordenada possui " + qtd + " elementos\n" + l;
    }
    public boolean salvar(String nomeArq) {
        try {
            ObjectOutputStream arq = new ObjectOutputStream(new FileOutputStream(nomeArq));
            ListaDeCarros aux = l;
            while(aux != null) {
                arq.writeObject(aux.info);
                aux = aux.proximo;
            }
            arq.close();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean carregar(String nomeArq) {
        try {
            ObjectInputStream arq = new ObjectInputStream(new FileInputStream(nomeArq));
            l = null;
            qtd = 0;
            while(true) {
                Carro c = (Carro) arq.readObject();
                insere(c);
            }
        } catch(EOFException e) {
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public boolean insere(Carro c) {
        if(qtd == 0 || c.placa.compareTo(l.info.placa) < 0) {
            l = new ListaDeCarros(c, l);
            qtd++;
            return true;
        }
        else {
            ListaDeCarros antes, depois;
            antes = l;
            depois = l.proximo;
            if(antes.info.placa.equals(c.placa))
                return false;
            else {
                while((depois != null) && (depois.info.placa.compareTo(c.placa) < 0)) {
                    antes = depois;
                    depois = depois.proximo;
                }
                if((depois == null) || (depois.info.placa.equals(c.placa)))
                    return false;
                else {
                    antes.proximo = new ListaDeCarros(c, depois);
                    qtd++;
                    return true;
                }
            }
        }
    }
    public boolean remove(Carro c) {
        if((l == null) || (l.info.placa.compareTo(c.placa) > 0))
            return false;
        else
            if(l.info.placa.equals(c.placa)) {
                qtd--;
                l = l.proximo;
                return true;
            }
            else {
                ListaDeCarros antes, depois;
                antes = l;
                depois = l.proximo;
                while((depois != null) && depois.info.placa.compareTo(c.placa) < 0) {
                    antes = depois;
                    depois = depois.proximo;
                }
                if((depois == null) || (!depois.info.placa.equals(c.placa)))
                    return false;
                else {
                    qtd--;
                    antes.proximo = depois.proximo;
                    return true;
                }
            }
    }
    public boolean consultar(Carro c) {
        if((l == null) || (c.placa.compareTo(l.info.placa) < 0))
            return false;
        else {
            ListaDeCarros aux = l;
            while((aux == null) && (aux.info.placa.compareTo(c.placa) < 0))
                aux = aux.proximo;
            if(aux == null || aux.info.placa.compareTo(c.placa) > 0)
                return false;
            else {
                c.marca = aux.info.marca;
                c.modelo = aux.info.modelo;
                return false;
            }
        }
    }
}
