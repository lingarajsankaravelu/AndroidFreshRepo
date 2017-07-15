package lingaraj.hourglass.in.swiggy.cloud.service;

import java.util.List;

import lingaraj.hourglass.in.swiggy.cloud.service.Response.KickStarterResponse;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by lingaraj on 5/7/17.
 */

public interface KickStarter {

    @GET("/kickstarter")
    void getKickstarterDemo(Callback<List<KickStarterResponse>> response);
}
