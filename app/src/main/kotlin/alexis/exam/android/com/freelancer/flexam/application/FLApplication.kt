package alexis.exam.android.com.freelancer.flexam.application

import alexis.exam.android.com.freelancer.api.RetrofitModule
import alexis.exam.android.com.freelancer.dagger.ApplicationScope
import android.app.Application
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by alzayon on 9/25/2017.
 */
class FLApplication : Application() {

    companion object {
        val BASE_URL = "http://localhost:8080"
    }

    @Inject
    lateinit var retrofit : Retrofit


    lateinit var retrofitModule : RetrofitModule


    override fun onCreate() {
        super.onCreate()
        retrofitModule = RetrofitModule(BASE_URL)

    }

    @ApplicationScope
    @Component(modules = arrayOf(RetrofitModule::class))
    interface FLComponent {
        fun inject(application: FLApplication);
    }
}