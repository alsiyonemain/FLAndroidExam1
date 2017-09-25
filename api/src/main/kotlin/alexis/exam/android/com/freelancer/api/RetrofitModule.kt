package alexis.exam.android.com.freelancer.api

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

/**
 * Created by alzayon on 9/25/2017.
 * TODO:
 * Use proper configuration for the base url
 */
@Module
class RetrofitModule(val baseUrl : String) {

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() : HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return interceptor
    }


    @Singleton
    @Provides
    fun provideOkkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor) : OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()
    }

    @Singleton
    @Provides
    fun provideJacksonConverterFactory() : JacksonConverterFactory {
        return JacksonConverterFactory.create()
    }


    @Singleton
    @Provides
    fun provideRetrofit(httpLoggingInterceptor: HttpLoggingInterceptor,
                        jacksonConverterFactory: JacksonConverterFactory,
                        okHttpClient: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(jacksonConverterFactory)
                .client(okHttpClient)
                .build();

    }

}