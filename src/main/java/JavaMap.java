
/*
You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query.
For each query, print the phone number of that person.
*/

import java.util.*;

public class JavaMap {
    public static void main(String[] argh) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if ((map.get(s)) == null)
                System.out.println("Not found");
            else
                System.out.println(s + "=" + map.get(s));

        }
    }
}