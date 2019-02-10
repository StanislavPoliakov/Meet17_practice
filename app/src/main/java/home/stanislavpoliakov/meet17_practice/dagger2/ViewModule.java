package home.stanislavpoliakov.meet17_practice.dagger2;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.util.Log;

import java.util.List;

import dagger.Module;
import dagger.Provides;
import home.stanislavpoliakov.meet17_practice.domain.DomainContract;
import home.stanislavpoliakov.meet17_practice.domain.UseCaseInteractor;
import home.stanislavpoliakov.meet17_practice.presentation.ViewContract;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.BriefData;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.Presenter;
import home.stanislavpoliakov.meet17_practice.presentation.view.MyAdapter;

@Module
public class ViewModule {
    private ViewContract view;

    public ViewModule(ViewContract view) {
        this.view = view;
    }

    @Provides
    public DomainContract.Presenter providePresenter() {
        return new Presenter(view);
    }

    @Provides
    public DomainContract.UseCase provideUseCaseInteractor(){
        return new UseCaseInteractor();
    }
}
