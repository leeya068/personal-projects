package meetingmaximumguests.naivesolution;

/*
Naive Solution (Brute Force)
Checks all possible overlapping guest time intervals to find the maximum number of guests present at the same time.
- Iterate through each guest and treat their arrival–departure time as a reference interval.
- For the selected guest, compare their interval with every other guest’s interval.
- Check if the two time intervals overlap.
- If an overlap exists, increment the count of guests present at that time.
- Track and return the maximum count obtained across all guests.

*/

import java.util.*;


public class NaiveSolution {
    
    public static int maxGuests(int[] arr, int[] dep) {
        int maxGuests = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 1; // Start with 1 as the current guest
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] <= arr[j] && dep[i] >= dep[j]) || (arr[i] <= dep[j] && dep[i] >= arr[j])) {
                    currentCount++;
                }
            }
            maxGuests = Math.max(maxGuests, currentCount);
        }

        return maxGuests;
    }
    
}


// time complexity: O(n^2) - due to nested loops checking all pairs of guests
// space complexity: O(1) - no additional space used