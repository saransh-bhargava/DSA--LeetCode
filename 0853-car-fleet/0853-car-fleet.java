class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] mat = new int[n][2];

        for(int i = 0; i < n; i++){
            mat[i][0] = position[i];
            mat[i][1] = speed[i];
        }

        Arrays.sort(mat, (a,b) -> b[0] - a[0]);


        int carFleets = 0;
        double lastFleetTime = 0;

        for(int[] car : mat ){
            double time = (double) (target - car[0]) / car[1];

            if(time > lastFleetTime){
                carFleets++;
                lastFleetTime = time;
            }
        }
        return carFleets;
    }
}