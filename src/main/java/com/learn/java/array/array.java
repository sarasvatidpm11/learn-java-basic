package com.learn.java.array;

public class array {

    public static void main(String[] args) {

        //single dimensional array
        int[] a = new int[5];
        int b[] = new int[10];
        int c[] = {1, 3, 5, 7, 9};
        int[] d = {2, 4, 6, 8, 10};

        //multidimensional array
         int[] [] e =  {
                 {1, 2},
                 {3, 4},
                 {5, 6}
         };

        System.out.println(c.length);
        System.out.println(d[3]);
        //System.out.println(d[5]); //pasti error karena tidak ditemukan index ke 5 pada array
        System.out.println("Columns = " + e[0].length);
        System.out.println("Rows = " + e.length);

        char[] source = {'H', 'A', 'P', 'P', 'Y', 'I', 'N', 'T', 'E', 'R', 'N', 'S', 'H', 'I', 'P'};
        char[] destination = new char[7];

        //copying elements from array to another array
        System.arraycopy(source,0, destination, 1, 5);
        System.out.println(new String(destination));

        //delete element from array using shifting method
        int flag = 4; //to be deleted
        for (int i = 0; i < source.length; i++) {
            if (flag == i) {
                for(int j = i + 1; i < source.length-1; j++) {
//                    System.out.println(j);
//                    System.out.println(source[j]);
                    source[i] = source[j];
                    i++;
                }
                System.out.println(source);
            }
        }
    }
}
