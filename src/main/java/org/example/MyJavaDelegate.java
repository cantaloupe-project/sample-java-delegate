package org.example;

import edu.illinois.library.cantaloupe.delegate.AbstractJavaDelegate;
import edu.illinois.library.cantaloupe.delegate.JavaDelegate;
import edu.illinois.library.cantaloupe.delegate.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MyJavaDelegate extends AbstractJavaDelegate implements JavaDelegate {

    public Object preAuthorize() {
        Logger.info("Hello world! The identifier is: " + getContext().getIdentifier());
        return true;
    }

    public Object authorize() {
        return true;
    }

    public Map<String,Object> getExtraIIIF2InformationResponseKeys() {
        return Collections.emptyMap();
    }

    public Map<String,Object> getExtraIIIF3InformationResponseKeys() {
        return Collections.emptyMap();
    }

    public String getSource() {
        return null;
    }

    public String getAzureStorageSourceBlobKey() {
        return null;
    }

    public String getFilesystemSourcePathname() {
        return null;
    }

    public Map<String,Object> getHTTPSourceResourceInfo() {
        return null;
    }

    public String getJDBCSourceDatabaseIdentifier() {
        return null;
    }

    public String getJDBCSourceMediaType() {
        return null;
    }

    public String getJDBCSourceLookupSQL() {
        return null;
    }

    public Map<String,String> getS3SourceObjectInfo() {
        return null;
    }

    public Map<String,Object> getOverlay() {
        return null;
    }

    public List<Map<String,Long>> getRedactions() {
        return Collections.emptyList();
    }

    public String getMetadata() {
        return null;
    }

}

