package typesofinheritance;
interface Student {
    void study();
}

interface Sports {
    void play();
}

class CollegeStudent implements Student, Sports {

    public void study() {
        System.out.println("Student is Studying");
    }

    public void play() {
        System.out.println("Student is Playing");
    }
}

public class Multiple {
    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        s.study();
        s.play();
    }
}