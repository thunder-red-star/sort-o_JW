# sort-o_JW
Roster: Jefford Shau, William Vongphanith  
SOTW: "Stay" by The Kid KAROI, Justin Bieber

## Bubble Sort
**Best case scenario:**
- The list is already sorted.
- Explanation: When the list is already sorted, no swaps are necessary.
- Ex: 1, 3, 5, 7, 12
- Time Complexity: O(N)


**Worst case scenario:**
- The list is in descending order
- Explanation: When the list is in descending order, the maximum number of swaps for each pass are necessary. The number of swaps for pass p would be the length of the list - p.
- Ex: 12, 7, 5, 3, 1
- Time Complexity: O(N^2)

Bubble Sort Swaps:
**Size**|**Best**|**Average**|**Worst**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|0|2452|4950
200|0|10416|19900
300|0|22307|44850
400|0|37868|79800
500|0|62319|124750
600|0|88824|179700
700|0|118987|244650
800|0|162783|319600
900|0|202226|404550


Best Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|1|99|0
200|1|199|0
300|1|299|0
400|1|399|0
500|1|499|0
600|1|599|0
700|1|699|0
800|1|799|0
900|1|899|0


Worst Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|4950|4950
200|199|19900|19900
300|299|44850|44850
400|399|79800|79800
500|499|124750|124750
600|599|179700|179700
700|699|244650|244650
800|799|319600|319600
900|899|404550|404550

## Selection Sort
**No Best case & Worst case scenario:**
- Any list
- Explanation: There is not necessarily a best and worst case scenario for selection sort. In selection sort, the algorithm searches for the least value of the unsorted region in each pass regardless of the initial arrangement order. Selection sort does not have any way to short-circuit the algorithm because the algorithm has no way of differentiating a sorted list from an unsorted list. This explains why each pass in selection sort will result in a swap.
- Ex: 1, 3, 5, 7, 12, 19, 23
- Ex: 7, 5, 19, 1, 23, 3, 12
- Ex: 23, 19, 12, 7, 5, 3, 1
- Time Complexity: O(N^2)


Selection Sort Swaps:
**Size**|**Best**|**Average**|**Worst**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|99|99
200|199|199|199
300|299|299|299
400|399|399|399
500|499|499|499
600|599|599|599
700|699|699|699
800|799|799|799
900|899|899|899


Best Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|4950|99
200|199|19900|199
300|299|44850|200
400|399|79800|399
500|499|124750|499
600|599|179700|599
700|699|244650|699
800|799|319600|799
900|899|404550|899


Worst Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|4950|99
200|199|19900|199
300|299|44850|200
400|399|79800|399
500|499|124750|499
600|599|179700|599
700|699|244650|699
800|799|319600|799
900|899|404550|899

## Insertion Sort
**Best case scenario:**
- The list is already sorted.
- Explanation: When the list is already sorted, no swaps are necessary.
- Ex: 1, 3, 5, 7, 12, 19, 23, 29, 35
- Time Complexity: O(N)


**Worst case scenario:**
- The list is in descending order
- Explanation: When the list is in descending order, the maximum number of swaps for each pass are necessary. The number of swaps for pass p would be the p - 1.
- Ex: 35, 29, 23, 19, 12, 7, 5, 3, 1
- Time Complexity: O(N^2)

Insertion Sort Swaps:
**Size**|**Best**|**Average**|**Worst**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|0|2360|4950
200|0|10942|19900
300|0|22121|44850
400|0|35754|79800
500|0|63210|124750
600|0|89993|179700
700|0|119323|244650
800|0|165929|319600
900|0|204041|404550


Best Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|99|0
200|199|199|0
300|299|299|0
400|399|399|0
500|499|499|0
600|599|599|0
700|699|699|0
800|799|799|0
900|899|899|0


Worst Case:
**Size**|**Passes**|**Compares**|**Swaps**
:-----:|:-----:|:-----:|:-----:
0|0|0|0
100|99|4950|4950
200|199|19900|19900
300|299|44850|44850
400|399|79800|79800
500|499|124750|124750
600|599|179700|179700
700|699|244650|244650
800|799|319600|319600
900|899|404550|404550
