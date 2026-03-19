class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }
}