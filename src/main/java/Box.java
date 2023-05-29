public class Box {
    private int width;
    private int height;
    private int length;
    private int volume;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;

        calculateVolume();
        printVolume();
    }

    private void calculateVolume() {
        volume = width * height * length;
    }

    public void printVolume() {
        System.out.println("Объем коробки: " + volume);
    }
}

