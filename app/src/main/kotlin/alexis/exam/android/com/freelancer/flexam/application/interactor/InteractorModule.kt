package alexis.exam.android.com.freelancer.flexam.application.interactor

import alexis.exam.android.com.freelancer.api.ProfileApi
import alexis.exam.android.com.freelancer.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by alexis on 9/27/17.
 */
@Module
class InteractorModule {
    @ActivityScope
    @Provides
    fun provideProfileInteractor(profileApi: ProfileApi) : ProfileInteractor {
        return DefaultProfileInteractor(profileApi)
    }
}