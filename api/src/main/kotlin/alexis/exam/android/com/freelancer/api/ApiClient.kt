package alexis.exam.android.com.freelancer.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import sun.util.logging.LoggingSupport.setLevel



/**
 * Created by alzayon on 9/24/2017.
 */
class ApiClient {
    companion object {
        var retrofit: Retrofit? = null;
        fun getClient() : Retrofit {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()


            retrofit = Retrofit.Builder()
                    .baseUrl("https://reqres.in")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()

            return retrofit!!
        }

    }
}