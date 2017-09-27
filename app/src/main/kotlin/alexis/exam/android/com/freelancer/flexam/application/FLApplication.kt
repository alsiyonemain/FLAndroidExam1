package alexis.exam.android.com.freelancer.flexam.application

import alexis.exam.android.com.freelancer.api.ProfileApi
import alexis.exam.android.com.freelancer.flexam.BuildConfig
import alexis.exam.android.com.freelancer.flexam.application.activity.ComponentProvider
import alexis.exam.android.com.freelancer.module.ApiModule
import alexis.exam.android.com.freelancer.module.RetrofitModule
import android.app.Application
import dagger.Component
import javax.inject.Singleton

/**
 * Created by alzayon on 9/25/2017.
 */
class FLApplication : Application(), ComponentProvider<FLApplication.FLComponent> {

    var _component: FLComponent? = null

    override fun onCreate() {
        super.onCreate()
        getComponent().inject(this);
    }

    @Singleton
    @Component(modules = arrayOf(ApiModule::class, RetrofitModule::class))
    interface FLComponent {
        fun provideProfileApi() : ProfileApi
        fun inject(application : FLApplication)
    }

    override fun getComponent(): FLComponent {
        if (_component == null) {
           val retrofitModule = RetrofitModule(BuildConfig.BASE_URL)
            _component = DaggerFLApplication_FLComponent.builder()
                    .retrofitModule(retrofitModule)
                    .build();
        }
        return _component!!
    }
}