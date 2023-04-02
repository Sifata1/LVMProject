import java.util.ArrayList;
import java.util.UUID;

// Base class for all LVM components
public class LVM {
    protected String name;
    protected UUID uuid;

    public LVM(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }


}