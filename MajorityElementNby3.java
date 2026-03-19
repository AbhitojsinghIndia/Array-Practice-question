class MajorityElementNby3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2, 2};
        int n = arr.length;

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 0;

            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) continue;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 3) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No majority element");
        }
    }
}