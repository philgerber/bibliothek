public class CD extends Medium {

    Sound sample;
    Player p = new Player();

    @Override
    public void showSample() {
        p.playSound(sample);
    }
}
