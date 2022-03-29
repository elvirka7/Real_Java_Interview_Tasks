package Cognizant;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Find the longest common substring among two strings
SOLUTION BY MANAS
 */
public class Map_LongestSubstring {
        public static void main(String[] args) {
            String s1 =   "aaabbbccccuytutyutututycddddeeeeee";
            String s2 =   "zzzzzccczzzzccddddeeeerrreeee";
            String[] ar1 = s1.split("");
            String[] ar2 = s2.split("");
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            for (String each : ar1) map1.put(each, Collections.frequency(Arrays.asList(ar1), each));
            for (String each : ar2) map2.put(each, Collections.frequency(Arrays.asList(ar2), each));

            int max=0;
            String maxChar= "";
            for (Map.Entry<String, Integer> each1 : map1.entrySet()) {
                for (Map.Entry<String, Integer> each2 : map2.entrySet()) {
                    if (each1.getKey().equals(each2.getKey()) && each1.getValue().equals(each2.getValue())){
                        if ( each1.getValue()>max) {
                            max = each1.getValue();
                            maxChar = each1.getKey();
                        }
                    }
                }
            }
            String result="";
            for (int i = 0; i < max; i++) {
                result +=maxChar;
            }
            System.out.println(result);
        }
    }
