<<<<<<< HEAD:1.Ïã§ÏäµLab/step05_miniTest_s/src/probono/model/dto/Probono.java
//º¯ºˆ ¿Á¥… ±‚∫Œø° ¥Î«— ¡§∫∏ ∫∏¿Ø ≈¨∑ß
package probono.model.dto;

public class Probono {
	private String probonoId;//¿Á¥… ±‚∫Œ id
	private String probonoName;//¿Á¥… ±‚∫Œ ¿Ã∏ß
	private String probonoPurpose;//
=======
// º¯ºˆ ¿Á¥… ±‚∫Œø° ¥Î«— ¡§∫∏ ∫∏¿Ø ≈¨∑°Ω∫



package probono.model.dto;

public class Probono {
	private String probonoId; // ¿Á¥… ±‚∫Œ id
	private String probonoName; // ¿Á¥… ±‚∫Œ ¿Ã∏ß
	private String probonoPurpose; // ¿Á¥… ±‚∫Œ ∏Ò¿˚
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:Ïù¥ÏòÅÎ≥µ/step05_miniTest_s/src/probono/model/dto/Probono.java
	
	public Probono() {}
		
	public Probono(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.probonoId = probonoId;
		this.probonoName = probonoName;
		this.probonoPurpose = probonoPurpose;
	}
	
	public String getProbonoId() {
		return probonoId;
	}

	public void setProbonoId(String probonoId) {
		this.probonoId = probonoId;
	}

	public String getProbonoName() {
		return probonoName;
	}

	public void setProbonoName(String probonoName) {
		this.probonoName = probonoName;
	}

	public String getProbonoPurpose() {
		return probonoPurpose;
	}

	public void setProbonoPurpose(String probonoPurpose) {
		this.probonoPurpose = probonoPurpose;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[«¡∑Œ∫∏≥Î æ∆¿Ãµ : ");
		builder.append(probonoId);
		builder.append(", «¡∑Œ∫∏≥Î ¿Ã∏ß : ");
		builder.append(probonoName);
		builder.append(", «¡∑Œ∫∏≥Î ∏Ò¿˚ : ");
		builder.append(probonoPurpose);
		builder.append("]");
		return builder.toString();
	}
}
