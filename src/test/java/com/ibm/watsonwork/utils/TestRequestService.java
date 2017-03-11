package com.ibm.watsonwork.utils;

import com.ibm.watsonwork.model.WebhookEvent;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface TestRequestService {

    @Headers({"Content-Type: application/json"})
    @POST("/webhook")
    Call<Void> webhookRequest(@Body WebhookEvent webhookEvent);

}
