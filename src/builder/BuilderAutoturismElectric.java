package builder;

public class BuilderAutoturismElectric implements BuilderMasina {
    private Masina auto;

    public BuilderAutoturismElectric(Masina auto) {
        this.auto = auto;
    }

    @Override
    public void buildSasiu() {

    }

    @Override
    public void buildRoti() {

    }

    @Override
    public void buildMotor() {

    }

    @Override
    public void buildInterior() {

    }

    @Override
    public Masina getMasina() {
        return null;
    }


    public void getIncarcator(){

    }
}
