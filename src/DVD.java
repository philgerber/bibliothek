public class DVD extends Medium {

    Player p = new Player();
    Video sample;

    @Override
    public void showSample() {
        p.playVideo(sample);
    }
}
