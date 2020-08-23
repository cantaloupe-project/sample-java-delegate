package org.example;

import edu.illinois.library.cantaloupe.delegate.JavaContext;

import java.util.Collections;
import java.util.List;
import java.util.Map;

class MockJavaContext implements JavaContext {

    public String getClientIPAddress() {
        return "0.0.0.0";
    }

    public Map<String,String> getCookies() {
        return Collections.emptyMap();
    }

    public Map<String,Integer> getFullSize() {
        return Map.of("width", 1000, "height", 800);
    }

    public String getIdentifier() {
        return "cats";
    }

    public String getLocalURI() {
        return "http://example.org/";
    }

    public Map<String,Object> getMetadata() {
        return Collections.emptyMap();
    }

    public List<Map<String,Object>> getOperations() {
        return Collections.emptyList();
    }

    public String getOutputFormat() {
        return "image/jpeg";
    }

    public Map<String,String> getRequestHeaders() {
        return Collections.emptyMap();
    }

    public String getRequestURI() {
        return "http://example.org/";
    }

    public Map<String,Integer> getResultingSize() {
        return Map.of("width", 500, "height", 400);
    }

    public int[] getScaleConstraint() {
        return new int[] { 1, 1 };
    }

}
