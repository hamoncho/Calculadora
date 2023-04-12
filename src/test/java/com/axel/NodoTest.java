package com.axel;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class NodoTest {
    @Test
    public void esNumeroTest() {
        Nodo nodo = new Nodo();

        nodo.setValor("a");

        assertFalse(nodo.esNumero());
    }

    @Test
    public void esOperadorTest() {
        Nodo nodo = new Nodo();

        nodo.setValor("0");

        assertFalse(nodo.esOperador());
    }
}
