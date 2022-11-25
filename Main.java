class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    System.out.println(Main.reverseString("1234"));
  }

   public static String reverseString(String s) {
        // feel free to comment this line out or delete it

        char ch;

        String result = "";
        for(int i=s.length()-1; i>=0; i--){
            ch = s.charAt(i);
            result += ch;
        }

        return result;

        //throw new RuntimeException("Todo! Needs implementation...");

    }
}