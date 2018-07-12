package fr.mds.explorer.dao;

import java.util.List;

import fr.mds.explorer.entity.File;

public interface FileDao {
	void addFile(File p);

	File findFile(Long id);

	List<File> getAllFiles();

	void removeFile(Long id);
}
