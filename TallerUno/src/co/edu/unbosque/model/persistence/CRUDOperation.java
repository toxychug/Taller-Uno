package co.edu.unbosque.model.persistence;

public interface CRUDOperation {
	public void create(String... args);
	public void create(Object o);
	//OBJECT ES LA SUPERCLASE DE TODOU

	public boolean delete(int index);
	public boolean delete(Object o);

	public boolean update(int index, String... args);

	public String readAll();
}
