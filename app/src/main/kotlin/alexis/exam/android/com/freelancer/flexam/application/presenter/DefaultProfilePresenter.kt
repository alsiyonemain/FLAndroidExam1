package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.dto.Profile
import alexis.exam.android.com.freelancer.flexam.application.interactor.ProfileInteractor
import alexis.exam.android.com.freelancer.flexam.application.view.ProfileView
import alexis.exam.android.com.freelancer.flexam.application.view.View
import android.util.Log

/**
 * Created by alexis on 9/27/17.
 */
class DefaultProfilePresenter(val profileInteractor : ProfileInteractor) : BasePresenter<ProfileView>(), ProfilePresenter,
    ProfileInteractor.OnProfileFetchListener {

    override fun fetchProfile() {
        profileInteractor.fetchProfile(this)
    }

    override fun onSuccess(profile: Profile) {
       Log.v("ProfilePresenter", profile.toString())
    }

    override fun onComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(throwable: Throwable) {
        Log.v("ProfilePresenter", throwable.message)
    }
}