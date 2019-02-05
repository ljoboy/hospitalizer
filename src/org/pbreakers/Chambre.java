package org.pbreakers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Chambre {

    private String  numero;
    private int nbLit;
    private List<Patient> patients = new List<Patient>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return size() != nbLit;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Patient> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Patient patient) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Patient get(int index) {
            return null;
        }

        @Override
        public Patient set(int index, Patient element) {
            return null;
        }

        @Override
        public void add(int index, Patient element) {

        }

        @Override
        public Patient remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Patient> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Patient> listIterator(int index) {
            return null;
        }

        @Override
        public List<Patient> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    Chambre(String numero){
        this.numero = numero;
    }
    public int getNbLit() {
        return nbLit;
    }

    public void setNbLit(int nbLit) {
        this.nbLit = nbLit;
    }

    public String getNumero() {
        return numero;
    }
}
