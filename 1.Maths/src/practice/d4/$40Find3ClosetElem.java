package practice.d4;

public class $40Find3ClosetElem {
    public static void findClosest(int[] A, int[] B,
            int[] C, int p, int q,
            int r)
{
// Three variable to store answer
int a = 0, b = 0, c = 0;

// To Store minimum of
// max(abs(A[i]-B[j]),abs(B[j]-C[k]),
// abs(C[k]-A[i]))
int ans = Integer.MAX_VALUE;
// Run three nested loop
for (int i = 0; i < p; i++) {
    for (int j = 0; j < q; j++) {
        for (int k = 0; k < r; k++) {
            int curr
                = Math.max(Math.abs(A[i] - B[j]),
                           Math.abs(B[j] - C[k]));
            int temp = Math.max(
                curr, Math.abs(C[k] - A[i]));
            
            
            


}
