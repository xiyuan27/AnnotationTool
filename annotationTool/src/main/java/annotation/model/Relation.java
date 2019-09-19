package annotation.model;
// Generated 2017-8-2 14:57:29 by Hibernate Tools 3.5.0.Final

/**
 * Relation generated by hbm2java
 */
public class Relation implements java.io.Serializable {

	private Integer id;
	private String entity1;
	private String entity2;
	private String relation;
	private String filename;
	private String username;
	private String color1;
	private String color2;

	public Relation() {
	}

	public Relation(String entity1, String entity2, String relation, String filename, String username, String color1,
			String color2) {
		this.entity1 = entity1;
		this.entity2 = entity2;
		this.relation = relation;
		this.filename = filename;
		this.username = username;
		this.color1 = color1;
		this.color2 = color2;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntity1() {
		return this.entity1;
	}

	public void setEntity1(String entity1) {
		this.entity1 = entity1;
	}

	public String getEntity2() {
		return this.entity2;
	}

	public void setEntity2(String entity2) {
		this.entity2 = entity2;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getColor1() {
		return this.color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return this.color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

}
