package project.domain;

public class CriminalDTO {
	private String district;	//자치구
	private int caseSum;		//발생합계
	private int arrestSum;	//검거합계
	private int killCase;	//살인발생
	private int killArrest;	//살인검거
	private int robberCase;	//강도발생
	private int robberArrest;		//강도검거
	private int rapeCase;		//강간,강제추행발생
	private int rapeArrest;	//강간,강제추행검거
	private int theftCase;		//절도발생
	private int theftArrest;	//절도검거
	private int attackCase;		//폭력발생
	private int attackArrest;		//폭력검거
	private int population;	//인구
	
	public CriminalDTO() {}
	
	public CriminalDTO(String district, int caseSum, int arrestSum, int killCase, int killArrest, int robberCase,
			int robberArrest, int rapeCase, int rapeArrest, int theftCase, int theftArrest, int attackCase,
			int attackArrest, int population) {
		super();
		this.district = district;
		this.caseSum = caseSum;
		this.arrestSum = arrestSum;
		this.killCase = killCase;
		this.killArrest = killArrest;
		this.robberCase = robberCase;
		this.robberArrest = robberArrest;
		this.rapeCase = rapeCase;
		this.rapeArrest = rapeArrest;
		this.theftCase = theftCase;
		this.theftArrest = theftArrest;
		this.attackCase = attackCase;
		this.attackArrest = attackArrest;
		this.population = population;
	}

	
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getCaseSum() {
		return caseSum;
	}
	public void setCaseSum(int caseSum) {
		this.caseSum = caseSum;
	}
	public int getArrestSum() {
		return arrestSum;
	}
	public void setArrestSum(int arrestSum) {
		this.arrestSum = arrestSum;
	}
	public int getKillCase() {
		return killCase;
	}
	public void setKillCase(int killCase) {
		this.killCase = killCase;
	}
	public int getKillArrest() {
		return killArrest;
	}
	public void setKillArrest(int killArrest) {
		this.killArrest = killArrest;
	}
	public int getRobberCase() {
		return robberCase;
	}
	public void setRobberCase(int robberCase) {
		this.robberCase = robberCase;
	}
	public int getRobberArrest() {
		return robberArrest;
	}
	public void setRobberArrest(int robberArrest) {
		this.robberArrest = robberArrest;
	}
	public int getRapeCase() {
		return rapeCase;
	}
	public void setRapeCase(int rapeCase) {
		this.rapeCase = rapeCase;
	}
	public int getRapeArrest() {
		return rapeArrest;
	}
	public void setRapeArrest(int rapeArrest) {
		this.rapeArrest = rapeArrest;
	}
	public int getTheftCase() {
		return theftCase;
	}
	public void setTheftCase(int theftCase) {
		this.theftCase = theftCase;
	}
	public int getTheftArrest() {
		return theftArrest;
	}
	public void setTheftArrest(int theftArrest) {
		this.theftArrest = theftArrest;
	}
	public int getAttackCase() {
		return attackCase;
	}
	public void setAttackCase(int attackCase) {
		this.attackCase = attackCase;
	}
	public int getAttackArrest() {
		return attackArrest;
	}
	public void setAttackArrest(int attackArrest) {
		this.attackArrest = attackArrest;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("자치구: ");
		builder.append(district);
		builder.append("\t 발생합계: ");
		builder.append(caseSum);
		builder.append("\t 검거합계: ");
		builder.append(arrestSum);
		builder.append("\t 살인발생: ");
		builder.append(killCase);
		builder.append("\t 살입검거: ");
		builder.append(killArrest);
		builder.append("\t 강도발생: ");
		builder.append(robberCase);
		builder.append("\t 강도검거: ");
		builder.append(robberArrest);
		builder.append("\t 성범죄발생: ");
		builder.append(rapeCase);
		builder.append("\t 성범죄검거: ");
		builder.append(rapeArrest);
		builder.append("\t 절도발생: ");
		builder.append(theftCase);
		builder.append("\t 절도검거: ");
		builder.append(theftArrest);
		builder.append("\t 폭력발생: ");
		builder.append(attackCase);
		builder.append("\t 폭력검거: ");
		builder.append(attackArrest);
		builder.append("\t 인구수: ");
		builder.append(population);
		return builder.toString();
	}
	
}
