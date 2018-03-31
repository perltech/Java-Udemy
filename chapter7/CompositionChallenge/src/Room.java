public class Room {
    private Table table;
    private Sofa sofa;
    private Lamp lamp;

    public Room(Table table, Sofa sofa, Lamp lamp) {
        this.table = table;
        this.sofa = sofa;
        this.lamp = lamp;
    }

    public void sitSofa() {
        sofa.sitDown();
    }
}
