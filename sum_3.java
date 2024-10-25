import java.util.*;
public class sum_3 {
    public static void main(String[]args){
        int[] arr={-1,0,1,2,-1,-4};
        sum_3 sol=new sum_3();
        List<List<Integer>> result= sol.threeSum(arr);
        System.out.println(result);

    }
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0&&(arr[i]==arr[i-1])){
                continue;
            }
            for(int j=i+1;j<arr.length-1;j++){
                if(j>i+1&&(arr[j]==arr[j-1])){
                    continue;
                }
                for(int k=j+1;k<arr.length;k++){
                    if(k>j+1&&(arr[k]==arr[k-1])){
                        continue;
                    }
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        return result;
    }
}
//     public static void main(String[]args){
//         int[] arr={-1,0,1,2,-1,-4};//given array
//         int n=arr.length;

//         int[] result = remove(arr);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
//     public static int[] remove(int[]arr){
//         if(arr.length==0){
//             return arr;
//         }
//         Arrays.sort(arr);
//         int count = 1; 
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 arr[count] = arr[i];
//                 count++;
//             }
//         }
//         int[] result = new int[count];
//         for (int i = 0; i < count; i++) {
//             result[i] = arr[i];
//         }
//         return result;
//     }
// }

        


        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     if(i>0&&(arr[i]==arr[i-1])){
        //         System.out.println(arr[i]);
        //         continue;
        //        // System.out.println(arr[i]);
            