void reverse(int[] array) {
  for (int i = 0; i < array.length / 2; i++){
    int other = array.length - i - 1;
    int temp = array[i];
    array[i] = array[other];
    array[other] = temp;
  }
}

// This algorithm reverses an array, it runs at O(N), iterating through half of
// the array does not impact the big O time.

// Example 7

/*

Which of the following are equivalent to O(N)?

A) O(N + P), where P < N / 2
B) O(2N)
C) O(N + log N)
D) O(N + M)

A - since P is less than half of N, N is the dominant term and we can drop O(P)
B - We drop constants so this too is O(N)
C - O(N) dominates log N so we can drop O(log N)
D - We don't know the relationship between N and M so the run time stays as is

A through C have a runtime of O(N)

*/
