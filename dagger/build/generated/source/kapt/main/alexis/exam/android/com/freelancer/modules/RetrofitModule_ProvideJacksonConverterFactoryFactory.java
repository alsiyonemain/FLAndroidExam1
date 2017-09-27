package alexis.exam.android.com.freelancer.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrofitModule_ProvideJacksonConverterFactoryFactory
    implements Factory<JacksonConverterFactory> {
  private final RetrofitModule module;

  public RetrofitModule_ProvideJacksonConverterFactoryFactory(RetrofitModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public JacksonConverterFactory get() {
    return Preconditions.checkNotNull(
        module.provideJacksonConverterFactory(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<JacksonConverterFactory> create(RetrofitModule module) {
    return new RetrofitModule_ProvideJacksonConverterFactoryFactory(module);
  }
}
