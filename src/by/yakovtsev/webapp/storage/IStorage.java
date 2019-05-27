package by.yakovtsev.webapp.storage;

import by.yakovtsev.webapp.WebAppException;
import by.yakovtsev.webapp.model.Resume;

import java.util.Collection;


public interface IStorage {
    void clear();

    void save(Resume r) throws WebAppException;

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();

    boolean isSectionSupported();
}
