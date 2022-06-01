package creator.factory.storage;

public class DatabaseStorage implements Storage {
    private String namaDb;

    public DatabaseStorage(String namaDb) {
        this.namaDb = namaDb;
    }

    public void simpan(String data) {
        System.out.println("Menyimpan data " + data + " di database " + namaDb);
    }
}