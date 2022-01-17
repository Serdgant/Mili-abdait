public class BonusMilesService {
    public int calculate(int price) {
        int ticket = price;
        int m = 20;
        int bonus = ticket / m;
        return bonus;
    }
}