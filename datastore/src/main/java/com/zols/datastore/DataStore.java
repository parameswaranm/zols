package com.zols.datastore;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Persistence Utility for Static and Dynamic Objects.
 *
 * @author Sathish Kumar Thiyagarajan
 */
public abstract class DataStore {

    /**
     * Creates a new object
     *
     * @param <T> Type of the Object
     * @param object Object to be created
     * @param clazz Class of the Object to be created
     * @return created object
     */
    public abstract <T> T create(Object object, Class<T> clazz);

    /**
     * reads an Object with given name
     *
     * @param <T> Type of the Object
     * @param name name of the Object
     * @param clazz Class of the Object to be read
     * @return object with given name
     */
    public abstract <T> T read(String name, Class<T> clazz);

    /**
     * update an Object with given Object
     *
     * @param <T> Type of the Object
     * @param object Object to be updated
     * @param clazz Class of the Object to be update
     * @return updated object
     */
    public abstract <T> T update(Object object, Class<T> clazz);

    /**
     * Delete an Object with given name
     *
     * @param <T> Type of the Object
     * @param name name of the Object
     * @param clazz Class of the Object to be delete
     * @return Deleted Object
     */
    public abstract <T> T delete(String name, Class<T> clazz);

    /**
     *
     * @param <T>
     * @param searchObject
     * @return
     */
    public abstract <T> T deleteByExample(T searchObject);

    /**
     * Get List of the Object with given count
     *
     * @param <T> Type of the Object
     * @param pageable Count of the Object
     * @param clazz Class of the Object to be get the List
     * @return Page Object
     */
    public abstract <T> Page<T> list(Pageable pageable, Class<T> clazz);

    /**
     * Get List of the Object
     *
     * @param <T> Type of the Object
     * @param aClass Class of the Object to be get the List
     * @return List Object
     */
    public abstract <T> List<T> list(Class<T> aClass);

    /**
     * Get List of the Object
     *
     * @param <T> Type of the Object
     * @param searchObject Search Object
     * @return List Object
     */
    public abstract <T> List<T> listByExample(T searchObject);

}
