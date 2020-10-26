package org.example;

import edu.illinois.library.cantaloupe.delegate.JavaContext;

import java.util.Collections;
import java.util.List;
import java.util.Map;

class MockJavaContext implements JavaContext {

    @Override
    public String getClientIPAddress() {
        return "0.0.0.0";
    }

    @Override
    public Map<String,String> getCookies() {
        return Collections.emptyMap();
    }

    @Override
    public Map<String,Integer> getFullSize() {
        return Map.of("width", 1000, "height", 800);
    }

    @Override
    public String getIdentifier() {
        return "cats";
    }

    @Override
    public String getLocalURI() {
        return "http://example.org/";
    }

    @Override
    public Map<String,Object> getMetadata() {
        return Collections.emptyMap();
    }

    @Override
    public List<Map<String,Object>> getOperations() {
        return Collections.emptyList();
    }

    @Override
    public String getOutputFormat() {
        return "image/jpeg";
    }

    @Override
    public Integer getPageCount() {
        return 0;
    }

    @Override
    public Integer getPageNumber() {
        return 0;
    }

    @Override
    public Map<String,String> getRequestHeaders() {
        return Collections.emptyMap();
    }

    @Override
    public String getRequestURI() {
        return "http://example.org/";
    }

    @Override
    public Map<String,Integer> getResultingSize() {
        return Map.of("width", 500, "height", 400);
    }

    @Override
    public int[] getScaleConstraint() {
        return new int[] { 1, 1 };
    }

}
