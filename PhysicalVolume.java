public class PhysicalVolume extends LVM {
    private PhysicalDrive drive;

    public PhysicalVolume(String name, PhysicalDrive drive) {
        super(name);
        this.drive = drive;
    }

    public PhysicalDrive getDrive() {
        return drive;
    }

    public int getSize() {
        return drive.getSize();
    }

}