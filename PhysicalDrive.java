public class PhysicalDrive extends LVM {
    private int size;
    private String id;

    public PhysicalDrive(String name, int size) {
        super(name);
        this.size = size;
        id = String.valueOf(getUuid());
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return name + ": [" + uuid + "] [Total: " + size + " GB]";
    }

}
