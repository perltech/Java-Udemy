public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics here
        theMonitor.drawPixelAt(1250, 50, "yellow");
    }
}

