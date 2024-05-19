/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author user
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SessionManager {

    private static SessionManager instance;
    private Map<String, Object> sessionData;

    private SessionManager() {
        sessionData = new HashMap<>();
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    } 

    public void setAttribute(String key, Object value) {
        sessionData.put(key, value);
    }

    public Object getAttribute(String key) {
        return sessionData.get(key);
    }

    public void removeAttribute(String key) {
        sessionData.remove(key);
    }

    public void invalidate() {
        sessionData.clear();
    }

    public Map<String, Object> getSessionData() {
        return Collections.unmodifiableMap(new HashMap<>(sessionData));
    }
}
