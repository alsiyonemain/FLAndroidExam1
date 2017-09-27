package alexis.exam.android.com.freelancer.flexam.application.interactor

import alexis.exam.android.com.freelancer.api.ProfileApi
import alexis.exam.android.com.freelancer.dto.Profile
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.function.Consumer

/**
 * Created by alexis on 9/27/17.
 */
class DefaultProfileInteractor(val profileApi : ProfileApi) : ProfileInteractor {
    override fun fetchProfile(listener: ProfileInteractor.OnProfileFetchListener) {
        profileApi.getProfileData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({profile -> listener.onSuccess(profile)},
                    {e -> listener.onError(e)})
    }
}