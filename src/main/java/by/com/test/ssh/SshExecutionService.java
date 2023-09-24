package by.com.test.ssh;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.IOException;
import java.io.InputStream;
import org.apache.cxf.helpers.IOUtils;

public class SshExecutionService {

  private final Session session;

  public SshExecutionService(Session session) {
    this.session = session;
  }

  public void disconnect() {
    session.disconnect();
  }

  public String executeCommand(String command) throws JSchException, IOException {
    Channel channel = session.openChannel("exec");
    ((ChannelExec) channel).setCommand(command);
    InputStream inputStream = channel.getInputStream();
    channel.connect();
    String result = IOUtils.readStringFromStream(inputStream);
    channel.disconnect();
    return result.trim();
  }
}
