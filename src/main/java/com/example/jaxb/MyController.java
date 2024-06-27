package com.example.jaxb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping
public class MyController {
    @Autowired
    private MyService service;

    @GetMapping("/resource/{n}")
    public String home(@PathVariable int n) {

        return "Hello from My Service!"+ factorial(n);
    }


    //factorial
    public int factorial(int n){

        if(n==0){
            return 1;
        }
        extractDigits("MY MOTHER OWNS 3 GOATS AND 20 CCHICKENS");
////        bubbleSort(new int[]
////                {8,5,45,1,2,6});
//        sortedSet(new String[]{"q","z","r","a","ty","a","o"});
        int[][] arr = { { 1, 2,9,0 }, { 3, 4,8,7 },{ 3, 4,8,7 } };
        traverseSpiral(arr);




        return n * factorial(n-1);
    }

    public static void printArray(int[] array)
    {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    //bubbleSort or sort array in ascending order

    public void bubbleSort(int [] arr){

        int temporary;

        for (int i= 0; i<arr.length;i++){
            for(int j = i+1;j < arr.length;j++){

                if(arr[i] > arr[j]){
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }

        printArray(arr);

    }

    //find maximum number in an array

    public int maxValue(int [] arr){

        int maxV = arr[0];

        for(int val : arr){

            if (val > maxV) {

                maxV = val;

            }
        }
        return maxV;
    }

    //sorted array

    public void sortedSet (String []arr){

//        SortedSet<String> sort = new TreeSet<>(Arrays.asList(arr));
        Map<String,Integer> m = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            m.put(arr[i].toUpperCase(), i);
        }

        System.out.println(m);

    }

    //create 2d array m x n

    public void matrixDim (int matrix [][]){

        for(int i=0 ; i <matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void traverseSpiral (int matrix[][]){

        //list variable

        int l = matrix.length; //3 no of rows
        int cl = matrix[0].length;//no of columns 4
        //begin row
        int x=0;
        //end row
        int y = matrix.length - 1;
        //begin column
        int p = 0;
        //end column
        int z = matrix[0].length -1;


//        System.out.println(l);
//        System.out.println(z);
//        System.out.println(y);
//        System.out.println(cl);

        //create a list where to add the values after spiral
        List<Integer> spiral = new ArrayList<>();
        //print first column
        while(x<=y && p<=z){

        for (x = 0; x<=y;x++){
        spiral.add(matrix[x][p]);
        }

            p++;
//        System.out.println(spiral);


        for (int i=p;i<=z;i++){
            spiral.add(matrix[y][i]);
        }
         y--;


        for(int i =y;i>=0;i--){
            spiral.add(matrix[i][z]);
        }

        z--;

        for(int i = z;i>0;i--){
            spiral.add(matrix[0][i]);
        }

        }


        System.out.println(spiral);

    }

    //linear search

    public boolean linearSearch(int arr [],int num){
        boolean found = false;

        for (int i = 0; i<arr.length;i++){
            if(arr[i] == num){
                found = true;
                break;

            }

        }
        return found;
    }

    //BinarySearch

    public int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;

        boolean found = false;



        while (start<=end){
            int mid = (start + end)/2;


            if(arr[mid] == num){
                return mid;
            }

            else if(arr[mid]< num){
                start= arr[mid] + 1;
            }
            else {
                end = arr[mid] - 1;
             }

        }
        return -1;

    }

    public static void extractDigits(String src) {

        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                numbers.add(c);
            }
        }

        System.out.println(numbers);
    }

}