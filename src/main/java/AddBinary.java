public class AddBinary {
    public String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        int max = Math.max(al, bl);
        String prA = addTrailingZeroes(a, max);
        String prB = addTrailingZeroes(b, max);
        String res = "";
        char carry = '0';

        for(int i = max - 1; i >= 0; i--) {
            char at = prA.charAt(i);
            char bt = prB.charAt(i);
            char d = plus(at, bt);
            if(carry == '1') {
                if(d == '0') {
                    d = '1';
                    if(at == '1' && bt == '1') {
                        carry = '1';
                    }
                    else {
                        carry = '0';
                    }
                }
                else {
                    d = '0';
                    carry = '1';
                }
            }
            else {
                if(at == bt && at == '1')
                    carry = '1';
            }
            res = d + res;
        }
        if(carry == '1')
            res = "1" + res;
        return res;
    }
    public char plus(char a, char b) {
        if (a == '0' && b == '0')
        {
            return '0';
        }
        else if (a == '0' && b == '1') {
            return '1';
        }
        else if (a == '1' && b == '0') {
            return '1';
        }
        else if (a == '1' && b == '1'){
            return '0';
        }
        return '2';
    }

    public String addTrailingZeroes(String s, int max) {
        StringBuilder aBuilder = new StringBuilder(s);
        for(int i = max - aBuilder.length() - 1; i >= 0; i--) {
            if(i == -1)
                break;
            aBuilder.insert(0, "0");
        }
        return aBuilder.toString();
    }
}
