package adapter;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("Ruleaza cu 0,5km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("Melodie cantata");
    }
}
