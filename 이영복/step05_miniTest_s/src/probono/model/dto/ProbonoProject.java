<<<<<<< HEAD:1.Ïã§ÏäµLab/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
//Ω«¡¶ ¡¯«‡µ«¥¬ ¿Á¥… ±‚∫Œ «¡∑Œ¡ß∆Æ ¡§∫∏ ∫∏¿Ø ≈¨∑ß
/*±‚∫Œ¿⁄, ºˆ«˝¿⁄, ±‚∫Œ ¡æ∑˘, ±‚∫Œµ«¥¬ Ω«¡¶ ≥ªøÎ 
 * 
 */

=======
// Ω«¡¶ ¡¯«‡µ«¥¬ ¿Á¥… ±‚∫Œ «¡∑Œ¡ß∆Æ ¡§∫∏ ∫∏¿Ø ≈¨∑°Ω∫
/*
 * ±‚∫Œ¿⁄, ºˆ«˝¿⁄, ±‚∫Œ ¡æ∑˘, ±‚∫Œµ«¥¬ Ω«¡¶ ≥ªøÎ
 */
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:Ïù¥ÏòÅÎ≥µ/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
package probono.model.dto;

public class ProbonoProject {

<<<<<<< HEAD:1.Ïã§ÏäµLab/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
	private String probonoProjectName; //«ˆ «¡∑Œ¡ß∆Æ ¿Ã∏ß 
	private Probono probono; //±‚∫Œ ¡æ∑˘
	private Activist activist; //±‚∫Œ¿⁄
	private Recipient receive; // ºˆ«˝¿⁄ 
=======
	private String probonoProjectName; // «ˆ «¡∑Œ¡ß∆Æ ¿Ã∏ß
	private Probono probono; // ±‚∫Œ ¡æ∑·
	private Activist activist; // ±‚∫Œ¿⁄
	private Recipient receive; // ºˆ«˝¿⁄
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:Ïù¥ÏòÅÎ≥µ/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
	private String projectContent; // ±‚∫Œµ«¥¬ Ω«¡¶ ≥ªøÎ

	public ProbonoProject() {
		super();
	}

	public ProbonoProject(String probonoProjectName, Probono probono,
			Activist activist, Recipient receive, String projectContent) {
		super();
		this.probonoProjectName = probonoProjectName;
		this.probono = probono;
		this.activist = activist;
		this.receive = receive;
		this.projectContent = projectContent;
	}

	public String getProbonoProjectName() {
		return probonoProjectName;
	}

	public void setProbonoProjectName(String probonoProjectName) {
		this.probonoProjectName = probonoProjectName;
	}

	public Probono getProbono() {
		return probono;
	}

	public void setProbono(Probono probono) {
		this.probono = probono;
	}

	public Activist getActivist() {
		return activist;
	}

	public void setActivist(Activist activist) {
		this.activist = activist;
	}

	public Recipient getReceive() {
		return receive;
	}

	public void setReceive(Recipient receive) {
		this.receive = receive;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. «¡∑Œ¡ß∆Æ∏Ì : ");
		builder.append(probonoProjectName);
		builder.append("\n2. ¿Á¥…±‚∫Œ≥ªøÎ : ");
		builder.append(probono);
		builder.append("\n3. ¿Á¥… ±‚∫Œ¿⁄ ¡§∫∏: ");
		builder.append(activist);
		builder.append("\n4. ºˆ«˝¿⁄ ¡§∫∏: ");
		builder.append(receive);
		builder.append("\n5. «¡∑Œ¡ß∆Æ¡¶∞¯≥ªøÎ : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}
