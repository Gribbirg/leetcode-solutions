package code.java;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int i = 0;
        for (; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff < 0) continue;

            priorityQueue.add(diff);

            if (priorityQueue.size() > ladders && !priorityQueue.isEmpty()) bricks -= priorityQueue.poll();
            if (bricks < 0) break;
        }
        return i;
    }

    public static void main(String[] args) {
        var sol = new FurthestBuildingYouCanReach();
        System.out.println(sol.furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));
        System.out.println(sol.furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
        System.out.println(sol.furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0));
    }
}
