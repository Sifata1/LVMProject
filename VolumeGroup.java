import java.util.ArrayList;

public class VolumeGroup extends LVM {
    private ArrayList<PhysicalVolume> physicalVolumes;
    private ArrayList<LogicalVolume> logicalVolumes;
    public VolumeGroup(String name, ArrayList<PhysicalVolume> physicalVolumes, ArrayList<LogicalVolume> logicalVolumes) {
        super(name);
        this.physicalVolumes = physicalVolumes;
        this.logicalVolumes = logicalVolumes;
    }

    public ArrayList<PhysicalVolume> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public ArrayList<LogicalVolume> getLogicalVolumes() {
        return logicalVolumes;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for (PhysicalVolume pv : physicalVolumes) {
            totalSize += pv.getSize();
        }
        return totalSize;
    }

    public int getFreeSpace() {
        int usedSpace = 0;
        for (LogicalVolume lv : logicalVolumes) {
            usedSpace += lv.getSize();
        }
        return getTotalSize() - usedSpace;
    }
}
