package org.pbreakers;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Pharmacie implements  Affichable{
    List<Medicament> medicaments = new List<Medicament>() {
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
        public Iterator<Medicament> iterator() {
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
        public boolean add(Medicament medicament) {
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
        public boolean addAll(@NotNull Collection<? extends Medicament> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Medicament> c) {
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
        public Medicament get(int index) {
            return null;
        }

        @Override
        public Medicament set(int index, Medicament element) {
            return null;
        }

        @Override
        public void add(int index, Medicament element) {

        }

        @Override
        public Medicament remove(int index) {
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
        public ListIterator<Medicament> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Medicament> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Medicament> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    List<Ordonnance> ordonnances = new List<Ordonnance>() {
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
        public Iterator<Ordonnance> iterator() {
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
        public boolean add(Ordonnance ordonnance) {
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
        public boolean addAll(@NotNull Collection<? extends Ordonnance> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Ordonnance> c) {
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
        public Ordonnance get(int index) {
            return null;
        }

        @Override
        public Ordonnance set(int index, Ordonnance element) {
            return null;
        }

        @Override
        public void add(int index, Ordonnance element) {

        }

        @Override
        public Ordonnance remove(int index) {
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
        public ListIterator<Ordonnance> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Ordonnance> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Ordonnance> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    @Override
    public void afficher() {
        for (Medicament medicament : medicaments){
            medicament.afficher();
        }
    }
}
