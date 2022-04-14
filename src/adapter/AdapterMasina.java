package adapter;

public class AdapterMasina implements JucarieMobila{

    Masina1 m;

    public AdapterMasina() {
        m = new Autoturism();
    }

    @Override
    public void seDeplaseaza() {
        m.ruleazaCuViteza();
    }

    @Override
    public void emiteSunete() {
        m.claxoneaza();
    }
}
