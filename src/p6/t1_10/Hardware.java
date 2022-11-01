package p6.t1_10;

import p4.t4.ModelName;
import p4.t4.Monitor;
import p4.t4.Processor;

public interface Hardware {

    public void getSpecs(ModelName name, Processor proc, Memory ram, Monitor monitor);

}
