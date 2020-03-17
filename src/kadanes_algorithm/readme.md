# Kadanes Algorithm: Solves Largest Subarray Sum Problems in Linear time

## Algorithm
```
kadane(ar):
    max_current = max_global = ar[0]
    for i=1 to ar.lenth-1
        max_current = MAX(ar[i], ar[i]+max_current)
        if max_current>max_global
            max_global = max_current
    
    return max_global
```


## References:
* [Kadane's Algorithm to Maximum Sum Subarray Problem (Youtube Tutorial)](https://www.youtube.com/watch?v=86CQq3pKSUw)
* [Largest Sum Contiguous Subarray (GeeksForGeeks)](https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/)