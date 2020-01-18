public class Telecomanda {

    private Proiector epson;

    public Telecomanda(Proiector epson) {
        this.epson = epson;
    }

    public void switchOn() {
        epson.switchOn();
    }

    public void switchOff() {
        epson.switchOff();
    }

    public void showSources() {
        epson.showSources();
    }

    public void selectSource(String source) {
        epson.selectSource(source);
    }

    public void volumeUp() {
        epson.increaseVolume();
    }

    public void volumeDown() {
        epson.decreaseVolume();
    }

    public void zoomIn() {
        epson.increaseZoom();
    }

    public void zoomOut() {
        epson.decreaseZoom();
    }

    public void pageUp() {
        epson.switchPageUp();
    }

    public void pageDown() {
        epson.switchPageDown();
    }

    public void freeze() {
        epson.freeze();
    }

    public void unfreeze() {
        epson.unfreeze();
    }
}
