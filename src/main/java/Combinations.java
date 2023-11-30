import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {

    public static void main(String[] args) {
        String input = "234";
        List<String> combination = letterCombinations(input);
        for (String comb : combination){
            System.out.print(comb + " ");
        }
    }
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
        if (digits.length() == 0){
            return result;
        }

        HashMap<Character, String > harflar = new HashMap<>();
        harflar.put('2',"abc");
        harflar.put('3',"def");
        harflar.put('4', "ghi");
        harflar.put('5',"jkl");
        harflar.put('6',"mno");
        harflar.put('7',"pqrs");
        harflar.put('8',"tuv");
        harflar.put('9',"wxyz");

        combination(result, harflar, digits, "",0);

        return result;
    }
    public static void combination(List<String> res, Map<Character, String> harflar, String sonlar, String current, int index){
        if (index == sonlar.length()){
            res.add(current);
            return;
        }
        char son = sonlar.charAt(index);
        String harf = harflar.get(son);
        for (int i = 0; i < harf.length(); i++){
            combination(res, harflar, sonlar, current + harf.charAt(i), index+1);
        }

    }
}
