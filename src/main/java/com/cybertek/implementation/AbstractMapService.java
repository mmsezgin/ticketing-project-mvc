package com.cybertek.implementation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T,ID> {

    protected Map <ID,T> map = new HashMap<>();

    T save (ID id, T object) {
        map.put(id, object);
        return object;
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }
    T findById (ID id){
        return map.get(id);
    }
    void deleteById (ID id){
        map.remove(id);
    }
    void delete (T object){
        //converting map to string, use entrySet()
        map.entrySet().removeIf((entry -> entry.getValue().equals(object) ));
    }
    void update (ID id, T object){
        //first delete that object. Below part not needed.
//        map.entrySet().removeIf((entry -> entry.getValue().equals(object) ));
        //add the new one
        map.put(id, object);

    }



}
