public class Table {
    private int legNumber;
    private String woodGrain;
    private int chairNumber;

    public Table(int legNumber, String woodGrain, int chairNumber) {
        this.legNumber = legNumber;
        this.woodGrain = woodGrain;
        this.chairNumber = chairNumber;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public String getWoodGrain() {
        return woodGrain;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    private void sitAtTable(int numberOfPeople) {
        if(numberOfPeople > chairNumber) {
            System.out.println("Not enough chairs.");
        }
        System.out.println("sitAtTable() executed.");
    }
}
