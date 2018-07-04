package step02.hasa;

public class Engine {
	String engineName = "파워엔진";
	int cc = 100;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String engineName, int cc) {
		super();
		this.engineName = engineName;
		this.cc = cc;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		System.out.println("set");
		this.engineName = engineName;
	}
	public int getCc() {
		return cc;
	}
	public int getPowerCc() {
		return cc + 1000;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
