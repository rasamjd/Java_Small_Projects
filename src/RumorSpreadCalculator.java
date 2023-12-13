public class RumorSpreadCalculator {
  public static void main(String[] args) {

    int initialPeople = 2;
    int polulation = 1200000;
    int averageNewPeople = 2;
    calculateRumorSpread(initialPeople, polulation, averageNewPeople);
  }

  public static void calculateRumorSpread(int initial, int population, int average) {
    int days = 1;
    long informedPeople = initial;
    long newPeolpe;           
    long repeatedPeople;
    while (informedPeople <= population) {
      newPeolpe = (informedPeople * average);
      repeatedPeople = (informedPeople * newPeolpe) / population;   

      informedPeople = informedPeople + newPeolpe - (int)repeatedPeople;
      days++;
    }
    
    System.out.println("Initial number of people aware of the rumor: " + initial +
    "\nAverage new people informed daily: " + average +
    "\nThe population is " + population + " people." +
    "\nAnd the rumor will spread in approximately " + days + " days.");
  }
}