package p6.t1_10;

public class Computer {

    private ModelName name;
    private Processor proc;
    private Memory ram;
    private Monitor monitor;

    public Computer(
        ModelName name,
        Processor proc,
        Memory ram,
        Monitor monitor)
    {
        this.name = name;
        this.proc = proc;
        this.ram = ram;
        this.monitor = monitor;
    }

    public ModelName getName() {
        return name;
    }

    public Processor getProc() {
        return proc;
    }

    public Memory getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                ", proc=" + proc.getName() +
                ", ram=" + ram.getName() +
                ", monitor=" + monitor.getName() +
                '}';
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
