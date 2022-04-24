package array_lists_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeChallenge {
    public static void main(String[] args) {

        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {4,5,6,7};

        int l1= nums1.length;
        int l2= nums2.length;
        int l3= l1+l2;

        int[] addednums = new int[l3];

        System.arraycopy(nums1, 0, addednums, 0, l1);
        System.arraycopy(nums2, 0, addednums, l1, l2);

        System.out.println(Arrays.toString(addednums));






	}
}

