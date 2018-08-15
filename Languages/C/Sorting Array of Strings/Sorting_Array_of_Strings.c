#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int lexicographic_sort(const char* a, const char* b) {
    return strcmp(a, b);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return strcmp(b, a);
}

int distinct_chars(const char *a)
{
    int dist = 0;
   
    while (*a != '\0') {
        if (!strchr(a + 1, *a))
            dist++;
        a++;
    }
    return dist;
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int res = distinct_chars(a) - distinct_chars(b);
    return (res) ? res : lexicographic_sort(a, b);
}

int sort_by_length(const char* a, const char* b) {
    int res = strlen(a) - strlen(b);
    return (res) ? res : lexicographic_sort(a, b);
}

// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
void merge(char** arr, int l, int m, int r, int (*cmp_func)(const char* a, const char* b))
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 =  r - m;
 
    /* create temp arrays */
    char** L;
    char** R;
    L = (char**)malloc(n1*sizeof(char*));
    R = (char**)malloc(n2*sizeof(char*));
 
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++)
        *(L + i) = *(arr + l + i);
    for (j = 0; j < n2; j++)
        *(R + j) = *(arr + m + 1 + j);
 
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray
    j = 0; // Initial index of second subarray
    k = l; // Initial index of merged subarray
    while (i < n1 && j < n2){
        if (cmp_func(L[i], R[j]) <= 0){
            *(arr + k) = *(L + i);
            i++;
        }
        else{
            *(arr + k) = *(R + j);
            j++;
        }
        k++;
    }
 
    /* Copy the remaining elements of L[], if there
       are any */
    while (i < n1){
        *(arr + k) = *(L + i);
        i++;
        k++;
    }
 
    /* Copy the remaining elements of R[], if there
       are any */
    while (j < n2){
        *(arr + k) = *(R + j);
        j++;
        k++;
    }
}
 
/* l is for left index and r is right index of the
   sub-array of arr to be sorted */
void mergeSort(char** arr, int l, int r, int (*cmp_func)(const char* a, const char* b))
{
    if (l < r)
    {
        // Same as (l+r)/2, but avoids overflow for
        int m = (l+r)/2;
        // large l and h
        // int m = l+(r-l)/2;
 
        // Sort first and second halves
        mergeSort(arr, l, m, cmp_func);
        mergeSort(arr, m+1, r, cmp_func);
 
        merge(arr, l, m, r, cmp_func);
    }
}

void bubbleSort(char** arr, const int len,int (*cmp_func)(const char* a, const char* b) ){
    int half = len / 2;
    int sorted = 0;
    while (!sorted) {
        sorted = 1;
        for (int i = 0; i < len - 1; i++) {
            if (cmp_func(arr[i], arr[i + 1]) <= 0) {
                char *tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                sorted = 0;
            }
        }
    }
}

/* simple bubble sort :) */
void string_sort(char** arr, const int len,int (*cmp_func)(const char* a, const char* b)) {
    //Bubble Sort
    //bubbleSort(arr, len, cmp_func);
    
    //Merge Sort
    mergeSort(arr, 0, len - 1, cmp_func);
}


int main() 
{
    int n;
    scanf("%d", &n);
  
    char** arr;
	arr = (char**)malloc(n * sizeof(char*));
  
    for(int i = 0; i < n; i++){
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }
  
    string_sort(arr, n, lexicographic_sort);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);    
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");
}