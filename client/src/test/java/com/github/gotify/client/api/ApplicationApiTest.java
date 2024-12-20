package com.github.gotify.client.api;

import com.github.gotify.client.ApiClient;
import com.github.gotify.client.model.Application;
import com.github.gotify.client.model.ApplicationParams;
import com.github.gotify.client.model.Error;
import java.io.File;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ApplicationApi
 */
public class ApplicationApiTest {

    private ApplicationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ApplicationApi.class);
    }


    /**
     * Create an application.
     *
     * 
     */
    @Test
    public void createAppTest() {
        ApplicationParams body = null;
        // Application response = api.createApp(body);

        // TODO: test validations
    }

    /**
     * Delete an application.
     *
     * 
     */
    @Test
    public void deleteAppTest() {
        Long id = null;
        // Void response = api.deleteApp(id);

        // TODO: test validations
    }

    /**
     * Return all applications.
     *
     * 
     */
    @Test
    public void getAppsTest() {
        // List<Application> response = api.getApps();

        // TODO: test validations
    }

    /**
     * Deletes an image of an application.
     *
     * 
     */
    @Test
    public void removeAppImageTest() {
        Long id = null;
        // Void response = api.removeAppImage(id);

        // TODO: test validations
    }

    /**
     * Update an application.
     *
     * 
     */
    @Test
    public void updateApplicationTest() {
        ApplicationParams body = null;
        Long id = null;
        // Application response = api.updateApplication(body, id);

        // TODO: test validations
    }

    /**
     * Upload an image for an application.
     *
     * 
     */
    @Test
    public void uploadAppImageTest() {
        File file = null;
        Long id = null;
        // Application response = api.uploadAppImage(file, id);

        // TODO: test validations
    }
}
