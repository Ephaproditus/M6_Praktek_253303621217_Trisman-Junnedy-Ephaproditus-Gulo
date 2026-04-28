public class MainHub {
    public static void main(String[] args) {
        // 1. Instansiasi & Upcasting
        // Objek SmartLamp disimpan dalam referensi bertipe SmartDevice
        SmartDevice myDevice = new SmartLamp("192.168.1.10");

        // 2. Memanggil method turnOn()
        myDevice.turnOn();

        // 3. Downcasting
        // Karena referensi 'myDevice' bertipe SmartDevice, ia tidak kenal 'connectWifi'
        // Maka kita harus mengubah tipe referensinya kembali ke SmartLamp atau Connectable
        
        // // Downcasting: Mengonversi referensi myDevice kembali ke tipe SmartLamp 
        // // agar bisa mengakses method connectWifi() yang ada di interface Connectable.
        SmartLamp downcastedLamp = (SmartLamp) myDevice;
        downcastedLamp.connectWifi();
    }
}