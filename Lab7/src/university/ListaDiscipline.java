package university;

import java.util.Vector;

public class ListaDiscipline {

    private class Disciplina {
        private String denumire;
        private String cadruDidacatic;
        private int nota;

        private Disciplina(String denumire, String cadruDidacatic, int nota) {
            this.denumire = denumire;
            this.cadruDidacatic = cadruDidacatic;
            this.nota = nota;
        }
    }

    private Vector<Disciplina> listaDiscipline;

    public void adaugareDisc(String denumire, String cadruDidactic, int nota) {
        if (listaDiscipline == null) {
            listaDiscipline = new Vector<Disciplina>();
        }
        Disciplina dis = new Disciplina(denumire, cadruDidactic, nota);

        listaDiscipline.add(dis);
    }

    public double calculMedie() {
        double suma = 0;
        for (Disciplina disc : listaDiscipline) {
            suma += disc.nota;
        }
        return suma / listaDiscipline.size();
    }

    @Override
    public String toString() {
        StringBuffer listaDesc = new StringBuffer("\ndetalii:\n");
        for (Disciplina disc : listaDiscipline) {
            listaDesc.append(disc.denumire + ' ');
            listaDesc.append(disc.cadruDidacatic + ' ');
            listaDesc.append(disc.nota + ' ');
            listaDesc.append('\n');
        }
        return this.getClass().getSimpleName() + listaDesc;
    }

}
