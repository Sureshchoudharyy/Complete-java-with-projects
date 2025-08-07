import java.util.*;

public class ArrayProblems {
    public static void reverse(int[] arr){
        int j = arr.length-1;
        int i=0;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void maxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        System.out.println(max+" is maximum and "+min+" is minimum");
    }

    public static void secondMaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s_max = Integer.MIN_VALUE;
        int s_min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                s_max = max;
                max = arr[i];
            }
            if(arr[i]<min){
                s_min = min;
                min = arr[i];
            }
            else if(arr[i]>s_max && arr[i]!=max){
                s_max = arr[i];
            }
            else if(arr[i]<s_min && arr[i]!=min){
                s_min = arr[i];
            }
        }
        System.out.println(s_max+" - "+s_min);
    }

    public static boolean checkSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){

            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void removeDuplicates(int[] arr){
        int i=1;
        for(int j=1;j<arr.length;j++){
            if(arr[j-1]!=arr[j]){
                arr[i] = arr[j];
                i++;
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void removeDuplicatesUnsorted(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.print(set+" ");
    }

    public static void moveZeros(int[] arr1){
        int i=0;
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]!=0){
                arr1[i] = arr1[j];
                i++;
            }
        }
        while(i<arr1.length){
            arr1[i] = 0;
            i++;
        }
    }

    public static void sumArr(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum is : "+sum);
    }

    public static void missingNum(int[] arr2){
        int sum = 0;
        int n = arr2.length;
        int total_sum = ((n+1)*(n+2))/2;
        for(int i=0;i<arr2.length;i++){
            sum += arr2[i];
        }
        System.out.println("Missing number is : "+(total_sum-sum));
    }

    public static void search(int[] arr2,int target){
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==target){
                System.out.println("Target found at index number : "+i);
            }
        }
    }

    public static void countEvenOdd(int[] arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count is : "+even+" , odd count is : "+odd);
    }

    public static void countPNZ(int[] arr1){
        int pos = 0;
        int neg = 0;
        int zeros = 0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                pos++;
            }
            else if(arr1[i]<0){
                neg++;
            }
            else{
                zeros++;
            }
        }
        System.out.println("Positive - "+pos+", Negatives - "+neg+", Zeros - "+zeros);
    }

    public static void leftRotate(int[] arr, int k){
        k = k%arr.length;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k] = arr[i];
        }
        for(int i=0;i<temp.length;i++){
            arr[arr.length-k+i] = temp[i];
        }
    }

    public static void rightRotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];
        int j=0;
        //1,2,3,5,6
        for(int i=n-k;i<n;i++){
            temp[j++] = arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }
        for(int i=0;i<temp.length;i++){
            arr[i] = temp[i];
        }
    }

    public static void frequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }

    public static void twoSum(int[] arr, int target){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i+","+j);
//                    break;
//                }
//            }
//        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println(i+","+j);
                break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
    }

    public static void threeSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(i+","+j+","+k);
                        break;
                    }
                }
            }
        }
    }

    public static void maxConOnes(int[] arr){
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        System.out.println(maxCount);
    }


    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,1,2,5,3,4,5};
        int[] arr1 = {0,1,1,0,0,2,0,3};
        int[] arr2 = {1,2,3,5,6};
        int[] arr3 = {1,0,1,1,0,0,1,1,1,1,1,0,0};
//        reverse(arr);
//        printArr(arr);
//        maxMin(arr);
//        secondMaxMin(arr);
//        if(checkSorted(arr)){
//            System.out.println("Array is sorted!");
//        }
//        else{
//            System.out.println("array is not sorted!");
//        }
//        removeDuplicates(arr);
//        removeDuplicatesUnsorted(arr);
//        moveZeros(arr1);
//        printArr(arr1);
//        sumArr(arr);
//        missingNum(arr2);
//        search(arr2,6);
//        countEvenOdd(arr);
//        countPNZ(arr1);
//        leftRotate(arr2,8);
//        rightRotate(arr2,6);
//        printArr(arr2);
//        frequency(arr);
//        twoSum(arr2,9);
//        threeSum(arr2,9);
        maxConOnes(arr3);
    }
}
