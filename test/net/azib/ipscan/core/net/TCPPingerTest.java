package net.azib.ipscan.core.net;

import net.azib.ipscan.config.Platform;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assume.assumeFalse;

public class TCPPingerTest extends AbstractPingerTest {
	public TCPPingerTest() throws Exception {
		super(TCPPinger.class);
	}

	@Test @Override
	public void pingAlive() throws IOException {
		assumeFalse(Platform.WINDOWS);
		super.pingAlive();
	}
}
