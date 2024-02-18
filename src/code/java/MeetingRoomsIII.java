package code.java;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int[] res = new int[n];
        long[] times = new long[n];

        for (var meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            long minTime = Long.MAX_VALUE;
            int minId = -1;
            boolean isSet = false;

            for (int i = 0; i < n; i++) {
                if (times[i] < minTime) {
                    minTime = times[i];
                    minId = i;
                }
                if (times[i] <= start) {
                    isSet = true;
                    times[i] = end;
                    res[i]++;
                    break;
                }
            }
            if (!isSet) {
                times[minId] += end - start;
                res[minId]++;
            }
        }

        int maxTime = -1;
        int maxId = -1;

        for (int i = 0; i < n; i++) {
            if (maxTime < res[i]) {
                maxId = i;
                maxTime = res[i];
            }
        }
        return maxId;
    }

    public static void main(String[] args) {
        var sol = new MeetingRoomsIII();
        System.out.println(sol.mostBooked(2, new int[][]{
                new int[]{0, 10},
                new int[]{1, 5},
                new int[]{2, 7},
                new int[]{3, 4},
        }));
        System.out.println(sol.mostBooked(3, new int[][]{
                new int[]{1, 20},
                new int[]{2, 10},
                new int[]{3, 5},
                new int[]{4, 9},
                new int[]{6, 8},
        }));
    }
}
