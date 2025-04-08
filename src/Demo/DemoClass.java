//package Demo;
//
//import java.util.*;
//
//
//@RestController
//controller GetUserInfo{
//
//    @Autowire
//    private JPARepository jpaRepository;
//
//   @PutMapping('/updateSalary/{age})
//    public void updateAllUserSalary(@PathVariable int age){
//        jpaRepository.updateAllUserSalary(age);
//   }
//
//}
//
//
////Put -->/updateSalary/23
//
//@Respository
//Public JPARepository {
//
//    //private EntityManager entityManager;
//
//    public User updateAllUserSalary(int age){
//        entityManager.merge(update  , rowmapper);
//    }
//
//}
//
//user {
//    id,
//            age,
//            salary,
//            name,
//            companyName
//}
//
//
////id ,age,salary ,name , companyName
//
//
//
//
////public class DemoClass {
////
////    public static void main(String[] args) {
////       String s = "abcabcbb";
////
////
////
////
////
////
////
////
////
////
////    }
////}
//
//
//
////Given a string s, find the length of the longest
////        substring
////without repeating characters.
////
////
////        Example 1:
////Input: s = "abcabcbb"Output: 3Explanation: The answer is "abc", with the length of 3.
////Example 2:
////Input: s = "bbbbb"Output: 1Explanation: The answer is "b", with the length of 1.
////Example 3:
////Input: s = "pwwkew"Output: 3Explanation: The answer is "wke", with the length of 3.
////Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//
//
//
////
////Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
////Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
////Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
////Return k.
////Custom Judge:
////The judge will test your solution with the following code:
////int[] nums = [...]; // Input arrayint[] expectedNums = [...]; // The expected answer with correct lengthint k = removeDuplicates(nums); // Calls your implementationassert k == expectedNums.length;for (int i = 0; i < k; i++) {    assert nums[i] == expectedNums[i];}
////If all assertions pass, then your solution will be accepted.
////        In-place algorithm
////In computer science, an in-place algorithm is an algorithm that operates directly on the input data structure without requiring extra space proportional to the input size. In other words, it modifies the...
////
////
////Input: nums = [1,1,2]Output: 2, nums = [1,2,_]
//
//
//
////int[] nums = {1,1,1,2,3,4,4,5}; // 1,2,1,2,3,4,4,5 //
//
////int[] nums = {1,1,1,1,1};
////
////int index = 1;
////
////
////        for (int i=0;i<nums.length-1;i++){
////        if(nums[i]!=nums[i+1]){
////nums[index]=nums[i+1];
////index++;
////        }
////        }
////        System.out.println(index);
////
////
////        for (int i=index;i<nums.length;i++){
////nums[index]=-1;
////index++;
////        }
////
////        System.out.println(Arrays.toString(nums));