package database;

import java.util.ArrayList;

public interface GenericDAO<T> {
	public ArrayList<T> SelectAll();
	public T Select(Integer id);
	public void DeleteAll();
	public void Delete(Integer id);
	public void Update(T item);
	public T Insert(T item);
}
