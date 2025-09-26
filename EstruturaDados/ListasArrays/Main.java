package EstruturaDados.ListasArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Arrays
        int[] codes = {100, 200};
        System.out.println(codes.length);
        System.out.println(codes[0]);
        System.out.println(codes[1]);

        int[] codes2 = {codes[0], codes[1], 300};
        System.out.println(Arrays.toString(codes2));

        // List - ArrayList
        List<Integer> codes3 = new ArrayList<>();
        codes3.add(codes2[0]);
        codes3.add(codes2[2]);
        codes3.add(400);
        codes3.forEach(System.out::println);

    }

}
