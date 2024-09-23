package d27exceptions;

public class E04 {
    public static void main(String[] args) {
        String[] arr = {"j", "a", "v", "a"};
        //getElementFromArray(arr,1);//a
        getElementFromArray(arr,5);


    }//main disi
    public static void getElementFromArray(String[] s, int idx) {
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index no "+(s.length-1)+" den buyuk olamaz");
        }
    }

}
