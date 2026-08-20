class Solution {
    
        
    boolean possible(int[] bloomDay, int m, int k, int mid)
    {
        int flowers=0;
        int bouquets=0;
        int n=bloomDay.length;
        for(int i=0; i<n; i++)
        {
            if(bloomDay[i] <= mid)
            {
                flowers++;
                if(flowers == k)
                {
                    bouquets++;
                    flowers = 0;
                }
            }
            else
            {
                flowers = 0;
                if ((m - bouquets) * k > n - i - 1)
                    break;
            }
            if (bouquets >= m)
                break;
        }

        return bouquets >= m;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if ((long) m * k > n)
            return -1;
        
        int r = 0;
        for (int i=0; i < n; i++) {
            if (bloomDay[i] > r) {
                r = bloomDay[i];
            }
        }

        int l=1;
        int result = -1;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(possible(bloomDay, m, k, mid))
            {
                result = mid;
                r = mid  - 1;
            }

            else
            {
                l = mid + 1;
            }
        }
        
        return result;
    }
}