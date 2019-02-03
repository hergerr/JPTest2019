package Ex11;

public class A {
    public static void main(String[] args) {
        int i = 0, j = 0;
        et1: while (i < 2) {
            ++i;
            et2: for (; j < 3;) {
                System.out.print(" " + i + " " + j);
                while (j < 2) {
                    j++;
                    if (i == 1)
                        break et1;
                    else
                        continue et2;
                }
            }
        }
    }
}
