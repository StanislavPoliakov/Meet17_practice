package home.stanislavpoliakov.meet17_practice.dagger2;

import dagger.Module;
import dagger.Provides;
import home.stanislavpoliakov.meet17_practice.domain.DomainContract;
import home.stanislavpoliakov.meet17_practice.domain.UseCaseInteractor;

@Module
public class PresenterModule {

    /**
     * Обещаем предоставить в Presenter элемент Domain-уровня
     * @return
     */
    @ApplicationScope
    @Provides
    public DomainContract.UseCase provideUseCaseInteractor() {
        return new UseCaseInteractor();
    }
}
