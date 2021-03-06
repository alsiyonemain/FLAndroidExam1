package alexis.exam.android.com.freelancer.flexam.application.api

import alexis.exam.android.com.freelancer.api.ProfileApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by alexis on 9/27/17.
 */
@Module
class ApiModule {
    @Singleton
    @Provides
    fun provideProfileApi(builder: Retrofit.Builder) : ProfileApi {
        val retrofit = builder.build()
        return retrofit.create(ProfileApi::class.java)
    }

}