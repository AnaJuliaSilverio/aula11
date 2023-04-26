public class Main {
    public static void main(String [] args){
        double altura;
        double peso;
        double imc;
        altura = 159;
        peso=70;
        imc = peso/(altura*altura);

        if (imc<18.5){
            //magreza
        }
        else if(18.5<imc && imc<24.9){
            //normal
        }
        else if(25<imc && imc<29.9){
            //sobrepeso
        }
        else if (30<imc && imc<39.9) {
            //obesdidade
        }
        else {
            //Obesidade grave
        }
    }
}
