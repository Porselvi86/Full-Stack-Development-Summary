package typesofinheritance;
class Movies {
    void showMovies() {
        System.out.println("Displaying Movies");
    }
}

interface OTT {
    void watchOnline();
}

class Hollywood extends Movies implements OTT {

    public void watchOnline() {
        System.out.println("Watching Hollywood Movies Online");
    }

    void actionMovies() {
        System.out.println("Displaying Action Movies");
    }
}

public class Hybrid {
    public static void main(String[] args) {

        Hollywood h = new Hollywood();

        h.showMovies();
        h.watchOnline();
        h.actionMovies();
    }
}

