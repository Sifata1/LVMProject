import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<PhysicalDrive> drives = new ArrayList<PhysicalDrive>();
        ArrayList<PhysicalVolume> pvs = new ArrayList<PhysicalVolume>();

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the LVM System!");
        boolean exit = true;
        while (exit) {
            System.out.println("cmd#: ");
            String input = s.nextLine();
            if (input.contains("install-drive")) {
                System.out.println("Enter the name of the drive.");
                String name = s.nextLine();
                System.out.println("Enter the storage of the drive.");
                int storage = s.nextInt();
                PhysicalDrive drive1 = new PhysicalDrive(name, storage);
                drives.add(drive1);
                System.out.println("Drive " + name + " installed");
            } else if (input.contains("list-drives")) {
                for (PhysicalDrive drive : drives) {
                    System.out.println(drive.toString());
                }
            } else if (input.contains("pvcreate")) {
                System.out.println("Enter the name of the drive.");
                String drive = s.nextLine();
                System.out.println("Enter the name of the PhysicalVolume.");
                String name = s.nextLine();
                PhysicalDrive drive2 = null;
                for (PhysicalDrive pd : drives) {
                    if (pd.getName().equals(name)) {
                        drive2 = pd;
                    }
                }
                PhysicalVolume pv = new PhysicalVolume(name, drive2);
                pvs.add(pv);
                System.out.println(name + " installed");
            } else if (input.contains("pvlist")) {
                for (PhysicalVolume pV : pvs) {
                    System.out.println(pV.toString());
                }
            }
        }
    }
}