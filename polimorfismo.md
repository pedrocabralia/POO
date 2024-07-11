# Polimorfismo

* Significado da palavra segundo  Oxford Languages:
    * Qualidade ou estado de ser capaz de assumir   diferentes formas.

* No POO um Objeto pode se comportar de diferentes formas. 

## Sobrecarga e Sobreposição

## Sobrecarga (overload)

* A sobrecarga(overload) é o conceito onde existema mais de um método com o mesmo nome na mesma classe, porém esses métodos devem receber argumentos diferentes.

    * Ex.: 

    ### **Calculadora.java**

    ```java
            public class Calculadora{

                public int soma(int a, int b){

                    return a + b;
                }
            }
    ```

    ### **TestandoCalculadora.java**

    ```java
     public class TestandoCalculadora {
            public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora();
         
         int soma = calc1.soma(1, 2);

         System.out.println(soma);
            
    }
    }
    ```
    ### Saída no terminal:
![saida](img/Untitled%20design%20(1).png)


* E se quiséssemos somar os números flutuantes, como faríamos?
 * Utilizaríamos a sobrecarga.

    * Ex.: 

    ### Na Classe Calculadora.java adicione: 



    ```java
     
       public double soma(double a, double b){

        return a + b;

    }
    ```

    ### Na Classe TestandoCalculadora.java adicione: 


    ```java

            double soma2 = calc1.soma(2.0, 3.1);

            System.out.println(soma2);
    
    ```
 ### Saída no terminal:

![SAIDA](img/Untitled%20design%20(2).png)

## Sobreposição (override)

* Permite reescrever os métodos nas classes filhas. Devem possuir o mesmo nome, tipo e quantidade de parâmetros do método da classe pai.
    * Ex.: 

    ### Vamos Criar uma classe chamada Funcionario.java

     ```java
     
    public class Funcionario {

        public double salario;


        public double gratificacao(){

        return this.salario * 0.10;

            }
    }
    ```

### Vamos criar duas classes filhas para ele:

### Gerente.java

 ```java

    public class Gerente  extends Funcionario{
    

        public double gratificacao(){

            return this.salario * 0.15;

                }

            }
 ```

### Atendente.java

```java
    
        public class Atendente  extends Funcionario{
    
            public double gratificacao(){

                 return this.salario * 0.12;

            }

         }

```
### Vamos criar uma classe Teste.java

```java
    
    public class Teste {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        Atendente atendente1 = new Atendente();

        gerente1.salario = 5000.00;
        atendente1.salario = 5000.00;

        double gratificacaoGerente = gerente1.gratificacao();
        double gratificacaoAtendente = atendente1.gratificacao();

        System.out.println("Gratificação do gerente: "+gerente1.gratificacao());

        System.out.println("Gratificação do Atendente: "+atendente1.gratificacao());




    }
}
    
```

### Saída Terminal


![saida](img/Untitled%20design%20(3).png)




# Atividade:

1. 
    * Crie uma classe Produto, com os atributos nome e preço. Crie também um método do tipo double, chamado calculaDesconto, onde esse método deve calcular o desconto do produto, que será de 10%;

    * Crie uma classe chamada Celular que herde as características da classe Produto. Em seguida, reescreva o método calculaDesconto para que o desconto do celular seja de 15%;

    * Crie uma classe chamada Relógio que herde as características da classe Produto. Em seguida, reescreva o método calculaDesconto para que o desconto do relógio seja de 25%;

    * Crie a classe Teste para instanciar os objetos do tipo Celular e Relógio, preencher as informações e imprimir no terminal o valor original e o valor com  desconto.














    