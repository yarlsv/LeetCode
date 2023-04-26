package easy;

public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {

        ++target;

        while(target <= 'z') {
            int low = 0;
            int high = letters.length - 1;
            int mid;

            while(low <= high) {
                mid = low + ((high - low) / 2);
                if(target < letters[mid]) {
                    high = mid - 1;
                } else if (target > letters[mid]) {
                    low = mid + 1;
                } else if (target == letters[mid]) {
                    return letters[mid];
                }
            }
            target++;
        }
        return letters[0];
    }
}
