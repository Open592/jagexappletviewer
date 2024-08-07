package com.jagex.signlink;

import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;

public final class SignLink implements Runnable {

	private Interface10 anInterface10_1;

	public FileOnDisk[] aFileOnDiskArray1;

	private Message headMessage = null;

	private Message tailMessage = null;

	public FileOnDisk aFileOnDisk_1 = null;

	public Applet hostApplet = null;

	private boolean isShuttingDown = false;

	public FileOnDisk aFileOnDisk_2 = null;

	public FileOnDisk aFileOnDisk_3 = null;

	private final String gameName;

	private final int modewhat;

	public EventQueue systemEventQueue;

	private final Thread thread;

	public static String systemUserHome;

	public static String systemOSName;

	public static String systemOSArch;

	public static String systemOSVersion;

	public static String javaVendor;

	public static String javaVersion;

	public static String systemOSNameLowerCase;

	public static Method setFocusTraversalKeysEnabled;

	public static Method setFocusCycleRoot;

	public static Hashtable aHashtable1 = new Hashtable(16);

	public static final int anInt1987 = 3;

	public static volatile long refuseConnectionsUntilTimestamp = 0L;

	public SignLink(Applet hostApplet, int modewhat, String gameName, int arg3) throws Exception {
		this.hostApplet = hostApplet;
		this.gameName = gameName;
		javaVersion = "1.1";
		this.modewhat = modewhat;
		javaVendor = "Unknown";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception ignored) {
		}

		try {
			systemOSName = System.getProperty("os.name");
		} catch (Exception local48) {
			systemOSName = "Unknown";
		}

		systemOSNameLowerCase = systemOSName.toLowerCase();

		try {
			systemOSArch = System.getProperty("os.arch").toLowerCase();
		} catch (Exception local59) {
			systemOSArch = "";
		}

		try {
			systemOSVersion = System.getProperty("os.version").toLowerCase();
		} catch (Exception local67) {
			systemOSVersion = "";
		}

		try {
			systemUserHome = System.getProperty("user.home");
			if (systemUserHome != null) {
				systemUserHome = systemUserHome + "/";
			}
		} catch (Exception ignored) {
		}

		if (systemUserHome == null) {
			systemUserHome = "~/";
		}

		try {
			this.systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable ignored) {
		}

		try {
			if (hostApplet == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = hostApplet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception ignored) {
		}

		try {
			if (hostApplet == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = hostApplet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception ignored) {
		}

		this.isShuttingDown = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	public Message method1726(int arg0, int arg1, int arg2) {
		return this.emitMessage((arg2 << 16) + arg0, arg1 << 16, null, 0, 6);
	}

	public Message method1727(Frame arg0) {
		return this.emitMessage(0, 0, arg0, 0, 7);
	}

	public Message emitConnectionInitializationMessage(String host, int port) {
		return this.emitMessage(port, 0, host, 0, 1);
	}

	private byte[] method1729(String arg0, int arg1) {
		Message local7 = this.method1749(arg0, 0, 0, 21);
		if (arg1 != 14) {
			this.resolveCacheFilePath(null);
		}
		return (byte[]) local7.output;
	}

	public Message method1730(Class[] arg0, String arg1, Class arg2) {
		return this.emitMessage(0, 0, new Object[] { arg2, arg1, arg0 }, 0, 8);
	}

	private Message method1731(byte arg0) {
		return arg0 == -128 ? this.emitMessage(0, 0, null, arg0 + 128, 18) : null;
	}

	public void shutdown() {
		synchronized (this) {
			this.isShuttingDown = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException ignored) {
		}

		if (this.aFileOnDisk_3 != null) {
			try {
				this.aFileOnDisk_3.close();
			} catch (IOException ignored) {
			}
		}

		if (this.aFileOnDisk_1 != null) {
			try {
				this.aFileOnDisk_1.close();
			} catch (IOException ignored) {
			}
		}

		if (this.aFileOnDiskArray1 != null) {
            for (FileOnDisk fileOnDisk : this.aFileOnDiskArray1) {
                if (fileOnDisk != null) {
                    try {
                        fileOnDisk.close();
                    } catch (IOException ignored) {
                    }
                }
            }
		}

		if (this.aFileOnDisk_2 != null) {
			try {
				this.aFileOnDisk_2.close();
			} catch (IOException ignored) {
			}
		}
	}

	public File resolveCacheFilePath(String filename) {
		return resolveCacheFilePath(filename, this.modewhat, this.gameName);
	}

	public Interface10 method1734() {
		return this.anInterface10_1;
	}

	private Message method1735(int arg0, Component arg1, boolean arg2) {
		if (arg0 != -23993) {
			this.refuseConnectionForFiveSeconds();
		}

		return this.emitMessage(arg2 ? 1 : 0, 0, arg1, 0, 15);
	}

	public Message method1736(Class arg0) {
		return this.emitMessage(0, 0, arg0, 0, 20);
	}

	private Message emitMessage(int integerInput, int arg1, Object genericInput, int arg3, int messageType) {
		Message message = new Message();

		message.integerInput = integerInput;
		message.genericInput = genericInput;
		message.type = messageType;

		synchronized (this) {
			if (this.tailMessage == null) {
				this.tailMessage = this.headMessage = message;
			} else {
				this.tailMessage.next = message;
				this.tailMessage = message;
			}

			this.notify();

			return message;
		}
	}

	public Message method1738(String arg0) {
		return this.emitMessage(0, 0, arg0, 0, 12);
	}

	public Message method1739(int arg0) {
		return this.emitMessage(arg0, 0, null, 0, 3);
	}

	public void method1740(Class arg0) throws Exception {
		Class[] parameterTypes = new Class[] {
				Class.forName("java.lang.Class"),
				Class.forName("java.lang.String")
		};
		Runtime runtime = Runtime.getRuntime();
		Method setAccessible = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		Method loadMethod;

		if (!systemOSNameLowerCase.startsWith("mac")) {
			loadMethod = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", parameterTypes);
			setAccessible.invoke(loadMethod, Boolean.TRUE);
			loadMethod.invoke(runtime, arg0, "jawt");
			setAccessible.invoke(loadMethod, Boolean.FALSE);
		}

		loadMethod = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", parameterTypes);
		setAccessible.invoke(loadMethod, Boolean.TRUE);

		if (!systemOSNameLowerCase.startsWith("win")) {
			throw new Exception();
		}

		loadMethod.invoke(runtime, arg0, this.resolveCacheFilePath("sw3d.dll").toString());
		setAccessible.invoke(loadMethod, Boolean.FALSE);
	}

	public Message emitThreadInitializationMessage(int arg0, Runnable target) {
		return this.emitMessage(arg0, 0, target, 0, 2);
	}

	private Message method1742(Transferable arg0, byte arg1) {
		return arg1 == 87 ? this.emitMessage(0, 0, arg0, 0, 19) : null;
	}

	public Message method1743(Point arg0, Component arg1, int arg2, int[] arg3, int arg4) {
		return this.emitMessage(arg2, arg4, new Object[] { arg1, arg3, arg0 }, 0, 17);
	}

	public Message method1744(String arg0) {
		return this.emitMessage(0, 0, arg0, 0, 16);
	}

	public Message method1745() {
		return this.emitMessage(0, 0, null, 0, 5);
	}

	public Message method1746(Class arg0) {
		return this.emitMessage(0, 0, arg0, 0, 11);
	}

	private Message method1747(Component arg0, boolean arg1, int arg2, int arg3) {
		if (arg1) {
			aHashtable1 = null;
		}
		Point local7 = arg0.getLocationOnScreen();
		return this.emitMessage(arg2 + local7.x, local7.y + arg3, null, 0, 14);
	}

	private Message method1749(Object genericInput, int arg1, int integerInput, int messageType) {
		Message message = new Message();

		synchronized (message) {
			message.type = messageType;
			message.integerInput = integerInput;
			message.genericInput = genericInput;

			synchronized (this) {
				if (arg1 != 0) {
					return null;
				}

				if (this.tailMessage == null) {
					this.tailMessage = this.headMessage = message;
				} else {
					this.tailMessage.next = message;
					this.tailMessage = message;
				}

				this.notify();
			}

			try {
				message.wait();
			} catch (InterruptedException ignored) {
			}

			return message;
		}
	}

	public Message method1750(Class arg0, String arg1) {
		return this.emitMessage(0, 0, new Object[] { arg0, arg1 }, 0, 9);
	}

	public Message emitOpenURLConnectionMessage(URL url) {
		return this.emitMessage(0, 0, url, 0, 4);
	}

	private Message method1752(String arg0, int arg1) {
		if (arg1 <= 71) {
			this.method1747(null, true, 35, 67);
		}
		return this.emitMessage(0, 0, arg0, 0, 21);
	}

	public void refuseConnectionForFiveSeconds() {
		refuseConnectionsUntilTimestamp = MonotonicClock.getCurrentTimeInMilliseconds() + 5000L;
	}

	@Override
	public void run() {
		while (true) {
			Message message;

			synchronized (this) {
				while (true) {
					if (this.isShuttingDown) {
						return;
					}

					if (this.headMessage != null) {
						message = this.headMessage;
						this.headMessage = this.headMessage.next;

						if (this.headMessage == null) {
							this.tailMessage = null;
						}

						break;
					}

					try {
						this.wait();
					} catch (InterruptedException ignored) {
					}
				}
			}
			try {
				int messageType = message.type;

				if (messageType == 1) {
					if (refuseConnectionsUntilTimestamp > MonotonicClock.getCurrentTimeInMilliseconds()) {
						throw new IOException();
					}

					message.output = new Socket(InetAddress.getByName((String) message.genericInput), message.integerInput);
				} else if (messageType == 2) {
					Thread thread = new Thread((Runnable) message.genericInput);

					thread.setDaemon(true);
					thread.start();
					thread.setPriority(message.integerInput);

					message.output = thread;
				} else if (messageType == 4) {
					if (refuseConnectionsUntilTimestamp > MonotonicClock.getCurrentTimeInMilliseconds()) {
						throw new IOException();
					}

					message.output = new DataInputStream(((URL) message.genericInput).openStream());
				} else {
					Object[] local107;

					if (messageType == 8) {
						local107 = (Object[]) message.genericInput;
						message.output = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (messageType == 9) {
						local107 = (Object[]) message.genericInput;
						message.output = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (messageType == 18) {
						Clipboard local168 = Toolkit.getDefaultToolkit().getSystemClipboard();

						message.output = local168.getContents(null);
					} else if (messageType == 19) {
						Transferable local152 = (Transferable) message.genericInput;
						Clipboard local155 = Toolkit.getDefaultToolkit().getSystemClipboard();

						local155.setContents(local152, null);
					} else {
						throw new Exception("");
					}
				}

				message.status = 1;
			} catch (ThreadDeath local198) {
				throw local198;
			} catch (Throwable local201) {
				message.status = 2;
			}
			synchronized (message) {
				message.notify();
			}
		}
	}

	public static File resolveCacheFilePath(String filename, int modewhat, String gameName) {
		File local4 = (File) aHashtable1.get(filename);

		if (local4 != null) {
			return local4;
		}

		String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", systemUserHome, "/tmp/", "" };
		String[] local66 = new String[] { ".jagex_cache_" + modewhat, ".file_store_" + modewhat };

		for (int local68 = 0; local68 < 2; local68++) {
            for (String s : local66) {
                for (String string : local43) {
                    String local105 = string + s + "/" + (gameName == null ? "" : gameName + "/") + filename;
                    RandomAccessFile local107 = null;

                    try {
                        File local112 = new File(local105);

                        if (local68 != 0 || local112.exists()) {
                            String local121 = string;

                            if (local68 != 1 || local121.length() <= 0 || (new File(local121)).exists()) {
                                (new File(string + s)).mkdir();

                                if (gameName != null) {
                                    (new File(string + s + "/" + gameName)).mkdir();
                                }

                                local107 = new RandomAccessFile(local112, "rw");
                                int local185 = local107.read();
                                local107.seek(0L);
                                local107.write(local185);
                                local107.seek(0L);
                                local107.close();
                                aHashtable1.put(filename, local112);

                                return local112;
                            }
                        }
                    } catch (Exception e) {
                        try {
                            if (local107 != null) {
                                local107.close();
                            }
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
		}
		throw new RuntimeException();
	}

	public boolean method1754() {
		return false;
	}
}
