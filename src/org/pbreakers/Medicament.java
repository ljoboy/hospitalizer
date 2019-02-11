package org.pbreakers;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Medicament implements Affichable{
    private String nom;
    List<Dosage> dose = new List<Dosage>() {
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

        @NotNull
        @Override
        public Iterator<Dosage> iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NotNull
        @Override
        public <T> T[] toArray(@NotNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Dosage dosage) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends Dosage> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Dosage> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Dosage get(int index) {
            return null;
        }

        @Override
        public Dosage set(int index, Dosage element) {
            return null;
        }

        @Override
        public void add(int index, Dosage element) {

        }

        @Override
        public Dosage remove(int index) {
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

        @NotNull
        @Override
        public ListIterator<Dosage> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Dosage> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Dosage> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    int nbStock = 0;

    Medicament(String nom){
        this.nom = nom;
    }

    public int getNbStock() {
        return nbStock;
    }

    public String getNom() {
        return nom;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    @Override
    public void afficher() {
        System.out.println("Nom : "+this.getNom());
    }
}
