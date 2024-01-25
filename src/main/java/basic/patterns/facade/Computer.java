package basic.patterns.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public void start() {
        this.cpu.start();
        this.memory.start();
        this.hardDrive.start();
    }
}
