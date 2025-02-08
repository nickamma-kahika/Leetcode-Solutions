package Daily_Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Leetcode2349_Design_a_Number_Container_System {
    public static void main(String[] args) {
        String[] fun_to_implement = {"NumberContainers", "find", "change", "change", "change", "change", "find", "change", "find"};
        int[][] values = {{}, {10}, {2, 10}, {1, 10}, {3, 10}, {5, 10}, {10}, {1, 20}, {10}};
        ArrayList<Object> result = new ArrayList<>();

        NumberContainers nc = new NumberContainers();
        for (int i = 0; i < fun_to_implement.length; i++) {
            if (fun_to_implement[i] == "NumberContainers") {
                result.add("null");
            } else if (fun_to_implement[i] == "change") {
                nc.change(values[i][0], values[i][1]);
                result.add("null");
            } else if (fun_to_implement[i] == "find") {
                result.add(nc.find(values[i][0]));
            }
        }

        System.out.println(result);

    }
}
class NumberContainers {
    private HashMap<Integer, Integer> idx_to_num;
    private HashMap<Integer, TreeSet<Integer>> num_to_idxs;
    public NumberContainers() {
        idx_to_num = new HashMap<>();
        num_to_idxs = new HashMap<>();
    }

    public void change(int index, int number) {
        if(idx_to_num.containsKey(index)){
            int oldNumber = idx_to_num.get(index);
            num_to_idxs.get(oldNumber).remove(index);
            if(num_to_idxs.get(oldNumber).isEmpty()){
                num_to_idxs.remove(oldNumber);
            }
        }
        idx_to_num.put(index, number);
        num_to_idxs.putIfAbsent(number, new TreeSet<>());
        num_to_idxs.get(number).add(index);

    }

    public int find(int number) {
        if(!num_to_idxs.containsKey(number) || num_to_idxs.get(number).isEmpty()){
            return -1;
        }
        return num_to_idxs.get(number).first();
    }
}

