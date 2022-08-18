public class Printer {
    
    public static String printerError(String s) {
        int errors = 0;
      for(int i = 0; i < s.length(); i++){
        int hashCode = s.substring(i, i+1).hashCode();
        if(hashCode < 97 || hashCode > 109) errors++;
      }
      return errors + "/" + s.length();
    }
}
