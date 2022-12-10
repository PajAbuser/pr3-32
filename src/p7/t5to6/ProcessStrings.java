package p7.t5to6;

public class ProcessStrings implements StringHandable{
    @Override
    public int countLiterals(String s) {
        return s.length();
    }

    @Override
    public String task2(String s) {
        String res = "";
        int size = s.length();
        for(int i = 1; i < size;i+=2){
            res += s.toCharArray()[i];
        }
        return res;
    }
    @Override
    public String reverse(String s) {
        String res = "";
        int size = s.length();
        for(int i = size - 1; i != 0; i--){
            res += s.toCharArray()[i];
        }
        return res;
    }
}
