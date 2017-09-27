package alexis.exam.android.com.freelancer.flexam.application.interactor

import alexis.exam.android.com.freelancer.dto.Profile
import java.util.function.Consumer

/**
 * Created by alexis on 9/27/17.
 */
interface ProfileInteractor {
    fun fetchProfile(listener: Consumer<Profile>)
    fun onProfileFetchedCompleted()
    fun onProfileFetchError(error: Throwable)
}