import org.antlr.v4.misc.Graph;
import org.example.*;




public class Main {
    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.randomGrades();
        grades.averageForStudent();

        Game gra = new Game();
        gra.startGame();

    }
}




