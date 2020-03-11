public class Bibliothek {

    private Medium[] katalog;

    public void showSample(Medium m) {
        if (m instanceof Buch) {
            System.out.println(((Buch) m).sample);
        } else if (m instanceof CD) {
            Player p = new Player();
            p.playSound(((CD) m).sample);
        } else if (m instanceof DVD) {
            Player p = new Player();
            p.playVideo(((DVD) m).sample);
        }
    }
}
