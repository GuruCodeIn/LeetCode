class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int peakindex=arr[0];
        int i;
        while(start<=end){
            for(i=0;i<=arr.length-1;i++){
                if(peakindex<=arr[i]){
                    peakindex=arr[i];
                }
            }
            for(int j=0;j<=arr.length;j++){
                if(peakindex==arr[j]){
                    return j;
                }
            }
        }
        return -1;
    }
}