import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JadenCase {

  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.length() <= 0) return null;
    List<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < words.size(); i++){
      result.append(words.get(i).substring(0,1).toUpperCase())
        .append(words.get(i).substring(1));
      if(i < words.size()-1) result.append(" ");
    }
    return result.toString();
  }
}
