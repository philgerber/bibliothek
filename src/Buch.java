public class Buch extends Medium {
    String sample;

    public Buch(String sample) {
        this.sample = sample;
    }

    @Override
    public void showSample() {
        System.out.println(sample);
    }
}
