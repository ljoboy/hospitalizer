package org.pbreakers;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Service implements Affichable{

    private String nom;
    List<Personnel> agents = new List<Personnel>() {
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
        public Iterator<Personnel> iterator() {
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
        public boolean add(Personnel personnel) {
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
        public boolean addAll(@NotNull Collection<? extends Personnel> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Personnel> c) {
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
        public Personnel get(int index) {
            return null;
        }

        @Override
        public Personnel set(int index, Personnel element) {
            return null;
        }

        @Override
        public void add(int index, Personnel element) {

        }

        @Override
        public Personnel remove(int index) {
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
        public ListIterator<Personnel> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Personnel> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Personnel> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public String getNom() {
        return nom;
    }

    Service(String nom){
        this.nom = nom;
    }

    @Override
    public void afficher() {
        System.out.println("Nom : "+this.nom);
    }
}
