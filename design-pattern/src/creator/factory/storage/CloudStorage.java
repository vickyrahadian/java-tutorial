package creator.factory.storage;

public class CloudStorage implements Storage {
    private String provider;

    public CloudStorage(String provider) {
        this.provider = provider;
    }

    public void simpan(String data) {
        System.out.println("Menyimpan data " + data + " di cloud provider " + provider);
    }
}