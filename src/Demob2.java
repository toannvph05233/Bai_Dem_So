public class Demob2 {
    public static void main(String[] args) {
        int count = 1;
        int i = 13;

        while (count <= 20) {
            int j = 2;
            boolean check = true;
            while (j <= i / 2) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                if (count == 20) {
                    System.out.println(i);
                }
                count++;
            }
            i++;
        }

        /////
        int count = 1;
        for (int i = 13; count <= 20; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (count == 20 && check) {
                System.out.println(i);
            }
            if (check) {
                count++;
            }

        }


    }

}
