package dzien0704.Zad02;


public class Student extends Osoba{
    private int rokStudiow;
    private Uczelnia uczelnia;

    public Student(String imie, int age) {
        super(imie, age);
    }

    public Student(String imie, int age, int rokStudiow, Uczelnia uczelnia) {
        super(imie, age);
        this.rokStudiow = rokStudiow;
        this.uczelnia = uczelnia;
    }
}
