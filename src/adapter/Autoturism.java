package adapter;

public class Autoturism implements Masina1{

    @Override
    public void ruleazaCuViteza() {
        System.out.println("Ruleaza cu 100km/h.");
    }

    @Override
    public void claxoneaza() {
        System.out.println("Sunet strident!");
    }
}
