package alexis.exam.android.com.freelancer.flexam.application

import alexis.exam.android.com.freelancer.flexam.BuildConfig
import alexis.exam.android.com.freelancer.flexam.application.activity.ComponentProvider
import alexis.exam.android.com.freelancer.modules.RetrofitModule
import android.app.Application
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by alzayon on 9/25/2017.
 */
class FLApplication : Application(), ComponentProvider<FLApplication.FLComponent> {

    private lateinit var _component: FLComponent

    @Inject
    lateinit var retrofit : Retrofit

    override fun onCreate() {
        super.onCreate()
        val retrofitModule = RetrofitModule(BuildConfig.BASE_URL)
        _component = DaggerFLApplication_FLComponent.builder()
                .retrofitModule(retrofitModule)
                .build();
        _component.inject(this);
    }

    @Singleton
    @Component(modules = arrayOf(RetrofitModule::class))
    interface FLComponent {
        fun inject(application: FLApplication);
    }

    override fun getComponent(): FLComponent {
        return _component
    }
}