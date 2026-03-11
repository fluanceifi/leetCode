class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        int n = num1.length(), m = num2.length();
        int[] result = new int[n + m];


        for(int i = n - 1 ; i >= 0 ; i--){
            for(int j = m - 1 ; j >= 0 ; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j; 
                int p2 = i + j + 1;

                int total = mul + result[p2];

                result[p2] = total % 10;
                result[p1] += total / 10;
            }
        }

        for(int i : result){
            if(sb.length() == 0 && i == 0) continue;
            sb.append(i);
        }
        
        return sb.toString();
    }
}