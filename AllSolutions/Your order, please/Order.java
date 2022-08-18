public class Order {
  public static String order(String str) {
    if(str.length() <= 0) return "";
    String[] words = str.split(" ");
    String result = "";
    int counter = 1;
    for(int i = 0; i < words.length; i++){
      for(String word : words){
        if(word.contains(String.valueOf(counter))){
          result += word + " ";
          counter++;
        }
      }
    }
    return result.substring(0, result.length()-1);
  }
}
