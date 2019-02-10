package home.stanislavpoliakov.meet17_practice.dagger2;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import home.stanislavpoliakov.meet17_practice.data.database.DatabaseGateway;
import home.stanislavpoliakov.meet17_practice.data.network.NetworkGateway;
import home.stanislavpoliakov.meet17_practice.domain.DomainContract;

@Module
public class InteractorModule {

    @Provides
    public DomainContract.NetworkOperations provideNetworkGateway() {
        return new NetworkGateway();
    }

    @Provides
    public DomainContract.DatabaseOperations provideDatabaseGateway(Context context) {
        return new DatabaseGateway(context);
    }
}
