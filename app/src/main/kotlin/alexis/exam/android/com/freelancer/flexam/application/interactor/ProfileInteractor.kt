package alexis.exam.android.com.freelancer.flexam.application.interactor

import alexis.exam.android.com.freelancer.dto.Profile
import java.util.function.Consumer

/**
 * Created by alexis on 9/27/17.
 */
interface ProfileInteractor {
    interface OnProfileFetchListener {
        fun onSuccess(profile: Profile)
        fun onComplete()
        fun onError(throwable: Throwable)
    }
    fun fetchProfile(listener: OnProfileFetchListener)
}