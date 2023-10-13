package university;

public class Student extends Persoana {
    private ListaDiscipline listaDisc;

    public Student(String nume, String prenume, String CNP) {
        super(nume, prenume, CNP);
    }

    public void adaugareDisc(String denumire, String cadruDidacatic, int nota) {
        if (listaDisc == null) {
            listaDisc = new ListaDiscipline();
        }
        listaDisc.adaugareDisc(denumire, cadruDidacatic, nota);
    }

    public double calculMedie() {
        return listaDisc.calculMedie();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + listaDisc.toString();
    }
}
