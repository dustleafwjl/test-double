package mockite;


import mock.DoorPaneMock;
import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
//    @Mock
//    DoorPanel doorPanelMock = new DoorPanel();
    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel doorPanelMock = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanelMock);
        securityCenter.switchOn();
        verify(doorPanelMock).close();
    }
}
