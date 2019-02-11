package org.pbreakers;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    private static List<Chambre> chambres = new List<Chambre>() {
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
        public Iterator<Chambre> iterator() {
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
        public boolean add(Chambre chambre) {
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
        public boolean addAll(@NotNull Collection<? extends Chambre> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Chambre> c) {
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
        public Chambre get(int index) {
            return null;
        }

        @Override
        public Chambre set(int index, Chambre element) {
            return null;
        }

        @Override
        public void add(int index, Chambre element) {

        }

        @Override
        public Chambre remove(int index) {
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
        public ListIterator<Chambre> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Chambre> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Chambre> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Consultation> consultations = new List<Consultation>() {
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
        public Iterator<Consultation> iterator() {
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
        public boolean add(Consultation consultation) {
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
        public boolean addAll(@NotNull Collection<? extends Consultation> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Consultation> c) {
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

        @NotNull
        @Override
        public ListIterator<Consultation> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Consultation> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Consultation> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Docteur> docteurs = new List<Docteur>() {
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
        public Iterator<Docteur> iterator() {
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
        public boolean add(Docteur docteur) {
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
        public boolean addAll(@NotNull Collection<? extends Docteur> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Docteur> c) {
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
        public Docteur get(int index) {
            return null;
        }

        @Override
        public Docteur set(int index, Docteur element) {
            return null;
        }

        @Override
        public void add(int index, Docteur element) {

        }

        @Override
        public Docteur remove(int index) {
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
        public ListIterator<Docteur> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Docteur> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Docteur> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Dosage> dosages = new List<Dosage>() {
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
    private static List<Fiche> fiches = new List<Fiche>() {
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
        public Iterator<Fiche> iterator() {
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
        public boolean add(Fiche fiche) {
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
        public boolean addAll(@NotNull Collection<? extends Fiche> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Fiche> c) {
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
        public Fiche get(int index) {
            return null;
        }

        @Override
        public Fiche set(int index, Fiche element) {
            return null;
        }

        @Override
        public void add(int index, Fiche element) {

        }

        @Override
        public Fiche remove(int index) {
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
        public ListIterator<Fiche> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Fiche> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Fiche> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Infirmier> infirmiers = new List<Infirmier>() {
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
        public Iterator<Infirmier> iterator() {
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
        public boolean add(Infirmier infirmier) {
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
        public boolean addAll(@NotNull Collection<? extends Infirmier> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Infirmier> c) {
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
        public Infirmier get(int index) {
            return null;
        }

        @Override
        public Infirmier set(int index, Infirmier element) {
            return null;
        }

        @Override
        public void add(int index, Infirmier element) {

        }

        @Override
        public Infirmier remove(int index) {
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
        public ListIterator<Infirmier> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Infirmier> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Infirmier> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Medicament> medicaments = new List<Medicament>() {
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
    private static List<Ordonnance> ordonnances = new List<Ordonnance>() {
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
    private static List<Patient> patients = new List<Patient>() {
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
        public Iterator<Patient> iterator() {
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
        public boolean add(Patient patient) {
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
        public boolean addAll(@NotNull Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Patient> c) {
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

        @NotNull
        @Override
        public ListIterator<Patient> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Patient> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Patient> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Pharmacie> pharmacies = new List<Pharmacie>() {
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
        public Iterator<Pharmacie> iterator() {
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
        public boolean add(Pharmacie pharmacie) {
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
        public boolean addAll(@NotNull Collection<? extends Pharmacie> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Pharmacie> c) {
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
        public Pharmacie get(int index) {
            return null;
        }

        @Override
        public Pharmacie set(int index, Pharmacie element) {
            return null;
        }

        @Override
        public void add(int index, Pharmacie element) {

        }

        @Override
        public Pharmacie remove(int index) {
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
        public ListIterator<Pharmacie> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Pharmacie> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Pharmacie> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Pharmacien> pharmaciens = new List<Pharmacien>() {
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
        public Iterator<Pharmacien> iterator() {
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
        public boolean add(Pharmacien pharmacien) {
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
        public boolean addAll(@NotNull Collection<? extends Pharmacien> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Pharmacien> c) {
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
        public Pharmacien get(int index) {
            return null;
        }

        @Override
        public Pharmacien set(int index, Pharmacien element) {
            return null;
        }

        @Override
        public void add(int index, Pharmacien element) {

        }

        @Override
        public Pharmacien remove(int index) {
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
        public ListIterator<Pharmacien> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Pharmacien> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Pharmacien> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Receptioniste> receptionistes = new List<Receptioniste>() {
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
        public Iterator<Receptioniste> iterator() {
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
        public boolean add(Receptioniste receptioniste) {
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
        public boolean addAll(@NotNull Collection<? extends Receptioniste> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Receptioniste> c) {
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
        public Receptioniste get(int index) {
            return null;
        }

        @Override
        public Receptioniste set(int index, Receptioniste element) {
            return null;
        }

        @Override
        public void add(int index, Receptioniste element) {

        }

        @Override
        public Receptioniste remove(int index) {
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
        public ListIterator<Receptioniste> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Receptioniste> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Receptioniste> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private static List<Service> services = new List<Service>() {
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
        public Iterator<Service> iterator() {
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
        public boolean add(Service service) {
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
        public boolean addAll(@NotNull Collection<? extends Service> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Service> c) {
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
        public Service get(int index) {
            return null;
        }

        @Override
        public Service set(int index, Service element) {
            return null;
        }

        @Override
        public void add(int index, Service element) {

        }

        @Override
        public Service remove(int index) {
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
        public ListIterator<Service> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Service> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Service> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean m = true;
        do {
            System.out.println("====================================================================");
            System.out.println("===============      BIENVENUE CHEZ HOSPITALIZER      ==============");
            System.out.println("====================================================================");
            System.out.println("Veuilez choisir l'un des chiffres ci-apres pour operer votre choix :");
            System.out.println("1. Chambre");
            System.out.println("2. Consultation");
            System.out.println("3. Docteur");
            System.out.println("4. Dosage");
            System.out.println("5. Fiche");
            System.out.println("6. Infirmier");
            System.out.println("7. Medicament");
            System.out.println("8. Ordonnance");
            System.out.println("9. Patient");
            System.out.println("10. Pharmacie");
            System.out.println("11. Pharmacien");
            System.out.println("12. Receptioniste");
            System.out.println("13. Service");
            System.out.println("0. Pour quitter");
            System.out.print("=> ");
            Scanner sc = new Scanner(System.in);
            String choix = sc.nextLine();
            if (choix.equals("1") || choix.equals("2") || choix.equals("3") || choix.equals("4") || choix.equals("5") || choix.equals("6") || choix.equals("7") ||
                    choix.equals("8") || choix.equals("9") || choix.equals("10") || choix.equals("11") || choix.equals("12") || choix.equals("13")) {
                int sous_choix = sous_menu();
                int ch = sc.nextInt();
                execute(ch, sous_choix);
            }else if (choix.equals("0")){
                System.out.println("Aurevoir !");
                m = false;
            }else {
                System.out.println("Veuillez operer un choix valide");
            }
        }while (m);

    }

    private static int sous_menu() {
        int sm;
        do {
            System.out.println("Choisissez l'operation a effectuer svp : ");
            System.out.println("1. Ajouter");
            System.out.println("2. Supprimer");
            System.out.println("3. Lister");
            System.out.println("4. Chercher");
            System.out.println("0. Menu principal");
            Scanner sc = new Scanner(System.in);
            String ch = sc.nextLine();
            if (ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") ||ch.equals("4")){
                sm = sc.nextInt();
            }else{
                System.out.println("Veuillez entrer un nombre valide");
                sm = -1;
            }
        }while (sm<0 || sm>3);
        return sm;
    }

    private static void execute(int menu, int sous_menu){
        if (menu == 1){
            if (sous_menu == 1){
                chambres.add(new Chambre());
            }else if (sous_menu == 2) {
                System.out.println("0. Pour quitter");
                execute(menu, 3);
                System.out.println("Veuillez selectionner l'element a supprimer");
                System.out.print("=>");
                Scanner sc = new Scanner(System.in);
                int el = sc.nextInt();
                if (el != 0){
                    System.out.print("Voulez-vous vraiment supprimer cet element ? (O|N)\n==>");
                    Scanner scan = new Scanner(System.in);
                    String c = scan.nextLine();
                    if (c.equals("o") || c.equals("O")){
                        chambres.remove(el-1);
                        System.out.println("Element supprimer avec succes");
                    }
                }
            }else if (sous_menu == 3) {
                int i = 0;
                for (Chambre chambre : chambres){
                    i++;
                    chambre.afficher();
                }
            }else if (sous_menu == 4){
                System.out.print("Tapez le numero de la chambre a rechercher\n==>");
                Scanner scanner = new Scanner(System.in);
                int nb = scanner.nextInt();
                if (nb<chambres.size() && nb>0){
                    chambres.get(nb).afficher();
                }else{
                    System.out.println("Element inexistant ou non trouver");
                }
            }
        }
    }
}