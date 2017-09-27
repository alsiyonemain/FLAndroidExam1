package alexis.exam.android.com.freelancer.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrofitModule_ProvideHttpLoggingInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final RetrofitModule module;

  public RetrofitModule_ProvideHttpLoggingInterceptorFactory(RetrofitModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideHttpLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpLoggingInterceptor> create(RetrofitModule module) {
    return new RetrofitModule_ProvideHttpLoggingInterceptorFactory(module);
  }
}
