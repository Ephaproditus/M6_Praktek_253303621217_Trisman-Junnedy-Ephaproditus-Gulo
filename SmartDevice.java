public abstract class SmartDevice {
    protected String ipAddress;

    // Constructor untuk inisialisasi IP Address
    public SmartDevice(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    // Abstract method: Wajib diimplementasikan oleh subclass
    public abstract void turnOn();
}