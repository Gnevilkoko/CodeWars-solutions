import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int peopleInBus = 0;
    for(int[] stop : stops){
      peopleInBus += stop[0];
      peopleInBus -= stop[1];
    }
    return peopleInBus;
  }
}
