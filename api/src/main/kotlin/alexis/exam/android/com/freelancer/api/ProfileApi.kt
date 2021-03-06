package alexis.exam.android.com.freelancer.api

import alexis.exam.android.com.freelancer.dto.Profile
import retrofit2.http.GET
import rx.Single

/**
 * Created by alzayon on 9/24/2017.
 */
interface ProfileApi {
    @GET("/profile.json")
    fun getProfileData() : Single<Profile>
}