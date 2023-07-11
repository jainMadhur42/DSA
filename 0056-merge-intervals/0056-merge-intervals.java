class Arrow implements Comparable<Arrow> {
    int start, end;

    public Arrow(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int compareTo(Arrow sd)
    {
        return this.start - sd.start;
    }
}

class Solution {

    public int[][] merge(int[][] intervals) {

        ArrayList<Arrow> arrows = new ArrayList<>();
        for(int i =0;i<intervals.length;i++) {
            arrows.add(new Arrow(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(arrows);
        
        ArrayList<Arrow> ans = new ArrayList<>();
        ans.add(new Arrow(arrows.get(0).start, arrows.get(0).end));

        for(int i = 1;i< arrows.size();i++) { 
            if(arrows.get(i).start <= ans.get(ans.size()-1).end) {
                int start = ans.get(ans.size()-1).start;
                Arrow updateArrow = new Arrow(start, Math.max(arrows.get(i).end, ans.get(ans.size()-1).end));
                ans.set(ans.size()-1, updateArrow);
            } else {
                ans.add(new Arrow(arrows.get(i).start, arrows.get(i).end));
            }         
        }

       
        int[][] mInterval =  new int[ans.size()][2];
        for(int i = 0;i< ans.size();i++) {
            mInterval[i][0] = ans.get(i).start;
            mInterval[i][1] = ans.get(i).end;
        }
        return mInterval;
    }
}









