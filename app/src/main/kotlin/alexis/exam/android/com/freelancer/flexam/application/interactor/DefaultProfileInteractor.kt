package alexis.exam.android.com.freelancer.flexam.application.interactor

import alexis.exam.android.com.freelancer.dto.Profile
import java.util.function.Consumer

/**
 * Created by alexis on 9/27/17.
 */
class DefaultProfileInteractor : ProfileInteractor {
    override fun fetchProfile(listener: Consumer<Profile>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProfileFetchedCompleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProfileFetchError(error: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}