package by.com.test.ssh;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.slf4j.Logger;

public class SshConnectionBuilder {
  private String host;
  private int port;
  private String user;
  private String password;

  public SshConnectionBuilder setHost(String host) {
    this.host = host;
    return this;
  }

  public SshConnectionBuilder setPort(int port) {
    this.port = port;
    return this;
  }

  public SshConnectionBuilder setUser(String user) {
    this.user = user;
    return this;
  }

  public SshConnectionBuilder setPassword(String password) {
    this.password = password;
    return this;
  }

  public SshConnectionBuilder setLogger(Logger logger) {
    return this;
  }

  public Session getSession() throws JSchException {
    return connect();
  }

  private Session connect() throws JSchException {
    Session session = new JSch().getSession(user, host, port);
    session.setPassword(password);
    session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
    session.setConfig("StrictHostKeyChecking", "no");
    session.connect();
    return session;
  }
}
