import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

    private List<Medium> katalog = new ArrayList<>();

    public Bibliothek() {
        katalog.add(new CD());
        katalog.add(new Buch("Bla"));
        katalog.add(new DVD());
        katalog.add(new DVD());
    }

    public void showAll() {
        for (Medium medium : katalog) {
            medium.showSample();
        }
    }

    public void showSample(Medium medium) {
        // Delegation
        medium.showSample();
    }

}
