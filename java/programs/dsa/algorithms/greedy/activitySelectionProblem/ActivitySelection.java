package programs.dsa.algorithms.greedy.activitySelectionProblem;

import java.util.Arrays;

class ActivitySelection {
    public static void main(String[] args) {
        Activity[] activities = {new Activity(1, 2), new Activity(3, 4), new Activity(0, 6), new Activity(5, 7)};
        Arrays.sort(activities);

        System.out.println("Selected Activities:");
        int lastEndTime = 0;
        for (Activity activity : activities) {
            if (activity.start >= lastEndTime) {
                System.out.println("Activity: (" + activity.start + ", " + activity.end + ")");
                lastEndTime = activity.end;
            }
        }
    }

    static class Activity implements Comparable<Activity> {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Activity other) {
            return this.end - other.end;
        }
    }
}
