package mx.edu.uttt.arreglos;

public class DeclaringArrays {
    public static void main(String[] args) {
        /*Sintaxis para declarar un arreglo
        1.- datatype [] arrayName;
            ejemplo: double [] dailyTemps;
        2.- datatype arrayName [];
            ejemplo: double dailiTemps [];
        3.- datatype [] arrayName1, arrayName2; (deben de ser ambos del mismo tipo)
         */

        double [] arr1;
        String [] arr2, arr3;
        boolean [] arr4;
        char arr5 [];
        int [] arr6;

        //intanciar arreglos
        arr1 = new double[3];
        System.out.println(arr1[0]);

        arr1[1] = 5.4;
        System.out.println(arr1[1]);

        String nombre [] = new String[4];
        System.out.println(nombre[0]);

        double arr7 [] = {23.7,34.6,12.9,22.8};
    }
}
