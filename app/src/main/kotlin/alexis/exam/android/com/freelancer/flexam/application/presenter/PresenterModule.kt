package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by alexis on 9/27/17.
 */
@Module
class PresenterModule {
    @ActivityScope
    @Provides
    fun provideProfilePresenter() : ProfilePresenter {
        return DefaultProfilePresenter()
    }
}