public class Main {
    public static void main(String[] args) {
       Table table = new Table(4,
               "Nordic Cherry", 4);

       Lamp lamp = new Lamp(100,"Grey",
       false);

       Sofa sofa = new Sofa(60.88,5,
               "Green");

       Room room = new Room(table,sofa,lamp);
       room.sitSofa();
       room.sitSofa();
    }
}
