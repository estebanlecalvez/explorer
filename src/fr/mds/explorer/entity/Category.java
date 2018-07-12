package fr.mds.explorer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String description;

	@OneToMany(mappedBy = "category",
			fetch=FetchType.EAGER)
	private List<File> files;

	public Category() {}

	public Category(Long id) {
		this.id = id;
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(long id, String name, String description, List<File> files) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.files = files;
	}

	public String getDescription() {
		return description;
	}
	

	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<File> getProducts() {
		return files;
	}

	public void setProducts(List<File> products) {
		this.files = products;
	}

}
