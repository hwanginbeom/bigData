<<<<<<< HEAD:1.실습Lab/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
//���� ����Ǵ� ��� ��� ������Ʈ ���� ���� Ŭ��
/*�����, ������, ��� ����, ��εǴ� ���� ���� 
 * 
 */

=======
// ���� ����Ǵ� ��� ��� ������Ʈ ���� ���� Ŭ����
/*
 * �����, ������, ��� ����, ��εǴ� ���� ����
 */
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:이영복/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
package probono.model.dto;

public class ProbonoProject {

<<<<<<< HEAD:1.실습Lab/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
	private String probonoProjectName; //�� ������Ʈ �̸� 
	private Probono probono; //��� ����
	private Activist activist; //�����
	private Recipient receive; // ������ 
=======
	private String probonoProjectName; // �� ������Ʈ �̸�
	private Probono probono; // ��� ����
	private Activist activist; // �����
	private Recipient receive; // ������
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:이영복/step05_miniTest_s/src/probono/model/dto/ProbonoProject.java
	private String projectContent; // ��εǴ� ���� ����

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
		builder.append("1. ������Ʈ�� : ");
		builder.append(probonoProjectName);
		builder.append("\n2. ��ɱ�γ��� : ");
		builder.append(probono);
		builder.append("\n3. ��� ����� ����: ");
		builder.append(activist);
		builder.append("\n4. ������ ����: ");
		builder.append(receive);
		builder.append("\n5. ������Ʈ�������� : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}
