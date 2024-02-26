//https://leetcode.com/problems/find-the-highest-altitude/

class highestAltitude {
    public static void main(String[] args) {
        int arr[] = {-5,1,5,0,-7};
        int ans = largestAltitude(arr);
        System.out.println(ans);
    }
    static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            // Calculate the current altitude by adding the net gain
            currentAltitude += gain[i];

            // Update the highest altitude if the current altitude is higher
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        return highestAltitude;
    }
}