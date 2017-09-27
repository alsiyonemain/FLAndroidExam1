package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.dto.Profile
import alexis.exam.android.com.freelancer.flexam.application.interactor.ProfileInteractor
import alexis.exam.android.com.freelancer.flexam.application.view.ProfileView

/**
 * Created by alexis on 9/27/17.
 */
class DefaultProfilePresenter : BasePresenter<ProfileView>(), ProfilePresenter {

    lateinit var profileInteractor : ProfileInteractor

//    override fun fetchProfile(): Profile {
//        //val profile = profileInteractor.fetchProfile()
//        return Profile()
//    }

    override fun fetchProfile(): Profile {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(): ProfileView {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}