public class MultiplesOf3And5 {

  public int multiplesOf3And5(int number) {
    if(number <= 0) return 0;
    int sum = 0;
    for(int i = 0; i < number; i++){
      if(i % 3 == 0 || i % 5 == 0) sum += i;
    }
    return sum;
  }
}
