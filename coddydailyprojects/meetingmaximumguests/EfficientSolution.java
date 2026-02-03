package meetingmaximumguests;

/* 

Efficient Solution (Using Sorting)
Sorts arrival and departure times and processes events in order to efficiently determine the maximum number of guests present simultaneously.
- Sort the arrival and departure time arrays independently.
- Initialize two pointers to track arrivals and departures.
- Traverse both arrays in chronological order using the two pointers.
- Increment the guest count when an arrival occurs before a departure; decrement it on departure.
- Maintain and return the maximum guest count observed during traversal.

*/

import java.util.*;

public class EfficientSolution {
    public static int maxCount(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 1;
        int j = 0;
        int count = 1;
        int maxGuests = 1;
        int n = arr.length;
        
        // Two pointer approach
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++; // New guest arrives
                i++;
            } else {
                count--; // A guest departs
                j++;
            }
            maxGuests = Math.max(maxGuests, count);
        }
        
        return maxGuests;
    }
    
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        
        int result = maxCount(arr, dep);
        System.out.println(result); 
    }
}

// time complexity: O(n log n) - due to sorting the arrival and departure arrays
// space complexity: O(1) - no additional space used
