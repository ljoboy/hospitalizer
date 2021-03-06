package org.pbreakers;

import org.jetbrains.annotations.Nullable;

import java.util.*;

class Ordonnance implements Affichable {

    private static int nb = 0;
    private int num = nb;
    private Fiche fiche;
    private Docteur medecin;
    private Date date;
    List<Medicament> medicaments = new List<Medicament>() {
        private int fromIndex;
        private int toIndex;

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
        public Iterator<Medicament> iterator() {
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
        public boolean add(Medicament medicament) {
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
        public boolean addAll(Collection<? extends Medicament> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Medicament> c) {
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

        @Override
        public ListIterator<Medicament> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Medicament> listIterator(int index) {
            return null;
        }

        @Override
        public List<Medicament> subList(int fromIndex, int toIndex) {
            this.fromIndex = fromIndex;
            this.toIndex = toIndex;
            return null;
        }
    };

    Ordonnance(Fiche fiche, Docteur doc){
        this.fiche = fiche;
        this.medecin = doc;
        date = new Date();
        nb++;
    }

    @Override
    public void afficher() {
        System.out.println("Ordonnance n°"+this.num+" Pour : "+fiche.getPatient().getNom()+" "+fiche.getPatient().getPrenom()+" Par : Dr. "+medecin.getNom()+" "+medecin.getPrenom());
        for (Medicament medicament : medicaments){
            medicament.afficher();
        }
    }

    public static int getNb() {
        return nb;
    }

}
