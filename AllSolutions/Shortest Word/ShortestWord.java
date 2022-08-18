public class ShortestWord {
    public static int findShort(String s) {
      String[] words = s.split(" ");
      int min = 100;
      for(String word : words){
        if(word.length() < min) min = word.length();
      }
      return min;
    }
}
