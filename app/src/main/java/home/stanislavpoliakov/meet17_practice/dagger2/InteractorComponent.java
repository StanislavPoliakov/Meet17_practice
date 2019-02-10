package home.stanislavpoliakov.meet17_practice.dagger2;

import dagger.Component;
import home.stanislavpoliakov.meet17_practice.domain.UseCaseInteractor;

@ApplicationScope
@Component(modules = {InteractorModule.class, ContextModule.class})
public interface InteractorComponent {

    void inject(UseCaseInteractor useCaseInteractor);
}
