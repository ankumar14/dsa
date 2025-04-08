package Demo;


import java.util.Arrays;

public class Photon {

    //array input = {1,2,3,4}
    //Expected output = {24,12,8,6}


    public static void main(String[] args) {

        int[] nums = new int[4];
        for (int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(findProductArray(nums)));

    }

    public static int[] findProductArray(int[] nums){

        int[] product = new int[nums.length];

        int actualProduct = 1;

        for (int i =0;i< nums.length;i++){
            actualProduct= nums[i]*actualProduct;
        }

        System.out.println(actualProduct);

        for (int i=0;i< nums.length;i++){
            product[i]=actualProduct/nums[i];
        }

        return product;

    }

}


