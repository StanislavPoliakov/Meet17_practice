package home.stanislavpoliakov.meet17_practice.dagger2;

import dagger.Module;
import dagger.Provides;
import home.stanislavpoliakov.meet17_practice.domain.DomainContract;
import home.stanislavpoliakov.meet17_practice.presentation.ViewContract;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.Presenter;

@Module
public class ViewModule {
    private ViewContract view;

    public ViewModule(ViewContract view) {
        this.view = view;
    }

    @ApplicationScope
    @Provides
    public DomainContract.Presenter providePresenter() {
        return new Presenter(view);
    }
}
