public class LogicalVolume extends LVM {
    private int size;
    private VolumeGroup volumeGroup;

    public LogicalVolume(String name, int size, VolumeGroup volumeGroup) {
        super(name);
        this.size = size;
        this.volumeGroup = volumeGroup;
    }

    public int getSize() {
        return size;
    }

    public VolumeGroup getVolumeGroup() {
        return volumeGroup;
    }
}