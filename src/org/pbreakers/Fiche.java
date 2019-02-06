package org.pbreakers;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Fiche {

    private Patient patient;
    private String numero;
    List<Consultation> consultations = new List<Consultation>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Consultation> iterator() {
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
        public boolean add(Consultation consultation) {
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
        public boolean addAll(Collection<? extends Consultation> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Consultation> c) {
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
        public Consultation get(int index) {
            return null;
        }

        @Override
        public Consultation set(int index, Consultation element) {
            return null;
        }

        @Override
        public void add(int index, Consultation element) {

        }

        @Override
        public Consultation remove(int index) {
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
        public ListIterator<Consultation> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Consultation> listIterator(int index) {
            return null;
        }

        @Override
        public List<Consultation> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    Fiche(@NotNull Patient patient){
        this.patient = patient;
        this.numero = "19"+(patient.getNom().substring(0,1)+patient.getPostnom().substring(0,1)+patient.getPrenom().substring(0,1)).toUpperCase();
    }

    public String getNumero() {
        return numero;
    }

    private void setNumero() {

    }

    public Patient getPatient() {
        return patient;
    }
}
