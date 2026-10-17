package meanArray;

public class productOfExceptSelf {

    public static int[] ProductExceptSelf(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        // Step 1: Left product
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = leftProduct;
            leftProduct = leftProduct * arr[i];
        }

        // Step 2: Right product
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = ProductExceptSelf(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
    

    

