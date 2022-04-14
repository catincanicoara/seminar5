package builder;//Un obiect builder Builder b;
//la nivelul constructorului un parametru()Ce tip de masina va construi

import builder.BuilderMasina;

public class InginerAuto {
    BuilderMasina b;
    //constructor builder.InginerAuto(String tipMasina);

    public InginerAuto(String tipMasina) {

    }

    //buildMasina(){apeleaza toate metodele b.build...pt fiecare componenta in parte}
    public void buildMasina(){
        b.buildSasiu();
        b.buildInterior();
        b.buildMotor();
        b.buildRoti();

    }

    //metoda getMasina(){return b.getMasina()};
    public Masina getMasina(){
        return b.getMasina();
    }
}
