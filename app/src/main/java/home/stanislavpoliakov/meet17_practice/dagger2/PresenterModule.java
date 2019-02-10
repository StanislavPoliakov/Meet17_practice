package home.stanislavpoliakov.meet17_practice.dagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;
import home.stanislavpoliakov.meet17_practice.domain.DomainContract;
import home.stanislavpoliakov.meet17_practice.domain.UseCaseInteractor;

@Module
public class PresenterModule {

    @Provides
    public DomainContract.UseCase provideUseCaseInteractor() {
        return new UseCaseInteractor();
    }
}
