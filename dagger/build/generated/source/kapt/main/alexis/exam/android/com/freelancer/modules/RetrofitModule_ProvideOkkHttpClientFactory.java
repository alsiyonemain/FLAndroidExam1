package alexis.exam.android.com.freelancer.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrofitModule_ProvideOkkHttpClientFactory implements Factory<OkHttpClient> {
  private final RetrofitModule module;

  private final Provider<HttpLoggingInterceptor> arg0Provider;

  public RetrofitModule_ProvideOkkHttpClientFactory(
      RetrofitModule module, Provider<HttpLoggingInterceptor> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkkHttpClient(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      RetrofitModule module, Provider<HttpLoggingInterceptor> arg0Provider) {
    return new RetrofitModule_ProvideOkkHttpClientFactory(module, arg0Provider);
  }
}
