class Solution {


    public int mySqrt(int number) {
        long start = 0;
	    long end = number;
	    
	    while(start+1<end){
	        long mid = start + (end-start)/2;
	        if(mid*mid == number)  return (int)mid;
	         else if(mid*mid<number) start = mid;
	         else end = mid;
	    }
	    if(end*end == number)
	        return (int)end;
	        
	    return (int)start;
    }
}