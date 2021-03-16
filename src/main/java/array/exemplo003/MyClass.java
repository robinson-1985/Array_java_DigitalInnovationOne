package array.exemplo003;

public class MyClass {
    public static void main(String[] args) {
        int[][] meuArrayMulti = {{1,2,3,4}, {53,63,73}};

        //percorrendo arrays multidimensionais

        for(int i = 0; i < meuArrayMulti.length; ++i){
            for(int j = 0; j < meuArrayMulti.length; ++j){
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}
