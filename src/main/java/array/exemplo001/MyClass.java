package array.exemplo001;

public class MyClass {
        public static void main(String[] args) {

            //conceitos e declaração de arrays
            int[] meuArray= new int[7];

            int[] meuArray2 = {12,32,54,6,8,89,64};

            System.out.println(meuArray[1]);
            System.out.println(meuArray2[3]);

            //alterando o valor de um elemento
            meuArray2[2] = 40;
            System.out.println(meuArray2[2]);

            //comprimento do array
            System.out.println(meuArray.length);
        }
}
