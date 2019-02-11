package home.stanislavpoliakov.meet17_practice.dagger2;

import dagger.Component;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.Presenter;

/**
 * Компонент зависимостей Presenter-уровня
 */
@ApplicationScope
@Component(modules = PresenterModule.class)
public interface PresenterComponent {

    void inject(Presenter presenter);
}
