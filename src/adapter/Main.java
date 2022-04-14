package adapter;

//Interface builder.Masina ruleaza()
//claxoneaza();

public class Main {
    public static void main(String[] args) {
        JucarieMobila jm = new AdapterMasina();
        jm.emiteSunete();
        jm.seDeplaseaza();
    }
}
