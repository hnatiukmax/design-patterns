package structural.adapter.example1;

/**
 * Адаптер — это структурный паттерн проектирования, который позволяет объектам
 * с несовместимыми интерфейсами работать вместе.
 */
public class MemoryCardToUSBAdapter implements USB {

    private final MemoryCard memoryCard;

    public MemoryCardToUSBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        memoryCard.insert();
        memoryCard.copyData();
    }
}
