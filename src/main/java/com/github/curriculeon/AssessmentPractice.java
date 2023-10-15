package com.github.curriculeon;

public class AssessmentPractice {
    public static String reverseString(String input){
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }

    public static boolean isPalindrome(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void Fibonacci(int n){
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static int countWords(String input){
        String[] words = input.split("//s+");
        return words.length;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; 1 < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n -1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
