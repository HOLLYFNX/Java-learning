import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variável que inicia em 1, e vai até 10, mudando 1-por-1, faça:

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(j + "x" + i + "=" + j * i);
                //j executa de 1 até 10, enquanto o i espera o j chegar a 10 para executar a repetição
            }
        }

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;



        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }

        String[] letras = new String[5];
        letras[0] = "a";
        letras[1] = "b";
        letras[2] = "c";
        letras[3] = "d";
        letras[4] = "e";

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);

        }
    //outro tipo de sintaxe
        String[] batatas = {"assada","batida","amassada", "cortada"};
        for (int i = 0; i < batatas.length; i++){
            System.out.println(batatas[i]);

        }

        System.out.println(Arrays.toString(batatas));

        int[] numeros2 = {9,10,12,25,2};
        int maior = numeros2[0];
        int menor = numeros2[0];
        int media = 0;

        for (int i = 0; i < numeros2.length; i++){
            if (numeros2[i] > maior){
                maior = numeros2[i];
            }
            if (numeros[i] < menor){
                menor = numeros2[i];
            }
            media += numeros2[i];
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Média = " + media/numeros.length);

        String name = "Matheus";
        saudacao(name);


        int resultado = soma(2,3);
        System.out.println(resultado);

    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static void saudacao(String name2){
        System.out.println("Hello, " + name2 + ".");
    }

    }

