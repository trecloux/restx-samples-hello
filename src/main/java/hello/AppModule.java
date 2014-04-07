package hello;

import com.google.common.base.Charsets;
import restx.security.SignatureKey;
import restx.factory.Module;
import restx.factory.Provides;

import java.time.Clock;

@Module
public class AppModule {
    @Provides
    public SignatureKey signatureKey() {
         return new SignatureKey("5341679063568601943 restx-samples-hello Hello e372a614-d7a5-477b-9e3f-40c182b9f34d".getBytes(Charsets.UTF_8));
    }

    @Provides
    public Clock clock() {
        return Clock.systemDefaultZone();
    }
}
