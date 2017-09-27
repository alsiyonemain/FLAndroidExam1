package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.dto.Profile

/**
 * Created by alexis on 9/27/17.
 */
interface ProfilePresenter {
    fun fetchProfile() : Profile
}