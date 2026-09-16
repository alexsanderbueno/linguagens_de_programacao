public class Main{
    public static void main (String[]args){
        double[] salarios = {
    1800,
    2500,
    3200,
    4500,
    7000
};
for (double salario:salarios){
   double salarioatual= (salario*0.10)+salario;
    System.out.println(" O salario acrescido em 10% será: "+salarioatual);

}
    }
}