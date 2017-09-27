package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.dto.Profile
import alexis.exam.android.com.freelancer.flexam.application.view.ProfileView

/**
 * Created by alexis on 9/27/17.
 */
interface ProfilePresenter : Presenter<ProfileView> {
    fun fetchProfile()
}