package mock;

import org.junit.jupiter.api.Assertions;

public class DoorPaneMock extends DoorPanel{
    boolean isClose = false;
    DoorPaneMock() {
        super();
    }

    public void close() {
//        close();
        isClose = true;
    }
    public void verityCloseDone() {
        Assertions.assertEquals(true, isClose);
    }
}
