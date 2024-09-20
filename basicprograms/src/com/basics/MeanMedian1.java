package com.basics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanMedian1 {
    static List<Integer> ans = new ArrayList<>();
    static double diff = 0;

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3};
        System.out.println(Arrays.toString(meanMedian(arr)));
    }

    public static int[] meanMedian(int[] arr) {
        List<Integer> subset = new ArrayList<>();
        backtrack(arr, subset, 0);
        int[] array = ans.stream().mapToInt(i -> i).toArray();
        return array;
    }

    public static void backtrack(int[] arr, List<Integer> subset, int start) {
        findMeanMedian(subset);
        for (int i = start; i < arr.length; i++) {
            subset.add(arr[i]);
            backtrack(arr, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void findMeanMedian(List<Integer> arr) {
        if (arr.size() == 0) {
            return;
        }
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        double mean = sum / arr.size();
        double median = 0.0;
        int mid = arr.size() / 2;
        if (arr.size() % 2 == 0) {
            median = (arr.get(mid) + arr.get(mid - 1)) / 2.0;
        } else {
            median = arr.get(mid);
        }
        double diff1 = Math.abs(mean - median);
        if (diff1 > diff) {
            diff = diff1;
            ans.clear();
            ans.addAll(arr);
        }
    }
}


/*
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * 
 * public class MeanMedian1 { static List<Integer> ans=new ArrayList<>(); static
 * double diff=0; public static void main(String[] args) { int arr[]=
 * {1,2,2,3,3}; System.out.println(Arrays.toString(meanMedian(arr))); } public
 * static int[] meanMedian(int[] arr) { // TODO Auto-generated method stub
 * List<Integer> subset=new ArrayList<>(); backtrack(arr,subset,0); int []
 * array=ans.stream().mapToInt(i -> i).toArray(); return array;
 * 
 * } public static void backtrack(int[] arr, List<Integer> subset, int start) {
 * // TODO Auto-generated method stub findMeanMedian(subset); for(int i=start;i
 * < arr.length;i++) { subset.add(arr[i]); backtrack(arr, subset, i+1);
 * subset.remove(subset.size() -1); }
 * 
 * } public static void findMeanMedian(List<Integer> arr) { // TODO
 * Auto-generated method stub if(arr.size() ==0) { return; } double sum=0;
 * for(int i=0;i<arr.size();i++) { sum +=arr.get(i); } double
 * mean=(double)sum/arr.size(); double median=0.0; int mid=arr.size()/2;
 * if(arr.size() % 2 ==0) { median=(arr.get(mid)+arr.get(mid - 1))/2; } else {
 * median=(double)arr.get(mid); } double diff1=(double)(mean-median); if(diff1 >
 * diff) { diff=diff1; ans.clear(); ans.addAll(arr); }
 * 
 * }
 * 
 * }
 */