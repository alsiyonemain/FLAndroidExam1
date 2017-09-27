package alexis.exam.android.com.freelancer.module

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
    fun provideProfileApiModule(builder: Retrofit.Builder) : ProfileApi {
        val retrofit = builder.build()
        return retrofit.create(ProfileApi::class.java)
    }

}