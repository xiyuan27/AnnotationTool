package annotation.model;
// Generated 2017-7-19 16:18:37 by Hibernate Tools 3.5.0.Final

/**
 * Sample generated by hbm2java
 */
public class Sample implements java.io.Serializable {

	private Integer id;
	private Integer jbxxDengjihao;
	private String dzblZhusu;
	private String dzblXianbingshi;
	private String editXianbingshi;
	private String status;

	public Sample() {
	}

	public Sample(Integer jbxxDengjihao, String dzblZhusu, String dzblXianbingshi, String editXianbingshi,
			String status) {
		this.jbxxDengjihao = jbxxDengjihao;
		this.dzblZhusu = dzblZhusu;
		this.dzblXianbingshi = dzblXianbingshi;
		this.editXianbingshi = editXianbingshi;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJbxxDengjihao() {
		return this.jbxxDengjihao;
	}

	public void setJbxxDengjihao(Integer jbxxDengjihao) {
		this.jbxxDengjihao = jbxxDengjihao;
	}

	public String getDzblZhusu() {
		return this.dzblZhusu;
	}

	public void setDzblZhusu(String dzblZhusu) {
		this.dzblZhusu = dzblZhusu;
	}

	public String getDzblXianbingshi() {
		return this.dzblXianbingshi;
	}

	public void setDzblXianbingshi(String dzblXianbingshi) {
		this.dzblXianbingshi = dzblXianbingshi;
	}

	public String getEditXianbingshi() {
		return this.editXianbingshi;
	}

	public void setEditXianbingshi(String editXianbingshi) {
		this.editXianbingshi = editXianbingshi;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
