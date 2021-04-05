class Solution {
    public int[] constructArray(int n, int k) {
        //1.建立数组1~n
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1; 
        }
        //2.if k = 1 则不用翻转直接输出
        if(k == 1) {
            return arr;
        }
        //3.if k > 1 则翻转k-1次，保留前m项
        for(int m = 1; m < k; m++) {
            reverse(arr, m, n-1);
        }
        return arr;
    }
    //4.reverse函数 翻转[i,j]之间的数
    void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}