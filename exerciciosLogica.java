public class exerciciosLogica {
    public boolean nearHundred(int n) {

        if (n > 0 && Math.abs(n) >= 90 && Math.abs(n) <= 110 ) {
            return true;
        } else return n > 0 && Math.abs(n) >= 190 && Math.abs(n) <= 210;
    }

    public String backAround(String str) {
        char letra = str.charAt(str.length() - 1);
        return letra + str + letra;
    }

    public boolean mixStart(String str) {
        if (str.contains("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lastDigit(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a % 10 == b % 10;
        }else {
            return false;
        }
    }

    public String front3(String str) {

        String tresPrimeiros = str.substring(0, 2);

        if (str.length() <= 3) {
            return str+str+str;
        } else {
            return tresPrimeiros+tresPrimeiros+tresPrimeiros;
        }

    }

    public String delDel(String str) {

        if (str.startsWith("del", 1)) {
            return str.replace("del", "");
        } else {
            return str;
        }

    }

    public String endUp(String str) {

        int letras = str.length();
        if (letras <= 3) {
            return str.toUpperCase();
        } else {
            String palavra = str.substring(str.length() - 3);
            String palavraSem3 = str.replace(palavra, "");
            return palavraSem3 + palavra.toUpperCase();
        }

    }

}




