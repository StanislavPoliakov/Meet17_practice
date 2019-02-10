package home.stanislavpoliakov.meet17_practice;

import android.app.Application;
import android.util.Log;

import home.stanislavpoliakov.meet17_practice.dagger2.ContextModule;
import home.stanislavpoliakov.meet17_practice.dagger2.DaggerInteractorComponent;
import home.stanislavpoliakov.meet17_practice.dagger2.DaggerPresenterComponent;
import home.stanislavpoliakov.meet17_practice.dagger2.InteractorComponent;
import home.stanislavpoliakov.meet17_practice.dagger2.PresenterComponent;
import home.stanislavpoliakov.meet17_practice.presentation.presenter.Presenter;

public class WeatherApplication extends Application {
    private static final String TAG = "meet17_logs";
    private static InteractorComponent interactorComponent;
    private static PresenterComponent presenterComponent;

    public static InteractorComponent getInteractorComponent() {
        Log.d(TAG, "getInteractorComponent: =" + interactorComponent);
        return interactorComponent;
    }

    public static PresenterComponent getPresenterComponent() {
        Log.d(TAG, "getPresenterComponent: =" + presenterComponent);
        return presenterComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        interactorComponent = buildInteractorComponent();
        presenterComponent = buildPresenterComponent();
    }

    public void destroyComponents() {
        interactorComponent = null;
        presenterComponent = null;
    }

    protected InteractorComponent buildInteractorComponent() {
        return DaggerInteractorComponent.builder()
                .contextModule(new ContextModule(getApplicationContext()))
                .build();
    }

    protected PresenterComponent buildPresenterComponent() {
        return DaggerPresenterComponent.builder()
                .build();
        //return DaggerPresenterComponent.create();
    }
}
