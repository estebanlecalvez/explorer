package fr.mds.explorer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String type;
	private String url;
	private String description;

	// en ko
	private Float weight;

	@ManyToOne
	@JoinColumn(name = "category_fk")
	private Category category;

	public File(String name, String type, String url, String description, Float weight) {
		this.name = name;
		this.type = type;
		this.url = url;
		this.description = description;
		this.weight = weight;
	}
 
	public File(String name, String type, String url, String description, Float weight, Category category) {
		this.name = name;
		this.type = type;
		this.url = url;
		this.description = description;
		this.weight = weight;
		this.category = category;
	}

	public File() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
