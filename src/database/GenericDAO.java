package database;

import java.util.ArrayList;

public interface GenericDAO<T> {
	public T SelectAll();
	public ArrayList<T> Select(Integer id);
	public void DeleteAll();
	public void Delete(Integer id);
	public void Update(T item);
}
