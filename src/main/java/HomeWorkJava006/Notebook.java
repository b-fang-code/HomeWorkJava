package HomeWorkJava006;

public class Notebook {
    String brand;
    Integer ramSize;
    Integer ssdSize;
    String cpuBrand;
    Integer screenDiagonal;

    @Override
    public String toString() {
        return "Ноутбук {" +
                "Фирмы'" + brand + '\'' +
                ", Оперативная память=" + ramSize +
                ", Размер жесткого диска=" + ssdSize +
                ", Процессор фирмы='" + cpuBrand + '\'' +
                ", Диагональ экрана=" + screenDiagonal +
                '}';
    }
    public void addNotebook (String brand, Integer ramSize, Integer ssdSize, String cpuBrand,
                             Integer screenDiagonal){
        this.brand = brand;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
        this.cpuBrand = cpuBrand;
        this.screenDiagonal = screenDiagonal;

    }
}
