/*
 * Problem #3709: Design Exam Scores Tracker
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/10/2025, 21:28:17
 * Link: https://leetcode.com/problems/design-exam-scores-tracker/
 */

class ExamTracker {
    private List<Integer> times;
    private List<Long> prefixSums;

    
    public ExamTracker() {
        times = new ArrayList<>();
        prefixSums = new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        long newSum = score + (prefixSums.isEmpty() ? 0 : prefixSums.get(prefixSums.size() - 1));

        prefixSums.add(newSum);
    }
    
    public long totalScore(int startTime, int endTime) {
       int left = lowerBound(times, startTime);
        int right = upperBound(times,endTime) - 1;
        
        if(left > right){
            return 0 ;
        }
            long endSum = prefixSums.get(right);

            long startSum = (left == 0 ? 0 : prefixSums.get(left - 1));
            return endSum - startSum;
        }
    
         private int
             lowerBound(List<Integer> list, int target){
             int low = 0, high = list.size();

             while(low < high){
                 int mid = (low + high) / 2;

                 if(list.get(mid) >= target){
                     high = mid;
                 }else{
                     low = mid + 1;
                 }
             }
             return low;
         }
        private int
            upperBound(List<Integer> list, int target){
            int low = 0, high = list.size();

            while(low < high) {
                int mid = (low + high) / 2;

                if(list.get(mid) > target){
                    high = mid;
                }else{
                    low = mid + 1;
                }
                
            }
            return low;
       
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */
