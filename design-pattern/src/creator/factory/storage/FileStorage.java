package creator.factory.storage;

public class FileStorage implements Storage {

    private String namafile;

    public FileStorage(String namafile) {
        this.namafile = namafile;
    }

    public void simpan(String teks) {
        System.out.println("Menyimpan teks " + teks + " di file " + namafile);
    }
}