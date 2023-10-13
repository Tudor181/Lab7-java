package university;

public class Persoana {
    private String nume;
    private String prenume;
    private String CNP;

    public Persoana() {
    }

    public Persoana(String nume, String prenume, String CNP) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String cnp) {
        this.CNP = cnp;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ' ' + nume + ' ' + prenume + ' ' + CNP + ';';
    }

}
