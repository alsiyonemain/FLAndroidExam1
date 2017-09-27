package alexis.exam.android.com.freelancer.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final RetrofitModule module;

  private final Provider<HttpLoggingInterceptor> arg0Provider;

  private final Provider<JacksonConverterFactory> arg1Provider;

  private final Provider<OkHttpClient> arg2Provider;

  public RetrofitModule_ProvideRetrofitFactory(
      RetrofitModule module,
      Provider<HttpLoggingInterceptor> arg0Provider,
      Provider<JacksonConverterFactory> arg1Provider,
      Provider<OkHttpClient> arg2Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
    assert arg1Provider != null;
    this.arg1Provider = arg1Provider;
    assert arg2Provider != null;
    this.arg2Provider = arg2Provider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(arg0Provider.get(), arg1Provider.get(), arg2Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      RetrofitModule module,
      Provider<HttpLoggingInterceptor> arg0Provider,
      Provider<JacksonConverterFactory> arg1Provider,
      Provider<OkHttpClient> arg2Provider) {
    return new RetrofitModule_ProvideRetrofitFactory(
        module, arg0Provider, arg1Provider, arg2Provider);
  }
}
