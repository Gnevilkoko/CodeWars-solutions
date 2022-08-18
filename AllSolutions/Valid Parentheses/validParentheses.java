public class Solution{
  
  public static boolean validParentheses(String parens)
  {
    int needClose = 0;
    for(int i = 0; i < parens.length(); i++){
      if(parens.charAt(i) == '('){
        needClose++;
      } else if(parens.charAt(i) == ')' && needClose > 0){
        needClose--;
      } else if(parens.charAt(i) == ')' && needClose <= 0){
        return false;
      }
    }
    return needClose == 0;
  }
}
