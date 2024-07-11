package Calculadora;
public class TestandoCalculadora {
    public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora();
         
         int soma = calc1.soma(1, 2);

         System.out.println(soma);


         double soma2 = calc1.soma(2.0, 3.1);

         System.out.println(soma2);
            
    }
}
