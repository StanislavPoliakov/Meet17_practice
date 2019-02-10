package home.stanislavpoliakov.meet17_practice.dagger2;

import dagger.Component;
import dagger.Module;
import home.stanislavpoliakov.meet17_practice.presentation.view.ViewActivity;

@ApplicationScope
@Component(modules = {ViewModule.class})
public interface ViewComponent {

    void inject(ViewActivity activity);
}
