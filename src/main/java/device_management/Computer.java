package device_management;

import behaviours.IInput;
import behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;
    private String dataStream;

    private IOutput outputDevice;
    private IInput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public IInput getInputDevice(){
        return this.inputDevice;
    }

    public String inputData(String data){
        this.dataStream = data;
        return this.inputDevice.sendData(data);
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public String outputDataStream(){
        return this.dataStream;
    }
}
