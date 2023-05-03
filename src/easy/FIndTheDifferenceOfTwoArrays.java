package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> set1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> set2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> onlyInList1 = new ArrayList<>();
        List<Integer> onlyInList2 = new ArrayList<>();

        for (Integer i : set1) {
            if(!set2.contains(i)) {
                onlyInList1.add(i);
            }
        }

        for (Integer i : set2) {
            if(!set1.contains(i)) {
                onlyInList2.add(i);
            }
        }


        answer.add(onlyInList1);
        answer.add(onlyInList2);

        return answer;
    }
}
