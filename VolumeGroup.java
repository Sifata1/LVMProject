import java.util.ArrayList;

public class VolumeGroup extends LVM {
    private ArrayList<PhysicalVolume> physicalVolumes;
    public VolumeGroup(String name, ArrayList<PhysicalVolume> physicalVolumes) {
        super(name);
        this.physicalVolumes = physicalVolumes;
    }

    public ArrayList<PhysicalVolume> getPhysicalVolumes() {
        return physicalVolumes;
    }



    public int getTotalSize() {
        int totalSize = 0;
        for (PhysicalVolume pv : physicalVolumes) {
            totalSize += pv.getSize();
        }
        return totalSize;
    }

//    public int getFreeSpace() {
//        int usedSpace = 0;
//        for (LogicalVolume lv : logicalVolumes) {
//            usedSpace += lv.getSize();
//        }
//        return getTotalSize() - usedSpace;
//    }
}
